package learn.sjms.fwzms;
/**
 * 
 * @version: 1.1.0
 * @Description: ���������
 * @author: wsq
 * @date: 2020��5��14������10:17:02
 */
public interface ElementVisitor {
public void vist(ElementAImpl elementAImpl);
public void vist(ElementBImpl elementBImpl);
public void vist(ElementCImpl elementCImpl);
public void vist(ElementDImpl elementDImpl);
}
