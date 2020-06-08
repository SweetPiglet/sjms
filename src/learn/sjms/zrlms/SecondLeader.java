package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 二级领导
 * @author: wsq
 * @date: 2020年5月17日下午5:31:07
 */
public class SecondLeader extends LeaderHandler{

	@Override
	public void diposeLeave(int day) {
		// TODO Auto-generated method stub
		if(day <= 3) {
			System.err.println("二级领导处理！");
		}else {
			upLeader.diposeLeave(day);
		}
	}

}
