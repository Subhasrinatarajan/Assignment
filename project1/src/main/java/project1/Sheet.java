package project1;

import java.util.logging.Logger;

public class Sheet 
{
	 public int sheet_no=10;
	    public String box="S2";
	    
	    public void sheet_details()
	    {
	    	Logger logger=Logger.getLogger("infologging");
	    	logger.info("Sheet Number :"+sheet_no);
	    	logger.info("Box :"+box);
	    	
	    }
		
}
