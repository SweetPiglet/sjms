package learn.sjms.gczms;
/**
 * 
 * @version: 1.1.0
 * @Description: ���۲��ɫ
 * @author: wsq
 * @date: 2020��5��15������9:31:40
 */
public interface Observerable {
public void addServer(Observer observer);
public void remove(Observer observer);
public void notifyObserver(String message);
}
