package learn.sjms.fwzms;
/**
 * 
 * @version: 1.1.0
 * @Description: ʵ����
 * @author: wsq
 * @date: 2020��5��14������10:20:41
 */
public class ElementCImpl implements Element {

	@Override
	public void accept(ElementVisitor elementVisitor) {
		// TODO Auto-generated method stub
		elementVisitor.vist(this);
	}

}
