
public class HTMLHeader extends HTMLTag{

	private int hNum;
	public HTMLHeader(String userId, String num, int hNum, String userText)
	{
		text = userText;
		id = userId;
		isId = true;
		this.hNum = hNum; 
	}
	
	public HTMLHeader(String num, int hNum, String userText)
	{
		text = userText;
		this.hNum = hNum;
	}
	
	public String displayTag() {
		StringBuffer sb = new StringBuffer();
		sb.append("<h");
		sb.append(hNum);
		if(isId)
		{
			sb.append(" id = ");
			sb.append(id);
		}
		sb.append(">");
		sb.append(text);
		sb.append("</h>");
		sb.append(hNum);
		return sb.toString();
	
	
	}
}
