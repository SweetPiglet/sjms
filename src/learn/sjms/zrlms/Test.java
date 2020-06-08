package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 责任链模式测试类
 * @author: wsq
 * @date: 2020年5月17日下午5:38:11
 */
public class Test {
public static void main(String[] args) {
	LeaderHandler LeaderList = Client.getLeaderHandler();
	LeaderList.diposeLeave(7);
}
}
