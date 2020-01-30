package prog1;

public class NoOFWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="my name is khan and i live in pak";
	String[] ch=str.split(" ");
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		count++;
	}
	System.out.println(count);
	}

}
