package learn.sjms.tmszhms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: ��֦��
 * @author: wsq
 * @date: 2020��5��13������7:51:20
 */
public class Composite extends Component{
	// ���༯��
	private List<Component> list = new ArrayList<Component>();
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
// ��д����ķ���
	public void addComponent(Component component) {
		list.add(component);
	}
	public void removeComponent(Component component) {
		list.remove(component);
	}
	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println(super.name);
		list.forEach(x->{x.printMessage();});
	}

}
