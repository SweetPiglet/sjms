package learn.sjms.clms;
/**
 * 
 * @version: 1.1.0
 * @Description: 环境类
 * @author: wsq
 * @date: 2020年5月14日上午11:21:44
 */
public class Environment {
private Strategy strategy;
public Environment(Strategy strategy) {
	this.strategy = strategy;
}

public void setStrategy(Strategy strategy) {
	this.strategy = strategy;
}

public int totalCalc(int a, int b) {
	return strategy.calc(a, b);
}
}
