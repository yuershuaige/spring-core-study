package main.java.org.geekbang.thinking.in.spring.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghaoyu
 * @version 1.0
 * @description: TODO
 * @date 2021/6/7 4:18 下午
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1231");
        list.add("1232");
        list.add("1233");
        list.add("1234");
        list.add("1235");
        list.add("1236");
        list.add("1237");
        list.parallelStream()
                .forEach(str ->{
                    if ("1235".equals(str)) {
                        str = "111111111111";
                    }
                });
        list.stream().forEach(str -> System.out.println(str));
        System.out.println("似懂非懂三法师");
    }
}
