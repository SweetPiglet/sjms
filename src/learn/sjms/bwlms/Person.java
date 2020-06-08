package learn.sjms.bwlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 普通类
 * @author: wsq
 * @date: 2020年5月15日上午10:19:28
 */
public class Person {
	private int id;
	private int age;
	private String name;
	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	// 创建备份
public Memento createMemento() {
	return new Memento(id, age, name);
}
	// 恢复备份
public void restoreMemento(Memento memento) {
	this.id = memento.getId();
	this.age = memento.getAge();
	this.name = memento.getName();
}
}
