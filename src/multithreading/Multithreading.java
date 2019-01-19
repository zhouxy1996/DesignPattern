package multithreading;

public class Multithreading {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); // ��ȡ��ʼʱ��
		int size = 10000;
		int f = CustThreadPoolExecutor.j / size;// ���Ϊ�������
		System.out.println("�߳�������"+f);
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
					System.out.println(f+"��"+Thread.currentThread().getName()+",��������ʱ�䣺 " + (System.currentTimeMillis() - startTime) + "ms");
				}

			});

		}
		
		

	}

	private static void doSomeWork() {

	}
}
