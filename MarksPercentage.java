class MarksPercentage
{
	public static void main(String args[])
	{
		String name="Vamshi";
		System.out.println(name);
		int m1=69,m2=44,m3=32,m4=33,m5=23;
		double total=m1+m2+m3+m4+m5;
		System.out.println("Total Marks :"+total);
		double per=(total/500)*100;
		System.out.println("Percentage of marks is : "+per);
		if(per>=90)
		   System.out.println("A+");
		else if(per>=80)
		   System.out.println('A');
		else if(per>=70)
		   System.out.println("B+");
		else if(per>=55)
		   System.out.println('B');
		else if(per>=35)
		   System.out.println('C');
		else
		   System.out.println("Fail");
		
	}
}