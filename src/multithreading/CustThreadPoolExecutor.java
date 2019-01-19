package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustThreadPoolExecutor {
	// 线程池核心线程数:20;线程池最大数:200;空闲线程存活时间:10s;时间单位:SECONDS;线程池所使用的缓冲队列20
	// 废弃，使用ThreadConfig替换
	public static ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 110, 50, TimeUnit.SECONDS,
			new ArrayBlockingQueue<Runnable>(20));
	
	public static int j = 1000000;//十万,遍历0至十万

}
