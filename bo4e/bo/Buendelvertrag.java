package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Sparte;
import bo4e.com.Unterschrift;
import bo4e.enums.Vertragsart;
import bo4e.com.Vertragskonditionen;
import bo4e.enums.Vertragsstatus;
import java.time.OffsetDateTime;

/**
 * Abbildung eines Bündelvertrags.
 * Es handelt sich hierbei um eine Liste von Einzelverträgen, die in einem Vertragsobjekt
 * gebündelt sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Buendelvertrag.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Buendelvertrag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.0-/src/bo4e_schemas/bo/Buendelvertrag.json>`_
 */
public class Buendelvertrag extends Geschaeftsobjekt {
    private final Typ _typ = Typ.BUENDELVERTRAG;
    private String beschreibung;
    private Vertrag[] einzelvertraege;
    private Sparte sparte;
    private Unterschrift[] unterzeichnervp1;
    private Unterschrift[] unterzeichnervp2;
    private Vertragsart vertragsart;
    private OffsetDateTime vertragsbeginn;
    private OffsetDateTime vertragsende;
    private Vertragskonditionen[] vertragskonditionen;
    private String vertragsnummer;
    private Geschaeftspartner vertragspartner1;
    private Geschaeftspartner vertragspartner2;
    private Vertragsstatus vertragsstatus;

    public Typ getTyp() { return _typ; }

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public Vertrag[] getEinzelvertraege() { return einzelvertraege; }
    public void setEinzelvertraege(Vertrag[] value) { this.einzelvertraege = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public Unterschrift[] getUnterzeichnervp1() { return unterzeichnervp1; }
    public void setUnterzeichnervp1(Unterschrift[] value) { this.unterzeichnervp1 = value; }

    public Unterschrift[] getUnterzeichnervp2() { return unterzeichnervp2; }
    public void setUnterzeichnervp2(Unterschrift[] value) { this.unterzeichnervp2 = value; }

    public Vertragsart getVertragsart() { return vertragsart; }
    public void setVertragsart(Vertragsart value) { this.vertragsart = value; }

    public OffsetDateTime getVertragsbeginn() { return vertragsbeginn; }
    public void setVertragsbeginn(OffsetDateTime value) { this.vertragsbeginn = value; }

    public OffsetDateTime getVertragsende() { return vertragsende; }
    public void setVertragsende(OffsetDateTime value) { this.vertragsende = value; }

    public Vertragskonditionen[] getVertragskonditionen() { return vertragskonditionen; }
    public void setVertragskonditionen(Vertragskonditionen[] value) { this.vertragskonditionen = value; }

    public String getVertragsnummer() { return vertragsnummer; }
    public void setVertragsnummer(String value) { this.vertragsnummer = value; }

    public Geschaeftspartner getVertragspartner1() { return vertragspartner1; }
    public void setVertragspartner1(Geschaeftspartner value) { this.vertragspartner1 = value; }

    public Geschaeftspartner getVertragspartner2() { return vertragspartner2; }
    public void setVertragspartner2(Geschaeftspartner value) { this.vertragspartner2 = value; }

    public Vertragsstatus getVertragsstatus() { return vertragsstatus; }
    public void setVertragsstatus(Vertragsstatus value) { this.vertragsstatus = value; }

}
