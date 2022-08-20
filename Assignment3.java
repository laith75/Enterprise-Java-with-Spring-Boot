import java.util.Arrays;
import java.util.Locale;

public class Assignment3 {
    public static void main(String[] args)
    {
        // WAP to reverse a string
        System.out.println("Problem 1 ");

        String s1 = "iNeuron";
        String s2 = "";
        for(int i = 0 ; i < s1.length() ; i++)
        {
           s2 =  s2 + s1.charAt((s1.length()-1) - i) ;
        }
        System.out.println(s2);
        //-----------------------------------------------------
        // WAP to reverse a sentence while preserving the position
        System.out.println("Problem 2 ");

        String s3 = "Think Twice";
        String s4 = "";
        String [] a = s3.split(" ");
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = 0 ; j < a[i].length() ; j++)
            {
                s4 = s4 + a[i].charAt((a[i].length() - 1) - j) ;
            }
            s4 = s4 + " ";
            s4 = s4.toLowerCase(Locale.ROOT);

        }
        System.out.println(s4);
        //-------------------------------------------------
        // WAP to check if the string is Anagram or not
        System.out.println("Problem 3");

        String s5 = "iNeuron";
        String s6 = "norueNi";
        if(areAnagram(s5,s6))
        {
            System.out.println("The two strings are anagram of each other");
        }
        else
        {
            System.out.println("The two Strings are not anagram of each other");
        }
        //---------------------------------------------------------------------
        // WAP to check if the string is a pangram or not
        System.out.println("Problem 4 ");
        String s7 = "abcdefghijklmnopqrstuvwxyzoohuhvgcccf";
        boolean[] check = new boolean[26];
        int index = 0 ;
        int flag = 1;
        for(int i = 0 ; i < s7.length() ; i++)
        {
            if(s7.charAt(i) >= 'A' && s7.charAt(i) <= 'Z') {
                index = s7.charAt(i) - 'A';
            }
            else if (s7.charAt(i) >= 'a' && s7.charAt(i) <= 'z')
            {
                index = s7.charAt(i) - 'a';
            }
            check[index] = true;
        }
        for(int i = 0 ; i < 26 ; i++)
        {
            if(check[i] == false)
                flag = 0;
        }

        if(flag == 1)
            System.out.println("The String is a pangram");
        else
            System.out.println("The string is not a pangram");
        //-------------------------------------------------------------
        // WAP to print repeatedly occurring characters in a given String
        System.out.println("Problem 5 ");

        String s8 = "ineuron";
        char[] s8Array = s8.toCharArray();
        for (int i = 0 ; i < s8.length() ; i++)
        {
            int counter =0;
            for(int j = i + 1 ; j < s8.length() ; j++)
            {
                if (s8Array[i] == s8Array[j])
                {
                    counter ++;

                    s8Array[j] = 0;
                }
            }

            if(counter > 0 && s8Array[i] != 0)
                System.out.println(s8Array[i]);

        }
        //---------------------------------------------------------------------
        // WAP to sort a String Alphabetically
        System.out.println("Problem 6");

        String s9 = "geeksforgeeksa";
        char arr[] = s9.toCharArray();
        char temp;
        int i = 0;
        while (i < arr.length)
        {
            int j = i + 1;
            while (j < arr.length)
            {
                if (arr[j] < arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i ++;
        }
        System.out.println(arr);
        //---------------------------------------------------
        // WAP to count the number of Vowels and Consonants of a String value
        System.out.println("Problem 7 ");

        String s10 = "This website is aw3som3.";
        int vowels = 0 ;
        int consonants = 0;

        s10 = s10.toLowerCase();
        for (int x = 0; x < s10.length(); x++)
        {
            char ch = s10.charAt(x);

            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels ++;
            }

            // check if character is in between a to z
            else if ((ch >= 'a' && ch <= 'z'))
            {
                consonants ++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        //-------------------------------------------------------
        // WAP to count the number of special letters in a string
        System.out.println("Problem 8 ");

        String str = "#GeeKs01fOr@gEEks07";
        int upper = 0, lower = 0, number = 0, special = 0;

        for(int x = 0; x < str.length(); x++)
        {
            char ch = str.charAt(x);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
        System.out.println("Special characters : " + special);











































    }
     static boolean areAnagram(String str1 , String str2 )
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        for(int i = 0 ; i < strArray1.length ; i++)
        {
            if(strArray1[i] != strArray2[i])
            {
                return false;
            }
        }

        return true;
    }

}


