import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
System.out.println("enter a string");
String str = scn.nextLine();
StringBuilder sb = new StringBuilder();
for(int i = str.length() - 1; i >= 0; i--)
{
sb.append(str.charAt(i));
}
System.out.println(sb.toString());
}

}
