package learn.sjms.clms;
/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��14������11:21:44
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
