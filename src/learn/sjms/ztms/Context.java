package learn.sjms.ztms;
/**
 * 
 * @version: 1.1.0
 * @Description: 状态类
 * @author: wsq
 * @date: 2020年5月14日下午5:25:40
 */
public class Context {
private State state;

public Context(State state) {
	super();
	this.state = state;
}

public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
}

public void method() {
	String status = state.getState();
	if(status.equals("hide")) {
		state.hide();
	}
	if(status.equals("online")) {
		state.online();
	}
}
}
