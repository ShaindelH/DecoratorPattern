package assignment6;

public class Italic extends DecoratorTag {

	public Italic(Tag tag) {
		this.tag = tag;
	}
	
	@Override
	public String display() {
		return "<i>" + tag.display() + "</i>" ;
	}
}
