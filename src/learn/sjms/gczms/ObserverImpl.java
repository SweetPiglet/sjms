package learn.sjms.gczms;
/**
 * 
 * @version: 1.1.0
 * @Description: 观察者实现类
 * @author: wsq
 * @date: 2020年5月15日上午9:34:36
 */
public class ObserverImpl implements Observer{
	private String name;
	private String message;
	
	public ObserverImpl(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void updateObserver(String message) {
		// TODO Auto-generated method stub
		this.message = message;
	}
	@Override
	public String toString() {
		return "ObserverImpl [name=" + name + ", message=" + message + "]";
	}

}
