package com.atmecs.automation.report;

import java.util.logging.Logger;

import com.atmecs.automation.commonutils.ConfigReader;
import com.atmecs.automation.constant.Constants;

public class Log {
	Logger logger = null;

	public Log() {
		getlogger();
		logger = Logger.getLogger(Log.class.getName());
	}

	public void getlogger() {
		ConfigReader.configure(Constants.LOGFILEPATH_FILE);
	}

	public void info(String message) {
		logger.info(message);
	}
}
