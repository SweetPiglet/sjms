package learn.sjms.gczms;
/**
 * 
 * @version: 1.1.0
 * @Description: �۲���ģʽ������
 * @author: wsq
 * @date: 2020��5��15������9:48:28
 */
public class Test {
public static void main(String[] args) {
	Observer os = new ObserverImpl("xiaohua", "�տ�ʼ��");
	Observer os1 = new ObserverImpl("xiaoming", "�տ�ʼ��");
	ObserverableImpl oi = new ObserverableImpl();
	oi.addServer(os);
	oi.addServer(os1);
	System.out.println(os);
	System.out.println(os1);
	oi.notifyObserver("�����ˣ�");
	System.out.println(os);
	System.out.println(os1);
}
}
