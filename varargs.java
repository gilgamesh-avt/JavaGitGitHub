package variableArguments;

public class VarArgsDemo {
	
	void VarArgsDemo(int...x)
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Print Numbers "+" "+i);
		}
	}

	public static void main(String[] args) {
		VarArgsDemo va=new VarArgsDemo();
		va.VarArgsDemo(2,8,5);
		va.VarArgsDemo(54,69);

	}

}
