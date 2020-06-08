package learn.sjms.aqszhms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: 树枝类
 * @author: wsq
 * @date: 2020年5月12日上午10:27:28
 */
public class Composite implements Component {
private String name;
List<Component> list = new ArrayList<Component>();
public Composite(String name) {
	super();
	this.name = name;
}

// 设置子类对象的删除和添加
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
