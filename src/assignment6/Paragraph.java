package assignment6;

public class Paragraph extends Tag {

	public Paragraph(String text, String id, String name) {
		description = "<p id= \"" + id + "\" name=\"" + name + "\">" + text + "</p>";
	}

	public Paragraph(String text, String id) {
		description = "<p id= \"" + id + "\">" + text + "</p>";
	}

	public Paragraph(String text) {
		description = "<p>" + text + "</p>";
	}

}
