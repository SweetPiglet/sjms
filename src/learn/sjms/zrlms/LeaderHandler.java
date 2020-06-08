package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 抽象类
 * @author: wsq
 * @date: 2020年5月17日下午5:25:56
 */
public abstract class LeaderHandler {
protected LeaderHandler upLeader;

public void setUpLeader(LeaderHandler upLeader) {
	this.upLeader = upLeader;
}
public abstract void diposeLeave(int day);
}
