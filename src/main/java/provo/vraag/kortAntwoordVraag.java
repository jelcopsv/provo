package provo.vraag;

public class kortAntwoordVraag implements Vraag{
    private String vraag;
    private String[] antwoorden;

    public kortAntwoordVraag(String vraag, String[] antwoorden) {
        this.vraag = vraag;
        this.antwoorden = antwoorden;
    }

    @Override
    public void getVraag() {
        System.out.println("Vraag: " + vraag);
    }
}
