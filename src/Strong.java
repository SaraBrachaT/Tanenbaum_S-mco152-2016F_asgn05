
public class Strong extends HTMLDecorator{

	public Strong(HTMLTag t)
	{
		innerTag = t;
	}
	
	public Strong(HTMLTag t, String userId)
	{
		this(t);
		isId = true;
		id = userId;
	}

	public String displayTag() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<strong");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(innerTag.displayTag());
		sb.append("</strong>");
		return sb.toString();
	}
}
