package fixacao118.codetests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = sdf.parse("02/05/1988");
		
		System.out.println(sdf.format(date));

	}

}
