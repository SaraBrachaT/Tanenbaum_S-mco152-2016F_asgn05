
public class HTMLDiv extends HTMLTag {

	public HTMLDiv(String userText, String userId)
	{
		text = userText;
		id = userId;
		isId = true;
	}
	
	public HTMLDiv(String userText)
	{
		text = userText;
	}
	
	public String displayTag()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<div");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(text);
		sb.append("</div>");
		return sb.toString();
	}

}
