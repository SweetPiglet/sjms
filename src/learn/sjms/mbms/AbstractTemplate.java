package learn.sjms.mbms;
/**
 * 
 * @version: 1.1.0
 * @Description: ģ����
 * @author: wsq
 * @date: 2020��5��14������10:56:23
 */
public abstract class AbstractTemplate {
	// ģ�巽��
	public void templateMethod() {
		 //���û�������
        abstractMethod();
        hookMethod();
        concreteMethod();
	}
// ���󷽷���������ʵ�֣�
	protected abstract void abstractMethod();
// ���ӷ����������Ѿ�ʵ�֣�����������ã�
	protected void hookMethod() {
		System.out.println("����Ĭ�Ϸ�����");
	}
// ���巽��
	private final void concreteMethod() {
		System.out.println("�����������䣡");
	}
}
