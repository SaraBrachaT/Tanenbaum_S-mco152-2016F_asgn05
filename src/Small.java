
public class Small extends HTMLDecorator{

	public Small(HTMLTag t)
	{
		innerTag = t;
	}
	
	public Small(HTMLTag t, String userId)
	{
		this(t);
		isId = true;
		id = userId;
	}
	
	public String displayTag() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<small");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(innerTag.displayTag());
		sb.append("</small>");
		return sb.toString();
	}
}
