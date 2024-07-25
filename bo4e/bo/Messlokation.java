package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Adresse;
import bo4e.com.Dienstleistung;
import bo4e.com.Geokoordinaten;
import bo4e.com.Katasteradresse;
import bo4e.enums.Netzebene;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;

import java.util.List;

/**
 * Object containing information about a Messlokation
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Messlokation.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Messlokation JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.1/src/bo4e_schemas/bo/Messlokation.json>`_
 */
public class Messlokation extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.MESSLOKATION;
    private Geokoordinaten geoadresse;
    /**
     * Liste der Geräte, die zu dieser Messstelle gehört
     */
    private List<Geraet> geraete;
    private String grundzustaendigerMsbCodenr;
    private String grundzustaendigerMsbimCodenr;
    /**
     * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
     */
    private Katasteradresse katasterinformation;
    /**
     * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
     * beschreibt.
     */
    private String lokationsbuendelObjektcode;
    /**
     * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
     */
    private List<Lokationszuordnung> lokationszuordnungen;
    private Adresse messadresse;
    /**
     * Liste der Messdienstleistungen, die zu dieser Messstelle gehört
     */
    private List<Dienstleistung> messdienstleistung;
    /**
     * Die Nummer des Messgebietes in der ene't-Datenbank
     */
    private String messgebietnr;
    /**
     * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
     */
    private String messlokationsId;
    /**
     * Zähler, die zu dieser Messlokation gehören
     */
    private List<Zaehler> messlokationszaehler;
    /**
     * Spannungsebene der Messung
     */
    private Netzebene netzebeneMessung;
    /**
     * Sparte der Messlokation, z.B. Gas oder Strom
     */
    private Sparte sparte;

    public Messlokation() {
    }

    private Messlokation(MesslokationBuilder builder) {
        super(builder);
        this.geoadresse = builder.geoadresse;
        this.geraete = builder.geraete;
        this.grundzustaendigerMsbCodenr = builder.grundzustaendigerMsbCodenr;
        this.grundzustaendigerMsbimCodenr = builder.grundzustaendigerMsbimCodenr;
        this.katasterinformation = builder.katasterinformation;
        this.lokationsbuendelObjektcode = builder.lokationsbuendelObjektcode;
        this.lokationszuordnungen = builder.lokationszuordnungen;
        this.messadresse = builder.messadresse;
        this.messdienstleistung = builder.messdienstleistung;
        this.messgebietnr = builder.messgebietnr;
        this.messlokationsId = builder.messlokationsId;
        this.messlokationszaehler = builder.messlokationszaehler;
        this.netzebeneMessung = builder.netzebeneMessung;
        this.sparte = builder.sparte;
    }

    public Typ getTyp() {
        return typ;
    }

    public Geokoordinaten getGeoadresse() {
        return geoadresse;
    }

    public void setGeoadresse(Geokoordinaten geoadresse) {
        this.geoadresse = geoadresse;
    }

    public List<Geraet> getGeraete() {
        return geraete;
    }

    public void setGeraete(List<Geraet> geraete) {
        this.geraete = geraete;
    }

    public String getGrundzustaendigerMsbCodenr() {
        return grundzustaendigerMsbCodenr;
    }

    public void setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
        this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
    }

    public String getGrundzustaendigerMsbimCodenr() {
        return grundzustaendigerMsbimCodenr;
    }

    public void setGrundzustaendigerMsbimCodenr(String grundzustaendigerMsbimCodenr) {
        this.grundzustaendigerMsbimCodenr = grundzustaendigerMsbimCodenr;
    }

    public Katasteradresse getKatasterinformation() {
        return katasterinformation;
    }

    public void setKatasterinformation(Katasteradresse katasterinformation) {
        this.katasterinformation = katasterinformation;
    }

    public String getLokationsbuendelObjektcode() {
        return lokationsbuendelObjektcode;
    }

    public void setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
        this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
    }

    public List<Lokationszuordnung> getLokationszuordnungen() {
        return lokationszuordnungen;
    }

    public void setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
        this.lokationszuordnungen = lokationszuordnungen;
    }

    public Adresse getMessadresse() {
        return messadresse;
    }

    public void setMessadresse(Adresse messadresse) {
        this.messadresse = messadresse;
    }

    public List<Dienstleistung> getMessdienstleistung() {
        return messdienstleistung;
    }

    public void setMessdienstleistung(List<Dienstleistung> messdienstleistung) {
        this.messdienstleistung = messdienstleistung;
    }

    public String getMessgebietnr() {
        return messgebietnr;
    }

    public void setMessgebietnr(String messgebietnr) {
        this.messgebietnr = messgebietnr;
    }

    public String getMesslokationsId() {
        return messlokationsId;
    }

    public void setMesslokationsId(String messlokationsId) {
        this.messlokationsId = messlokationsId;
    }

    public List<Zaehler> getMesslokationszaehler() {
        return messlokationszaehler;
    }

    public void setMesslokationszaehler(List<Zaehler> messlokationszaehler) {
        this.messlokationszaehler = messlokationszaehler;
    }

    public Netzebene getNetzebeneMessung() {
        return netzebeneMessung;
    }

    public void setNetzebeneMessung(Netzebene netzebeneMessung) {
        this.netzebeneMessung = netzebeneMessung;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public static class MesslokationBuilder extends GeschaeftsobjektBuilder {
        private Geokoordinaten geoadresse;
        /**
         * Liste der Geräte, die zu dieser Messstelle gehört
         */
        private List<Geraet> geraete;
        private String grundzustaendigerMsbCodenr;
        private String grundzustaendigerMsbimCodenr;
        /**
         * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
         */
        private Katasteradresse katasterinformation;
        /**
         * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
         * beschreibt.
         */
        private String lokationsbuendelObjektcode;
        /**
         * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
         */
        private List<Lokationszuordnung> lokationszuordnungen;
        private Adresse messadresse;
        /**
         * Liste der Messdienstleistungen, die zu dieser Messstelle gehört
         */
        private List<Dienstleistung> messdienstleistung;
        /**
         * Die Nummer des Messgebietes in der ene't-Datenbank
         */
        private String messgebietnr;
        /**
         * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
         */
        private String messlokationsId;
        /**
         * Zähler, die zu dieser Messlokation gehören
         */
        private List<Zaehler> messlokationszaehler;
        /**
         * Spannungsebene der Messung
         */
        private Netzebene netzebeneMessung;
        /**
         * Sparte der Messlokation, z.B. Gas oder Strom
         */
        private Sparte sparte;
    
        public Geokoordinaten getGeoadresse() {
            return geoadresse;
        }
    
        public MesslokationBuilder setGeoadresse(Geokoordinaten geoadresse) {
            this.geoadresse = geoadresse;
            return this;
        }
    
        public List<Geraet> getGeraete() {
            return geraete;
        }
    
        public MesslokationBuilder setGeraete(List<Geraet> geraete) {
            this.geraete = geraete;
            return this;
        }
    
        public String getGrundzustaendigerMsbCodenr() {
            return grundzustaendigerMsbCodenr;
        }
    
        public MesslokationBuilder setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
            this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
            return this;
        }
    
        public String getGrundzustaendigerMsbimCodenr() {
            return grundzustaendigerMsbimCodenr;
        }
    
        public MesslokationBuilder setGrundzustaendigerMsbimCodenr(String grundzustaendigerMsbimCodenr) {
            this.grundzustaendigerMsbimCodenr = grundzustaendigerMsbimCodenr;
            return this;
        }
    
        public Katasteradresse getKatasterinformation() {
            return katasterinformation;
        }
    
        public MesslokationBuilder setKatasterinformation(Katasteradresse katasterinformation) {
            this.katasterinformation = katasterinformation;
            return this;
        }
    
        public String getLokationsbuendelObjektcode() {
            return lokationsbuendelObjektcode;
        }
    
        public MesslokationBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }
    
        public List<Lokationszuordnung> getLokationszuordnungen() {
            return lokationszuordnungen;
        }
    
        public MesslokationBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }
    
        public Adresse getMessadresse() {
            return messadresse;
        }
    
        public MesslokationBuilder setMessadresse(Adresse messadresse) {
            this.messadresse = messadresse;
            return this;
        }
    
        public List<Dienstleistung> getMessdienstleistung() {
            return messdienstleistung;
        }
    
        public MesslokationBuilder setMessdienstleistung(List<Dienstleistung> messdienstleistung) {
            this.messdienstleistung = messdienstleistung;
            return this;
        }
    
        public String getMessgebietnr() {
            return messgebietnr;
        }
    
        public MesslokationBuilder setMessgebietnr(String messgebietnr) {
            this.messgebietnr = messgebietnr;
            return this;
        }
    
        public String getMesslokationsId() {
            return messlokationsId;
        }
    
        public MesslokationBuilder setMesslokationsId(String messlokationsId) {
            this.messlokationsId = messlokationsId;
            return this;
        }
    
        public List<Zaehler> getMesslokationszaehler() {
            return messlokationszaehler;
        }
    
        public MesslokationBuilder setMesslokationszaehler(List<Zaehler> messlokationszaehler) {
            this.messlokationszaehler = messlokationszaehler;
            return this;
        }
    
        public Netzebene getNetzebeneMessung() {
            return netzebeneMessung;
        }
    
        public MesslokationBuilder setNetzebeneMessung(Netzebene netzebeneMessung) {
            this.netzebeneMessung = netzebeneMessung;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public MesslokationBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public MesslokationBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public MesslokationBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Messlokation build() {
            return new Messlokation(this);
        }
    }
}