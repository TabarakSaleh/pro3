Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
   |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|              

Scenario Outline: Search home by number of bathroom 
  When I search about home by bathrooms <number>
  Then A list of homes that matches bathroom <number> specification should be returned and printed on the console
 Examples:      
                |number|
                |1|
                |2|
                |3|
 Scenario Outline: Search home by number of bedrooms 
  When I search about home by bedrooms <number>
  Then A list of homes that matches bedroom <number> specification should be returned and printed on the console
 Examples:      
                |number|
                |1|
                |2|
                |3|
                |4|
                |5|
  
 Scenario Outline: Search about home by Allow Pets
    When I search about home by <boolean> pets
    Then A list of homes that matches the <boolean> pets specification should be returned and printed on the console
    Examples:
    |boolean|
    |"YES"|
    |"NO"|
Scenario Outline: Search home by type
  When I search about home by type <type>
  Then A list of homes that matches the type <type> specification should be returned and printed on the console
  Examples:
         |type|
         |"HOUSE"|
         |"APARTMENT"|
Scenario Outline: Search home by Lease Length
  When I search about home by Lease <number>
  Then A list of homes that matches the Lease <number>specification should be returned and printed on the console
  Examples:
         |number|
         |6|
         |12|
 Scenario Outline: Search home by Amenities 
  When I search about home by Amenitie <string>
  Then A list of homes that matches the Amenitie <string> specification should be returned and printed on the console
  Examples:
         |string|
         |"AirConditioning"|
         |"Balcony"|
         |"ELEVATOR"|
         |"FIREPLACE"|
         |"GARAGEPARKING"|
         |"Swimming Pool"|
     
Scenario Outline: Search about home by Placement
When I search about home by placement <Placement>
Then A list of homes that matches the placement <Placement> specification should be returned
Examples:
|Placement|   
|"VILLAGE"|
|"CITY"|

Scenario Outline: Search about home by Material
When I search about home by Material <Material>
Then A list of homes that matches the Material <Material> specification should be returned
Examples:
|Material|
|"STONE"|
|"BRICK"|
|"WOOD"|
Scenario: Search about home with less than specific price
When I search about home with price less than 400.0
Then A List of homes that  less than price 400.0 specification should be returned 
And email with the result should be send to user "hayasam@najah.edu"
 
Scenario: Search about home between range of prices
When I search about home with price between 200.0 and 400.0
Then A List of homes that in range 200.0 and 400.0 of prices specification should be returned 

Scenario: Search about home below specific area
When I search about home with area below 200.0
Then A List of homes that below area 200.0 specification should be returned 

Scenario: Search about home between range of areas
When I search about home with area between 100.0 and 400.0
Then A List of homes that in ranges 100.0 and 400.0 of area specification should be returned

Scenario: search about home by two combination 
When I search about home by "material" "WOOD" and by "placement" "CITY"
Then A List of homes should be returned and console

Scenario: Search about home  by three
When I search about home with "area" "500.0" and by "Material" "WOOD" and by "Placement" "VILLAGE"
Then A List of homes that matches the three specification should be returned

Scenario: Search about home  by four
When I search about home with "area" "500.0" and by "Material" "WOOD" and by "Placement" "VILLAGE"  and "price" "600.0"
Then A List of homes that matches the four specification should be returnedthe four specification should be returned