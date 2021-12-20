package assignment6;

public class HTag extends Tag {

	public HTag(int hNum, String id, String name, String text) {
		description = "<h" + hNum + "id=\"" + id + "\" name=\"" + name + "\">" + text + "</h" + hNum + ">";
	}
	
	public HTag(int hNum, String text, String id) {
		description = "<h" + hNum + "id=\"" + id + "\">" + text + "</h" + hNum + ">";
	}
	
	public HTag(int hNum, String text) {
		description = "<h" + hNum + ">" + text + "</h" + hNum + ">";
	}

}
