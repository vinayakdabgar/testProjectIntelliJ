package listCollection;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListConcept {
    
    
    @Test
    public void array_list()
    {

        ArrayList ar = new ArrayList();
        ar.add(2);
        ar.add("Vinayak");
        ar.add(10);

        System.out.println(ar.size());

        for ( int i=0; i<ar.size() ; i++)
        {
            System.out.println(ar.get(i));

        }


        Employee e1 = new Employee("vinay", 30, "QA");
        Employee e2 = new Employee("vinay1", 31, "QA1");
        Employee e3 = new Employee("vinay2", 32, "QA2");

        ArrayList<Employee> ar2 = new ArrayList<Employee>();
        ar2.add(e1);
        ar2.add(e2);
        ar2.add(e3);

        Iterator<Employee> itr = ar2.iterator();

        while (itr.hasNext())
        {
            Employee emp = itr.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

        LinkedList<String> l1= new LinkedList<String>();
        l1.add("Vinay1");
        l1.add("Vinay2");
        l1.add("Vinay3");
        l1.add("Vinay4");
        l1.add("Vinay5");

        System.out.println("Value of link list as follows " + l1);
        l1.addFirst("Sneha");
        System.out.println(l1);

        System.out.println(l1.get(0));
        l1.set(0,"janav");
        System.out.println(l1);
        l1.removeFirst();
        l1.remove(3);
        l1.removeLast();
        System.out.println(l1);

        // Print using different loop.

  System.out.println("FOr loop");
        for ( int i=0; i<l1.size(); i++){

            System.out.println(l1.get(i));
        }

       // advance for loop
        System.out.println("Advance FOr loop");
        for ( String str : l1)
        {
            System.out.println(str);
        }

        // Iterator
        System.out.println("Using Iterator");
        Iterator<String>  ir = l1.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());

        }

        // while loop
        System.out.println("While loop");
        int num = 0;
        while ( l1.size()>num)
        {
            System.out.println(l1.get(num));
            num++;
        }




    }
    
}
