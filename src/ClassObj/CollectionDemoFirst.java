package ClassObj;

import java.util.ArrayList;

/**
 * Created by Anukul-PC on 21-06-2018.
 */
public class CollectionDemoFirst {


    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList();

        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(40);
        intArrayList.add(50);

//        System.out.println(intArrayList);
//
//        System.out.println("before Add");
//        for (int i = 0; i < intArrayList.size(); i++) {
//            System.out.println(intArrayList.get(i));
//        }
//
//        intArrayList.add(2,99);
//        System.out.println("After Add");
//        for (int i = 0; i < intArrayList.size(); i++) {
//            System.out.println(intArrayList.get(i));
//        }
//

        ArrayList<String> stringArrayList= new ArrayList<>();


        stringArrayList.add("mimoh");
        stringArrayList.add("anukul");
        stringArrayList.add("smita");
        stringArrayList.add("darshit");
        stringArrayList.add("kodeeshwari");
        stringArrayList.add(1,"harshil");


        for(int i=0;i<stringArrayList.size();i++)
        {
            System.out.println(stringArrayList.get(i));
        }






    }


}
