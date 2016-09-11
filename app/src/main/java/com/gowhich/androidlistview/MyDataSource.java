package com.gowhich.androidlistview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by durban126 on 16/9/11.
 */
public class MyDataSource {

    public MyDataSource(){

    }

    public static List<String> getDataSource(){
        List<String> list = new ArrayList<>();
        list.add("上海");
        list.add("北京");
        list.add("深圳");
        list.add("杭州");
        list.add("山东");
        list.add("济南");

        return list;
    }
}
