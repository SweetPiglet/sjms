package learn.sjms.bwlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 备份模式测试类
 * @author: wsq
 * @date: 2020年5月15日上午10:25:36
 */
public class Test {
public static void main(String[] args) {
	Person p = new Person(1, 1, "wsq");
	MementoManager mm = new MementoManager();
	mm.setMemento(p.createMemento());
	System.out.println(p);
	p.setName("wsq1");
	System.out.println(p);
	p.restoreMemento(mm.getMemento());
	System.out.println(p);
}
}
