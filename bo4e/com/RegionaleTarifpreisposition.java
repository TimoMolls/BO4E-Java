package bo4e.com;

import bo4e.enums.Mengeneinheit;
import bo4e.enums.Waehrungseinheit;
import bo4e.enums.Preistyp;

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen im Zusammenhang mit
 * regionalen Gültigkeiten abgebildet
 * werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/RegionaleTarifpreisposition.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `RegionaleTarifpreisposition JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1.1/src/bo4e_schemas/com/RegionaleTarifpreisposition.json>`_
 */
public class RegionaleTarifpreisposition extends COM {
    private Mengeneinheit bezugseinheit;
    private Waehrungseinheit einheit;
    private Mengeneinheit mengeneinheitstaffel;
    private RegionalePreisstaffel[] preisstaffeln;
    private Preistyp preistyp;

    public Mengeneinheit getBezugseinheit() { return bezugseinheit; }
    public void setBezugseinheit(Mengeneinheit value) { this.bezugseinheit = value; }

    public Waehrungseinheit getEinheit() { return einheit; }
    public void setEinheit(Waehrungseinheit value) { this.einheit = value; }

    public Mengeneinheit getMengeneinheitstaffel() { return mengeneinheitstaffel; }
    public void setMengeneinheitstaffel(Mengeneinheit value) { this.mengeneinheitstaffel = value; }

    public RegionalePreisstaffel[] getPreisstaffeln() { return preisstaffeln; }
    public void setPreisstaffeln(RegionalePreisstaffel[] value) { this.preisstaffeln = value; }

    public Preistyp getPreistyp() { return preistyp; }
    public void setPreistyp(Preistyp value) { this.preistyp = value; }

}
