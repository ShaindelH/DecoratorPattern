package assignment6;

public class Small extends DecoratorTag{

	public Small(Tag tag) {
		this.tag = tag;
	}
	
	@Override
	public String display() {
		return "<small>" + tag.display() + "</small>";
	}
	
}
