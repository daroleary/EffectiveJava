package effectivejava.classesandinterfaces.use_accessor_methods_in_public_classes;


// Public class with exposed immutable fields - questionable
public final class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int _hour;
    public final int _minute;

    public Time(int hour, int minute) {
	if (hour < 0 || hour >= HOURS_PER_DAY) {
	    throw new IllegalArgumentException("Hour: " + hour);
	}
	if (minute < 0 || minute >= MINUTES_PER_HOUR) {
	    throw new IllegalArgumentException("Min: " + minute);
	}
	_hour = hour;
	_minute = minute;
    }
}
