package assignment6;

public class Input extends Tag {

	public Input(String type, String id, String value, String name, String functionName, String function) {
		description = "<input type=\"" + type + "\" id=\"" + id + "\" value=\"" + value + "\" name=\"" + name + "\" "
				+ functionName + "=\"" + function + "\"></input>";
	}

	public Input(String type, String id, String name) {
		description = "<input type=\"" + type + "\" " + "id=\"" + id + "\" name=\"" + name + "\"></input>";
	}

	public Input(String type, String id) {
		description = "<input type=\"" + type + "\" " + "id=\"" + id + "\"></input>";
	}

	public Input(String type) {
		description = "<input type=\"" + type + "\"></input>";

	}

}
