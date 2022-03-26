package provo;

import provo.vraag.Vraag;

import java.util.Scanner;

public class Kennistoets {
    private int gebruikteTijd;
    private int maxTijd;
    private Vraag[] vragen;
    Scanner antwoord = new Scanner(System.in);

    public Kennistoets(int maxTijd, Vraag[] vragen) {
        this.maxTijd = maxTijd;
        this.vragen = vragen;
    }

    public void startToets(){
        for(Vraag vraag:vragen){
            vraag.getVraag();
            beantwoordVraag();
        }
    }
    public void betreedLokaal(){

    }
    public void enterStudentNaam(){

    }
    public void beantwoordVraag(){
        String gegevenAntwoord = antwoord.nextLine();
    }
}
