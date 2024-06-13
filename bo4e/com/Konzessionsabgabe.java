package bo4e.com;

import bo4e.enums.AbgabeArt;

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Konzessionsabgabe verwendet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Konzessionsabgabe.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Konzessionsabgabe JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1.1/src/bo4e_schemas/com/Konzessionsabgabe.json>`_
 */
public class Konzessionsabgabe extends COM {
    private String kategorie;
    private String kosten;
    private AbgabeArt satz;

    public String getKategorie() { return kategorie; }
    public void setKategorie(String value) { this.kategorie = value; }

    public String getKosten() { return kosten; }
    public void setKosten(String value) { this.kosten = value; }

    public AbgabeArt getSatz() { return satz; }
    public void setSatz(AbgabeArt value) { this.satz = value; }

}
