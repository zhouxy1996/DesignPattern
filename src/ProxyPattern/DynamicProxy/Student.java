package ProxyPattern.DynamicProxy;

public class Student implements People {

	@Override
	public void address() {
		System.out.println("住在学校");

	}

	@Override
	public void eat() {
		System.out.println("吃食堂");

	}

	@Override
	public void work() {
		System.out.println("学习");

	}

}
