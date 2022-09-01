import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int loserIndex;
        String loser;
        ArrayList<String> tribu = new ArrayList<String>();
        tribu.add("Richard");
        tribu.add("Jerri");
        tribu.add("Colby");
        tribu.add("Amber");
        tribu.add("Rupert");
        loserIndex = (int) (Math.random() * 5);
        loser = tribu.remove(loserIndex);
        System.out.println("soryry " + loser + ". La tribu ha hablado, quedas eliminado.");
        System.out.println("Aun quedan: " + tribu);
    }
}
