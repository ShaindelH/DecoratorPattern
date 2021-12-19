package assignment6;

public class Main {

	public static void main(String[] args) {
		
		Tag tag1= new Div("Hello World");
		tag1 = new Em(tag1);
		tag1 = new Italic(tag1);
		
		System.out.println(tag1.display());
		
		Tag tag2 = new HTag(3, "Decorator Pattern");
		tag2 = new Strong(tag2);
		tag2 = new Small(tag2);
		tag2 = new Href(tag2, "google.com");
		
		System.out.println(tag2.display());
		
		Tag tag3 = new Input("button", "action", "onclick", "javascript:alert('action')");
		tag3 = new Strong(tag3);
		
		System.out.println(tag3.display());
		
	}

}
