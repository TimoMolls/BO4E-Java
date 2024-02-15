package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Anrede;
import bo4e.enums.Geschaeftspartnerrolle;
import bo4e.enums.Kontaktart;
import bo4e.enums.Marktrolle;
import bo4e.com.Adresse;
import bo4e.enums.Rollencodetyp;
import bo4e.enums.Sparte;

/**
 * Objekt zur Aufnahme der Information zu einem Marktteilnehmer
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Marktteilnehmer.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Marktteilnehmer JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1-/src/bo4e_schemas/bo/Marktteilnehmer.json>`_
 */
public class Marktteilnehmer extends Geschaeftsobjekt {
    private final Typ typ = Typ.MARKTTEILNEHMER;
    private String amtsgericht;
    private Anrede anrede;
    private String eMailAdresse;
    private Geschaeftspartnerrolle[] geschaeftspartnerrolle;
    private String glaeubigerId;
    private String hrnummer;
    private Boolean istGewerbe;
    private Kontaktart[] kontaktweg;
    private String makoadresse;
    private Marktrolle marktrolle;
    private String name1;
    private String name2;
    private String name3;
    private Adresse partneradresse;
    private String rollencodenummer;
    private Rollencodetyp rollencodetyp;
    private Sparte sparte;
    private String umsatzsteuerId;
    private String website;

    public Typ getTyp() { return typ; }

    public String getAmtsgericht() { return amtsgericht; }
    public void setAmtsgericht(String value) { this.amtsgericht = value; }

    public Anrede getAnrede() { return anrede; }
    public void setAnrede(Anrede value) { this.anrede = value; }

    public String getEMailAdresse() { return eMailAdresse; }
    public void setEMailAdresse(String value) { this.eMailAdresse = value; }

    public Geschaeftspartnerrolle[] getGeschaeftspartnerrolle() { return geschaeftspartnerrolle; }
    public void setGeschaeftspartnerrolle(Geschaeftspartnerrolle[] value) { this.geschaeftspartnerrolle = value; }

    public String getGlaeubigerId() { return glaeubigerId; }
    public void setGlaeubigerId(String value) { this.glaeubigerId = value; }

    public String getHrnummer() { return hrnummer; }
    public void setHrnummer(String value) { this.hrnummer = value; }

    public Boolean getIstGewerbe() { return istGewerbe; }
    public void setIstGewerbe(Boolean value) { this.istGewerbe = value; }

    public Kontaktart[] getKontaktweg() { return kontaktweg; }
    public void setKontaktweg(Kontaktart[] value) { this.kontaktweg = value; }

    public String getMakoadresse() { return makoadresse; }
    public void setMakoadresse(String value) { this.makoadresse = value; }

    public Marktrolle getMarktrolle() { return marktrolle; }
    public void setMarktrolle(Marktrolle value) { this.marktrolle = value; }

    public String getName1() { return name1; }
    public void setName1(String value) { this.name1 = value; }

    public String getName2() { return name2; }
    public void setName2(String value) { this.name2 = value; }

    public String getName3() { return name3; }
    public void setName3(String value) { this.name3 = value; }

    public Adresse getPartneradresse() { return partneradresse; }
    public void setPartneradresse(Adresse value) { this.partneradresse = value; }

    public String getRollencodenummer() { return rollencodenummer; }
    public void setRollencodenummer(String value) { this.rollencodenummer = value; }

    public Rollencodetyp getRollencodetyp() { return rollencodetyp; }
    public void setRollencodetyp(Rollencodetyp value) { this.rollencodetyp = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

    public String getUmsatzsteuerId() { return umsatzsteuerId; }
    public void setUmsatzsteuerId(String value) { this.umsatzsteuerId = value; }

    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

}
