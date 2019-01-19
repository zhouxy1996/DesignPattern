package multithreading;

public class SingleThread {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 获取开始时间
		int maxSize = CustThreadPoolExecutor.j;
		for(int i = 0;i<maxSize;i++) {
			doSomeWork();
		}
		System.out.println(Thread.currentThread().getName()+",程序运行时间： " + (System.currentTimeMillis() - startTime) + "ms");
	}
	
	private static void doSomeWork() {

	}

}
