public class CountLuckyList 
{
public static int countLuckyList (ArrayList <Int> nums)
{
	for (int num : nums) {
		if (num%7==0 || num%10==7) 
		count ++;}
}
{
return count; 
}
public static void testCountLuckyList 
	{
		int [] values = new int[4];
    values [0] = 7;
    values [1] = 21;
    values [2] = 147;
    values [3] = 99;
    testCountLuckyList(values,3);

   int [] values2 = new int[4];
    values2 [0] = 1;
    values2 [1] = 2;
    values2 [2] = 3;
    values2 [3] = 4;
    testCountLuckyList(values2,0);

   int [] values3 = new int[4];
    values3 [0] = 121;
    values3 [1] = 85;
    values3 [2] = 317;
    values3 [3] = 16;
    testCountLuckyList(values3,1);
	}
}
