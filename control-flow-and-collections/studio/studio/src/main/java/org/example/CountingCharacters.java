package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a phrase: ");
        String phrase = input.nextLine();
        char[] charArray = phrase.toLowerCase().replaceAll(",.' ","").toCharArray();
        HashMap<Character,Integer> charsCount = new HashMap<>();
        for(char i : charArray){
            if(charsCount.containsKey(i)){
                charsCount.put(i,charsCount.get(i)+1);
            }else{
                charsCount.put(i,1);
            }
        }
        for(Map.Entry<Character,Integer> count : charsCount.entrySet()){
            System.out.println(count.getKey() +":"+ count.getValue());
        }

    }
}
