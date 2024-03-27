/*1. Write a program to get the following output.
 Hey there,
I am “some data”! (assign a variable and print the variable data  .  */
//Note:This type of comment starts with /* and ends with */. Any text between these delimiters is considered a comment and is ignored by the compiler.
// to print a string with a variable interpolation in Java
// interpolation is the process of inserting the values into the string or data stream dynamically . It allows you to construct strings or other data structures where certain parts of the content are determined by variables or expressions.
public class one{
public static void main(String[] args) {
    String a = "Suren";
    System.out.println("hey there \n I am " +a);
    System.out.println(String.format(   "Hey there \n I am", a));  // or we can do print in this way for interpolation
    System.out.println(String.format("hello I am %s", a));

}
}