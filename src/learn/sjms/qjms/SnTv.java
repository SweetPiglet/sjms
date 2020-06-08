package learn.sjms.qjms;
/**
 * 
 * @version: 1.1.0
 * @Description: 电视机的实现类
 * @author: wsq
 * @date: 2020年5月11日上午9:06:24
 */
public class SnTv implements TvInterface{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("索尼电视开机了。。。。。");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("索尼电视关机了。。。。。");
	}

	@Override
	public void waitnow() {
		// TODO Auto-generated method stub
		System.out.println("索尼电视待机中。。。。。");
	}

}
