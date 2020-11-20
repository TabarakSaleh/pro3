package test;

public class HOME {
	
	
	public HOME(String string1, String string2) {
		  String []s1 = string1.split("_");
		  String []t1 = string2.split("_");
		  
		this.type =s1[0] ;
		this.meterial =s1[1] ;
		this.placement=s1[2] ;
		this.allowpets =s1[3] ;
		this.amenities =s1[4] ;
		this.firstprice=Double.parseDouble(t1[0]) ;
		this.firstarea=Double.parseDouble(t1[1]) ;
		this.bedroomsnumber=Integer.parseInt(t1[2]);
		this.bathroomsnumber = Integer.parseInt(t1[3]) ;
		this.leaselength=Integer.parseInt(t1[4]) ;
	}
   private	String placement ;
   private	String meterial ;
   private  double firstprice =0 ;
   private double secoundprice ;
   private double firstarea ;
   private double secoundarea ;
   private int bedroomsnumber ;
   private int bathroomsnumber ;
   private String allowpets ;
   private String type ;
   private int leaselength ;
   private String  amenities; 
  
   public String getplacementr() {
	   return placement ;
   }
   public String getmeterial() {
	   return meterial ;
   }public double getfirstprice() {
	   return firstprice ;
   }public double getsecoundprice() {
	   return secoundprice ;
   }public double getfirstarea() {
	   return firstarea ;
   }public double getsecoundarea() {
	   return secoundarea ;
   }public int getbathroomsnumber() {
	   return bathroomsnumber ;
   }public int getbedroomnumber() {
	   return bedroomsnumber ;
   }public String allowpets() {
	   return allowpets ;
   }public String gettype() {
	   return type ;
   }public int getleaselength() {
	   return leaselength ;
   }public String getamenities() {
	   return amenities ;
   }
   
  
 
}