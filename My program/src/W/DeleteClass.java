package W;

import java.util.ArrayList;

public class DeleteClass {
    public static void main(String[] args) throws Exception {
        LinkList list=new LinkList();
        //向单链表中添加数据
        for(int i=0;i<10;i++) {
            int temp = ((int) (Math.random() * 100)) % 100;
            list.insert(i, temp);
            System.out.println(temp + " ");
        }
        int max=(int)list.get(0);
        int count=0;
        for(int i=0;i< list.size;i++){
            //寻找最大值并且删除
            if ((int)list.get(i)>=max)
            {
              max=(int)list.get(i);
              count=i;
            }
        }
        list.delete(count);
        System.out.println("----"+max);
        //输出删除后的链表
      for (int l=0;l<list.size;l++)
        {
            System.out.println(list.get(l)+" ");
        }

    }
}
