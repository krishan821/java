package javacrux;
import java.util.*;
public class Smart_Keypad_I {

	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String ques=sc.next();
        key(ques,"");

    }
    public static void key(String ques,String ans )
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);//1
        String get_string=table[ch-'0'];
        for(int i=0;i<get_string.length();i++)
        {
            key(ques.substring(1),ans+get_string.charAt(i));
        }
    }
}

