public class fibonacci 
{
    public static void main(String[] args)
    {
      int n = 10, firstNum = 0, secondNum = 1;
      for(int i=1; i<=n; i++) {
		  System.out.println(firstNum + ",");
		  nextNum = firstNum+secondNum; 
		  secondNum = nextNum;
    }
}
}
