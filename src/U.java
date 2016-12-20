
public class U extends HTMLDecorator{
	public U(HTMLTag t)
	{
		innerTag = t;
	}
	
	public U(HTMLTag t, String userId)
	{
		this(t);
		isId = true;
		id = userId;
	}

	public String displayTag() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<u");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(innerTag.displayTag());
		sb.append("</u>");
		return sb.toString();
	}
}
