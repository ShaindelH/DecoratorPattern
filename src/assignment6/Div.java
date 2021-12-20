package assignment6;

public class Div extends Tag {

	public Div(String text, String id, String name) {

		description = "<div id=\"" + id + "\" name=\"" + name + "\">" + text + "</div>";
	}
	
	public Div(String text, String id) {
		description = "<div id=\"" + id + "\">" + text + "</div>";
	}

	public Div(String text) {
		description = "<div>" + text + "</div>";
	}

}
