package jedisTest;

import redis.clients.jedis.Jedis;

public class JedisTest {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.233.132", 6379);
		System.out.println(jedis.ping());
		jedis.close();
	}
	
}
