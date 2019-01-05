/**
 * 
 * @author 41790 ������������ʼ�����Ϳ�������Ǽ������� ������֧��״̬�������һ�¼���
 *         ���¼�ԴMyPaymentStatusUpdateSubject�������¼���
 *         ������myPaymentStatusUpdateSubject#updatePaymentStatus(2);
 *         ���������¼�ʱ����֪ͨ���еļ������� ����������ʼ����� ���Ǹ����Լ���ҵ���߼�������ͬ����Ӧ��
 *
 */
public class Test {

	public static void main(String[] args) {

		// "֧��״̬����"->����һ���¼������Ա��������¼�

		// ���۲��ߡ����¼�Դ
		MyPaymentStatusUpdateSubject myPaymentStatusUpdateSubject = new MyPaymentStatusUpdateSubject();

		// �۲��ߡ����¼�������
		MyEmailObserver myEmailObserver = new MyEmailObserver();
		MyStockObserver myStockObserver = new MyStockObserver();

		// ��ӹ۲��ߡ�
		myPaymentStatusUpdateSubject.addObserver(myEmailObserver);
		myPaymentStatusUpdateSubject.addObserver(myStockObserver);

		// �����¼���֧��״̬���¡�
		myPaymentStatusUpdateSubject.updatePaymentStatus(2);
	}

}
