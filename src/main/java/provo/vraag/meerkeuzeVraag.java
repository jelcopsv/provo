package provo.vraag;

public class meerkeuzeVraag implements Vraag{
    private String vraag;
    private String[] antwoorden;
    private String correctAntwoord;

    public meerkeuzeVraag(String vraag, String[] antwoorden, String correctAntwoord) {
        this.vraag = vraag;
        this.antwoorden = antwoorden;
        this.correctAntwoord = correctAntwoord;
    }

    @Override
    public void getVraag() {
        System.out.println("Vraag: " + vraag);
        for (String antwoord: antwoorden){
            System.out.println(antwoord);
        }
    }
}
