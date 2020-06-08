package learn.sjms.mbms;
/**
 * 
 * @version: 1.1.0
 * @Description: 模板类
 * @author: wsq
 * @date: 2020年5月14日上午10:56:23
 */
public abstract class AbstractTemplate {
	// 模板方法
	public void templateMethod() {
		 //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
	}
// 抽象方法（由子类实现）
	protected abstract void abstractMethod();
// 钩子方法（父类已经实现，子类可以重置）
	protected void hookMethod() {
		System.out.println("这是默认方法！");
	}
// 具体方法
	private final void concreteMethod() {
		System.out.println("这个方法不会变！");
	}
}
