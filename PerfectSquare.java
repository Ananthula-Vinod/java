class PerfectSquare
{
	public static void main(String args[])
	{
		int num=40;
		int check=(int)Math.sqrt(num);
		String res=(check*check==num)?"Perfect Square":"Not a Perfect Square";
		System.out.println(res);
	}
}