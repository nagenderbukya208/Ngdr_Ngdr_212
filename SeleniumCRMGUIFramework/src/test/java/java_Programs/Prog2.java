package java_Programs;


public class Prog2 {
public static void main(String[] args) {
	String s1="Nagender";
	String s2="";
 	char[] ch = s1.toCharArray();
 	for (int i = 0; i < ch.length; i++) {
// 		s2=s2+s1.charAt(i)+" ";
// 		System.out.println(s2);
 		s2=s2+ch[i];
 		System.out.println(s2);
	}
}
}
