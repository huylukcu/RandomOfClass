package day16_17_18_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsPassByValueDateTimeVarargs {
    public static void main(String[] args) {

    // 1) Type code to make all elements in a List unique(COMMON INTERVIEW QUESTION)
    //           [2, 3, 2, 2, 5] ==> [2, 3, 5]
    List<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
    List<Integer> b = new ArrayList<Integer>();
        for(Integer w : a){
        if(!b.contains(w)){
            b.add(w);
        }
    }
    //2) Find the closest 2 integers in the given list. [12, 15, 16, 21]
    List<Integer> c = new ArrayList<Integer>();
        c.add(12);
        c.add(15);
        c.add(16);
        c.add(21);
        System.out.println(c);//[12, 15, 16, 21]
    //How to sort list elements
        Collections.sort(c);
        System.out.println(c);//[12, 15, 16, 21]
    //How to get minimum difference
    int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<c.size(); i++){
        minDiff = Math.min(minDiff, c.get(i) - c.get(i-1));
    }
        System.out.println(minDiff);
        for(int i=1; i<c.size(); i++){
        if(c.get(i) - c.get(i-1) == minDiff){
            System.out.println(c.get(i) + " and " + c.get(i-1));
        }
    }
    //3) Convert all elements to "*" except the last 4 elements

    List<String> d = new ArrayList<String>();
        d.add("11");
        d.add("31");
        d.add("22");
        d.add("22");
        d.add("26");
        for(int i=0; i<d.size(); i++){
        if(i==(d.size()-4) || d.size()<5){
            break;
        }
        d.set(i, "*");
    }
        System.out.println(d);

    //4) Increase the value of every element by 3 except 7
    List<Integer> e = new ArrayList<Integer>();
        e.add(11);
        e.add(31);
        e.add(22);
        e.add(7);
        e.add(15);
        for(Integer w : e){
        if(w==7){
            continue;
        }
        e.set(e.indexOf(w),w+3);
    }
        System.out.println(e);
    //Note: How can you understand the existence of a specific element in a List?
    //      i) Use indexOf() method if the result is "-1" it means the element does not exist,
    //      if the result is not "-1" it means the element exists
    //      ii) Use contains()


        /*  PASS BY VALUE
         Question:Does Java use Pass by value or Pass by reference?
         Answer:Java uses "Pass by Value" everytime.When you use a variable inside a method,
                Java creates the copy of the variable and uses it inside the method.
                Java does that for to protect the original value of the variables.
                This process is called "Pass by Value" in Java.
                The opposite of "Pass by Value" is "Pass by Reference", Java does not use "Pass by Reference"



         DATE-TIME
        1) How to change the format of the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy")==>27/10/2022
        DateTimeFormatter dt =DateTimeFormatter.ofPattern("dd/MMM/yyyy") ==>27/Oct/2022(MMM gives first 3 of character)
        DateTimeFormatter d =DateTimeFormatter.ofPattern("dd/MMMM/yy")   ==>27/October/22(MMMM gives full name of month)

        2) How to change the format of the time
        DateTimeFormatter mnr =DateTimeFormatter.ofPattern("hh:mm a")==>hh uses 12 hours system,HH uses 24 hours system
                                                                     ==>"a" for displaying "AM"or"PM"

        3)Type the code that find out how many months Ali lived. Date of birth of Ali is 4th of June 1997
        LocalDate dobAli = LocalDate.of(1997, Month.JUNE, 4);
        LocalDate currentDate = LocalDate.now();
        long numOfMonths = ChronoUnit.MONTHS.between(dobAli, currentDate);
        System.out.println(numOfMonths);//303


        Varargs
        1)When do we use varargs?
           If you want to make number of parameters flexible in a method ,use varargs
        2)Can I use another regular parameter after varargs?
           No ,because varargs can not be made full,second parameter will be unreachable ,it will give error
           varargs must be last parameter everytime
        3)Can I use another regular parameter before varargs?
           Yes,you can use many regular parameters before varargs
        4)Can I use multiple varargs parameter in a method //No


        INCREMENT-DECREMENT(Mr.Suleyman stated that:In certification exam they ask increment and decrement ,there are
                             many questions about them .You should learn it:)FYI

         1) int a =12;
            int b=a++;//Post increment  ==> a=13 , b=12
         2)int m =21;
           int n=++m;//Pre increment    ==> m=22 , n=22
         3)int x=15;
           int y= x--;//Post decrement  ==> x=14 , y=15
         4) int t=32;
            int u =--t;//Pre increment  ==> t=31 , u=31
         */
}
    }