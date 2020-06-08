package learn.sjms.qjms;
/**
 * 
 * @version: 1.1.0
 * @Description: 遥控器抽象类
 * @author: wsq
 * @date: 2020年5月11日上午9:09:48
 */
public interface TvControllerInterface {
	public abstract void on();
	public abstract void off();
	public abstract void waitnow();
}
