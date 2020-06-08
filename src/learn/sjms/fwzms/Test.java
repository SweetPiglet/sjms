package learn.sjms.fwzms;
/**
 * 
 * @version: 1.1.0
 * @Description: 访问者模式(主要解决 稳定的数据结构和易变的操作耦合问题。)
 * @author: wsq
 * @date: 2020年5月14日上午10:35:26
 */
public class Test {
public static void main(String[] args) {
	ElementVisitor ev = new ElementVisitorImpl();
	ElementAImpl a1 = new ElementAImpl();
	ElementBImpl b1 = new ElementBImpl();
	ElementCImpl c1 = new ElementCImpl();
	ElementDImpl d1 = new ElementDImpl();
	a1.accept(ev);
	b1.accept(ev);
	c1.accept(ev);
	d1.accept(ev);
}
}
