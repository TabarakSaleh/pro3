package test;


import java.util.List;



public class Scenario13 {

	
    SearchSteps ss =new SearchSteps() ;
    public  List<HOME> comb(List<HOME> repo,String []value1, String []t) {
    	for(int i=0 ;i< t.length;i++) {
    	switch(t[i]) {
    	
    	case "material" : repo = ss.byMaterial(repo, value1[i]);
    	                  break ;
    	case "area" : repo = ss.byarea(repo,Double.parseDouble(value1[i]));
                         break ;
    	case "Placement" : repo = ss.byplacement(repo, value1[i]); 
    	                 break ;
    	case "price" : repo = ss.bypice(repo,Double.parseDouble(value1[i]) );
                    	break ;
    	case "bedrooms" : repo = ss.bybedroomsnumber(repo,Integer.parseInt(value1[i]));
    	                break ;
    	case "bathrooms" : repo = ss.bybathroomsnumber(repo,Integer.parseInt(value1[i]));
                    	break ;
    	case "pets" : repo = ss.byAllowpets(repo,value1[i]);
                    	break ;
    	case "type" : repo = ss.byType(repo, value1[i]);
    	                break ;
    	case "leaselength" : repo = ss.byleasenumber(repo, Integer.parseInt(value1[i]));
                    	break ;
    	case "amenties" : repo = ss.byAmenitie(repo, value1[i]);
    	                break ;
    	default : break;
    	}
    	}
    	return repo ;
    }
    
}
