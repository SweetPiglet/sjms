package learn.sjms.aqszhms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: ��֦��
 * @author: wsq
 * @date: 2020��5��12������10:27:28
 */
public class Composite implements Component {
private String name;
List<Component> list = new ArrayList<Component>();
public Composite(String name) {
	super();
	this.name = name;
}

// ������������ɾ�������
public void addComponent(Component component) {
	list.add(component);
}
public void removeComponent(Component component) {
	list.remove(component);
}
	@Override
	public void printlnMessage() {
		// TODO Auto-generated method stub
		System.out.println(name);
		list.forEach(x ->{x.printlnMessage();});
	}

}
