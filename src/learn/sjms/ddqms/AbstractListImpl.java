package learn.sjms.ddqms;

import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: 抽象实现类
 * @author: wsq
 * @date: 2020年5月16日下午4:48:20
 */
public class AbstractListImpl extends AbstractList{

	public AbstractListImpl(List<Object> list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new IteratorImpl(this);
	}

}
