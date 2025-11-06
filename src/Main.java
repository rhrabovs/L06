import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Cviceni L06 - pole");

        int[] treeHights;  //zalozeni pole []
        treeHights = new int[10]; // java nezna dynamicke pole, vzdy musim udat rozmer

        System.out.println("Velikost stromu na prvni pozici je "+treeHights[0]);
        treeHights[0]=35;
        treeHights[9]=42;

        int lengthOfArrayOfTree = treeHights.length;
        System.out.println("Velikost pole je "+lengthOfArrayOfTree);
        System.out.println("Velikost stromu na poslednim miste je "+treeHights[lengthOfArrayOfTree-1]);

        //vypis pomoci foreach
        for (int i=0;i<lengthOfArrayOfTree;i++){
            Random randomNumber = new Random();
            treeHights[i] = randomNumber.nextInt(100); //pridam nahodne cislo do hodnoty 99
        }


        for (int oneElements : treeHights){
            System.out.println(oneElements);
        }
    }
}