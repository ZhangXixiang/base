import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lambdas {


    public static void main(String[] args) {


        List<MyClasss> pojoList = new ArrayList<>();


        //list转list
        List<MyClasss> newList = pojoList.stream().map(a->a).filter(a -> a.getId() > 0).collect(Collectors.toList());
        List<Long> idList = pojoList.stream().map(a->a.getId()).filter(a -> a > 0).collect(Collectors.toList());
        //list转map
        Map<Long,MyClasss> newMap = pojoList.stream().collect(Collectors.toMap(MyClasss::getId, Function.identity(),(a,b)->a));


            char[] chars = String.valueOf(1234).toCharArray();
            for (char c : chars) {
                int showLocation = c - '0';
                System.out.println(showLocation);
            }



                SetMultimap<String, String> setMultimap = HashMultimap.create();
                setMultimap.put("key", "1");
                setMultimap.put("key1", "1");
                setMultimap.put("key", "2");
                System.out.println(setMultimap.get("key").size());



                Map<String,String> map = new HashMap<>();
                for(String key : map.keySet()){
                    map.get(key);
                }

                for(Map.Entry<String,String> entry : map.entrySet()){
                    entry.getKey();
                    entry.getValue();
                }

                Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
                if(iterator.hasNext()){
                    Map.Entry entry = iterator.next();
                    entry.getValue();
                    entry.getKey();
                }









        }




    }


