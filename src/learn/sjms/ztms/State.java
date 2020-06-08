package learn.sjms.ztms;
/**
 * 
 * @version: 1.1.0
 * @Description: 方法类
 * @author: wsq
 * @date: 2020年5月14日下午5:23:30
 */
public class State {
private String state;

public State(String state) {
	super();
	this.state = state;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}
public void hide() {
	System.out.println("这是隐藏方法！");
}
public void online() {
	System.out.println("这是在线方法！");
}
}
