package learn.sjms.gczms;
/**
 * 
 * @version: 1.1.0
 * @Description: 被观察角色
 * @author: wsq
 * @date: 2020年5月15日上午9:31:40
 */
public interface Observerable {
public void addServer(Observer observer);
public void remove(Observer observer);
public void notifyObserver(String message);
}
