public class fibonacci 
{
    public static void main(String[] args)
    {
      int n = 10, firstNum = 0, secondNum = 1, nextNum = 1;
      for(int i=1; i<=n; i++) {
		  nextNum = firstNum + secondNum;
		  System.out.println(nextNum + ",");
		  firstNum = secondNum;
		  secondNum = nextNum;
		}
	}
}
