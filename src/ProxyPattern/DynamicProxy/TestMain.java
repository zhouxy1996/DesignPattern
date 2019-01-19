package ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMain {

	public static void main(String[] args) {
        //����һ��ʵ��������������Ǳ�����Ķ���
		People people = new Student();
        
        //����һ�����������������InvocationHandler
        InvocationHandler stuHandler = new PeopleProxy<People>(people);
        
        //����һ���������stuProxy������Student����������ÿ��ִ�з��������滻ִ��Invocation�е�invoke����
        People stuProxy = (People) Proxy.newProxyInstance(People.class.getClassLoader(), new Class<?>[]{People.class}, stuHandler);

       //����ִ�з���
        stuProxy.address();

	}

}
