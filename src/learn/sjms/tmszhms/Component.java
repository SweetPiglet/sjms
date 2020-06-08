package learn.sjms.tmszhms;
/**
 * 
 * @version: 1.1.0
 * @Description: ����ĳ�����
 * @author: wsq
 * @date: 2020��5��13������7:46:47
 */
public abstract class Component {
// ��������
protected String name;
// ���췽��
public Component(String name) {
	super();
	this.name = name;
}
// ���󷽷�
public abstract void printMessage();
// ʵ�ַ���
public void addComponent(Component component) {
	System.out.println("���ף�û�ж�Ӧ����ӷ�����");
}
public void removeComponent(Component component) {
	System.out.println("���ף�û�ж�Ӧ��ɾ��������");
}
@Override
public String toString() {
	return "Component [name=" + name + "]";
}

}
