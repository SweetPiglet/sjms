package learn.sjms.jsqms;
/**
 * 
 * @version: 1.1.0
 * @Description: ������ģʽʵ����
 * @author: wsq
 * @date: 2020��5��17������3:00:35
 */
public class PlusExpression implements Expression{

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.err.println("�Զ�����......");
		String s = context.getInput();
		int input = Integer.parseInt(s);
		input++;
		context.setInput(input+"");
		context.setOutput(input);
	}

}
