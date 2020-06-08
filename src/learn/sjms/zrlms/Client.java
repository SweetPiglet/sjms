package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 链的生成类
 * @author: wsq
 * @date: 2020年5月17日下午5:32:47
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
