package book_example.thirteen;

/**
 * @ClassName Example13_2
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/11
 **/

interface Computer<E,F>
{
    void makeChorus(E x,F y);

}
class Chorus<E,F>implements Computer<E,F>
{
    public void makeChorus(E x,F y)
    {
     x.toString();
     y.toString();
    }
}

class 乐器{
    public String toString()
    {
        System.out.println("|351-|135-|12 35 2-|");
        return "";
    }
}
class 歌手{
    public String toString()
    {
        System.out.println("你和我,我和你,同住地球村");
        return "";
    }
}
public class Example13_2 {
    public static void main(String[] args) {
        Chorus<歌手,乐器>model = new Chorus<歌手,乐器>();
        歌手 pengliyuan = new 歌手();
        乐器 piano = new 乐器();
        model.makeChorus(pengliyuan,piano);
    }
}
