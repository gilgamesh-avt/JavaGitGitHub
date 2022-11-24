package PalindromeNumber;

 class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,temp,res=0;
		int n=151;
		temp=n;
		while(n>0)
		{
			r=n%10;
			res=(res*10)+r;
			n=n/10;
		}
		if(temp==res)
		{
			System.out.println("The number is Palindrome "+res);
		}
		else
		{
			System.out.println("The number is not Palindrome "+res);
		}

	}

}