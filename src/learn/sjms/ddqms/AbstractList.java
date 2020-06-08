package learn.sjms.ddqms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: ����ۺ���
 * @author: wsq
 * @date: 2020��5��16������4:14:11
 */
public abstract class AbstractList {
protected List<Object> list;
public AbstractList(List<Object> list) {
	super();
	this.list = list;
}
public void add(Object o) {
	list.add(o);
}
public void remove(Object o) {
	list.remove(o);
}
public List<Object> getList(){
	return this.list;
}
// ���󷽷���:��ȡ������
public abstract Iterator getIterator();
}
