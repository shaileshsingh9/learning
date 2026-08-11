class Area{

static double triangleArea(double base, double height){
double area=0.5*base*height;
return area;
}

public static void main(String args[]){
double res=triangleArea(10,20);
System.out.println("Area of triangle: " +res);

}
}