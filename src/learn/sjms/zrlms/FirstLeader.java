package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: һ����ɫ
 * @author: wsq
 * @date: 2020��5��17������5:28:40
 */
public class FirstLeader extends LeaderHandler{

	@Override
	public void diposeLeave(int day) {
		// TODO Auto-generated method stub
		if(day <= 1) {
			System.err.println("һ���쵼����");
		}else {
			upLeader.diposeLeave(day);
		}
	}

}
