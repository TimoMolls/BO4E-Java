package bo4e.com;

import bo4e.enums.AufAbschlagstyp;
import bo4e.enums.AufAbschlagsziel;
import bo4e.enums.Waehrungseinheit;

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen
 * im Zusammenhang mit regionalen Gültigkeiten abgebildet werden.
 * Hier sind auch die Auswirkungen auf verschiedene Tarifparameter modelliert,
 * die sich durch die Auswahl eines Auf- oder Abschlags ergeben.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/AufAbschlagRegional.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `AufAbschlagRegional JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.1-rc6/src/bo4e_schemas/com/AufAbschlagRegional.json>`_
 */
public class AufAbschlagRegional extends COM {
    private AufAbschlagstyp aufAbschlagstyp;
    private AufAbschlagsziel aufAbschlagsziel;
    private String beschreibung;
    private AufAbschlagProOrt[] betraege;
    private String bezeichnung;
    private Waehrungseinheit einheit;
    private Tarifeinschraenkung einschraenkungsaenderung;
    private Energiemix energiemixaenderung;
    private Preisgarantie garantieaenderung;
    private Zeitraum gueltigkeitszeitraum;
    private String tarifnamensaenderungen;
    private Vertragskonditionen vertagskonditionsaenderung;
    private String[] voraussetzungen;
    private String website;
    private String[] zusatzprodukte;

    /**
     * zusatz_attribute: Optional[list["ZusatzAttribut"]] = None
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
     * Typ des Aufabschlages (z.B. absolut oder prozentual)
     */
    public AufAbschlagstyp getAufAbschlagstyp() { return aufAbschlagstyp; }
    public void setAufAbschlagstyp(AufAbschlagstyp value) { this.aufAbschlagstyp = value; }

    /**
     * Diesem Preis oder den Kosten ist der Auf/Abschlag zugeordnet. Z.B. Arbeitspreis,
     * Gesamtpreis etc.
     */
    public AufAbschlagsziel getAufAbschlagsziel() { return aufAbschlagsziel; }
    public void setAufAbschlagsziel(AufAbschlagsziel value) { this.aufAbschlagsziel = value; }

    /**
     * Beschreibung zum Auf-/Abschlag
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung
     */
    public AufAbschlagProOrt[] getBetraege() { return betraege; }
    public void setBetraege(AufAbschlagProOrt[] value) { this.betraege = value; }

    /**
     * Bezeichnung des Auf-/Abschlags
     */
    public String getBezeichnung() { return bezeichnung; }
    public void setBezeichnung(String value) { this.bezeichnung = value; }

    /**
     * Gibt an in welcher Währungseinheit der Auf/Abschlag berechnet wird. Euro oder Ct.
     */
    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    /**
     * Änderungen in den Einschränkungen zum Tarif. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    public Tarifeinschraenkung getEinschraenkungsaenderung() { return einschraenkungsaenderung; }
    public void setEinschraenkungsaenderung(Tarifeinschraenkung value) { this.einschraenkungsaenderung = value; }

    /**
     * Der Energiemix kann sich durch einen AufAbschlag ändern (z.B. zwei Cent Aufschlag für
     * Ökostrom:
     * Sollte dies der Fall sein, wird hier die neue Zusammensetzung des Energiemix angegeben.
     */
    public Energiemix getEnergiemixaenderung() { return energiemixaenderung; }
    public void setEnergiemixaenderung(Energiemix value) { this.energiemixaenderung = value; }

    /**
     * Änderungen in den Garantievereinbarungen. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    public Preisgarantie getGarantieaenderung() { return garantieaenderung; }
    public void setGarantieaenderung(Preisgarantie value) { this.garantieaenderung = value; }

    /**
     * Zeitraum, in dem der Abschlag zur Anwendung kommen kann
     */
    public Zeitraum getGueltigkeitszeitraum() { return gueltigkeitszeitraum; }
    public void setGueltigkeitszeitraum(Zeitraum value) { this.gueltigkeitszeitraum = value; }

    /**
     * Durch die Anwendung des Auf/Abschlags kann eine Änderung des Tarifnamens auftreten.
     */
    public String getTarifnamensaenderungen() { return tarifnamensaenderungen; }
    public void setTarifnamensaenderungen(String value) { this.tarifnamensaenderungen = value; }

    /**
     * Änderungen in den Vertragskonditionen. Falls in dieser Komponenten angegeben,
     * werden die Tarifparameter hiermit überschrieben.
     */
    public Vertragskonditionen getVertagskonditionsaenderung() { return vertagskonditionsaenderung; }
    public void setVertagskonditionsaenderung(Vertragskonditionen value) { this.vertagskonditionsaenderung = value; }

    /**
     * Voraussetzungen, die erfüllt sein müssen, damit dieser AufAbschlag zur Anwendung kommen
     * kann
     */
    public String[] getVoraussetzungen() { return voraussetzungen; }
    public void setVoraussetzungen(String[] value) { this.voraussetzungen = value; }

    /**
     * Internetseite, auf der die Informationen zum Auf-/Abschlag veröffentlicht sind
     */
    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

    /**
     * Zusatzprodukte, die nur in Kombination mit diesem AufAbschlag erhältlich sind
     */
    public String[] getZusatzprodukte() { return zusatzprodukte; }
    public void setZusatzprodukte(String[] value) { this.zusatzprodukte = value; }
}
