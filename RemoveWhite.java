import java.util.Scanner;
class RemoveWhite{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println(str.replaceAll("\\s",""));
	}
}