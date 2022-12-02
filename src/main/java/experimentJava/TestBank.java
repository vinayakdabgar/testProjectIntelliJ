package experimentJava;

import org.testng.annotations.Test;

public class TestBank {

    @Test
    public void testB(){

        ICICIBank ib = new ICICIBank();

        ib.fix_deposit();
        ib.current();
        ib.mutual_fund();
        ib.saving();
        System.out.println("Minimum balance of icici bank :" + ICICIBank.bal);
    }


}
