package learn.sjms.zjzms;
/**
 * 
 * @version: 1.1.0
 * @Description: ע����ʵ����
 * @author: wsq
 * @date: 2020��5��15������10:59:13
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
		System.err.println("��������ίԱ��");
	}

	@Override
	public void sendrequest(String lname) {
		// TODO Auto-generated method stub
		mediator.command(lname);
	}

}