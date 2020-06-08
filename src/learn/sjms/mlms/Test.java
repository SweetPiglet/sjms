package learn.sjms.mlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 命令模式测试类
 * @author: wsq
 * @date: 2020年5月17日下午4:39:07
 */
public class Test {
public static void main(String[] args) {
	Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
	invoker.action();
}
}
