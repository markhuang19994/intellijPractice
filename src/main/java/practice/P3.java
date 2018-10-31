package main.java.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/10/31, MarkHuang,new
 * </ul>
 * @since 2018/10/31
 */
public class P3 {
    /*
    * 1.生成integer的變數
    * 2.用if包住b
    * 3.m顯示轉型成HashMap
    * 4.m.keySet生成for迴圈
    * 5.反白變數sdfgdfgdfg
    * 5.修改變數名稱sdfgdfgdfg => s
    *
    * 後方接:
    * .var...1
    * .if...2
    * .cast...3
    * .fori...4
    * 滑鼠指在變數任何一個字上ctrl + w(一直按w可以智能向上選取)
    * 選取變數名稱後shift + f6 ...5(檔案名稱,class名稱等等都能這樣改)
    * */
    public void yo(){
        new Integer(3);

        boolean b = Math.random() + 1 < 1;

        Map m = new HashMap();

        m.keySet();

        String sdfgdfgdfg = "123";
        System.out.println(sdfgdfgdfg);
    }
}
