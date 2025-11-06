package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayMain {

    public static void main(String[] args){
        System.out.println("Wellcome to ArrayMain");
        List<Gift> listOfGift = new ArrayList<>();

        Gift darekProMarka = new Gift(101.1,XL,"Tesla");

        //anonymni objekt - nikde se nevytvori, ale rovnou schova do Listu
        listOfGift.add(new Gift(5.0,L,"Pastelka"));

        System.out.println("Pocet darku v seznamu "+listOfGift.size());

        //pomoci cyklu foreach
        for (Gift oneGift : listOfGift){

        }

        //pomoci for cyklu
        for(int i=0;i<listOfGift.size();i++){
            Gift oneGift = listOfGift.get(i);
            System.out.println("Pocet darku v seznamu "+listOfGift.size());
        }

        //exttremne krartky zapis
        System.out.println("short");
        listOfGift.forEach(System.out::println);

        Collections.sort(listOfGift);
        System.out.println(listOfGift.toString());
    }
}
