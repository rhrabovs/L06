import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Cviceni L06 - pole");
        int POZICE_RODIC_DITE = 2;

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

        //String[] simpsons = new String[5];
        String[] simpsons = {"Homer","Marge","Bart","Lisa","Maggie"}; //mozna definice pole
        System.out.println("POCET SIMPSONU JE "+simpsons.length);

        String[] rodice = Arrays.copyOfRange(simpsons,0,POZICE_RODIC_DITE);
        System.out.println("rodice jsou "+Arrays.toString(rodice));

        String[] deti = Arrays.copyOfRange(simpsons,POZICE_RODIC_DITE,simpsons.length);
        System.out.println("deti jsou "+Arrays.toString(deti));
    }
}