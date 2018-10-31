package main.java.practice;

/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/10/31, MarkHuang,new
 * </ul>
 * @since 2018/10/31
 */
public class P4 {
    /**
     * 1.把yo裡面的第一個方法向上移動到第二個方法上面
     * 2.把第一個方法放到跟第二個方法上面
     * 3.把參數1放在第一個參數
     *
     *
     * 鼠標放在第一個方法(),alt + shift + 上下...1
     * 鼠標放在第一個方法,ctrl + shift + 上下...2
     * 鼠標放在參數,ctrl + alt + shift + 左右...3
     *
     */
    public void yo(){
        第二個方法("","");
        第一個方法();
    }

    private void 第二個方法(String 參數2, String 參數1){
        System.out.println(2);
    }

    private void 第一個方法(){
        System.out.println(1);
    }
}
