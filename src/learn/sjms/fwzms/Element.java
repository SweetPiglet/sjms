package learn.sjms.fwzms;
/**
 * 
 * @version: 1.1.0
 * @Description: 抽象元素
 * @author: wsq
 * @date: 2020年5月14日上午10:16:12
 */
public interface Element {
public void accept(ElementVisitor elementVisitor);
}
