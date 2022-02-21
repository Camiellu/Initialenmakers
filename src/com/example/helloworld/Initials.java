package com.example.helloworld;
import java.util.*;

public class Initials {
    public static void main(String[] args) {
        System.out.println("Welkom bij de Monogrammenfabriek!");
        System.out.print("Voer uw naam in: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        List <String> ignoreList = new ArrayList<>(Arrays.asList("van", "de", "der", "den"));
        List <String> nameList = new ArrayList<>(Arrays.asList(name.split(" ")));

        for (int i = 0; i<nameList.size();i++){
            for (int c = 0; c<ignoreList.size();c++ ){
                if (nameList.get(i).equals(ignoreList.get(c))) {
                    nameList.remove(i);
                    i = 0;
                }
            }
        }
        for (String s : nameList) {
            s=s.toUpperCase();
            System.out.print(s.charAt(0) + ".");
        }
    }

}
