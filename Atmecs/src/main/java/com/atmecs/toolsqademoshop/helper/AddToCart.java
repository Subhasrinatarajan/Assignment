package com.atmecs.toolsqademoshop.helper;

import java.io.IOException;

import com.atmecs.toolsqademoshop.testbase.TestBase;


public class AddToCart extends TestBase
{
  public static void addtocart() throws IOException
  {
	  Scrolling.dropdown("pa_color", 1);
      Scrolling.dropdown("pa_size", 1);
         
      ClickOperation.pg_click_opr(driver,addtocart);
     
  }
}
