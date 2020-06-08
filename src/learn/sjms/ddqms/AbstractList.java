package learn.sjms.ddqms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: 抽象聚合类
 * @author: wsq
 * @date: 2020年5月16日下午4:14:11
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
// 抽象方法获:获取迭代器
public abstract Iterator getIterator();
}
