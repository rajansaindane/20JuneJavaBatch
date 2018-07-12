package collectionDemo;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {


        List<String> list=new ArrayList<>();
        list.add("chetan");
        list.add("jinendra");
        list.add("rajan");
        list.add(1,"tushar");


        List<String> list1=new ArrayList<>();
        list1.addAll(list);
        list1.add("Yeshi");
        list1.add("sontakke");
        list1.add("saindane");

        Set<String>  set=new HashSet<>();
        set.add("jinendra");
        set.add("rajan");
        set.add("chetan");
        set.add("Abhi");

        set.addAll(list);

        Set<String> set1=new TreeSet<>();
        set1.addAll(set);


            for (String s : list1) {
                if(list.contains(s)) {
                    System.out.println(s);
                }
                else
                {
                    System.out.println(s+" is not present");
                }
            }

    }

}
