package learn.sjms.mlms;
/**
 * 
 * @version: 1.1.0
 * @Description: ����ģʽ������
 * @author: wsq
 * @date: 2020��5��17������4:39:07
 */
public class Test {
public static void main(String[] args) {
	Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
	invoker.action();
}
}
