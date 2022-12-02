package experimentJava;

import org.testng.annotations.Test;

public class TestCar {

    @Test
    public void carCalling()
    {
        Ford fd1 = new Ford();
        fd1.bmwEngine();
        fd1.sum();
        fd1.bmwEngine();
        fd1.fordEngine();

    }
}
