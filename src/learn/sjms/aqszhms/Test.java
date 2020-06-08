package learn.sjms.aqszhms;
/**
 * 
 * @version: 1.1.0
 * @Description: 安全式组合模式
 * @author: wsq
 * @date: 2020年5月12日上午10:35:26
 */
public class Test {
public static void main(String[] args) {
	Composite clothes = new Composite("衣服");
	Composite brand1 = new Composite("nike");
	Composite brand2 = new Composite("adidas");
	Composite brand3 = new Composite("kuagnwei");
	Leaf style1 = new Leaf("T-shirt");
	Leaf style2 = new Leaf("skirt");
	Leaf style3 = new Leaf("pants");
	
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
	
	clothes.printlnMessage();
}
}
