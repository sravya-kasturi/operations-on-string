public class Stringsopr{
    public static void main(String[] args ){
        String str ="hello, Natasha";
        String a ="welcome to java tutorial";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(4));// returns the char at the specific index
        System.out.println(str.indexOf('h'));//returns the position of the ffirst found occurance of specified characters in a string
        System.out.println(str.length());//returns the length of a specified string
        //OTHER STRING METHODS
        System.out.println(str.codePointAt(3));//returrns the unicode of the char at the specific index
        System.out.println(str.codePointBefore(2));//returns the number of unicode values found in a string
        System.out.println(str.codePointCount(2, 4));//returns the number of unicode values found in a string
        System.out.println(str.concat(" "+a));//appends a string to the end of another string 
        System.out.println(str.contains(str));// check wheather a string contains a sequence of chareacters ,retuens boolen values
        System.out.println(str+" "+a);
        System.out.println(str);
    }
}
