package learn.sjms.clms;
/**
 * 
 * @version: 1.1.0
 * @Description: ����ģʽ������һ���㷨����ÿ���㷨����װ������ʹ������֮������໥�滻��
 * ����ģʽ���㷨�����ڵ������Ŀͻ��˶������仯����
 * @author: wsq
 * @date: 2020��5��14������11:24:56
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
