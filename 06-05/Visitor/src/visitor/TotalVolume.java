package visitor;

public class TotalVolume extends Visitor{

	@Override
	public void visit(Carframe cf) {
		String name=cf.getName();
		int volume = cf.getVolume();
		System.out.println(name+"体积占"+volume+"立方米.");
	}

	@Override
	public void visit(Wheel wh) {
		String name=wh.getName();
		int volume=wh.getVolume();
		System.out.println(name+"体积占"+volume+"立方米.");
	}

	@Override
	public void visit(Seat st) {
		String name=st.getName();
		int volume=st.getVolume();
		System.out.println(name+"体积占"+volume+"立方米.");
	}

}
