package bo4e.com;

import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.AufAbschlagsziel;
import bo4e.enums.Waehrungseinheit;

/**
 * Modell für die preiserhöhenden (Aufschlag) bzw. preisvermindernden (Abschlag)
 * Zusatzvereinbarungen,
 * die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen wurden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlag.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlag JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0/src/bo4e_schemas/com/AufAbschlag.json>`_
 */
public class AufAbschlag extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private AufAbschlagsziel aufAbschlagsziel;
    private String beschreibung;
    private String bezeichnung;
    private Waehrungseinheit einheit;
    private Zeitraum gueltigkeitszeitraum;
    private Preisstaffel[] staffeln;
    private String website;

    /**
     * zusatz_attribute: Optional[list[ZusatzAttribut]] = None
     *
     * # pylint: disable=duplicate-code
     * model_config = ConfigDict(
     * alias_generator=camelize,
     * populate_by_name=True,
     * extra="allow",
     * # json_encoders is deprecated, but there is no easy-to-use alternative. The best way
     * would be to create
     * # an annotated version of Decimal, but you would have to use it everywhere in the
     * pydantic models.
     * # See this issue for more info: https://github.com/pydantic/pydantic/issues/6375
     * json_encoders={Decimal: str},
     * )
     */
    /**
     * Version der BO-Struktur aka "fachliche Versionierung"
     */
    /**
     * Typ des Aufabschlages (z.B. absolut oder prozentual).
     */
    public AufAbschlagstyp getAufAbschlagstyp() { return aufAbschlagstyp; }
    public void setAufAbschlagstyp(AufAbschlagstyp value) { this.aufAbschlagstyp = value; }

    /**
     * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
     * Gesamtpreis etc..
     */
    public AufAbschlagsziel getAufAbschlagsziel() { return aufAbschlagsziel; }
    public void setAufAbschlagsziel(AufAbschlagsziel value) { this.aufAbschlagsziel = value; }

    /**
     * Beschreibung zum Auf-/Abschlag
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Bezeichnung des Auf-/Abschlags
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
     */
    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
     */
    public Zeitraum getGueltigkeitszeitraum() { return gueltigkeitszeitraum; }
    public void setGueltigkeitszeitraum(Zeitraum value) { this.gueltigkeitszeitraum = value; }

    /**
     * Werte für die gestaffelten Auf/Abschläge.
     */
    public Preisstaffel[] getStaffeln() { return staffeln; }
    public void setStaffeln(Preisstaffel[] value) { this.staffeln = value; }

    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind.
     */
    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

}
