package reusableComponents;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Practice {
	
	public static void main(String[] args) throws ParseException {
		
		
		String dateFormat="dd/MM/yyyy";
		String date="22/08/1992";
		//String outputDate;
		
		/*SimpleDateFormat iFormat=new SimpleDateFormat(inputFormat);
		SimpleDateFormat oFormat=new SimpleDateFormat("d MMMMM yyyy");
		
		System.out.println(oFormat.format(iFormat.parse(inputDate)));*/
		
		SimpleDateFormat iFormat=new SimpleDateFormat(dateFormat);
		SimpleDateFormat oFormat=new SimpleDateFormat("d MMMMM yyyy");
		String outputDate=oFormat.format(iFormat.parse(date));
		String[] a=outputDate.split(" ",2);
		String day=a[0];
		String month=a[1];
		System.out.println(day);
		System.out.println(month);
		
		
		
		
		
	}

}
