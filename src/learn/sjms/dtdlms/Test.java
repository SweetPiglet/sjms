package learn.sjms.dtdlms;
/**
 * 
 * @version: 1.1.0
 * @Description: ��̬������
 * @author: wsq
 * @date: 2020��5��13������8:58:46
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
