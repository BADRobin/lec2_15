package lec215;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<String> strs = new ArrayList<>();
//        strs.addAll(List.of("aaa", "bbbb", "c")); в 10 JAVA
//        strs.addAll(Arrays.asList("aaa", "bbbb", "c")); в 8 JAVA

        List<String> list = Arrays.asList("aaa", "bbbb", "c"); // немодифицируемая коллекция
        strs.addAll(list);
//        strs.remove("c");
        System.out.println(strs);
//        String[] arr = new String[1];
        String[] arr = new String[strs.size()];
//        String[] arr1 = strs.toArray(arr);
        arr = strs.toArray(arr);
//        System.out.println(arr1 == arr);
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
//        Collection<Integer> inst = new ArrayList<>();
        List<Integer> inst = new ArrayList<>();
        inst.addAll(Arrays.asList(2,3,4,5,6,7,8,9,10));
//        for (Iterator<Integer> iterator = inst.iterator(); iterator.hasNext(); ) {
//            Integer next = iterator.next();
//            if (next % 2 == 0){
//                iterator.remove();
//            }
//        }
        System.out.println(inst);
        List<Integer> subList =  inst.subList(3,7);
        subList.set (0 ,45);
        subList.remove(3);
        System.out.println(subList);
        System.out.println(inst);
    }
}
