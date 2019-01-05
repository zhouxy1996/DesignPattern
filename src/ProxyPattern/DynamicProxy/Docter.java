package ProxyPattern.DynamicProxy;

public class Docter implements People {

	@Override
	public void address() {
		System.out.println("住在医院");

	}

	@Override
	public void eat() {
		System.out.println("吃快餐");

	}

	@Override
	public void work() {
		System.out.println("给病人做手术");

	}

}
