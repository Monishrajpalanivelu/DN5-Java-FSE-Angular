class Employee{
int id;
String name;
double salary;

Employee(int id,String name,double salary){
this.id=id;
this.name=name;
this.salary=salary;
}
}

public class EmployeeManagement{

Employee arr[]=new Employee[10];

void add(Employee e){
arr[0]=e;
}

void traverse(){
for(Employee e:arr)
if(e!=null)
System.out.println(e.name);
}

}