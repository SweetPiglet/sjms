package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: ������ģʽ������
 * @author: wsq
 * @date: 2020��5��17������5:38:11
 */
public class Test {
public static void main(String[] args) {
	LeaderHandler LeaderList = Client.getLeaderHandler();
	LeaderList.diposeLeave(7);
}
}
