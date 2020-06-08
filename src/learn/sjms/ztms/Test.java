package learn.sjms.ztms;
/**
 * 
 * @version: 1.1.0
 * @Description: 状态模式测试类
 * @author: wsq
 * @date: 2020年5月14日下午5:41:15
 */
public class Test {
public static void main(String[] args) {
	Context context = new Context(new State("hide"));
	context.method();
	context.setState(new State("online"));
	context.method();
}
}
