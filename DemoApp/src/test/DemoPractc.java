package test;

public class DemoPractc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {10,30,60,70,20};
   int max=arr[0];
   for (int i = 0; i < arr.length; i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
}
   System.out.println(max);
	}

}
