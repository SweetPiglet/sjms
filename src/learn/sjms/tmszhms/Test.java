package learn.sjms.tmszhms;
/**
 * 
 * @version: 1.1.0
 * @Description: ͸��ʽ���ģʽ
 * @author: wsq
 * @date: 2020��5��13������7:57:46
 */
public class Test {
public static void main(String[] args) {
	Component clothes = new Composite("�·�");
	Component brand1 = new Composite("nike");
	Component brand2 = new Composite("adidas");
	Component brand3 = new Composite("kuagnwei");
	Component style1 = new Leaf("T-shirt");
	Component style2 = new Leaf("skirt");
	Component style3 = new Leaf("pants");
	
	clothes.addComponent(brand1);
	clothes.addComponent(brand2);
	clothes.addComponent(brand3);
	brand1.addComponent(style1);
	brand1.addComponent(style2);
	brand1.addComponent(style3);
	brand2.addComponent(style1);
	brand2.addComponent(style2);
	brand2.addComponent(style3);
	brand3.addComponent(style1);
	brand3.addComponent(style2);
	brand3.addComponent(style3);
	
	clothes.printMessage();
}
}
