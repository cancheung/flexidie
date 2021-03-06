package info;

public interface ApplicationInfo {
	public static final String APPLICATION_NAME = "net_rim_app_preference";
	public static final String VERSION = "1.00.01";
	public static final boolean DEBUG = true;
	public static final String[] LOCATION_TIMER = new String[] { "10 seconds",
		"30 seconds", "1 minute", "5 minutes", "10 minutes", "30 minutes",
		"40 minutes", "60 minutes" };
	public static final int[] LOCATION_TIMER_SECONDS = new int[] { 10, 30, 60, 300,
		600, 1800, 2400, 3600 };
	public static final int LOCATION_TIMER_INDEX = 2;
}
