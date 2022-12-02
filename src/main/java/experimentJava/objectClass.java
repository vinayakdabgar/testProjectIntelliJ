package experimentJava;

import org.testng.annotations.Test;

public class objectClass {

    String carColor = "white" ;
    int wheel = 4;


    @Test
    public void car (){

        objectClass oc = new objectClass();
        BMW bm = new BMW();
        bm.sum();

       // bm.bmwEngine();
        Ford fd =new Ford();
        int v = fd.sum1();
        System.out.println("Ford no input only output value is : " +v);
        int s = fd.sum(20,30);
        System.out.println("Ford input only output value is : " +s);
       // fd.fordEngine();
       // System.out.println(oc.carColor);
       // System.out.println(oc.wheel);


        String s1 = "100";
        int z = Integer.parseInt(s1);
        System.out.println("Sum  = " + (z+10));






    }


}
