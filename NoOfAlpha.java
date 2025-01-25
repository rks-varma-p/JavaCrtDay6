import java.util.Scanner;
public class NoOfAlpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character:");
		String d=sc.next();
d=d.toLowerCase();
int[] count =new int[26];
for(int i=0;i<d.length();i++) {
	char c = d.charAt(i);
	count[c-97]++;
}
for(int i=0;i<26;i++) {
	System.out.println((char)(i+97)+"--->"+count[i]);
}

	}

}
