package redisTest;

import redis.clients.jedis.Jedis;

public class TestMS {

	public static void main(String[] args) {

		Jedis jedis_M = new Jedis("192.168.74.128", 6379);
		Jedis jedis_S = new Jedis("192.168.74.128", 6380);
		
		jedis_S.slaveof("192.168.74.128", 6379);
		
		jedis_M.set("class", "v12");
		System.out.println(jedis_S.get("class"));
	}

}
