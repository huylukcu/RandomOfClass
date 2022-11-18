package friendsquestion;

import java.util.ArrayList;

public class ArrayList_RemoveNum {
    public static void main(String[] args) {

   // If a list has 15 or 13, remove them.
//Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

        /* ArrayList

        for (int i =0; i<list1.size(); i++){

        if (list1.get(i)==13){

        list1.remove(Integer.valueOf(13));
        }

        if (list1.get(i)==15){
        list1.remove(Integer.valueOf(15));
        }
        }
        System.out.println(list1);

        }*/
    // 6) If a list has 15 or 13, remove them.
    //   Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(31);
        list.add(15);
        list.add(13);
        list.add(54);

       ArrayList<Integer> newList = new ArrayList<Integer>();

        for(int w:list){

        if(w==15 || w==13) {

            continue;
        }
        newList.add(w);
    }

        System.out.println(newList);
    }}