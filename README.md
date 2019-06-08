# Sprint-Challenge--Building-Java-Web-APIs-gdp

A student that completes this project shows that they can
* build a REST service using Maven, Spring Boot and other Spring projects
* implement server sided routing and rendering for a Spring REST service
* implement industry standard exception handling including user friendly exception messages
* troubleshoot running services using both system and programmatically generated logs
* deploy a full RESTful Web Services application with a JAR using Maven, Spring including Spring Boot, and Tomcat


# Introduction


The top 100 economies in the world are provided below. The data includes the country's name its GDP in millions. They are arranged in a way where they can be copy and pasted into a data seed class assuming that the model is crafted correctly. Taking this data, develop an application to help display it.


# Instructions


Expose the following end-points
* /names - return using the JSON format all of the countries alphabetized by name
* /economy - return using the JSON format all of the countries sorted from most to least GDP  
  * for sorting you might have to type cast so    
  ```.sort((c1, c2) -> (int)(c2.getGDP() - c2.getGDP()))``` 
* /country/{id} - return using the JSON format a single country and GDP based off of its id number
* /country/stats/median - return using the JSON the country and its GDP with the median GDP. For odd number list, return the the country in the middle. For even number list you may return either one of the countries found in the middle.

Create server side rendering pages using Thymeleaf to
* /economy/table - display a table list all countries sorted from most to least GDP

Add appropriate exception handling routines. This is the standard exception handling covered in class. Required exceptions to handle are when
* a resource is not found
* the wrong data type is used for a path variable
* a non-handled endpoint is accessed (a URL not found exception)

Add appropriate logging routines. This is the standard logging covered in class. Required logging include
* Activating actuator endpoints
* Tomcat logging routed to a separate log file
Custom logging under each Get endpoint saying the endpoint has been accessed
* should only go to console
* for example when a client calls /names log should say "/names accessed"
  * in the log entry include any parameters that were sent to the endpoint
  * in the log entry include the date and timestamp of the access of the endpoint
* You are not to log access to the server side rendering pages.

Note: put the log files under the directory /tmp/var/logs/lambdajx Feel free to create and necessary subdirectories.

Finally, deploy the application in a JAR file to Heroku. For the application name use <GitHub username>-gdp

## Stretch Goals  

Expose the following end-point  
* /total - return the sum of all GDPs using the JSON format with country name being returned as Total

Create the server side html pages 
* /names/{start letter}/{end letter} - display a table listing all countries in alphabetical order that begin with letters between start and end letter inclusive.
* /gdp/list/{start gdp}/{end gdp} - display a table listing all countries order by GDP from least to greatest where the country's GDP lies between start gdp and end gdp inclusive.


## the data

When reading in the GDP, best practice would be to convert it to a long datatype using something like  
```Long.parseLong(GDP)```

gdpList.add(new GDP("United States","20513000"));  
gdpList.add(new GDP("China","13457267"));  
gdpList.add(new GDP("Japan","5070626"));  
gdpList.add(new GDP("Germany","4029140"));  
gdpList.add(new GDP("United Kingdom","2808899"));  
gdpList.add(new GDP("France","2794696"));  
gdpList.add(new GDP("India","2689992"));  
gdpList.add(new GDP("Italy","2086911"));  
gdpList.add(new GDP("Brazil","1909386"));  
gdpList.add(new GDP("Canada","1733706"));  
gdpList.add(new GDP("South Korea","1655608"));  
gdpList.add(new GDP("Russia","1576488"));  
gdpList.add(new GDP("Spain","1437047"));  
gdpList.add(new GDP("Australia","1427767"));  
gdpList.add(new GDP("Mexico","1199264"));  
gdpList.add(new GDP("Indonesia","1005268"));  
gdpList.add(new GDP("Netherlands","909887"));  
gdpList.add(new GDP("Saudi Arabia","769878"));  
gdpList.add(new GDP("Turkey","713513"));  
gdpList.add(new GDP("Switzerland","709118"));  
gdpList.add(new GDP("Taiwan","602678"));  
gdpList.add(new GDP("Sweden","554659"));  
gdpList.add(new GDP("Poland","549478"));  
gdpList.add(new GDP("Belgium","536055"));  
gdpList.add(new GDP("Thailand","490120"));  
gdpList.add(new GDP("Argentina","475429"));  
gdpList.add(new GDP("Austria","459401"));  
gdpList.add(new GDP("Norway","441439"));  
gdpList.add(new GDP("United Arab Emirates","432612"));  
gdpList.add(new GDP("Iran","430082"));  
gdpList.add(new GDP("Nigeria","397472"));  
gdpList.add(new GDP("South Africa","376679"));  
gdpList.add(new GDP("Ireland","366448"));  
gdpList.add(new GDP("Israel","365599"));  
gdpList.add(new GDP("Hong Kong","360315"));  
gdpList.add(new GDP("Denmark","354683"));  
gdpList.add(new GDP("Malaysia","347290"));  
gdpList.add(new GDP("Singapore","346621"));  
gdpList.add(new GDP("Colombia","336940"));  
gdpList.add(new GDP("Philippines","331678"));  
gdpList.add(new GDP("Pakistan","306987"));  
gdpList.add(new GDP("Chile","299887"));  
gdpList.add(new GDP("Bangladesh","286275"));  
gdpList.add(new GDP("Finland","276553"));  
gdpList.add(new GDP("Egypt","249471"));  
gdpList.add(new GDP("Czech Republic","244540"));  
gdpList.add(new GDP("Vietnam","241434"));  
gdpList.add(new GDP("Romania","239440"));  
gdpList.add(new GDP("Portugal","237962"));  
gdpList.add(new GDP("Iraq","230911"));  
gdpList.add(new GDP("Peru","228944"));  
gdpList.add(new GDP("Greece","218057"));  
gdpList.add(new GDP("New Zealand","205997"));  
gdpList.add(new GDP("Algeria","188342"));  
gdpList.add(new GDP("Qatar","188295"));  
gdpList.add(new GDP("Kazakhstan","184209"));  
gdpList.add(new GDP("Hungary","156393"));  
gdpList.add(new GDP("Kuwait","144523"));  
gdpList.add(new GDP("Ukraine","126390"));  
gdpList.add(new GDP("Morocco","118178"));  
gdpList.add(new GDP("Angola","114504"));  
gdpList.add(new GDP("Ecuador","107266"));  
gdpList.add(new GDP("Slovakia","106940"));  
gdpList.add(new GDP("Puerto Rico","104557"));  
gdpList.add(new GDP("Venezuela","96328"));  
gdpList.add(new GDP("Sri Lanka","92504"));  
gdpList.add(new GDP("Kenya","89591"));  
gdpList.add(new GDP("Ethiopia","83836"));  
gdpList.add(new GDP("Oman","81682"));  
gdpList.add(new GDP("Dominican Republic","81103"));  
gdpList.add(new GDP("Guatemala","79109"));  
gdpList.add(new GDP("Syria","77460"));  
gdpList.add(new GDP("Myanmar","71543"));  
gdpList.add(new GDP("Luxembourg","68993"));  
gdpList.add(new GDP("Panama","66031"));  
gdpList.add(new GDP("Bulgaria","63651"));  
gdpList.add(new GDP("Uruguay","60933"));  
gdpList.add(new GDP("Costa Rica","60816"));  
gdpList.add(new GDP("Croatia","59971"));  
gdpList.add(new GDP("Belarus","56934"));  
gdpList.add(new GDP("Lebanon","56709"));  
gdpList.add(new GDP("Tanzania","55645"));  
gdpList.add(new GDP("Slovenia","54969"));  
gdpList.add(new GDP("Macau","53961"));  
gdpList.add(new GDP("Lithuania","52468"));  
gdpList.add(new GDP("Ghana","51815"));  
gdpList.add(new GDP("Serbia","47564"));  
gdpList.add(new GDP("Cote d'Ivoire","45875"));  
gdpList.add(new GDP("Azerbaijan","45592"));  
gdpList.add(new GDP("Uzbekistan","43303"));  
gdpList.add(new GDP("Libya","43236"));  
gdpList.add(new GDP("Democratic Republic of the Congo","42692"));  
gdpList.add(new GDP("Turkmenistan","42764"));  
gdpList.add(new GDP("Jordan","41869"));  
gdpList.add(new GDP("Paraguay","41851"));  
gdpList.add(new GDP("Bolivia","41833"));  
gdpList.add(new GDP("Tunisia","41662"));  
gdpList.add(new GDP("Bahrain","39300"));  
gdpList.add(new GDP("Cameroon","38445"));  
gdpList.add(new GDP("Latvia","34286"));  
gdpList.add(new GDP("Sudan","33249"));  
