package learn.sjms.wgms;
/**
 * 
 * @version: 1.1.0
 * @Description: 观察者模式
 * @author: wsq
 * @date: 2020年5月13日下午7:39:58
 */
public class Test {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.shtartup();
		computer.shutdown();
	}
}
