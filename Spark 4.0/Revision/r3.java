class Employee{
int id;
String name;
double salary;
String department;

void display(){
System.out.println("Id : "+id);
System.out.println("Name : "+name);
System.out.println("salary : "+salary);
System.out.println("Department : "+department);

}

}

public class r3{
public static void main(String[] args){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
Employee e4=new Employee();

e1.id=(101);
e1.name=("Akash Singh");
e1.salary=(20000.00);
e1.department=("Business");

e2.id=(102);
e2.name=("Vishal");
e2.salary=(18000.00);
e2.department=("Non tech");

e3.id=(103);
e3.name=("Ajit");
e3.salary=(25000.00);
e3.department=("Government Income tax");

e4.id=(104);
e4.name=("Suraj ");
e4.salary=(24000.00);
e4.department=("IT");

e1.display();
e2.display();
e3.display();
e4.display();
}
}