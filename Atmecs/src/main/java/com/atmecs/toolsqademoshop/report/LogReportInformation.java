package com.atmecs.toolsqademoshop.report;

import java.util.logging.Logger;

import com.atmecs.toolsqademoshop.constant.Constants;
import com.atmecs.toolsqademoshop.utils.ConfigReader;

public class LogReportInformation {
Logger logger = null;

public LogReportInformation() {
getlogger();
logger = Logger.getLogger(LogReportInformation.class.getName());
}

public void getlogger() {
ConfigReader.configure(Constants.LOGFILEPATH_FILE);
}

public void info(String message) {
logger.info(message);
}
}
