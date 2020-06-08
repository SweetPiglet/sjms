package learn.sjms.fhxyms;
/**
 * 
 * @version: 1.1.0
 * @Description: 复合享元模式（只适用于值为基本类型的元素，否则无效）
 * @author: wsq
 * @date: 2020年5月13日下午8:11:19
 */
public class Test {
public static void main(String[] args) {
	Person p = FlyweightFactory.getPerson(1,"小明", "男", 12);
	Person p2 = FlyweightFactory.getPerson(2,"小张", "男", 12);
	Person p3 = FlyweightFactory.getPerson(1,"小王", "男", 12);
	System.out.println(p);
	System.out.println(p2);
	System.out.println(p3);
}
}
