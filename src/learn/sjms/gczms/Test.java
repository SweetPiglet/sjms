package learn.sjms.gczms;
/**
 * 
 * @version: 1.1.0
 * @Description: 观察者模式测试类
 * @author: wsq
 * @date: 2020年5月15日上午9:48:28
 */
public class Test {
public static void main(String[] args) {
	Observer os = new ObserverImpl("xiaohua", "刚开始！");
	Observer os1 = new ObserverImpl("xiaoming", "刚开始！");
	ObserverableImpl oi = new ObserverableImpl();
	oi.addServer(os);
	oi.addServer(os1);
	System.out.println(os);
	System.out.println(os1);
	oi.notifyObserver("结束了！");
	System.out.println(os);
	System.out.println(os1);
}
}
