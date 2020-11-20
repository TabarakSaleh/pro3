package test;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepsTry {
	private MockEmailHolder mockholder;
	SearchSteps c = new SearchSteps();
	List<HOME> searchedhome =new ArrayList<HOME>();
	List<HOME> allhome =new ArrayList<HOME>();
	int x ;
	String A;
	Double r,s1,s2,m,n1,n2;
	List<HOME> Basic=new ArrayList<HOME>();
	SearchSteps S=new SearchSteps();
	Scenario13 ss =new Scenario13();
	
 @Given("these homes are contained in the system")
 public void these_homes_are_contained_in_the_system(List<List> d){
	
	  for (int i=0 ; i<d.size();i++) {
		  String s =d.get(i).get(0).toString();
		  String p =d.get(i).get(1).toString();
	
		  HOME h1 = new HOME (s,p);
		if (c.notexist(h1)) {
               allhome.add(h1);}
		 

	  }
 }
 
 @When("I search about home by bedrooms {int}")
 public void I_search_about_home_by_bedrooms(int x) {
	 c.findhome(allhome);
	 searchedhome= c.bybedroomsnumber(allhome,x);
 }
 @Then("A list of homes that matches bedroom {int} specification should be returned and printed on the console")
 public void A_list_of_homes_matches_bedroom (int x) {
	 int j =0 ;
	 int d =0 ;
	 String printhome ;
	for (int i =0 ;i<searchedhome.size();i++) {
		 j = searchedhome.get(i).getbedroomnumber();
			if (searchedhome.get(i).getbedroomnumber()==x) {
				 d =x;
				 System.out.println("searching by number of bedrooms");
					  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
			         System.out.println(printhome);
			          assertEquals(d,j);
			    	  allhome.clear();

				 }
			} 
	 
	
 }//done 
@When("I search about home by bathrooms {int}")
 public void I_search_about_home_by_bathrooms (int k) {
	 c.findhome(allhome);
	 searchedhome = c.bybathroomsnumber(allhome,k);
 }
 @Then("A list of homes that matches bathroom {int} specification should be returned and printed on the console")
 public void A_list_of_homes_matches_bathroom (Integer x) {
	 int j =0 ;
	 int d =0 ;
	 String printhome = null;
	 for (int i =0 ;i <searchedhome.size();i++) {
		 j = searchedhome.get(i).getbathroomsnumber();
			if (j==x) {
				 d =x;
				 System.out.println("searching by number of bathrooms");

					  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
			          System.out.println(printhome);
			          assertEquals(d,j);
			    	  allhome.clear();


				 
			} }
	 
	
 }
 

	 @When("I search about home by {string} pets")
	 public void iSearchAboutHomeByAllowpets(String d) {

	
		 c.findhome(allhome);
		 searchedhome= c.byAllowpets(allhome,d);
	     
	 }


	 @Then("A list of homes that matches the {string} pets specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAllowSpecificationShouldBeReturnedAndPrintedOnTheConsole(String d) {
	  
		 String j ="" ;
		 String l ="" ;
		 String printhome = null;
		 for (int i =0 ;i< searchedhome.size();i++) {
			 j = searchedhome.get(i).allowpets();
	          

				if (d.equals(searchedhome.get(i).allowpets())) {
					 l =d;
					 System.out.println("searching by allow pets");

						  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
				          System.out.println(printhome);
				          assertEquals(l,j);
				    	  allhome.clear();


					 
				} }				        

	 }

		 @When("I search about home by type {string}")
		 public void iSearchAboutHomeBytype(String s) {
			 c.findhome(allhome);
			 searchedhome= c.byType(allhome,s);
		 }



		 @Then("A list of homes that matches the type {string} specification should be returned and printed on the console")
		 public void aListOfHomesThatMatchesTheHouseSpecificationShouldBeReturnedAndPrintedOnTheConsole(String s) {
			 String j ="" ;
			 String d ="" ;
			 String printhome = null;
			 for (int i =0 ;i<searchedhome.size();i++) {
				 j = searchedhome.get(i).gettype();
				 
					if (s.equals(searchedhome.get(i).gettype())) {
						 d =s;
						 System.out.println("searching by type");

							  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
					          System.out.println(printhome);
					          assertEquals(d,j);
					    	  allhome.clear();


						 
					} }					          

			 
			 
		 }
		
		 
		 
			 @When("I search about home by Lease {int}")
			 public void iSearchAboutHomeByLease(Integer int1) {
			   
				 c.findhome(allhome);
				 searchedhome = c.byleasenumber(allhome,int1);
			 }



			 @Then("A list of homes that matches the Lease {int}specification should be returned and printed on the console")
			 public void aListOfHomesThatMatchesTheLease6specificationShouldBeReturnedAndPrintedOnTheConsole(int f) {
				 int j =0 ;
				 int d =0 ;
				 String printhome ;
				 for (int i =0 ;i<searchedhome.size();i++) {
					 j = searchedhome.get(i).getleaselength();
						if (searchedhome.get(i).getleaselength()==f) {
							 d =f;
							 System.out.println("searching by lease length");

								  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
						         System.out.println(printhome);
						          assertEquals(d,j);
						    	  allhome.clear();

							 }
						} 		 }

		
			 
				 @When("I search about home by Amenitie {string}")
				 public void iSearchAboutHomeByAmenitie(String s) {
				    
					 c.findhome(allhome);
					 searchedhome = c.byAmenitie(allhome,s);
				 }



				 @Then("A list of homes that matches the Amenitie {string} specification should be returned and printed on the console")
	 public void aListOfHomesThatMatchesTheAmenitieSpecificationShouldBeReturnedAndPrintedOnTheConsole(String s) {
				 
					 String j ="" ;
					 String d ="" ;
					 String printhome = null;
					 for (int u =0 ;u<searchedhome.size();u++) {
						 j=searchedhome.get(u).getamenities();
						  String []h1 = j.split(",");

						  for (int i =0;i<h1.length;i++) {
						if (h1[i].equals(s)) {
							
								 d =h1[i];
								 j=s;
								 System.out.println("searching by Amenites");

									  printhome = searchedhome.get(u).gettype()+"_"+searchedhome.get(u).getmeterial()+"_"+searchedhome.get(u).getplacementr()+"_"+searchedhome.get(u).allowpets()+"_"+searchedhome.get(u).getamenities()+"_"+searchedhome.get(u).getfirstprice()+"_"+searchedhome.get(u).getfirstarea()+"_"+searchedhome.get(u).getbedroomnumber()+"_"+searchedhome.get(u).getbathroomsnumber()+"_"+searchedhome.get(u).getleaselength() ;
							          System.out.println(printhome);
							          assertEquals(d,j);
							    	  allhome.clear();
								 }

								 }
							} 
				 }
				 

					 @When("I search about home by placement {string}")
					 public void iSearchAboutHomeBy(String string) {
						 c.findhome(allhome);
						 searchedhome = c.byplacement(allhome,string);
					 }


					 @Then("A list of homes that matches the placement {string} specification should be returned")
					 public void aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturned(String s) {
					   
						 String j ="" ;
						 String d ="" ;
						 String printhome = null;
						 for (int i =0 ;i<searchedhome.size();i++) {
							 j = searchedhome.get(i).getplacementr();

								if (s.equals(searchedhome.get(i).getplacementr())) {
									 d =s;
									 System.out.println("searching by placement");

										  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
								          System.out.println(printhome);
								          assertEquals(d,j);
								    	  allhome.clear();


									 
								} }	
					 }

						 @When("I search about home by Material {string}")
						 public void iSearchAboutHomeByMaterial(String string) {
						     
							 c.findhome(allhome);
							 searchedhome = c.byMaterial(allhome,string);			
							 }



						 @Then("A list of homes that matches the Material {string} specification should be returned")
						 public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturned(String s) {
						 
							 String j ="" ;
							 String d ="" ;
							 String printhome = null;
							 for (int i =0 ;i<searchedhome.size();i++) {
								 j = searchedhome.get(i).getmeterial();

									if (s.equals(searchedhome.get(i).getmeterial())) {
										 d =s;
										 System.out.println("searching by material");

											  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
									          System.out.println(printhome);
									          assertEquals(d,j);
									    	  allhome.clear();


										 
									} }							 }


							 @When("I search about home with price less than {double}")
							 public void iSearchAboutHomeWithPriceLessThan(Double double1) throws NamingException {
						
								 c.findhome(allhome);
								 searchedhome = c.bypice(allhome,double1);
							 }



							 @Then("A List of homes that  less than price {double} specification should be returned")
							 public void aListOfHomesThatMatchesLessThanThePriceSpecificationShouldBeReturned(Double s) {
							
								 Double j =0.0 ;
								 Double d =0.0 ;
								 String printhome = null;
								 for (int i =0 ;i<searchedhome.size();i++) {
									 j = searchedhome.get(i).getfirstprice();

										if (s>=searchedhome.get(i).getfirstprice()) {
											 d =s;
											 System.out.println("searching by less than price");

												  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;

												  System.out.println(printhome);
										          assertTrue(d>=j);
										    	  allhome.clear();


											 
										} }								 }
										
								 @When("I search about home with price between {double} and {double}")
								 public void iSearchAboutHomeWithPriceBetweenAnd(Double double1, Double double2) {
							
									 c.findhome(allhome);
									 searchedhome = c.bybetweenpice(allhome,double1,double2);
								 }



								 @Then("A List of homes that in range {double} and {double} of prices specification should be returned")
								 public void aListOfHomesThatInRangeAndOfPricesSpecificationShouldBeReturnedCationShouldBeReturned(Double double1, Double double2) {
									 Double j =0.0 ;
									 Double d =0.0 ;
									 Double l =0.0 ;

									 String printhome = null;
									 for (int i =0 ;i<searchedhome.size();i++) {
										 j = searchedhome.get(i).getfirstprice();

											if (double1<=j && j<=double2) {
												 d =double1;
												 l=double2;
													  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
														 System.out.println("searching by betwwrn two prices");

													  System.out.println(printhome);
											        
													  assertTrue(j>=d && j<=l);
											    	  allhome.clear();


												 
											} }								
								 }

									 @When("I search about home with area below {double}")
									 public void iSearchAboutHomeWithAreaBelow(Double double1) {
				
										 c.findhome(allhome);
										 searchedhome = c.byarea(allhome,double1);									 }



									 @Then("A List of homes that below area {double} specification should be returned")
									 public void aListOfHomesThatBelowAreaSpecificationShouldBeReturned(Double double1) {
					
										 Double j =0.0 ;
										 Double d =0.0 ;
										 String printhome = null;
										 for (int i =0 ;i<searchedhome.size();i++) {
											 j = searchedhome.get(i).getfirstarea();

												if (double1>=searchedhome.get(i).getfirstarea()) {
													 d =double1;
														  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
															 System.out.println("searching by bellow area");

														  System.out.println(printhome);
												          assertTrue(d>=j);
												    	  allhome.clear();


													 
												} }																	 }


										 @When("I search about home with area between {double} and {double}")
										 public void iSearchAboutHomeWithAreaBetweenAnd(Double double1, Double double2) {
										
											 c.findhome(allhome);
											 searchedhome = c.bybetweenarea(allhome,double1, double2);												 }


											 @Then("A List of homes that in ranges {double} and {double} of area specification should be returned")
											 public void aListOfHomesThatInRangesAndOfAreaSpecificationShouldBeReturned(Double double1, Double double2) {
											  
												 Double j =0.0 ;
												 Double d =0.0 ;
												 Double l =0.0 ;

												 String printhome = null;
												 for (int i =0 ;i<searchedhome.size();i++) {
													 j = searchedhome.get(i).getfirstarea();

														if (double1<=j && j<=double2) {
															 d =double1;
															 l=double2;
													
																  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
																	 System.out.println("searching by between two areas");

																  System.out.println(printhome);
														        
																  assertTrue(j>=d && j<=l);
														    	  allhome.clear();


															 
														} }		
											 }
											 @When("I search about home by {string} {string} and by {string} {string}")
											 public void iSearchAboutHomeByAndBy(String s1,String s2,String s3,String s4) throws NumberFormatException, NamingException {
													 c.findhome(allhome);
													 String []value1 = {s2,s4};
													 String []t = {s1,s3};
													 searchedhome= ss.comb(allhome, value1, t);
												}
											 @Then("A List of homes should be returned and console")
											 public void aListOfHomesThatAndShouldBeReturnedAndConsole() {
												 String printhome=null;
												
												 for (int i =0 ;i<searchedhome.size();i++) {
													 printhome = searchedhome.get(i).gettype()+""+searchedhome.get(i).getmeterial()+""+searchedhome.get(i).getplacementr()+""+searchedhome.get(i).allowpets()+""+searchedhome.get(i).getamenities()+""+searchedhome.get(i).getfirstprice()+""+searchedhome.get(i).getfirstarea()+""+searchedhome.get(i).getbedroomnumber()+""+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
													  System.out.println("search by two of the obove");
													  System.out.println(printhome);
													  allhome.clear();
												 }}

						 @When("I search about home with {string} {string} and by {string} {string} and by {string} {string}")
						 public void iSearchAboutHomeWithAndByAndByVILLAGE(String string, String string2, String string3, String string4, String string5 ,String string6) throws NumberFormatException, NamingException {
										
													 c.findhome(allhome);
													 String []value1 = {string2,string4,string6};
													 String []t = {string,string3,string5};
													 searchedhome= ss.comb(allhome, value1, t);
													
												 }




                                                    @Then("A List of homes that matches the three specification should be returned")												
                                                    	public void aListOfHomesThatMatchesTheThreeSpecificationShouldBeReturned() {													
                                                    	for (int i =0 ;i<searchedhome.size();i++) {

															
																	String  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
																	 System.out.println("searching by thee of the above");

																	  System.out.println(printhome);
															        
																	
															    	  allhome.clear();}
												 }

                                                    	@When("I search about home with {string} {string} and by {string} {string} and by {string} {string}  and {string} {string}")
                                                    	public void iSearchAboutHomeWithAndByAndByAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws NumberFormatException, NamingException {
                                                    	
                                                    		c.findhome(allhome);
                                                    		 String []value1 = {string2,string4,string6,string8};
        													 String []t = {string,string3,string5,string7};
        													 searchedhome= ss.comb(allhome, value1, t);
                                                    	}



                                                    	@Then("A List of homes that matches the four specification should be returnedthe four specification should be returned")
                                                    	public void aListOfHomesThatMatchesTheFourSpecificationShouldBeReturned() {
                                                 
                                                    		for (int i =0 ;i<searchedhome.size();i++) {

    															
																String  printhome = searchedhome.get(i).gettype()+"_"+searchedhome.get(i).getmeterial()+"_"+searchedhome.get(i).getplacementr()+"_"+searchedhome.get(i).allowpets()+"_"+searchedhome.get(i).getamenities()+"_"+searchedhome.get(i).getfirstprice()+"_"+searchedhome.get(i).getfirstarea()+"_"+searchedhome.get(i).getbedroomnumber()+"_"+searchedhome.get(i).getbathroomsnumber()+"_"+searchedhome.get(i).getleaselength() ;
																 System.out.println("searching by four of the above");

																  System.out.println(printhome);
														        
																
														    	  allhome.clear();}
                                                    	}
                                                    	@Then("email with the result should be send to user {string}")
                                                        public void emailWithTheResultShouldBeSendToUser(String email) throws NamingException {
                                   
                                                        verify(mockholder.getEmailService(),times(1)).send(email,SearchSteps.priceList,"All homes with less than price");



}
}



