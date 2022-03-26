package provo.vraag;

import provo.vraag.Vraag;

public class juistOnjuistVraag implements Vraag {
    private String vraag;
    private boolean antwoord;

    @Override
    public void getVraag() {
        System.out.println("Vraag: " + vraag);
    }
}
