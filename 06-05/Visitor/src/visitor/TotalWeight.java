package visitor;

public class TotalWeight extends Visitor{

	@Override
	public void visit(Carframe cf) {
		String name=cf.getName();
		int weight = cf.getWeight();
		System.out.println(name+"������"+weight+"ǧ�ˡ�");
	}

	@Override
	public void visit(Wheel wh) {
		String name=wh.getName();
		int weight=wh.getWeight();
		System.out.println(name+"������"+weight+"ǧ�ˡ�");
	}

	@Override
	public void visit(Seat st) {
		String name=st.getName();
		int weight = st.getWeight();
		System.out.println(name+"������"+weight+"ǧ�ˡ�");
	}
}
