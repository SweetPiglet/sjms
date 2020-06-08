package learn.sjms.tmszhms;
/**
 * 
 * @version: 1.1.0
 * @Description: 树叶类
 * @author: wsq
 * @date: 2020年5月13日上午7:56:49
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println(super.name);
	}

}
