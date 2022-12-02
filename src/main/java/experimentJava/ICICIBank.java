package experimentJava;

public class ICICIBank implements USBank{

    @Override
    public void saving() {
        System.out.println("Implement for USbank - saving ");
    }

    @Override
    public void current() {
        System.out.println("Implement for USbank - Current ");
    }

    @Override
    public void fix_deposit() {
        System.out.println("Implement for USbank - fix_deposit ");
    }

    public void mutual_fund()
    {
        System.out.println("own product of ICICI - Mutual Fund ");
    }
}

