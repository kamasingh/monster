package prog1;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="big black bug bit a big black dog on his big black nose  ";
		String[] ch=str.split(" ");
		int count;
		for(int i=0; i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i].equals(ch[j]))
				{
					count++;
					ch[j]="0";
				}
			}
			if(count>1 && ch[i]!="0")
				System.out.println(ch[i] +" " + count);
		}
		
	}

}
