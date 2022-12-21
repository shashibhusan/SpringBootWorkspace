import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		/*
		 * List<String> city = Arrays.asList("Boston", "San Diego", "Las Vegas",
		 * "Houston", "Miami", "Austin");
		 * 
		 * long seconds = 1320105600; Instant i =
		 * Instant.ofEpochSecond(1320105600/1000); ZonedDateTime zdt =
		 * ZonedDateTime.ofInstant(i, ZoneOffset.UTC);
		 * 
		 * LocalDate localDate = zdt.toLocalDate(); LocalTime localTime =
		 * zdt.toLocalTime();
		 * 
		 * String ss=String.format(
		 * "IOTQueueConsumer.postTimeSeriesData() indicatorData not found for objectId : %s, position : %s, ssId : %s, characteristic : %s, categoryId :%s "
		 * , localDate, localDate, localDate, localDate, localDate);
		 * System.out.println("==== : "+ss);
		 * 
		 * System.out.println("localDate"+localDate);
		 * System.out.println("localTime"+localTime);
		 */
		//9999-12-31T00:00:00
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate validityEndDate = LocalDate.parse("2001-01-28", formatter);

		 System.out.println("---- "+validityEndDate.getDayOfMonth());
	
	}
	

}
