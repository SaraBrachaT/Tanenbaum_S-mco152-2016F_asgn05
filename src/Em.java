
public class Em extends HTMLDecorator{

	public Em(HTMLTag t)
	{
		innerTag = t;
	}
	
	public Em(HTMLTag t, String userId)
	{
		this(t);
		isId = true;
		id = userId;
	}

	public String displayTag() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<em");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(innerTag.displayTag());
		sb.append("</em>");
		return sb.toString();
	}
}
