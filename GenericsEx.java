class Dictionary<W,M>
{
	private W word;
	private M meaning;
	public Dictionary(W word,M meaning)
	{
		this.word=word;
		this.meaning=meaning;
	}
	public void printMeaning()
	{
		System.out.println(word);
		System.out.println(meaning);
	}
}
public class GenericsEx
{
   public static void main(String args[])
   {
	   Dictionary<String,String> data=new Dictionary<String,String>("apple","it is a fruit");
	   data.printMeaning();
   }
}
