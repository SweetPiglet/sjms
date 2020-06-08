package learn.sjms.dtdlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 动态代理类
 * @author: wsq
 * @date: 2020年5月13日下午8:58:46
 */
public class Test {
public static void main(String[] args) {
DaoInterface di = new DaoImpl();
DaoInterface dp = (DaoInterface) new DaoProxy(di).getProxyInstance();
dp.add();
dp.remove();
dp.update();
dp.find();
}
}
