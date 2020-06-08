package learn.sjms.mlms;

public class ConcreteCommand implements Command{
private Receiver receiver = null;
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
