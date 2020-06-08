package learn.sjms.fwzms;
/**
 * 
 * @version: 1.1.0
 * @Description: 抽象访问者
 * @author: wsq
 * @date: 2020年5月14日上午10:17:02
 */
public interface ElementVisitor {
public void vist(ElementAImpl elementAImpl);
public void vist(ElementBImpl elementBImpl);
public void vist(ElementCImpl elementCImpl);
public void vist(ElementDImpl elementDImpl);
}
