package learn.sjms.zszms;
/**
 * 
 * @version: 1.1.0
 * @Description: ����װ����
 * @author: wsq
 * @date: 2020��5��13������9:50:31
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
