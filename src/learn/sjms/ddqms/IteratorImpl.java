package learn.sjms.ddqms;

import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: 迭代器的实现类
 * @author: wsq
 * @date: 2020年5月16日下午4:22:18
 */
public class IteratorImpl implements Iterator{
	private List<Object> list;
	private int index;
	public IteratorImpl(AbstractList list) {
		super();
		this.list = list.getList();
		index = 0;
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
			index ++;
		
	}

	@Override
	public Object getNext() {
		// TODO Auto-generated method stub
		return list.get(index);
	}

	@Override
	public boolean isNext() {
		if(index == list.size()) {
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}


}
