import linkedList.linkList;

import java.util.Iterator;

public class Program {
    public static void main(String[] args)
    {
        linkList<String> lst = new linkList<>();
        lst.add("GO-GO");
        lst.add("Привет, ");
        lst.add("Мир!!!");

        /*linkList pp = lst.first;
        while(pp != null)
        {
            System.out.println(pp.toString());
            pp = pp.next;
        }*/
        System.out.println("Size=" + Integer.toString(lst.getSize()));

        for (String string : lst)
            System.out.println(string);
    }
}
