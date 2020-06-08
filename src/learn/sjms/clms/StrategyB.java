package learn.sjms.clms;
/**
 * 
 * @version: 1.1.0
 * @Description: 策略实现类
 * @author: wsq
 * @date: 2020年5月14日上午11:20:36
 */
public class StrategyB implements Strategy{

	@Override
	public int calc(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
