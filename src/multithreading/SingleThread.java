package multithreading;

public class SingleThread {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // ��ȡ��ʼʱ��
		int maxSize = CustThreadPoolExecutor.j;
		for(int i = 0;i<maxSize;i++) {
			doSomeWork();
		}
		System.out.println(Thread.currentThread().getName()+",��������ʱ�䣺 " + (System.currentTimeMillis() - startTime) + "ms");
	}
	
	private static void doSomeWork() {

	}

}
