package learn.sjms.zjzms;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @version: 1.1.0
 * @Description: �н���ʵ����
 * @author: wsq
 * @date: 2020��5��15������11:05:22
 */
public class ClassMonitor implements Mediator{
Map<String, ClassLeader> map = new HashMap<String, ClassLeader>();
	@Override
	public void register(String lname, ClassLeader c) {
		// TODO Auto-generated method stub
		map.put(lname, c);
	}

	@Override
	public void command(String lname) {
		// TODO Auto-generated method stub
		map.get(lname).job();
	}

}
