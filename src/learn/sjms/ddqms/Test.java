package learn.sjms.ddqms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: ������ģʽ������
 * @author: wsq
 * @date: 2020��5��16������4:54:43
 */
public class Test {
public static void main(String[] args) {
	List<Object> list = new ArrayList<Object>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("e");
	list.add("f");
	AbstractList al = new AbstractListImpl(list);
	Iterator it = al.getIterator();
	while(it.isNext()) {
		System.out.println(it.getNext());
		it.next();
	}
	
}
}
