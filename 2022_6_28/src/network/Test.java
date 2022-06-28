package network;

import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                str.append(ch);
            }else{
                if(str.length() != 0){
                    list.add(str.toString());
                    str.delete(0,str.length());
                    if(i+1 == s.length()){
                        flag = true;
                    }
                }
            }
        }
        if(flag == false){
            list.add(str.toString());
        }
        StringBuilder result = new StringBuilder();
        for (int i = list.size()-1 ; i >= 0; i--) {
            result.append(list.get(i));
            result.append(" ");
        }
        System.out.println(result.toString());
    }
}