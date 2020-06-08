package learn.sjms.tmszhms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: 树枝类
 * @author: wsq
 * @date: 2020年5月13日上午7:51:20
 */
public class Composite extends Component{
	// 子类集合
	private List<Component> list = new ArrayList<Component>();
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
// 重写父类的方法
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
