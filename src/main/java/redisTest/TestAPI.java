package redisTest;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class TestAPI {

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("192.168.74.128", 6379);
//		jedis.flushAll();
//		jedis.set("k1", "v1");
//		jedis.set("k2", "v2");
//		jedis.set("k3", "v3");
//		
//		Set<String> sets = jedis.keys("*");
//		sets.stream().forEach(s -> System.out.println(s));
//		
//		System.out.println("jedis exists===>" + jedis.exists("k2"));
//		System.out.println(jedis.ttl("k1"));	//��ʾ����ʣ��ʱ��
//		
//		//String
//		jedis.append("k1", "myredis");
//		System.out.println("k1=====>" + jedis.get("k1"));
//		
//		jedis.set("k4", "k4_redis");
//		System.out.println("-----------------------");
//		
//		jedis.mset("str1", "v1", "str2", "v2", "str3", "v3");
//		System.out.println(jedis.mget("str1", "str2", "str3"));
//		
//		
//		//list
//		System.out.println("--------------------------");
//		jedis.lpush("mylist", "v1", "v2", "v3", "v4", "v5");
//		List<String> list = jedis.lrange("mylist", 0, -1);
//		list.stream().forEach(s -> System.out.println(s));
//		
//		
//		//set
//		jedis.sadd("orders", "jd001");
//		jedis.sadd("orders", "jd002");
//		jedis.sadd("orders", "jd003");
//		Set<String> set1 = jedis.smembers("orders");
//		set1.stream().forEach(s -> System.out.println(s));
//		jedis.srem("orders", "jd002");
//		System.out.println(jedis.smembers("orders").size());
//		
//		
//		//hash
//		jedis.hset("hash1", "userName", "lisi");
//		System.out.println(jedis.hget("hash1", "userName"));
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("telephone", "18838901098");
//		map.put("address", "֣�ݴ�ѧ");
//		map.put("email", "abc@163.com");
//		jedis.hmset("hash2", map);
//		List<String> result = jedis.hmget("hash2", "telephone", "email", "address");
//		result.stream().forEach(s -> System.out.println(s));	
		
		
		//zset
		jedis.zadd("zset01", 60d, "v1");
		jedis.zadd("zset01", 70d, "v2");
		jedis.zadd("zadd03", 80d, "v3");
		jedis.zadd("zadd04", 90d, "v4");
		Set<String> s1 = jedis.zrange("zset01", 0, -1);		
		s1.stream().forEach(s -> System.out.println(s + "\t" + "0.0"));
		
		
		
		
		
		
		
		
	}
}
