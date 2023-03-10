package onetomany;

public class Main {
public static void main(String[] args) {
//	Employees e1 = new  Employees();
//	Employees e2 = new  Employees();
//	Employees e3 = new  Employees();
//	Employees[] emp=new Employees[3];
//	emp[0]=e1;
//	emp[1]=e2;
//	emp[2]=e3;
  
	
	
	
    Department dept = new Department();
    dept.setDid("BCCI");
    dept.setDname("IPL");
    
    Employees e1 = new  Employees();
	Employees e2 = new  Employees();
	
	
	e1.setEaddr("Mumbai");
	e1.setEname("sachin");
	e1.setEmpcode("MI");
	
	

	e2.setEaddr("Mumbai");
	e2.setEname("sachin");
	e2.setEmpcode("MI");
	
	System.out.println(e1.getEaddr());
	System.out.println(e1.getEmpcode());
	System.out.println(e1.getEname());
	
	
//	public void getEmployeesDetails() {
//		 
//		 System.out.println("Department Details:");
//		 System.out.println("-------------");
//		 System.out.println("Department id "+ did);
//		 System.out.println("Department name "+ dname);
//		 System.out.println();
//		 System.out.println("Employee details:");
//		 System.out.println("-------------");
//	     for (Employees emps : emp) {
//	   	  System.out.println("emplloyee name "+emps.getEname());
//	   	  System.out.println("emplloyee name "+emps.getEaddr());
//	   	  System.out.println("emplloyee name "+emps.getEmpcode());
//	   	  System.out.println();
//
//
//			
//		}
	
}
}
