package assignment6;

public class Strong extends DecoratorTag {

	public Strong(Tag tag) {
		this.tag = tag;
	}
	@Override
	public String display() {
		return "<strong>" + tag.display() + "</strong>";
	}

}
