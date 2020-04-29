package com.servicenow.practice;

public class S1 extends StaticBlock {
	S1()
	{
		
		
		System.out.println("Constructor  S1");
	}
	static{
		System.out.println("Static S1 ");
	}
	{
		System.out.println("Initialization ");	
	}
	
	public static void main(String arg[])
	{
		
		String a= "Manish";
		System.out.println(a.hashCode());
		String b="Manish";
		System.out.println(b.hashCode());
		System.out.println(a==b);
		String d2=new String("Manish");
		System.out.println(a==d2);
	b=	a.concat(b);
	System.out.println(b.hashCode());
	
		System.out.println(a==b);
		System.out.println(b);
		String c="Shanu";
		System.out.println(c==b);
		String d=new String ("Manish");	
		String d1=new String ("Manish");	
		System.out.println(d==b);
		System.out.println(d==d1);
		StringBuilder br=new StringBuilder("Shanu");
		StringBuilder br2=new StringBuilder("Manish");
		System.out.println(br2);
		System.out.println(br2.hashCode());
		br2=br2.append(br);
		System.out.println(br2.hashCode());
		System.out.println(br==br2);
		
//		StaticBlock a=new S1();
//		a=new S1();
//		System.out.println("<----------> ");
//		S1 b=(S1)a;
//		StaticBlock b2=new StaticBlock();
//		
	}
	

static{
	System.out.println("Static S3 ");
}
}

