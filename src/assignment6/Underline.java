package assignment6;

public class Underline extends DecoratorTag{

	public Underline(Tag tag) {
		this.tag = tag;
	}
	
	@Override
	public String display() {
		return "<u>" + tag.display() + "</u>";
	}

}
