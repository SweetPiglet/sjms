package learn.sjms.wgms;
/**
 * 
 * @version: 1.1.0
 * @Description: 关系类
 * @author: wsq
 * @date: 2020年5月13日下午7:36:21
 */
public class Computer {
private CPU cpu;
private Memory memory;
private Disk disk;
public Computer() {
	cpu = new CPU();
	memory = new Memory();
	disk = new Disk();
}
public void shtartup() {
	System.out.println("电脑启动中。。。。。。");
	cpu.startup();
	memory.startup();
	disk.startup();
	System.out.println("电脑启动完成！");
	
}

public void shutdown() {
	System.out.println("电脑关机中。。。。。。");
	cpu.shutdown();
	memory.shutdown();
	disk.shutdown();
	System.out.println("电脑关机完成！");
}
}
