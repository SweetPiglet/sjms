package learn.sjms.zszms;
/**
 * 
 * @version: 1.1.0
 * @Description: ����������
 * @author: wsq
 * @date: 2020��5��13������9:43:32
 */
public abstract class Supplement implements Drink{
private Drink drink;
public Supplement(Drink drink) {
	this.drink = drink;
}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return drink.name();
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return drink.price();
	}

}
