package multithreading;

public class Multithreading {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // 获取开始时间
		int size = 10000;
		int f = CustThreadPoolExecutor.j / size;// 拆分为多个数组
		System.out.println("线程总数："+f);
		for (int count = 0; count < f; count++) {
			CustThreadPoolExecutor.executor.execute(new Runnable() {
				@Override
				public void run() {
					int initSize = f * size;
					int maxSize = initSize + size;
					for (int p = initSize; p < maxSize; p++) {
						// do something;
						doSomeWork();
					}
					System.out.println(f+"、"+Thread.currentThread().getName()+",程序运行时间： " + (System.currentTimeMillis() - startTime) + "ms");
				}

			});

		}
		
		

	}

	private static void doSomeWork() {

	}
}
