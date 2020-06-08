package learn.sjms.fhxyms;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @version: 1.1.0
 * @Description: ��Ԫ������
 * @author: wsq
 * @date: 2020��5��13������8:10:23
 */
public class FlyweightFactory {
private static Map<Integer,Person> personMap = new HashMap<Integer,Person>();
// ������Ԫ����
public static Person getPerson(Integer id,String name, String gender, int age) {
	Person person = personMap.get(id);
	if(person == null) {
		person = new Person(id,name,gender,age);
		personMap.put(id, person);
	}
	return person;
}
// ������Ԫ����
public static Person getPersonList(Integer id,String name, String gender, int age) {
	Person person = personMap.get(id);
	if(person == null) {
		person = new Person(id,name,gender,age);
		personMap.put(id, person);
	}
	return person;
}
}
