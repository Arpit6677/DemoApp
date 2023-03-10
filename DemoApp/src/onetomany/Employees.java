package onetomany;

public class Employees {
 private String ename;
 private String eaddr;
 private String empcode;
 
 
//public Employees(String ename, String eaddr, String empcode) {
//	super();
//	this.ename = ename;
//	this.eaddr = eaddr;
//	this.empcode = empcode;
//}
 


@Override
public String toString() {
	return "Employees [ename=" + ename + ", eaddr=" + eaddr + ", empcode=" + empcode + "]";
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public String getEaddr() {
	return eaddr;
}


public void setEaddr(String eaddr) {
	this.eaddr = eaddr;
}


public String getEmpcode() {
	return empcode;
}


public void setEmpcode(String empcode) {
	this.empcode = empcode;
}

 
 
 
}
