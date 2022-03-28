package provo.vraag;

import java.util.Objects;

public class kortAntwoordVraag implements Vraag{
    private final String vraag;
    private final String[] antwoorden;

    public kortAntwoordVraag(String vraag, String[] antwoorden) {
        this.vraag = vraag;
        this.antwoorden = antwoorden;
    }

    @Override
    public void getVraag() {
        System.out.println("Vraag: " + vraag);
    }

    @Override
    public boolean checkAntwoord(String antwoord) {
        boolean antwoordKomtOvereen = false;
        for (String correctAntwoord : antwoorden) {
            if (Objects.equals(antwoord, correctAntwoord)) {
                antwoordKomtOvereen = true;
                break;
            }
        }
        return antwoordKomtOvereen;
    }
}
