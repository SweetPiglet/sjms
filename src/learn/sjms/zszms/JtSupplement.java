package learn.sjms.zszms;
/**
 * 
 * @version: 1.1.0
 * @Description: 具体装饰者
 * @author: wsq
 * @date: 2020年5月13日上午9:50:31
 */
public class JtSupplement extends Supplement{

	public JtSupplement(Drink drink) {
		super(drink);
		// TODO Auto-generated constructor stub
	}
	 @Override
	    public String name() {
	        return super.name()+">>>Add Bubble";
	    }

	    @Override
	    public double price() {
	        return super.price()+5.0;
	    }

}
