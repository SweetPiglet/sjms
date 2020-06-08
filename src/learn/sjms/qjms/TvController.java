package learn.sjms.qjms;
/**
 * 
 * @version: 1.1.0
 * @Description: 遥控器实现类
 * @author: wsq
 * @date: 2020年5月11日上午9:10:03
 */
public class TvController implements TvControllerInterface{
	protected TvInterface tvInterface;
	
	public TvController(TvInterface tvInterface) {
		super();
		this.tvInterface = tvInterface;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		tvInterface.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		tvInterface.off();
	}

	@Override
	public void waitnow() {
		// TODO Auto-generated method stub
		tvInterface.waitnow();
	}

}
