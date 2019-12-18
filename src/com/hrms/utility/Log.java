package com.hrms.utility;

import java.util.logging.Logger;

public class Log {

	private static Logger log = Logger.getLogger(Log.class.getName()); // initialize log4j logs

	public static void info(String message) {

		log.info(message);
	}

}
