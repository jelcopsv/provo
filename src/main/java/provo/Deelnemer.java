package provo;

import provo.vraag.Vraag;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Boolean.TRUE;

public class Deelnemer {
    String naam;
    Scanner antwoord = new Scanner(System.in);
    private int score;
    private ArrayList<Antwoord> antwoorden = new ArrayList<Antwoord>();

    public Deelnemer(String naam) {
        this.naam = naam;
    }

    public void beantwoordVraag(Vraag vraag){
        String gegevenAntwoord = antwoord.nextLine();
        if(vraag.checkAntwoord(gegevenAntwoord)==TRUE){
            score++;
        }
        antwoorden.add(new Antwoord(gegevenAntwoord, vraag));
    }

    public int getScore(){
        return score;
    }
}
