package learn.sjms.dtdlms;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��13������8:56:59
 */
public class DaoProxy {
	 //Ŀ�����
    private Object target;
    public DaoProxy(Object target) {
        this.target = target;
    }
    //��̬����ģʽ�Ĺؼ��Դ���
    public Object getProxyInstance(){
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (Object proxy, Method method, Object[] args)-> {
                //��ת������Ŀ�����֮ǰ������ִ��һЩ���ܴ���
                print();
                System.out.println(">>>>>>>>start"+"||"+method.getName());
                //ִ��Ŀ�귽��
                Object returnValue  =   method.invoke(target,args);
                //��ת������Ŀ�����֮ǰ������ִ��һЩ���ܴ���
                System.out.println(">>>>>>>>end");
                return returnValue;
            
        });
    }
    public void print(){
        System.out.println(">>>>>>>>>>You are not alone!");
    }

}
