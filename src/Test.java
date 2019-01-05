/**
 * 
 * @author 41790 在这个例子中邮件服务和库存服务就是监听器， 监听“支付状态变更”这一事件，
 *         由事件源MyPaymentStatusUpdateSubject产生此事件，
 *         当调用myPaymentStatusUpdateSubject#updatePaymentStatus(2);
 *         方法发布事件时，会通知所有的监听器， 即库存服务和邮件服务， 他们根据自己的业务逻辑做出不同的响应。
 *
 */
public class Test {

	public static void main(String[] args) {

		// "支付状态更新"->看做一个事件，可以被监听的事件

		// 被观察者。即事件源
		MyPaymentStatusUpdateSubject myPaymentStatusUpdateSubject = new MyPaymentStatusUpdateSubject();

		// 观察者。即事件监听器
		MyEmailObserver myEmailObserver = new MyEmailObserver();
		MyStockObserver myStockObserver = new MyStockObserver();

		// 添加观察者。
		myPaymentStatusUpdateSubject.addObserver(myEmailObserver);
		myPaymentStatusUpdateSubject.addObserver(myStockObserver);

		// 发布事件。支付状态更新。
		myPaymentStatusUpdateSubject.updatePaymentStatus(2);
	}

}
