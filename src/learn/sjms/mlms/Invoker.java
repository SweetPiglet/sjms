package learn.sjms.mlms;
/**
 * 
 * @version: 1.1.0
 * @Description: �����߽�ɫ��
 * @author: wsq
 * @date: 2020��5��17������4:33:42
 */
public class Invoker {
private Command command;
public Invoker(Command command) {
	this.command = command;
}
public void action() {
	command.execute();
}
}
