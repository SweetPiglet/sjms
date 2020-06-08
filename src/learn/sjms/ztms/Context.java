package learn.sjms.ztms;
/**
 * 
 * @version: 1.1.0
 * @Description: ״̬��
 * @author: wsq
 * @date: 2020��5��14������5:25:40
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
