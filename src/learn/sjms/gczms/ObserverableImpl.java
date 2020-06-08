package learn.sjms.gczms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: ���۲��ߵ�ʵ����
 * @author: wsq
 * @date: 2020��5��15������9:44:07
 */
public class ObserverableImpl implements Observerable{

private List<Observer> list;
public ObserverableImpl() {
	list = new ArrayList<Observer>();
}
@Override
public void addServer(Observer observer) {
	// TODO Auto-generated method stub
	list.add(observer);
}
@Override
public void remove(Observer observer) {
	// TODO Auto-generated method stub
	list.remove(observer);
}
@Override
public void notifyObserver(String message) {
	// TODO Auto-generated method stub
	list.forEach(x -> {
		x.updateObserver(message);
	});
}

}
