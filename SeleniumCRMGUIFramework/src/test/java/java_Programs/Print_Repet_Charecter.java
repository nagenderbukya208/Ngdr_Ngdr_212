package java_Programs;

import org.apache.poi.util.SystemOutLogger;

public class Print_Repet_Charecter
{
public static void main(String[] args)
{
	String s1="Nagender";
	String s2="";
	String s3="*";
	for(int i=0;i<s1.length();i++)
	{
		char c=s1.charAt(i);
		if(c=='e'|| c=='E')
		{
	s2=s2+s3;
	s3+="*";
		}
		else
		{
			s2=s2+c;
		}
	}

	System.out.println(s2);
	System.out.println("Hello Java & Selenium");
}
}
