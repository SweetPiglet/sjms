package learn.sjms.dxspqms;
/**
 * 
 * @version: 1.1.0
 * @Description: ������������
 * @author: wsq
 * @date: 2020��5��10������9:48:06
 */

import learn.sjms.lspqms.YClass;
@SuppressWarnings("all")
public class Adapter implements SpqInterface{
private YClass yc;
public void Adapter() {
	yc = new YClass();
}
@Override
public void method1() {
	// TODO Auto-generated method stub
	yc.method1();
}
@Override
public void method2() {
	// TODO Auto-generated method stub
	System.err.println("Ŀ�귽������");
}

}
