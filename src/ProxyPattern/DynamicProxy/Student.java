package ProxyPattern.DynamicProxy;

public class Student implements People {

	@Override
	public void address() {
		System.out.println("ס��ѧУ");

	}

	@Override
	public void eat() {
		System.out.println("��ʳ��");

	}

	@Override
	public void work() {
		System.out.println("ѧϰ");

	}

}
