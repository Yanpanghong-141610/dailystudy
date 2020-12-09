package book_example.four.aftertext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/19
 **/

public class Test {
    public static void main(String[] args) {
        Cpu cpu=new Cpu();
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);

        Pc pc = new Pc();
        pc.setCpu(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
