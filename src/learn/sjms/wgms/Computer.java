package learn.sjms.wgms;
/**
 * 
 * @version: 1.1.0
 * @Description: ��ϵ��
 * @author: wsq
 * @date: 2020��5��13������7:36:21
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
	System.out.println("���������С�����������");
	cpu.startup();
	memory.startup();
	disk.startup();
	System.out.println("����������ɣ�");
	
}

public void shutdown() {
	System.out.println("���Թػ��С�����������");
	cpu.shutdown();
	memory.shutdown();
	disk.shutdown();
	System.out.println("���Թػ���ɣ�");
}
}
