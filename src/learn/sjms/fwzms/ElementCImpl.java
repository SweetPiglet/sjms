package learn.sjms.fwzms;
/**
 * 
 * @version: 1.1.0
 * @Description: 实现类
 * @author: wsq
 * @date: 2020年5月14日上午10:20:41
 */
public class ElementCImpl implements Element {

	@Override
	public void accept(ElementVisitor elementVisitor) {
		// TODO Auto-generated method stub
		elementVisitor.vist(this);
	}

}
