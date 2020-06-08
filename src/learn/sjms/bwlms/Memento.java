package learn.sjms.bwlms;
/**
 * 
 * @version: 1.1.0
 * @Description: 备忘录类
 * @author: wsq
 * @date: 2020年5月15日上午10:17:50
 */
public class Memento {
private int id;
private int age;
private String name;
public Memento(int id, int age, String name) {
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

}
