package learn.sjms.zjzms;
/**
 * 
 * @version: 1.1.0
 * @Description: �н���ģʽ������
 * @author: wsq
 * @date: 2020��5��15������11:15:23
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
