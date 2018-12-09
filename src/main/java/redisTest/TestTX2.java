package redisTest;

import javax.swing.text.TabableView;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * ģ�����ÿ�ҵ�񣬼���
 * 
 * @author ��׿
 *
 */
public class TestTX2 {

	public static void main(String[] args) throws InterruptedException {
		TestTX2 tx = new TestTX2();
		boolean result = tx.transMehod();
		System.out.println("===>" + result);
	}
	
	public boolean transMehod() throws InterruptedException{
		Jedis jedis = new Jedis("192.168.74.128", 6379);
		int balance;
		int debt;
		int amtToSubtrant = 10;
		
		jedis.watch("balance");
		//jedis.set("balance", "5");�˾䲻�ó��֣�ģ�����������Ѿ��޸�����Ŀ
		Thread.sleep(7000);
		balance = Integer.parseInt(jedis.get("balance"));
		if(balance < amtToSubtrant){
			jedis.unwatch();
			System.out.println("�");
			return false;
		}else{
			System.out.println("************transaction*********");
			Transaction transaction = jedis.multi();
			transaction.decrBy("balance", amtToSubtrant);
			transaction.incrBy("debt", amtToSubtrant);
			transaction.exec();
			balance = Integer.parseInt(jedis.get("balance"));
			debt = Integer.parseInt(jedis.get("debt"));
			System.out.println("balance--->" + balance);
			System.out.println("debt------>" + debt);
			return true;
		}
		
	}

}
