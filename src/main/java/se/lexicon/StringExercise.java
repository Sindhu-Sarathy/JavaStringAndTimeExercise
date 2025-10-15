package se.lexicon;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class StringExercise {

    public static void main(String[] args){

        /* The length of the String */
        String str="Java";
        System.out.println(str.length());

        /*To get the Char at Index */
        String str1="Long example sentence";
        System.out.println("Char at index 6: " + str1.charAt(6));

        /*To get the index position */
        String str2="Even longer example sentence";
        System.out.println("The index position of 'o':  " + str2.indexOf('o'));

        /*To get the Substring from the sentence */
        String str3="Ok this is not as long!";
        System.out.println("a substring of only 'not as long':" + str3.substring(11,22));

        /*To convert the string to lower case and upper case */
        String str4="CAPS EQUALS SCREAMING";
        System.out.println("Lowercase: "+str4.toLowerCase());
        System.out.println("Uppercase: "+str4.toUpperCase());

        /*To replace the string */
        String str5="Java is the worst programming language!";
        System.out.println("The corrected sentence is: "+str5.replace("worst","best") );

        /*To trim the string */
        String str6="\tJ\ta\tv\ta\t";
        System.out.println("The trimmed String is:"+str6.trim());

        /*To parse and convert int to string */
        int num=20;
        String str7=String.valueOf(num);
        System.out.println("The String is: "+(str7+num));

        /*To split the words using array */
        String str8="Oil and Water";
        String[] div=str8.split(" and ");
        System.out.println("The split words are:");
        System.out.println(div[0]);
        System.out.println(div[1]);

        /*To split the names using array */
        String names="Carl,Susie,Fredrick,Bob,Erik";
        String[] array=names.split(",");
        System.out.println("The Names are: ");
        for(String name:array){

            System.out.println(name);
        }

        /*To convert into char array */
        String str9="ThisShouldBeConverted";
        char[] chars=str9.toCharArray();
        System.out.println("The Char Array are:");
        for(char c:chars){
            System.out.println(c);
        }

        /*From char array to String */
        char[] letters={'J','a','v','a'};
        String str10=new String(letters);
        System.out.println("The String is:"+ str10);

    }
}
