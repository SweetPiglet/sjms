package learn.sjms.tmszhms;
/**
 * 
 * @version: 1.1.0
 * @Description: 组件的抽象类
 * @author: wsq
 * @date: 2020年5月13日上午7:46:47
 */
public abstract class Component {
// 公共名称
protected String name;
// 构造方法
public Component(String name) {
	super();
	this.name = name;
}
// 抽象方法
public abstract void printMessage();
// 实现方法
public void addComponent(Component component) {
	System.out.println("亲亲，没有对应的添加方法！");
}
public void removeComponent(Component component) {
	System.out.println("亲亲，没有对应的删除方法！");
}
@Override
public String toString() {
	return "Component [name=" + name + "]";
}

}
