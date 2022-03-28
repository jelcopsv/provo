package provo;

import provo.vraag.Vraag;
import provo.vraag.juistOnjuistVraag;
import provo.vraag.meerkeuzeVraag;

import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Kennistoets {
    private int gebruikteTijd;
    private final int maxTijd;
    private final Vraag[] vragen;
    private int aantalCorrect = 0;
    Scanner antwoord = new Scanner(System.in);

    public Kennistoets(int maxTijd, Vraag[] vragen) {
        this.maxTijd = maxTijd;
        this.vragen = vragen;
    }

    public void startToets(){
        for(Vraag vraag:vragen){
            vraag.getVraag();
            beantwoordVraag(vraag);
        }
        getResultaat();
    }
    public void betreedLokaal(){

    }
    public void enterStudentNaam(){

    }
    public void getResultaat(){
        System.out.println("Je hebt " + aantalCorrect + " van de " + vragen.length + " vragen goed beantwoord!");
    }
    public void beantwoordVraag(Vraag vraag){
        String gegevenAntwoord = antwoord.nextLine();
        if(vraag.checkAntwoord(gegevenAntwoord)==TRUE){
            aantalCorrect++;
        }
    }
}
