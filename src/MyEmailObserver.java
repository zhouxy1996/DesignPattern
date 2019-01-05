/**
 * 邮件服务
 * @author 41790
 *
 */
public class MyEmailObserver implements Observer{

	@Override
	public void update() {
		System.out.println("邮件服务，已经接收到支付通知，准备发送邮件");
		
	}

}
