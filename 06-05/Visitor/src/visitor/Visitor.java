package visitor;

public abstract class Visitor {
	public abstract void visit(Carframe cf);
	public abstract void visit(Wheel wh);
	public abstract void visit(Seat st);
}
