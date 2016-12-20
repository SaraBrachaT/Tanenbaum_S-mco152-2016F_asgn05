
public class A extends HTMLDecorator{
	
	private String href;
	
	public A( String site, HTMLTag t)
	{
		innerTag = t;
		href = site;
	}
	
	public A(String site, HTMLTag t, String userId)
	{
		this(site,t);
		isId = true;
		id = userId;
	}
	
	public String displayTag() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<a");
		sb.append(" href = \"");
		sb.append(href);
		sb.append("\"");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(innerTag.displayTag());
		sb.append("</a>");
		return sb.toString();
	}

}
