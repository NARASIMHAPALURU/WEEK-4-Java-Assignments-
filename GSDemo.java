/* Create a generic class Stack and include member functions to add an element in stack,remove an element from stack and display()*/
class Stack <T>
{
	T e[];
	int top;
	Stack(T[] ia,int n)
	{
		e = ia;
		top = 0;
	}
	public void push(T ele)
	{
		if(top<=10)
		{
			e[top++] = ele;
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	public void pop()
	{
		if(top==0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("pop element is:"+e[--top]);
		}
	}
	public void display()
	{
		for (int i=0;i<top;i++)
		{
			System.out.print(e[i]+" " );
		}
	}
}
	class GSDemo{
		public static void main(String [] args)
		{
			Integer ia[] = new Integer[10];
			Stack<Integer> s1 = new Stack<Integer>(ia,10);
			Character ca[] = new Character[10];
			Stack<Character> s2 = new Stack<Character>(ca,10);
			s1.pop();
			s1.push(10);
			s1.push(20);
			s1.pop();
			s2.push('s');
			s2.push('d');
			s2.push('e');
			s2.pop();
			s2.display();
		}
	}
			
	
	