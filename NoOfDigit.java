import java.util.Scanner;
public class NoOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int r;
		int count[]=new int[10];
		while(n !=0) {
			r = (int)(n% 10);
			count[r]++;
			n=n/10;
		}
		for(int i=0;i<=9;i++) {
			System.out.println(i+" > "+ count[i]);
		}
	}

}
