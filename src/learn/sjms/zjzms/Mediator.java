package learn.sjms.zjzms;
/**
 * 
 * @version: 1.1.0
 * @Description: �н��߽ӿ���
 * @author: wsq
 * @date: 2020��5��15������11:00:49
 */
public interface Mediator {
//ע��ίԱ
void register(String lname,ClassLeader c);
//�೤����ίԱ���ֻ��֪ͨ����
void command(String lname);
}
