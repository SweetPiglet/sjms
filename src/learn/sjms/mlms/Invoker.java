package learn.sjms.mlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 请求者角色类
 * @author: wsq
 * @date: 2020年5月17日下午4:33:42
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
