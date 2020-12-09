package book_example.four.aftertext;

/**
 * @ClassName HardDisk
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/19
 **/

public class HardDisk {
    private int amount;

    void setAmount(int amount)
    {
        if(amount>0)
        {
            this.amount = amount;
        }
    }

    int getAmount()
    {
        return amount;
    }
}
