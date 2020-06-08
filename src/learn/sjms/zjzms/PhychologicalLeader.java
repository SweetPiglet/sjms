package learn.sjms.zjzms;
/**
 * 
 * @version: 1.1.0
 * @Description: 注册者实现类
 * @author: wsq
 * @date: 2020年5月15日上午10:59:13
 */
public class PhychologicalLeader implements ClassLeader{
	private Mediator mediator;
	public PhychologicalLeader(Mediator mediator) {
	super();
	this.mediator = mediator;
	mediator.register("PhychologicalLeader", this);
}
	@Override
	public void job() {
		// TODO Auto-generated method stub
		System.err.println("我是体育委员！");
	}

	@Override
	public void sendrequest(String lname) {
		// TODO Auto-generated method stub
		mediator.command(lname);
	}

}
