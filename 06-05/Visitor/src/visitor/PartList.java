package visitor;

import java.util.ArrayList;

public class PartList {
	private ArrayList<Part> list=new ArrayList<Part>();
	public void addPart(Part pt) {
		list.add(pt);
	}
	public void accept(Visitor vis) {
		for(Object obj:list) {
			((Part)obj).accept(vis);
		}
	}
}
