package assignment4;

public class ElementType {
	String Identifier;
	String access;
	
	public ElementType() {
		Identifier = "info";
        access = "private";
	}
	public ElementType(String Identifier, String access) {
		this.Identifier = Identifier;
		this.access = access;
	}
	
	public String toString()
    {
        return "[" + Identifier + " | " + access + "]";
    }

}
