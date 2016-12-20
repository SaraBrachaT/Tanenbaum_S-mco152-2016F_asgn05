
public class I extends HTMLDecorator{

	public I(HTMLTag t)
	{
		innerTag = t;
	}
	
	public I(HTMLTag t, String userId)
	{
		this(t);
		isId = true;
		id = userId;
	}
	
	public String displayTag() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<i");
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(innerTag.displayTag());
		sb.append("</i>");
		return sb.toString();
	}
}
