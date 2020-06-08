package learn.sjms.jtdlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 静态代理类
 * @author: wsq
 * @date: 2020年5月13日下午8:58:46
 */
public class Test {
public static void main(String[] args) {
	DaoProxy daoProxy = new DaoProxy(new DaoImpl());
	daoProxy.add();
	daoProxy.remove();
	daoProxy.update();
	daoProxy.find();
}
}
