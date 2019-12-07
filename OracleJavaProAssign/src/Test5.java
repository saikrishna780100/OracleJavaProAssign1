
public class Test5 {

	public void larger(int a,int b)
	{
		int c;
		if(a>b)
			c=a;
		else
			c=b;
		System.out.println("Larger Number "+c);
	}
	public void smaller(int a,int b)
	{
		int c;
		if(a<b)
			c=a;
		else
			c=b;
		System.out.println("Smaller Number "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		t1.add(10, 20);
		t1.div(10, 20);
		t1.mul(10, 20);
		Test2 t2=new Test2();
		t2.leftShift(10,2);
		t2.rightShift(10,2);
		t2.remainder(10,2);
		Test3 t3=new Test3();
		t3.and(10,2);
		t3.or(10,2);
		t3.exclusiveOr(10,2);
		Test4 t4=new Test4();
		t4.areaSquare(10,2);
		t4.areaRect(10,2);
		t4.areaTri(10,2);
		Test5 t5=new Test5();
		t5.larger(10,2);
		t5.smaller(10,2);
	}

}
