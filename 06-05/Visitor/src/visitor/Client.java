package visitor;

public class Client {

	public static void main(String[] args) {
		PartList list = new PartList();
		Part pt1,pt2,pt3,pt4;
		
		pt1 = new Carframe("����A",500,20);
		pt2 = new Wheel("��̥A",400,10);
		pt3 = new Seat("����A",600,30);
		pt4 = new Wheel("��̥B",200,10);
		
		list.addPart(pt1);
		list.addPart(pt2);
		list.addPart(pt3);
		list.addPart(pt4);
		
		Visitor vis;
		vis=(Visitor)XMLUtil.getBean();
		list.accept(vis);
	}

}
