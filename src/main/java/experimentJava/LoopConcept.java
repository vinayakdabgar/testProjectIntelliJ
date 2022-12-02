package experimentJava;

import org.testng.annotations.Test;

public class LoopConcept {

    @Test
  public void forLoop()
  {
      int i = 1;
      System.out.println("Loop Verification - Using while loop");

      while ( i <5 )
      {
            System.out.println( i);
            i++;
      }

      System.out.println("Loop Verification - Using For loop - Increment");

      for (int j=1; j<=5 ; j++)
      {
          System.out.println(j);

      }
      System.out.println("Loop Verification - Using For loop - Decrement");
      for (int k=5; k>=1 ; k--)
      {
          System.out.println(k);

      }

  }




}
