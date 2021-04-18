import java.util.*;
class ReplaceChar
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer();
		s1.append(sc.nextLine());
		System.out.println(s1);
		s1.deleteCharAt(3);
		s1.insert(3,'v');
		System.out.println(s1);
	}
}
