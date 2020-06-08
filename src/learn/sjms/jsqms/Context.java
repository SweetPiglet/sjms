package learn.sjms.jsqms;
/**
 * 
 * @version: 1.1.0
 * @Description: 上下文环境，用来保存文法
 * @author: wsq
 * @date: 2020年5月17日上午9:48:37
 */
public class Context {
private String input;
private int output;
public Context(String input) {
	super();
	this.input = input;
}
public String getInput() {
	return input;
}
public void setInput(String input) {
	this.input = input;
}
public int getOutput() {
	return output;
}
public void setOutput(int output) {
	this.output = output;
}

}
