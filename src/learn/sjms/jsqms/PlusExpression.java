package learn.sjms.jsqms;
/**
 * 
 * @version: 1.1.0
 * @Description: 解释器模式实现类
 * @author: wsq
 * @date: 2020年5月17日下午3:00:35
 */
public class PlusExpression implements Expression{

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.err.println("自动递增......");
		String s = context.getInput();
		int input = Integer.parseInt(s);
		input++;
		context.setInput(input+"");
		context.setOutput(input);
	}

}
