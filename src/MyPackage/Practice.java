package MyPackage;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.add(2,4);
		A.sub(5, 5);
		B.mul(2, 8);
		B b=new B();
		b.mul(5, 6);
		b.div(8, 2);
		System.out.println(z);
	}
	class A
	{int z;
		static void add(int a,int b)
		{int z=a+b;
			System.out.println(z);
		}
		static int sub(int a,int b)
		{
			System.out.println(a-b);
			return a-b;
			//int z=a-b;
		}
	}}
class B
{
	static void mul(int a,int b)
	{
		int z=a*b;
	}
	 void div(int a,int b)
	{
		int z=a/b;
	}
}

