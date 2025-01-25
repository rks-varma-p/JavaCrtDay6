
public class SwappingName {

	public static void main(String[] args) {
		String N1="Ramu";
		String N2="Abdul";
		System.out.println("Before swapping");
		System.out.println("Name-1:"+N1);
		System.out.println("Name-2:"+N2);
		
		N2=N2+N1;
		N1=N2.substring(0,N2.length()-N1.length());
		N2=N2.substring(N1.length());
		System.out.println("After swapping------");
		System.out.println("Name1----"+N1);
		System.out.println("Name2----"+N2);

	}

}
