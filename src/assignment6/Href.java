package assignment6;

public class Href extends DecoratorTag{
	
	private String url;
	
	public Href(Tag tag, String url) {

		this.tag = tag;
		this.url = url;
	}
	
	@Override
	public String display() {
		return "<a href=\"" + url + "\">" + tag.display() + "</a>";
	}

}
