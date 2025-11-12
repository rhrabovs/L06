package Set;
import java.util.HashSet;

public class SetMain {
    public static void main (String[] args){
        HashSet<String> programingLanguage = new HashSet();

        //pridani prvku
        programingLanguage.add("C#");
        programingLanguage.add("Cobol");
        programingLanguage.add("4GL");
        programingLanguage.add("RPG");

        System.out.println("Pocet jazyku co umim "+programingLanguage.size());

        //kontrolovat zda je v Hashsetu
        if (programingLanguage.contains("Python")){
            System.out.println("umi Python");
        } else {
            System.out.println("neumi");
        }

        programingLanguage.add("Cobol"); //nevlozi nic, ale pokracuje dal, nevyhodi chybu

    }
}
