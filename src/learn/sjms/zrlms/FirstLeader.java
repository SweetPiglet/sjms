package learn.sjms.zrlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 一级角色
 * @author: wsq
 * @date: 2020年5月17日下午5:28:40
 */
public class FirstLeader extends LeaderHandler{

	@Override
	public void diposeLeave(int day) {
		// TODO Auto-generated method stub
		if(day <= 1) {
			System.err.println("一级领导处理！");
		}else {
			upLeader.diposeLeave(day);
		}
	}

}
