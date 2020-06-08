package learn.sjms.dcxyms;
/**
 * 
 * @version: 1.1.0
 * @Description: 
 * @author: wsq
 * @date: 2020年5月13日下午8:02:10
 */
public class Person {
private int id;
private String name;
private String gender;
private int age;
public Person(int id, String name, String gender, int age) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
}

}
