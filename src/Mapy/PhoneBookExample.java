package Mapy;

import java.util.HashMap;

public class PhoneBookExample {
    public static void main(String[] args){
        System.out.println("Map Array");

        HashMap<String,People> phoneBook = new HashMap<>();

        phoneBook.put("Novakova", new People("Alice",35,"1111"));
        phoneBook.put("Prochazka",new People("Bob",25,"2222"));

        System.out.println("Tel.seznam");

        for (String name : phoneBook.keySet()){
            System.out.println(name);
            People p = phoneBook.get(name);
            System.out.println(p);
        }
    }
}
