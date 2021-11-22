package Demo1;

public class Test1 {
    public static void main(String[] args) {
        char[] str = {'a','C','d','E','S',' ','1','\n',' ','8','\n'};
        int letter  = 0;
        int digit = 0;
        int upper = 0;
        int lower = 0;
        int space = 0;
        for (int i = 0; i < str.length; i++) {
            if(Character.isLetter(str[i]))      letter++;
            if(Character.isUpperCase(str[i]))   upper++;
            if(Character.isLowerCase(str[i]))   lower++;
            if(Character.isDigit(str[i]))       digit++;
            if(Character.isWhitespace(str[i]))  space++;
        }
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(space);
    }
}
