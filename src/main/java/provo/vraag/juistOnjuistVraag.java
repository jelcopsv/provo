package provo.vraag;

import java.util.Objects;

public class juistOnjuistVraag implements Vraag {
    private final String vraag;
    private final String correctAntwoord;

    public juistOnjuistVraag(String vraag, String antwoord) {
        this.vraag = vraag;
        this.correctAntwoord = antwoord;
    }

    @Override
    public void getVraag() {
        System.out.println("Vraag: " + vraag);
    }

    @Override
    public boolean checkAntwoord(String antwoord) {
        return (Objects.equals(antwoord, correctAntwoord));
    }
}
