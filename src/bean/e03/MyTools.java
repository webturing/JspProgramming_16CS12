package bean.e03;

public class MyTools {
	public static String change(String str){
		str=str.replace("<","&lt;");
		str=str.replace(">","&gt;");
	//	str=str.replace(" ", "&nbsp");
	//	str=str.replace("\n", "<br>");
		return str;		
	}
}