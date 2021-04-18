import java.util.Scanner;
class CountVowels1{
	public static void main(String []args){
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		for(int i = 0;i<str.length();i++)
		{
			if( str.charAt(i)== 'a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u'||str.charAt(i)== 'A'||str.charAt(i)== 'E'||str.charAt(i)== 'I'||str.charAt(i)== 'O'||str.charAt(i)== 'U')
			{
				count = count+1;
			}
		}
		System.out.println("Vowels Count is :"+count);
	}
}

				