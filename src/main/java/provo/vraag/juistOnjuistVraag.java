package provo.vraag;

import java.util.Objects;

public class juistOnjuistVraag implements Vraag {
    private String vraag;
    private boolean correctAntwoord;

    public juistOnjuistVraag(String vraag, boolean antwoord) {
        this.vraag = vraag;
        this.correctAntwoord = antwoord;
    }

    @Override
    public void getVraag() {
        System.out.println("Vraag: " + vraag);
    }

    @Override
    public boolean checkAntwoord(String antwoord) {
        return Objects.equals(antwoord, correctAntwoord);
    }
}
