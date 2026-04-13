import java.util.*;

public class ArrayOfObjectsTest
{
  public static double avgPerimeter(ArrayOfObjects[][] r)
  {
    double sum = 0;
    int count = 0;

    for(int i = 0; i < r.length; i++)
    {
      for(int j = 0; j < r[i].length; j++)
      {
        sum += r[i][j].perimeter();
        count++;
      }
    }

    return sum/count;
  }

  public static void avgPerimeterTest(ArrayOfObjects[][] r, double expected)
  {
    double answer = avgPerimeter(r);

    System.out.println("\nexpected average perimeter: " + expected
                        + "\nactual average perimeter: " + answer);

    if (Math.abs(answer - expected) < .001)
      System.out.println("yes ");
    else
      System.out.println("no ");
  }


  public static ArrayOfObjects greatestArea(ArrayOfObjects[][] r)
  {
    double max = 0;
    ArrayOfObjects ans = new ArrayOfObjects("", 0, 0);

    for(int i = 0; i < r.length; i++)
    {
      for(int j = 0; j < r[i].length; j++)
      {
        if (max < r[i][j].area())
        {
          max = r[i][j].area();
          ans = (r[i][j]);
        }
      }
    }

    return ans;
  }

  public static void greatestAreaTest(ArrayOfObjects[][] r, ArrayOfObjects expected)
  {
    ArrayOfObjects answer = greatestArea(r);

    System.out.println("\nexpected greatest area rectangle: " + expected.getName()
                                                              + " [" + expected.getWidth() + " by "
                                                              + expected.getHeight() + "]");

    System.out.println("actual greatest area rectangle: " + answer.getName()
                                                          + " [" + answer.getWidth() + " by "
                                                          + answer.getHeight() + "]");

    if (expected.getName().equals(answer.getName())
        && expected.getWidth() == answer.getWidth()
        && expected.getHeight() == answer.getHeight())
      System.out.println("yes ");
    else
      System.out.println("no ");
  }


  public static void main(String[] args)
  {
    ArrayOfObjects[][] rectangles = new ArrayOfObjects[2][2];
    rectangles[0][0] = new ArrayOfObjects("r1", 3.7, 6.2);
    rectangles[0][1] = new ArrayOfObjects("r2", 4.5, 5.3);
    rectangles[1][0] = new ArrayOfObjects("r3", 2.3, 9.8);
    rectangles[1][1] = new ArrayOfObjects("r4", 3.1, 7.0);

    avgPerimeterTest(rectangles, 20.95);
    greatestAreaTest(rectangles, rectangles[0][1]);
  }
}
