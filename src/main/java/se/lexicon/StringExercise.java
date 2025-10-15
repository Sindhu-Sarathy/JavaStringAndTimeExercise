package se.lexicon;

public class StringExercise {

    public static void main(String[] args){

        /* The length of the String */
        String str="Java";
        System.out.println(str.length());

        String str1="Long example sentence";
        System.out.println("Char at index 6: " + str1.charAt(6));

        String str2="Even longer example sentence";
        System.out.println("The index position of 'o':  " + str2.indexOf('o'));

        String str3="Ok this is not as long!";
        System.out.println("a substring of only 'not as long':" + str3.substring(11,22));

        String str4="CAPS EQUALS SCREAMING";
        System.out.println("Lowercase: "+str4.toLowerCase());
        System.out.println("Uppercase: "+str4.toUpperCase());

        String str5="Java is the worst programming language!";
        System.out.println("The corrected sentence is: "+str5.replace("worst","best") );

        String str6="\tJ\ta\tv\ta\t";
        System.out.println("The trimmed String is:"+str6.trim());



    }
}
