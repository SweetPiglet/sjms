package learn.sjms.clms;
/**
 * 
 * @version: 1.1.0
 * @Description: 策略模式（定义一组算法，将每个算法都封装起来，使得它们之间可以相互替换。
 * 策略模式让算法独立于调用它的客户端而独立变化。）
 * @author: wsq
 * @date: 2020年5月14日上午11:24:56
 */
public class Test {
public static void main(String[] args) {
	StrategyA strategyA = new StrategyA();
	StrategyB strategyB = new StrategyB();
	Environment environment = new Environment(strategyA);
	System.err.println(environment.totalCalc(1, 2));
	environment.setStrategy(strategyB);
	System.err.println(environment.totalCalc(1, 2));
}
}
