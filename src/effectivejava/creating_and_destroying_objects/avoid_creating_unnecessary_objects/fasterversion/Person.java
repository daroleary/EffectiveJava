package effectivejava.creating_and_destroying_objects.avoid_creating_unnecessary_objects.fasterversion;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {

    private final Date _birthDate;

    public Person(Date birthDate) {
	// Defensive copy - see Item 39
	_birthDate = new Date(birthDate.getTime());
    }

    /**
     * The starting and ending dates of the baby boom
     */
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
	Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
	BOOM_START = gmtCal.getTime();
	gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
	BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
	return _birthDate.compareTo(BOOM_START) >= 0
		&& _birthDate.compareTo(BOOM_END) < 0;
    }
}
