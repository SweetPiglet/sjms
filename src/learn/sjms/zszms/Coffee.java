package learn.sjms.zszms;
/**
 * 
 * @version: 1.1.0
 * @Description: 被修饰这的具体实现类
 * @author: wsq
 * @date: 2020年5月13日上午9:41:50
 */
public class Coffee implements Drink{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "拿铁";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 10.0;
	}

}
