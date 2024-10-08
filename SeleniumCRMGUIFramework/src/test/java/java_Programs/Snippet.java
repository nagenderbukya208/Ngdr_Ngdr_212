package java_Programs;

public class Snippet {
	public static void main(String[] args) 
	{
		String s1="Nagender";
		String s2="";
		String s3=null;
		int count=1;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			
			s3=("Ee").contains(c+"")?s2=s2+"*".repeat(count++):(s2=s2+c);
			
			
//			if(("Ee").contains(c+""))
//			{
//				s2=s2+"*".repeat(count++);
//		}
//			else
//			{
//				s2=s2+c;
//			}
		}

		System.out.println(s3);

	}
}

