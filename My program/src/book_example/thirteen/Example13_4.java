package book_example.thirteen;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName Example13_4
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/11
 **/

public class Example13_4 {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.add("你");
        mylist.add("好");
        int number = mylist.size();
        for (int i=0;i<number;i++)
        {
            String temp = (String) mylist.get(i);
            System.out.println("第"+i+"结点中的数据:"+temp);
        }
        Iterator iter = mylist.iterator();
        while(iter.hasNext())
        {
            String te = (String) iter.next();
            System.out.println(te);
        }
    }
}
