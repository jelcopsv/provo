package provo;

import provo.vraag.Vraag;
import provo.vraag.juistOnjuistVraag;
import provo.vraag.kortAntwoordVraag;
import provo.vraag.meerkeuzeVraag;

import static java.lang.Boolean.FALSE;

public class Provo
{
        public static void main( String[] args )
    {
        Vraag[] vragen = new Vraag[3];
        vragen[0] = new juistOnjuistVraag("Vraag 1: Juist/onjuist: De volgende eis R1 valt in de categortie Usability." +
                "R1: Het systeem moet 75% van de webpaginas binnen 2 seconden tonen.", "FALSE");
        vragen[1] = new meerkeuzeVraag("Vraag 2: Wat leg je vast m.b.v. use cases", new String[]{"needs", "features", "functional requirements", "non-functional requirements"}, "functional requirements");
        vragen[2] = new kortAntwoordVraag("Vraag 3: Bij welk team rijdt max verstappen ", new String[]{"Red bull racing","Red bull"} );
        Kennistoets kennistoets = new Kennistoets(1000,vragen);
        kennistoets.startToets(new Deelnemer("Jelco"));
    }
}
