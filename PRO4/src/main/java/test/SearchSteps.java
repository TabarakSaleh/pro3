package test;

import java.util.ArrayList;

import javax.naming.NamingException;

import java.util.*;


public class SearchSteps {
	String ma1 = "Material" ;
	String ar1 = "area" ;
	String pla1 = "Placement" ;
	String pri1 = "price" ;
	String be1 = "bedrooms";
	String ba1 = "bathrooms" ;
	String pet1 = "Pets" ;
	String ty1 ="type";
	String le1 ="Lease Length" ;
	String amn1 = "Amenities" ;
	private  WebEmailService emailService =new WebEmailService();
	 List<HOME> priceList =new ArrayList<HOME>();
List<HOME> repository =new ArrayList <HOME>();
public void findhome(List<HOME> h) {
	this.repository=h ;

}
public  List<HOME> bybedroomsnumber (List<HOME> repo,int x){
	ArrayList<HOME> founded = new ArrayList<HOME>();
	if(x==1||x==2||x==3||x==4||x==5) {
	for (int c =0 ;c<repo.size();c++) {
		if (repo.get(c).getbedroomnumber()==x) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
		    
		}
		}
	}
return founded ;
}
public  List<HOME> bybathroomsnumber(List<HOME> repo,int x){
	ArrayList<HOME> founded = new ArrayList<HOME>();

	if (x==1||x==2||x==3) {
	for (int c =0 ;c<repo.size();c++) {
		if (repo.get(c).getbathroomsnumber()==x) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
		

		}
	}}
return founded ;
}
public boolean notexist(HOME h) {
	int x=0;
	boolean a=false;
	for (int c =0 ;c<repository.size();c++) {
		if(repository.get(c)!=h) {
			x++;
		}}
	if(x==repository.size()) {
		a= true ;
	}else a= false;

	return a;
	
	}
public List<HOME> byAllowpets(List<HOME> repo,String d) {
	
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	if(d.equalsIgnoreCase("yes")||d.equalsIgnoreCase("no")) {
	for (int c =0 ;c<repo.size();c++) {
		String z =repo.get(c).allowpets();
		

		if (z.equals(d)) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
		    
		}}
	}
return founded ;
}
public List<HOME> byType(List<HOME> repo,String s) {
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	if(s.equalsIgnoreCase("HOUSE")||s.equalsIgnoreCase("APARTMENT")) {
	for (int c =0 ;c<repo.size();c++) {
		String z =repo.get(c).gettype();
		if (z.equals(s)) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
			
		}
		}
	}
return founded ;
}
public List<HOME> byleasenumber(List<HOME> repo,Integer int1) {
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	if(int1==6||int1==12) {
	for (int c =0 ;c<repo.size();c++) {
		if (repo.get(c).getleaselength()==int1) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
		    
		}
		}
	}
return founded ;}
public List<HOME> byAmenitie(List<HOME> repo,String s) {
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	for (int c =0 ;c<repo.size();c++) {
		 String h ;
		 h = repo.get(c).getamenities();
		  String []h1 = h.split(",");
		  for (int i =0;i<h1.length;i++) {
		if (h1[i].equals(s)) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
		    
		}
		}
	}
return founded ;}

public List<HOME> byplacement(List<HOME> repo,String string) {
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	if (string.equalsIgnoreCase("VILLAGE")||string.equalsIgnoreCase("CITY")) {
	for (int c =0 ;c<repo.size();c++) {
		String z =repo.get(c).getplacementr();

		if (z.equals(string)) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
			
		}
		}
	}
return founded ;
}

public List<HOME> byMaterial(List<HOME> repo,String string) {
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	if(string.equalsIgnoreCase("STONE")||string.equalsIgnoreCase("BRICK")||string.equalsIgnoreCase("WOOD")) {
	for (int c =0 ;c<repo.size();c++) {
		String z =repo.get(c).getmeterial();

		if (z.equals(string)) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
		}

		}
	}
return founded ;
}
public List<HOME> bypice(List<HOME> repo,Double double1)  {
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	for (int c =0 ;c<repo.size();c++) {
		Double z =repo.get(c).getfirstprice();

		if (z<= double1) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
			

		}
	}
	priceList=founded;
	String email="hayasam@najah.edu";
	String sub="All homes with less than price";
	emailService.send(email,priceList,sub);
	
return founded ;}
public List<HOME> bybetweenpice(List<HOME> repo,Double double1,Double double2) {
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	for (int c =0 ;c<repo.size();c++) {
		Double z =repo.get(c).getfirstprice();

		if (z>= double1 && z <=double2) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
			

		}
	}
return founded ;
}
public List<HOME> byarea(List<HOME> repo,Double double1) {
	
	ArrayList<HOME> founded = new ArrayList<HOME>();
	for (int c =0 ;c<repo.size();c++) {
		Double z =repo.get(c).getfirstarea();

		if (z<= double1) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
			

		}
	}
return founded ;}
public List<HOME> bybetweenarea(List<HOME> repo,Double double1,Double double2) {

	ArrayList<HOME> founded = new ArrayList<HOME>();
	for (int c =0 ;c<repo.size();c++) {
		Double z =repo.get(c).getfirstarea();

		if (z>= double1 && z <=double2) {
			HOME f = new HOME (repo.get(c).gettype()+"_"+repo.get(c).getmeterial()+"_"+repo.get(c).getplacementr()+"_"+repo.get(c).allowpets()+""+"_"+repo.get(c).getamenities(),repo.get(c).getfirstprice()+""+"_"+repo.get(c).getfirstarea()+""+"_"+repo.get(c).getbedroomnumber()+""+"_"+repo.get(c).getbathroomsnumber()+""+"_"+repo.get(c).getleaselength()+"");
			founded.add(f);
			

		}
	}
return founded ;
}
public void setEmailService(WebEmailService emailservice) {
	this.emailService=emailservice;
}
}







