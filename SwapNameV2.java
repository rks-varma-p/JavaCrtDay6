import java.util.Scanner;
public class SwapNameV2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name1=sc.next();
		System.out.println("Enter the string");
		String name2=sc.next();
System.out.println("Before Swapping-------");
System.out.println("Name1="+name1);
System.out.println("Name2="+name2);
String t=name2;
name2=name1;
name1=t;
System.out.println("After swapping........");
System.out.println("Name1="+name1);
System.out.println("Name2="+name2);
	}

}
