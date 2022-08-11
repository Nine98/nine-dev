package com.netease;

import javafx.util.Pair;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyTest {

    public static void main(String[] args) {

        ArrayList<String[]> strList = new ArrayList<>();
        strList.add(new String[]{"Java", "IsNice","1"});
        strList.add(new String[]{"Java", "IsGood","2"});
        strList.add(new String[]{"Python", "IsWonderful","3"});
        strList.add(new String[]{"Java", "IsBeauty","4"});

        String[][] aa = strList.toArray(new String[0][0]);


        List<String[]> list = strList.subList(0, 1);
        for (String[] lis: list) {
            System.out.println(lis);
        }

        // 测试 toMap 方法
        Stream<String []> str = Stream.of(new String[][]{{"Java", "IsNice","1"},
                                                        {"Java", "IsBeauty","4"}});
//        Map<String, String> map = str.collect(Collectors.toMap(p -> p[1],p->p[0]));

//        Map<String, String> map = str.collect(Collectors.toMap(q->q[0],q->q[1],(a,b)->a+","+b));

        HashMap<String,String> map = strList.stream().collect(Collectors.toMap(p->p[0], p->p[1],(a, b)->b,HashMap::new));

        System.out.println("map:"+map);



        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version",12.10));
        pairArrayList.add(new Pair<>("version",12.19));
        pairArrayList.add(new Pair<>("version",6.28));

        Map<String, Double> mp = pairArrayList.stream().collect(Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v2));
        System.out.println(mp);


        float a = 1.0F-0.9F;
        float b = 0.9F-0.8F;
        float diff = 1e-6F;
        if (Math.abs(a - b) < diff) {
            System.out.println("true");
        }
        BigDecimal c = new BigDecimal("1.0");
        BigDecimal d = new BigDecimal("0.9");
        BigDecimal e = new BigDecimal("0.8");


        String s = "a,b,c,,";
        String[] strArray = s.split(",");
        System.out.println(strArray.length);

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());
//        System.out.println(System.currentTimeMillis());
//        System.out.println(System.nanoTime());
//
//        int i = LocalDate.now().lengthOfYear();
//        System.out.println(i);


        ArrayList<Integer> arrayList = new ArrayList<>(3);
        Integer t = new Integer(4);
        arrayList.add(t);
        System.out.println(arrayList.isEmpty());
        for (Integer l: arrayList) {
            System.out.println(l);
        }

    }
}
