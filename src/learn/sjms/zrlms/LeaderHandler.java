package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��17������5:25:56
 */
public abstract class LeaderHandler {
protected LeaderHandler upLeader;

public void setUpLeader(LeaderHandler upLeader) {
	this.upLeader = upLeader;
}
public abstract void diposeLeave(int day);
}
