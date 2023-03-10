package hasarelation;



  public class Student{
	 private String sname;
	 private Integer sid;
	 private Integer smob;


	 public Student(String sname, Integer sid, Integer smob) {
	 	super();
	 	this.sname = sname;
	 	this.sid = sid;
	 	this.smob = smob;
	 }


	 public String getSname() {
	 	return sname;
	 }


	 public void setSname(String sname) {
	 	this.sname = sname;
	 }


	 public Integer getSid() {
	 	return sid;
	 }


	 public void setSid(Integer sid) {
	 	this.sid = sid;
	 }


	 public Integer getSmob() {
	 	return smob;
	 }


	 public void setSmob(Integer smob) {
	 	this.smob = smob;
	 }


	 @Override
	 public String toString() {
	 	return "Student [sname=" + sname + ", sid=" + sid + ", smob=" + smob + "]";
	 }


 }


