package assignment6;

public class Em extends DecoratorTag {

	public Em(Tag tag) {
		this.tag = tag;
	}
	
	@Override
	public String display() {
		return "<em>" + tag.display() + "</em>";
	}

}
