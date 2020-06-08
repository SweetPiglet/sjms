package learn.sjms.fwzms;

public class ElementVisitorImpl implements ElementVisitor {

	@Override
	public void vist(ElementAImpl elementAImpl) {
		// TODO Auto-generated method stub
		System.err.println("elementAImpl");
	}

	@Override
	public void vist(ElementBImpl elementBImpl) {
		// TODO Auto-generated method stub
		System.err.println("elementBImpl");
	}

	@Override
	public void vist(ElementCImpl elementCImpl) {
		// TODO Auto-generated method stub
		System.err.println("elementCImpl");
	}

	@Override
	public void vist(ElementDImpl elementDImpl) {
		// TODO Auto-generated method stub
		System.err.println("elementDImpl");
	}

}
