package learn.sjms.ddqms;
/**
 * 
 * @version: 1.1.0
 * @Description: �������ӿ�
 * @author: wsq
 * @date: 2020��5��16������4:20:36
 */
public interface Iterator {
		// �Ƶ���һ��Ԫ��
		public abstract void next();
		// ��ȡ��ǰԪ��
		public abstract Object getNext();

		//�Ƿ������һ��Ԫ��
		public abstract boolean isNext();
		

}
