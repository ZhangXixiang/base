import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {






    public static void main(String[] arg){


        MyClasss myClasss = new MyClasss(1L,"xx","desc");
        MyClasss myClasss1 = new MyClasss(2L,"xx1","desc");
        MyClasss myClasss2 = new MyClasss(3L,"xx2","desc");
        MyClasss myClasss3 = new MyClasss(4L,"xx2","desc");
        MyClasss myClasss4 = new MyClasss(4L,"xx3","desc");
        MyClasss myClasss5 = new MyClasss(5L,"xx4","desc");


        List<MyClasss> list = new ArrayList<>();
        list.add(myClasss);
        list.add(myClasss1);
        list.add(myClasss2);
        list.add(myClasss3);
        list.add(myClasss4);
        list.add(myClasss5);

        List<MyClasss> list1 = new ArrayList<>();
        list1.add(myClasss);

        list1 = list;


        Iterator<MyClasss> iterator = list.iterator();

        List<MyClasss> newList = new ArrayList<>();
       /* while (iterator.hasNext()){
            MyClasss item = iterator.next();
            if("xx2".equals(item.getName())){
                newList.add(item);
                iterator.remove();
            }
        }*/

       for(MyClasss item : list){

           if("xx3".equals(item.getName())){
               newList.add(item);
               list.remove(item);
           }



       }


        list.addAll(newList);

        System.out.println("finish");

        TestMain.main(newList.toArray(new String[0]));

        TestMain testMain = new TestMain();






    }
}
