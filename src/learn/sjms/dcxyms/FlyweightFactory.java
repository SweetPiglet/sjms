package learn.sjms.dcxyms;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @version: 1.1.0
 * @Description: 享元对象类
 * @author: wsq
 * @date: 2020年5月13日下午8:10:23
 */
public class FlyweightFactory {
private static Map<Integer,Person> personMap = new HashMap<Integer,Person>();
public static Person getPerson(Integer id,String name, String gender, int age) {
	Person person = personMap.get(id);
	if(person == null) {
		person = new Person(id,name,gender,age);
		personMap.put(id, person);
	}
	return person;
}
}
