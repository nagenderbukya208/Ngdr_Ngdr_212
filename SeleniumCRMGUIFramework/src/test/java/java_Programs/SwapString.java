package java_Programs;

public class SwapString {
	public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Step 1: Concatenate str1 and str2 and assign the result to str1
        str1 = str1 + str2; // str1 becomes "HelloWorld"

        // Step 2: Extract the original second string from the concatenated string and assign it to str1
        str2 = str1.substring(0, str1.length() - str2.length()); // str2 becomes "Hello"

        // Step 3: Extract the original first string from the concatenated string and assign it to str2
       str1 = str1.substring(str2.length()); // str1 becomes "World"

        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
