package day13_14_15;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndMulti_coding {

        public static void main(String[] args) {


    /*
    Q01 -  Let user  enter student names into the application
           (Create an Array together with the user)
     */

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of the Students please! ");
            int numOfStd = input.nextInt();

            String students[] = new String[numOfStd];

            for (int i = 0; i < students.length; i++) {

                System.out.println("Enter " + (i + 1) + ". student name, to stop please enter Q");
                String stdName = input.next();

                if (!stdName.equalsIgnoreCase("Q")) {
                    students[i] = stdName;
                } else {
                    break;
                }
            }
            System.out.println(Arrays.toString(students));

    /*
    Q02- Create an Integer Array and print the elements of the Array in Reverse order
     */

            int arr[] = {2, 4, 6, 8, 10, 12};

            //1.Way
            Arrays.sort(arr);

            for (int i = arr.length - 1; i > -1; i--) {

                System.out.print(arr[i] + " ");
            }
            System.out.println();
            //2.Way
            int brr[] = new int[arr.length];

            int idx = 0;
            for (int i = arr.length - 1; i > -1; i--) {
                brr[idx] = arr[i];
                idx++;
            }
            System.out.println(Arrays.toString(brr));

     /*
        Q03- [0, 2, 3, 0, 12, 0] put the zeros to the end
     */
            int crr[] = {0, 2, 3, 0, 12, 0};

            int idx1 = 0;
            int lastIdx= crr.length-1;

            int drr[] = new int[crr.length];

            for(int i=0; i<crr.length; i++){
                if(crr[i]!=0){
                    drr[idx1]= crr[i];
                    idx1++;
                }else{
                    drr[lastIdx] = 0;
                    lastIdx--;
                }
            }
            System.out.println(Arrays.toString(drr));

     /*
     Q04) Type code to check if a specific element exists in an Array or not
      */

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a character/word to check it exists in the given Array");
            String str = scan.nextLine();

            String [] frr= { "Tom", "Ali", "Alley", "Katty", "Mary"};

            //1.Way:
            int counter = 0;
            for(String  w : frr) {

                if (w.equalsIgnoreCase(str)) {
                    counter++;
                }
            }
            if(counter>0){
                System.out.println("The element exists!");
            }else{
                System.out.println("Does not exist!");
            }
            //2.Way:
            Arrays.sort(frr);
            System.out.println(Arrays.toString(frr));
            int idx3 = Arrays.binarySearch(frr, str);
            System.out.println(idx3);// -3 returns negative order number if the element does not exist in the Array


    /*
        Q05: Convert multidimensional array to one dimensional array
               { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }
    */
            String [][] a = { {"learn", "java", "it"}, {"is", "easy"} };

            int numOfElements = 0;
            for(String [] w: a){
                numOfElements += w.length;
            }
            System.out.println(numOfElements);

            String [] b = new String[numOfElements];

            int idx4=0;
            for(String [] w : a){

                for(String u : w){
                    b[idx4] = u;
                    idx4++;
                }
            }
            System.out.println(Arrays.toString(b));

    /*
      Q06: Find the maximum element in a two-dimensional array
     */

            int grr [][] = { {5, 0}, {-2, 4}, {65, -12, 23} };
            //1.Way
            int max = grr[0][0];

            for(int [] w : grr){
                for(int u : w){
                    if(u>max){
                        max=u;
                    }
                }
            }
            System.out.println(max);//65

            //2.Way
            int max1 = grr[0][0];
            for(int [] w : grr){
                for(int u : w){
                    max1 = Math.max(max1, u);
                }
            }
            System.out.println(max1);//65


    /*
    Q07: Find the minimum element in a two-dimensional array
     */

            int min = grr[0][0];
            for(int [] w : grr){
                for(int u : w){
                    if(u<min){
                        min = u;
                    }
                }
            }
            System.out.println(min);//-12
}}
