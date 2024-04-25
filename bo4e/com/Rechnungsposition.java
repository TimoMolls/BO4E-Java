package bo4e.com;

import bo4e.enums.BDEWArtikelnummer;
import bo4e.enums.Mengeneinheit;
import java.time.OffsetDateTime;

/**
 * Über Rechnungspositionen werden Rechnungen strukturiert.
 * In einem Rechnungsteil wird jeweils eine in sich geschlossene Leistung abgerechnet.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Rechnungsposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Rechnungsposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.0.3/src/bo4e_schemas/com/Rechnungsposition.json>`_
 */
public class Rechnungsposition extends COM {
    private String artikelId;
    private BDEWArtikelnummer artikelnummer;
    private Preis einzelpreis;
    private OffsetDateTime lieferungBis;
    private OffsetDateTime lieferungVon;
    private String lokationsId;
    private Menge positionsMenge;
    private Long positionsnummer;
    private String positionstext;
    private Betrag teilrabattNetto;
    private Betrag teilsummeNetto;
    private Steuerbetrag teilsummeSteuer;
    private Menge zeitbezogeneMenge;
    private Mengeneinheit zeiteinheit;

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
     * Standardisierte vom BDEW herausgegebene Liste, welche im Strommarkt die
     * BDEW-Artikelnummer ablöst
     */
    public String getArtikelId() { return artikelId; }
    public void setArtikelId(String value) { this.artikelId = value; }

    /**
     * Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
     */
    public BDEWArtikelnummer getArtikelnummer() { return artikelnummer; }
    public void setArtikelnummer(BDEWArtikelnummer value) { this.artikelnummer = value; }

    /**
     * Der Preis für eine Einheit der energetischen Menge
     */
    public Preis getEinzelpreis() { return einzelpreis; }
    public void setEinzelpreis(Preis value) { this.einzelpreis = value; }

    /**
     * Start der Lieferung für die abgerechnete Leistung (inklusiv)
     */
    public OffsetDateTime getLieferungBis() { return lieferungBis; }
    public void setLieferungBis(OffsetDateTime value) { this.lieferungBis = value; }

    /**
     * Start der Lieferung für die abgerechnete Leistung (inklusiv)
     */
    public OffsetDateTime getLieferungVon() { return lieferungVon; }
    public void setLieferungVon(OffsetDateTime value) { this.lieferungVon = value; }

    /**
     * Marktlokation, die zu dieser Position gehört
     */
    public String getLokationsId() { return lokationsId; }
    public void setLokationsId(String value) { this.lokationsId = value; }

    /**
     * Die abgerechnete Menge mit Einheit
     */
    public Menge getPositionsMenge() { return positionsMenge; }
    public void setPositionsMenge(Menge value) { this.positionsMenge = value; }

    /**
     * Fortlaufende Nummer für die Rechnungsposition
     */
    public Long getPositionsnummer() { return positionsnummer; }
    public void setPositionsnummer(Long value) { this.positionsnummer = value; }

    /**
     * Bezeichung für die abgerechnete Position
     */
    public String getPositionstext() { return positionstext; }
    public void setPositionstext(String value) { this.positionstext = value; }

    /**
     * Nettobetrag für den Rabatt dieser Position
     */
    public Betrag getTeilrabattNetto() { return teilrabattNetto; }
    public void setTeilrabattNetto(Betrag value) { this.teilrabattNetto = value; }

    /**
     * # the cross check in general doesn't work because Betrag and Preis use different enums to
     * describe the currency
     * # see https://github.com/Hochfrequenz/BO4E-python/issues/126
     *
     * #: Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
     * teilsumme_steuer: Optional[Steuerbetrag] = None
     *
     * #: Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
     * zeiteinheit: Optional[Mengeneinheit] = None
     *
     * #: Kennzeichnung der Rechnungsposition mit der Standard-Artikelnummer des BDEW
     * artikelnummer: Optional[BDEWArtikelnummer] = None
     * #: Marktlokation, die zu dieser Position gehört
     * lokations_id: Optional[str] = None
     *
     * zeitbezogene_menge: Optional[Menge] = None
     */
    public Betrag getTeilsummeNetto() { return teilsummeNetto; }
    public void setTeilsummeNetto(Betrag value) { this.teilsummeNetto = value; }

    /**
     * Auf die Position entfallende Steuer, bestehend aus Steuersatz und Betrag
     */
    public Steuerbetrag getTeilsummeSteuer() { return teilsummeSteuer; }
    public void setTeilsummeSteuer(Steuerbetrag value) { this.teilsummeSteuer = value; }

    /**
     * Nettobetrag für den Rabatt dieser Position
     */
    public Menge getZeitbezogeneMenge() { return zeitbezogeneMenge; }
    public void setZeitbezogeneMenge(Menge value) { this.zeitbezogeneMenge = value; }

    /**
     * Falls sich der Preis auf eine Zeit bezieht, steht hier die Einheit
     */
    public Mengeneinheit getZeiteinheit() { return zeiteinheit; }
    public void setZeiteinheit(Mengeneinheit value) { this.zeiteinheit = value; }

}
