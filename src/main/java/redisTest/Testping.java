package redisTest;

import redis.clients.jedis.Jedis;

public class Testping {

	public static void main(String[] args) {

		System.out.println(1);
		
		Jedis jedis = new Jedis("192.168.74.128", 6379);
//		System.out.println(jedis.get("k1"));
		System.out.println(jedis.ping());
		
		Jedis jedis2 = new Jedis("192.168.74.128", 6380);
		System.out.println(jedis2.ping());
		System.out.println(jedis2.get("k1"));
	}

}
