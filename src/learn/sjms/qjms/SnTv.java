package learn.sjms.qjms;
/**
 * 
 * @version: 1.1.0
 * @Description: ���ӻ���ʵ����
 * @author: wsq
 * @date: 2020��5��11������9:06:24
 */
public class SnTv implements TvInterface{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("������ӿ����ˡ���������");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("������ӹػ��ˡ���������");
	}

	@Override
	public void waitnow() {
		// TODO Auto-generated method stub
		System.out.println("������Ӵ����С���������");
	}

}
