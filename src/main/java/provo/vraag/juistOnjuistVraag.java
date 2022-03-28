package provo.vraag;

import provo.vraag.Vraag;

public class juistOnjuistVraag implements Vraag {
    private String vraag;
    private boolean antwoord;

    public juistOnjuistVraag(String vraag, boolean antwoord) {
        this.vraag = vraag;
        this.antwoord = antwoord;
    }

    @Override
    public void getVraag() {
        System.out.println("Vraag: " + vraag);
    }
}
