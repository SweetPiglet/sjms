package learn.sjms.fhxyms;
/**
 * 
 * @version: 1.1.0
 * @Description: ������Ԫģʽ��ֻ������ֵΪ�������͵�Ԫ�أ�������Ч��
 * @author: wsq
 * @date: 2020��5��13������8:11:19
 */
public class Test {
public static void main(String[] args) {
	Person p = FlyweightFactory.getPerson(1,"С��", "��", 12);
	Person p2 = FlyweightFactory.getPerson(2,"С��", "��", 12);
	Person p3 = FlyweightFactory.getPerson(1,"С��", "��", 12);
	System.out.println(p);
	System.out.println(p2);
	System.out.println(p3);
}
}
