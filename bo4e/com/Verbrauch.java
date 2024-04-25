package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Messwertstatus;
import bo4e.enums.Wertermittlungsverfahren;
import java.time.OffsetDateTime;

/**
 * Abbildung eines zeitlich abgegrenzten Verbrauchs
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Verbrauch.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Verbrauch JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc3/src/bo4e_schemas/com/Verbrauch.json>`_
 */
public class Verbrauch extends COM {
    private Mengeneinheit einheit;
    private OffsetDateTime enddatum;
    private Messwertstatus messwertstatus;
    private String obisKennzahl;
    private OffsetDateTime startdatum;
    private Double wert;
    private Wertermittlungsverfahren wertermittlungsverfahren;

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
     * Gibt die Einheit zum jeweiligen Wert an
     */
    public Mengeneinheit getEinheit() { return einheit; }
    public void setEinheit(Mengeneinheit value) { this.einheit = value; }

    /**
     * Exklusives Ende des Zeitraumes, für den der Verbrauch angegeben wird
     */
    public OffsetDateTime getEnddatum() { return enddatum; }
    public void setEnddatum(OffsetDateTime value) { this.enddatum = value; }

    /**
     * Messwertstatus includes the plausibility of the value
     */
    public Messwertstatus getMesswertstatus() { return messwertstatus; }
    public void setMesswertstatus(Messwertstatus value) { this.messwertstatus = value; }

    /**
     * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
     * z.B. '1-0:
     */
    public String getObisKennzahl() { return obisKennzahl; }
    public void setObisKennzahl(String value) { this.obisKennzahl = value; }

    /**
     * Inklusiver Beginn des Zeitraumes, für den der Verbrauch angegeben wird
     */
    public OffsetDateTime getStartdatum() { return startdatum; }
    public void setStartdatum(OffsetDateTime value) { this.startdatum = value; }

    /**
     * Gibt den absoluten Wert der Menge an
     */
    public Double getWert() { return wert; }
    public void setWert(Double value) { this.wert = value; }

    /**
     * Gibt an, ob es sich um eine PROGNOSE oder eine MESSUNG handelt
     */
    public Wertermittlungsverfahren getWertermittlungsverfahren() { return wertermittlungsverfahren; }
    public void setWertermittlungsverfahren(Wertermittlungsverfahren value) { this.wertermittlungsverfahren = value; }

}
