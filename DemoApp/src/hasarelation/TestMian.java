package hasarelation;

public class TestMian {
	public static void main(String[] args) {
		Student st=new Student("dhhdd",576,345556);
		System.out.println(st);
		st.getSid();
		st.getSmob();
		st.getSname();
		st.setSname("ram");
		st.setSmob(9876);
		st.setSid(123);
		System.out.println(st);
}
}