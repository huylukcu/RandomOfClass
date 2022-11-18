package day25_26_27;

public class busrareviewexception {
   /* Day25-26-27   Questions  @Yasemin

    1-What is "Exception"? -->"Exception" means unexpected issues in code execution
    2-How can we work with Exceptions?  --> There are 2 ways to work with Exceptions
                                                 i)Using try-catch block: Handling Exception
                                                 ii)Throw Exception and block the application

    3-What happened if you do not handle the Exception? --> Java stops execution and the application is blocked.
    4-Can you say something about "try" --> "try" can be used with a single or more catch blocks, "try" cannot be used alone, using catch is not mandatory.
                                                "try" can be used like i) try+single catch    ii)try + multiple catch

    5-What is ArithmeticException? -->that one will cover all mathematical problems.
    6-How can we get technical message about the exception? --> With using e.printStackTrace()
    7-When will we get NumberFormatException? --> When we use valueOf method and when we  put a non-digit character into the String

    8-When will we get StringIndexOutOfBoundsException? --> When we use non-existing index for a String, we will get "StringIndexOutOfBoundsException"

    9-Where will "finally" uses? --> Finally uses in try-catch. If you want to execute a code for every scenario, use "finally" block after "try" body.


    10)What is the "RunTime Exceptions"?  --> "ArithmeticException", "NullPointerException", "NumberFormatException", "ArrayIndexOutOfBoundsException",
    "StringIndexOutOfBoundsException", "IllegalArgumentException"  are displayed on the console after I click on
    "Run" button therefore those are called "RunTime Exceptions ((Unchecked Exception)".  All these exceptions i run time exceptions. they are not visible

    11)What is "Compile Time Exception"? --> There is "Compile Time Exception", they will be displayed before clicking on the "Run" button.
    Therefore, they are called "Compile Time Exception (Checked Exception)"

    12)What is "FileNotFoundException"? -->FileNotFoundException is related with the "Path of the file" and the "Existence of the file".
    "FileNotFoundException" is "Compile Time Exception" (Checked Exception). "FileNotFoundException" is the child of "IOException"

    13)What is "IOException"?  -->IOException is related with all possible input output issues. "IOException" is "Compile Time Exception"

    14)What is your options when you encounter a "Compile Time Exception"? --> I have to options:
                                                                        i)Using "throws" in method signature line
                                                                        *Java will throw exception and stop the execution
                                                                        ii)Using try-catch block
                                                                        *Java will execute whatever you typed inside the catch body and does not stop                           the execution.

    15)What is the different between "throw" and "throws" keywords? -->i)"Throw" keyword is used to throw and Exception in anywhere inside the method body.
                                                                        "throws keywords is used in the method signature line  --> ) *  {

                                                                        ii)By using "throws" keyword you can declare multiple exceptions
                                                                        After using "throw" keyword you can  declare just one exception

                                                                        iii)After using "throw" keyword you have to create an Exception object.
                                                                        After using "throws" keyword, you will tell just the name Exception class

   16)What is the main difference between Exception and error? --> "Exception" can be handled but "Error" can not.
                                                                        OutOfMemory, StackOutOfMemory, VirtualMachine, Assertion can be example for errors.
                                                                        if StackOutOfMemory, it means there is not enough space in memory.

   17)What is method overloading? --> Method overloading is adding parameters to the same method name.

   18)How do you change the parameter of a method? -> I can add different parameters and change the number of parameters or order of parameters

   19-Why we need Custom Exceptions? --> 1)To make Java exceptions more specific,  2)To create some exceptions for our application.
                                         3)Custom Exceptions guide the developers not to break the application rules

   20-Give two examples for to get "FileNotFoundException"---> i)path can be wrong ii)file doesn't exist

   21-What is "Collections" --> Collections are for storing multiply data in the same data type. Collections are flexible in length.
                                Collections have many usefull methods.

   22-What is the type of collections?          i)List  --> a)ArrayList :Successful in search operations, but not good at adding and removing.
                                                            b)LinkedList : Successful in removing and adding operations, but not good at "search operations"
                                                ii)Queue ---> a) PriorityQueue   b)Deque
                                                iii)Set --> a)HashSet   b)LinkedHashSet     c)TreSet

  23-What are the disadvantages of arraylist?  ArrayList are not successfully in removing elements and ArrayList are not successfully in adding elements




       */
}
