package learn.sjms.dtdlms;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @version: 1.1.0
 * @Description: 代理类
 * @author: wsq
 * @date: 2020年5月13日下午8:56:59
 */
public class DaoProxy {
	 //目标对象
    private Object target;
    public DaoProxy(Object target) {
        this.target = target;
    }
    //动态代理模式的关键性代码
    public Object getProxyInstance(){
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (Object proxy, Method method, Object[] args)-> {
                //在转调具体目标对象之前，可以执行一些功能处理
                print();
                System.out.println(">>>>>>>>start"+"||"+method.getName());
                //执行目标方法
                Object returnValue  =   method.invoke(target,args);
                //在转调具体目标对象之前，可以执行一些功能处理
                System.out.println(">>>>>>>>end");
                return returnValue;
            
        });
    }
    public void print(){
        System.out.println(">>>>>>>>>>You are not alone!");
    }

}
