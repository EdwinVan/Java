package visitor;

public class Wheel implements Part {
	private String name;
	private int weight;
	private int volume;

	public Wheel(String name,int weight,int volume) {
		this.name=name;
		this.weight=weight;
		this.volume=volume;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return (this.name);
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public void setVolume(int volume) {
		this.volume=volume;
	}
	public int getWeight() {
		return (this.weight);
	}
	public int getVolume() {
		return (this.volume);
	}

	@Override
	public void accept(Visitor vis) {
		vis.visit(this);
	}
}
