package learn.sjms.zjzms;
/**
 * 
 * @version: 1.1.0
 * @Description: 中介者接口类
 * @author: wsq
 * @date: 2020年5月15日上午11:00:49
 */
public interface Mediator {
//注册委员
void register(String lname,ClassLeader c);
//班长根据委员名字获得通知请求
void command(String lname);
}
