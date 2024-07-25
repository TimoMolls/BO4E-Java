package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.enums.Geraeteklasse;
import bo4e.enums.Geraetetyp;
import bo4e.enums.Typ;

import java.util.List;

/**
 * Mit diesem BO werden alle Geräte modelliert, die keine Zähler sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geraet.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geraet JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.1/src/bo4e_schemas/bo/Geraet.json>`_
 */
public class Geraet extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.GERAET;
    /**
     * Bezeichnung des Geräts
     */
    private String bezeichnung;
    /**
     * Die übergreifende Klasse eines Geräts, beispielsweise Wandler
     */
    private Geraeteklasse geraeteklasse;
    /**
     * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
     */
    private String geraetenummer;
    /**
     * Der speziellere Typ eines Gerätes, beispielsweise Stromwandler
     */
    private Geraetetyp geraetetyp;

    public Geraet() {
    }

    private Geraet(GeraetBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.geraeteklasse = builder.geraeteklasse;
        this.geraetenummer = builder.geraetenummer;
        this.geraetetyp = builder.geraetetyp;
    }

    public Typ getTyp() {
        return typ;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Geraeteklasse getGeraeteklasse() {
        return geraeteklasse;
    }

    public void setGeraeteklasse(Geraeteklasse geraeteklasse) {
        this.geraeteklasse = geraeteklasse;
    }

    public String getGeraetenummer() {
        return geraetenummer;
    }

    public void setGeraetenummer(String geraetenummer) {
        this.geraetenummer = geraetenummer;
    }

    public Geraetetyp getGeraetetyp() {
        return geraetetyp;
    }

    public void setGeraetetyp(Geraetetyp geraetetyp) {
        this.geraetetyp = geraetetyp;
    }

    public static class GeraetBuilder extends GeschaeftsobjektBuilder {
        /**
         * Bezeichnung des Geräts
         */
        private String bezeichnung;
        /**
         * Die übergreifende Klasse eines Geräts, beispielsweise Wandler
         */
        private Geraeteklasse geraeteklasse;
        /**
         * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
         */
        private String geraetenummer;
        /**
         * Der speziellere Typ eines Gerätes, beispielsweise Stromwandler
         */
        private Geraetetyp geraetetyp;
    
        public String getBezeichnung() {
            return bezeichnung;
        }
    
        public GeraetBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }
    
        public Geraeteklasse getGeraeteklasse() {
            return geraeteklasse;
        }
    
        public GeraetBuilder setGeraeteklasse(Geraeteklasse geraeteklasse) {
            this.geraeteklasse = geraeteklasse;
            return this;
        }
    
        public String getGeraetenummer() {
            return geraetenummer;
        }
    
        public GeraetBuilder setGeraetenummer(String geraetenummer) {
            this.geraetenummer = geraetenummer;
            return this;
        }
    
        public Geraetetyp getGeraetetyp() {
            return geraetetyp;
        }
    
        public GeraetBuilder setGeraetetyp(Geraetetyp geraetetyp) {
            this.geraetetyp = geraetetyp;
            return this;
        }
    
        public GeraetBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public GeraetBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Geraet build() {
            return new Geraet(this);
        }
    }
}