package learn.sjms.zszms;
/**
 * 
 * @version: 1.1.0
 * @Description: 装饰者模式
 * @author: wsq
 * @date: 2020年5月13日上午9:52:41
 */
public class Test {
public static void main(String[] args) {
	Drink pop = new Pop();
	Drink coffee = new Coffee();
	Supplement js = new JtSupplement(pop);
	Supplement js2 = new JtSupplement(coffee);
	System.err.println(pop.name());
	System.err.println(pop.price());
	System.err.println(js.name());
	System.err.println(js.price());
	System.err.println(js2.name());
	System.err.println(js2.price());
}
}
