package learn.sjms.gczms;
/**
 * 
 * @version: 1.1.0
 * @Description: �۲���ʵ����
 * @author: wsq
 * @date: 2020��5��15������9:34:36
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
