package mypack;

class Employee {

int empno;
String ename = "Asha";

Salary sal;

public Employee() {
System.out.println("From Employee Constructor");
sal = new Salary(5000, 1000, 500);
}

public Employee(int x) {
this("Mani");
this.empno=x;
System.out.println("From Employee Constructor" + x);
sal = new Salary(5000, 1000, 500);
}

public Employee(String str) {

System.out.println("From Employee Constructor" + str);
sal = new Salary(5000, 1000, 500);
}
public String getDetails() {
return (empno + " -- " + ename + " --- " + sal);
}

}

class Manager extends Employee {
String dept = "IT";


public Manager() {
super(888); // used to invoke base clas constructor
System.out.println("From Mgr Constr");

}
public String getDetails() {
return super.getDetails()+ "-- " + dept;
}

}

public class MainClass {

public static void main(String[] args) {
Employee emp = new Employee();
System.out.println(emp.getDetails());

Manager mgr = new Manager();
System.out.println(mgr.getDetails());

}

}