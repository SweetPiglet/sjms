package learn.sjms.qjms;
/**
 * 
 * @version: 1.1.0
 * @Description: 测试类 
 * @author: wsq
 * @date: 2020年5月11日上午9:17:58
 */
public class Test {
public static void main(String[] args) {
	TvControllerInterface tci = new TvController(new ChTv());
	tci.on();
	tci.off();
	tci.waitnow();
	TvControllerInterface tci1 = new TvController(new SnTv());
	tci1.on();
	tci1.off();
	tci1.waitnow();
}
}
