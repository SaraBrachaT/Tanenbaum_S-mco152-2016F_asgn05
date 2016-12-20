
public class HTMLParag extends HTMLTag{
	
	public HTMLParag(String userText)
	{
		text = userText;
	}
	
	public HTMLParag(String userId, String userText)
	{
		this(userText);
		isId = true;
		id = userId;
	}
	
	public String displayTag()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<p");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(text);
		sb.append("</p>");
		return sb.toString();
	}

}
