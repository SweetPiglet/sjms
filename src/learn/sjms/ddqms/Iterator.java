package learn.sjms.ddqms;
/**
 * 
 * @version: 1.1.0
 * @Description: 迭代器接口
 * @author: wsq
 * @date: 2020年5月16日下午4:20:36
 */
public interface Iterator {
		// 移到下一个元素
		public abstract void next();
		// 获取当前元素
		public abstract Object getNext();

		//是否存在下一个元素
		public abstract boolean isNext();
		

}
