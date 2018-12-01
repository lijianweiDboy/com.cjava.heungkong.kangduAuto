package com.cjava.dateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author win10
 *
 */
public class Format {


	/**
	 * @param dateParseString  Ŀǰ���ַ���ʱ���ʽ
	 * @param dateFormatString ��Ҫװ���ɵĸ�ʽ
	 * @param dateString �����ַ���
	 * @deprecated ʱ���ʽ����:2018-07-23T21:00:44.653+08:00:yyyy-MM-dd'T'HH:mm:ss.SSSXXX,
	 * 2018-07-23:yyyy-MM-dd ��
	 * @return
	 */
	public static String formatDate(String dateParseString,String dateFormatString,String dateString) {
		SimpleDateFormat dateParse=new SimpleDateFormat(dateParseString);
		SimpleDateFormat dateFormat=new SimpleDateFormat(dateFormatString);
		String d = null;
		try {
			d = dateFormat.format(dateParse.parse(dateParseString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;	
	}
	
	/**
	 * @param dateParseString  Ŀǰ���ַ���ʱ���ʽ
	 * @param dateFormatString ��Ҫװ���ɵĸ�ʽ
	 * @param dateString �����ַ���
	 * @deprecated ʱ���ʽ����:2018-07-23T21:00:44.653+08:00:yyyy-MM-dd'T'HH:mm:ss.SSSXXX,
	 * 2018-07-23:yyyy-MM-dd ��
	 * @return
	 */
    public static Date formatDateTime(String time) throws ParseException {
   	 
    	String formatString="";
  		if(time.contains(".")) {
  			formatString = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
  			SimpleDateFormat format = new SimpleDateFormat(formatString);
  			
            return format.parse(time);
  			
  		}else {
  			formatString = "yyyy-MM-dd'T'HH:mm:ssX";
  			SimpleDateFormat format = new SimpleDateFormat(formatString);
  			return format.parse(time);
  		}
}
}
