package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: �����쵼
 * @author: wsq
 * @date: 2020��5��17������5:31:07
 */
public class SecondLeader extends LeaderHandler{

	@Override
	public void diposeLeave(int day) {
		// TODO Auto-generated method stub
		if(day <= 3) {
			System.err.println("�����쵼����");
		}else {
			upLeader.diposeLeave(day);
		}
	}

}
