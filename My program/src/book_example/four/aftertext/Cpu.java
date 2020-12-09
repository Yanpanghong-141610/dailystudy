package book_example.four.aftertext;

/**
 * @ClassName Cpu
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/19
 **/

public class Cpu {
   private int speed;
   void setSpeed(int speed)
   {
       if(speed>0)
       {
           this.speed = speed;
       }
   }

   int getSpeed(){
       return speed;
   }
}
