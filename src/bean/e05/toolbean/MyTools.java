package bean.e05.toolbean;

import java.io.UnsupportedEncodingException;

public class MyTools {
	public static int strToint(String str){			//��String�����ת��Ϊint����ݵķ���
		if(str==null||str.equals(""))
			str="0";
		int i=0;
		try{
			i=Integer.parseInt(str);
		}catch(NumberFormatException e){
			i=0;
			e.printStackTrace();
		}
		return i;		
	}
	public static String toChinese(String str){		//����ת������ķ���
		if(str==null)
			str="";
		try {
			str=new String(str.getBytes("ISO-8859-1"),"gb2312");
		} catch (UnsupportedEncodingException e) {
			str="";
			e.printStackTrace();
		}
		return str;
	}
}