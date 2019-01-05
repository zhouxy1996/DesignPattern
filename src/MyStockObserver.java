/**
 * 库存服务
 * @author 41790
 *
 */
public class MyStockObserver implements Observer{

	@Override
	public void update() {
		System.out.println("库存服务，已经接收到支付通知，库存量减少x件");
		
	}

}
