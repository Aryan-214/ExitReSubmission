package Base;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Logger1 {
	private static Logger Log = LogManager.getLogger(Logger1.class);

	public static void info(String message) {

		Log.info(message);

	}

	public static void error(String message) {

		Log.error(message);

	}
}
