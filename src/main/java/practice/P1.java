package main.java.practice;

import main.java.other.YourFather;

/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/10/31, MarkHuang,new
 * </ul>
 * @since 2018/10/31
 */
public class P1 extends YourFather {
    /*
     * 1.請生成getter setter
     * 2.請生成初始化參數的constructor
     * 3.請複寫父類的sayHello方法
     * 4.請生成靜態初始化方法getInstance
     *
     * 可以用到的方法:
     * alt + insert...1&2
     * 直接在class空白處打get/set...1&4
     * ctrl + o...3
     * */
    private String p1s;
    private int p1i;


}

/*參考解答
* public static P1 getInstance(String p1s, int p1i) {
        return new P1(p1s, p1i);
    }

    public P1(String p1s, int p1i) {
        this.p1s = p1s;
        this.p1i = p1i;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("I'm your son");
    }

    public String getP1s() {
        return p1s;
    }

    public void setP1s(String p1s) {
        this.p1s = p1s;
    }

    public int getP1i() {
        return p1i;
    }

    public void setP1i(int p1i) {
        this.p1i = p1i;
    }
*
* */