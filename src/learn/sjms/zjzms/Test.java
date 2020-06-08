package learn.sjms.zjzms;
/**
 * 
 * @version: 1.1.0
 * @Description: 中介者模式测试类
 * @author: wsq
 * @date: 2020年5月15日上午11:15:23
 */
public class Test {
public static void main(String[] args) {
	ClassMonitor classMonitor = new ClassMonitor();
	LifeLeader lifeLeader = new LifeLeader(classMonitor);
	PhychologicalLeader phychologicalLeader = new PhychologicalLeader(classMonitor);
	lifeLeader.job();
	lifeLeader.sendrequest("PhychologicalLeader");
}
}
