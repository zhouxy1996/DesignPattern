package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustThreadPoolExecutor {
	// �̳߳غ����߳���:20;�̳߳������:200;�����̴߳��ʱ��:10s;ʱ�䵥λ:SECONDS;�̳߳���ʹ�õĻ������20
	// ������ʹ��ThreadConfig�滻
	public static ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 110, 50, TimeUnit.SECONDS,
			new ArrayBlockingQueue<Runnable>(20));
	
	public static int j = 1000000;//ʮ��,����0��ʮ��

}
