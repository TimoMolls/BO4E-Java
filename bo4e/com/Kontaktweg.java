package bo4e.com;

import bo4e.enums.Kontaktart;

/**
 * Die Komponente wird dazu verwendet, die Kontaktwege innerhalb des BOs Person
 * darzustellen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kontakt.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kontakt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.1-rc6/src/bo4e_schemas/com/Kontakt.json>`_
 */
public class Kontaktweg extends COM {
    private String beschreibung;
    private Boolean istBevorzugterKontaktweg;
    private Kontaktart kontaktart;
    private String kontaktwert;

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
     * Spezifikation, beispielsweise "Durchwahl", "Sammelnummer" etc.
     */
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    /**
     * Gibt an, ob es sich um den bevorzugten Kontaktweg handelt.
     */
    public Boolean getIstBevorzugterKontaktweg() { return istBevorzugterKontaktweg; }
    public void setIstBevorzugterKontaktweg(Boolean value) { this.istBevorzugterKontaktweg = value; }

    /**
     * Gibt die Kontaktart des Kontaktes an.
     */
    public Kontaktart getKontaktart() { return kontaktart; }
    public void setKontaktart(Kontaktart value) { this.kontaktart = value; }

    /**
     * Die Nummer oder E-Mail-Adresse.
     */
    public String getKontaktwert() { return kontaktwert; }
    public void setKontaktwert(String value) { this.kontaktwert = value; }

}
