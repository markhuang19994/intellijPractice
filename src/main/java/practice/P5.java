package main.java.practice;

/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/10/31, MarkHuang,new
 * </ul>
 * @since 2018/10/31
 */
public class P5 {

    /*
    * 1.調轉equals左右參數
    * 2.把equals改成Objects.equals()
    * 3.把if裡面的or(||)換成and(&&)
    * 4.反轉if的條件
    * 5.簡化if
    * 6.驗證ss的正則表示式
    *
    * 以下都是按alt + enter的選項
    * flip equal...1
    * with Objects...2
    * replace && with ||...3
    * invert if...4
    * simplify...5
    * inject lang or ref + enter => regexp...6
    * */
    public void yo() {
        String s = null;
        s.equals("123");

        if(Math.random() +1 > 1 && true || false && !true){

        }

        String ss = "^(\\d+)$";
    }

}
