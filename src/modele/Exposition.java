package modele;

import java.time.LocalDate;
import java.util.Scanner;

public class Exposition extends Activite {
    private String theme, description;

    public Exposition(String nom, String lieu, String publique,
                      LocalDate date, String theme, String description) {
        super(nom, lieu, publique, date);
        this.theme = theme;
        this.description = description;
    }

    public Exposition() {
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Exposition ["+super.toString()+", "+theme+", "+description+"]";
    }

    public void saisie(){
        Scanner sc = new Scanner(System.in);
        super.saisie();
        System.out.println("Saisir le theme");
        theme = sc.nextLine();
        System.out.println("Saisir la description");
        description = sc.nextLine();
    }

}
