
public class Main {
	public static void main(String[] args)
	{
		HTMLDiv div = new HTMLDiv("Hello");
		System.out.println(div.displayTag());
		HTMLDiv div2 = new HTMLDiv("Hello", "World");
		System.out.println(div2.displayTag());
		HTMLTag t = new U( new Strong(new HTMLParag("Assignment 5")), "I have an id");
		System.out.println(t.displayTag());
		HTMLTag t1 = new Em ( new Small (new HTMLInput("button", "onClick or some event", "action")));
		System.out.println(t1.displayTag());
		HTMLTag t2 = new I(new A("www.touro.edu", new Strong (new HTMLDiv("Touro"))));
		System.out.println(t2.displayTag());
	}
}
