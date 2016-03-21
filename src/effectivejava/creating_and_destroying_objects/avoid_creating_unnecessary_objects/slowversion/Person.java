package effectivejava.creating_and_destroying_objects.avoid_creating_unnecessary_objects.slowversion;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
    private final Date _birthDate;

    public Person(Date birthDate) {
	_birthDate = birthDate;
    }

    // Other fields, methods omitted

    // DON'T DO THIS
    public boolean isBabyBoomer() {
	// Unnecessary allocation of expensive object
	Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
	Date boomStart = gmtCal.getTime();
	gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
	Date boomEnd = gmtCal.getTime();

	return _birthDate.compareTo(boomStart) >= 0 &&
	       _birthDate.compareTo(boomEnd) < 0;

    }
}
