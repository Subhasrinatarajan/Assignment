package project1;

public class Train 
{
	 public String Train_Name;
	   public String starting_place;
	   public String Ending_place;
	   public long Train_no;
	   public double Platform_Arraival_Timing;
	   public double Train_starting_Time;
	   public double Ending_place_Arraival_Timing;
	   public Train(String Train_Name,String starting_place,String Ending_place,long Train_no,double Platform_Arraival_Timing,double Train_starting_Time,double Ending_place_Arraival_Timing)
	   {
		   this.Train_Name=Train_Name;
		   this.starting_place=starting_place;
		   this.Ending_place=Ending_place;
		   this.Train_no=Train_no;
		   this.Platform_Arraival_Timing=Platform_Arraival_Timing;
		   this.Train_starting_Time=Train_starting_Time;
		   this.Ending_place_Arraival_Timing=Ending_place_Arraival_Timing;
	   }
	   public void Train_Details()
	   {
		   System.out.println("Train Name :"+Train_Name);
		   System.out.println("Starting Place :"+starting_place);
		   System.out.println("Ending Place :"+Ending_place);
		   System.out.println("Train Number :"+Train_no);
		   System.out.println("Platform Arraival Timing :"+Platform_Arraival_Timing);
		   System.out.println("Train Starting Time :"+Train_starting_Time);
		   System.out.println("Ending place arraival timing :"+Ending_place_Arraival_Timing);
	   }
}
