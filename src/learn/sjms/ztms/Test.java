package learn.sjms.ztms;
/**
 * 
 * @version: 1.1.0
 * @Description: ״̬ģʽ������
 * @author: wsq
 * @date: 2020��5��14������5:41:15
 */
public class Test {
public static void main(String[] args) {
	Context context = new Context(new State("hide"));
	context.method();
	context.setState(new State("online"));
	context.method();
}
}
