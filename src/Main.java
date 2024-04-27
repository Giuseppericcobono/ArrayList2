//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> gruppoS = new ArrayList<>();

        gruppoS.add(new Student("Paolo", 18));
        gruppoS.add(new Student("Katia", 22));
        gruppoS.add(new Student("Piero", 19));
        gruppoS.add(new Student("Naomi", 23));
        gruppoS.add(new Student("Giuseppe", 19));
        gruppoS.add(new Student("Marco", 17));
        gruppoS.add(new Student("Elisa", 18));
        gruppoS.add(new Student("Marika", 20));
        gruppoS.add(new Student("Josh", 21));
        gruppoS.add(new Student("Daniel", 26));
        gruppoS.add(new Student("Vincenzo", 22));
        gruppoS.add(new Student("Simona", 21));

        System.out.println(gruppoS);

        gruppoS.sort(Comparator.comparing(Student::getName));

        System.out.println(gruppoS);
    }
}
