package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: ����������
 * @author: wsq
 * @date: 2020��5��17������5:32:47
 */
public class Client {
public static LeaderHandler getLeaderHandler() {
	LeaderHandler leader1 = new FirstLeader();
	LeaderHandler leader2 = new SecondLeader();
	LeaderHandler leader3 = new ThirdLeader();
	leader1.setUpLeader(leader2);
	leader2.setUpLeader(leader3);
	return leader1;
}
}
