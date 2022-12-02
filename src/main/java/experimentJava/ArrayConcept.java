package experimentJava;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.testng.annotations.Test;

public class ArrayConcept {

    @Test
    public void arrayFunction()
    {

       /* Object ob[] = new Object[6];
        ob[0] = 1;
        ob[1] = "Vinayak Dabgar";
        ob[2] = 38;
        ob[3] = "Softweb Solution";
        ob[4] = "M";
        ob[5] = 2000.50;

        for (int n= 0; n<ob.length ; n++)
        {

            System.out.println(ob[n]);
        }*/

        String x[][] = new String[3][5];

        System.out.println(x.length);
        System.out.println(x[0].length);





    }

}
