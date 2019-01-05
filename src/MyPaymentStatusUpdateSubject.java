import java.util.List;
import java.util.Vector;
/**
 * �¼�Դ��֧��
 * @author 41790
 *
 */
public class MyPaymentStatusUpdateSubject implements Subject {
	private List<Observer> observers = new Vector<>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }

	}
	
    public void updatePaymentStatus(int newStatus) {

        // ҵ���߼�����
        System.out.println("�����µ�֧��״̬Ϊ��" + newStatus);

        // ֪ͨ�۲���
        this.notifyObservers();
    }

}
