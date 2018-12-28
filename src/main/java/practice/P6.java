package main.java.practice;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.stream.Collectors;

/**
 * @author MarkHuang
 * @version <ul>
 * <li>2018/12/28, MarkHuang,new
 * </ul>
 * @since 2018/12/28
 */
public class P6 {
    /*
     * 1.把Mark提取成常量
     * 2.把is提取成區域變數
     * 3.把very提取成全域變數
     * 4.把handsome提取成方法參數
     * 5.新增一個fixme註解
     * 6.新增一個for迴圈
     * 7.加入bookmark
     * 8.查看RandomAccessFile的文檔
     * 9.取出為println方法
     * 10.logf模板
     *
     * ctrl + alt + (c,v,f,p) 分別對應1~4
     * ctrl + j + f i x m e  ...5
     * ctrl + j + fori  ...6
     * ctrl + f11 (查看bookmark為shift + f11) ...7
     * ctrl + q (可以選擇左下角齒輪讓它顯示在tool window) ...8
     * ctrl + alt + m ...9
     *
     * 以下步驟為第10題的參考解答
     * 1.ctrl + alt + s
     * 2.用搜尋框找到live templates
     * 3.選擇other => 按下+號 => 選擇第一個live template
     * 4.Abbreviation: logf
     * 5.Description: generate logger factory from sl4j
     * 6.templateText:private static final Logger LOGGER = LoggerFactory.getLogger($CLASS_NAME$.class);
     * 7.edit variable => expression:className
     * 8.在底下根據提示(No application context)點選Define => java => Declare
     *
     *
     * 在Editor單字上按 alt + enter => 選擇implement interface
     *
     *
     * */
    public void hey() throws FileNotFoundException {
        //1~4
        System.out.println(String.format("My name is %s", "Mark"));
        System.out.println(String.format("My name is %s", "is"));
        System.out.println(String.format("My name is %s", "very"));
        System.out.println(String.format("My name is %s", "handsome"));

        //5.在此新增一個fixme註解

        //6.在此新增一個for迴圈

        //7.把底下這句話加入bookmark
        System.getProperties().entrySet().stream().parallel().sorted().distinct().collect(Collectors.toList());

        //8.在tool window查看RandomAccessFile的文檔
        RandomAccessFile raf = new RandomAccessFile("", "");

        //9.把底下的4句System.out.println()獨立成一個名為println的方法
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

    }

    //10.新增一個名為logf的模板,用以產生底下這一行
    //private static final Logger LOGGER = LoggerFactory.getLogger(P6.class);

    //11.創建此interface的實現類
    interface Editor {
        void getText();
    }

}
