package learn.sjms.jsqms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @version: 1.1.0
 * @Description: ������ģʽ������
 * @author: wsq
 * @date: 2020��5��17������3:09:31
 */
public class Test {
public static void main(String[] args) {
	Context context = new Context("20");
	List<Expression> list = new ArrayList<Expression>();
	list.add(new PlusExpression());
	list.add(new PlusExpression());
	list.add(new PlusExpression());
	list.add(new PlusExpression());
	list.add(new PlusExpression());
	list.forEach(x -> {
		x.interpret(context);
	});
	System.err.println(context.getOutput());
}
}
