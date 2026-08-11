import java.util.*;

class capital{
static String getCapital(String country){
if(country.equals("India")){
return "New Delhi";
}
else if(country.equals("Japan")){
return "Tokyo";
}
else if(country.equals("America")){
return "washington d.c";
}
else if(country.equals("China")){
return "Bijing";
}
else if(country.equals("Russia")){
return "Moscow";
}
else if(country.equals("England")){
return "London";
}
return "Not found";

}


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter country name: ");
String country=sc.nextLine();
String capital = getCapital(country);
System.out.println(capital);

}
}