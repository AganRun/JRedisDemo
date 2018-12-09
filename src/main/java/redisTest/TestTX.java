package redisTest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * ÊÂÎñ²âÊÔ
 * @author 18838
 *
 */
public class TestTX {
	

	public static void main(String[] args) {

		Jedis jedis = new Jedis("192.168.74.128", 6379);
		System.out.println(jedis.ping());
		
		Transaction transaction = jedis.multi();
		transaction.set("k1", "v1");
		transaction.set("k22", "v2");
//		transaction.exec();
		transaction.discard();
	}

}
