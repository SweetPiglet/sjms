package learn.sjms.ztms;
/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��14������5:23:30
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
	System.out.println("�������ط�����");
}
public void online() {
	System.out.println("�������߷�����");
}
}
