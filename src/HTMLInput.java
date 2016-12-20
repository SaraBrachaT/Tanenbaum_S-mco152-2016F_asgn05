
public class HTMLInput extends HTMLTag{
	
	private String type, event, value;

	
	public HTMLInput(String t, String e, String v)
	{
		type = t;
		event = e;
		value = v;
	}
	

	public HTMLInput(String userId, String t, String e, String v)
	{
		this(t, e, v);
		isId = true;
		id = userId;
	}
	
	public String displayTag()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<input");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(" type = ");
		sb.append("\"");
		sb.append(type);
		sb.append("\"");
		sb.append(" event = ");
		sb.append("\"");
		sb.append(event);
		sb.append("\"");
		sb.append(" value = ");
		sb.append("\"");
		sb.append(value);
		sb.append("\"");
		sb.append(">");
		sb.append("</input>");
		return sb.toString();
	}
}
