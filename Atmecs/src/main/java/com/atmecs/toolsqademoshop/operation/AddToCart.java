package com.atmecs.toolsqademoshop.operation;

import java.io.IOException;

import com.atmecs.toolsqademoshop.testbase.TestBase;
import com.atmecs.toolsqademoshop.utils.ConfigReader;

public class AddToCart extends TestBase
{
  public static void addtocart() throws IOException
  {
	  Scrolling.dropdown("pa_color", 1);
      Scrolling.dropdown("pa_size", 1);
         
      String addtocart = ConfigReader.getData("loc.btn.adddtocart");
      ClickOperation.pg_click_opr(driver,addtocart);
     
  }
}
