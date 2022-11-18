package Swapping;

public class MyDate {

	public MyDate(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyDate d1=new MyDate(1,2,3);
        MyDate d2=new MyDate(4,5,6);
        System.out.println("Before "+d1+" "+d2);
        
        Swap(d1,d2);
	}

	private static void Swap(MyDate d1, MyDate d2) {
		// TODO Auto-generated method stub
		MyDate temp;
		temp=d1;
		d1=d2;
		d2=temp;
	}

}