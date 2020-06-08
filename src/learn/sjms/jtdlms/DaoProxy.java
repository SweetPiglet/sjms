package learn.sjms.jtdlms;
/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��13������8:56:59
 */
public class DaoProxy implements DaoInterface{
private DaoInterface daoInterface;
public DaoProxy(DaoInterface daoInterface) {
	this.daoInterface = daoInterface;
}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		daoInterface.add();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		daoInterface.remove();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		daoInterface.update();
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		daoInterface.find();
	}

}
