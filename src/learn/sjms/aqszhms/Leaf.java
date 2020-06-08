package learn.sjms.aqszhms;
/**
 * 
 * @version: 1.1.0
 * @Description: 树叶类
 * @author: wsq
 * @date: 2020年5月12日上午10:35:02
 */
public class Leaf implements Component {
private String name;

	public Leaf(String name) {
	super();
	this.name = name;
}

	@Override
	public void printlnMessage() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
