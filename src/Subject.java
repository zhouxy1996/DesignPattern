/**
 * ���۲���
 * @author 41790
 *
 */
public interface Subject {
    /**
     * ��ӹ۲���
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * ɾ���۲���
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * ֪ͨ�۲���
     */
    void notifyObservers();
}
