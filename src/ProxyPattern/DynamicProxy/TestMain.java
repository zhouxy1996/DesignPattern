package ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMain {

	public static void main(String[] args) {
        //创建一个实例对象，这个对象是被代理的对象
		People people = new Student();
        
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new PeopleProxy<People>(people);
        
        //创建一个代理对象stuProxy来代理Student，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        People stuProxy = (People) Proxy.newProxyInstance(People.class.getClassLoader(), new Class<?>[]{People.class}, stuHandler);

       //代理执行方法
        stuProxy.address();

	}

}
