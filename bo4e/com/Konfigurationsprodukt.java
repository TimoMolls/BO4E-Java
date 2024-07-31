package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.bo.Marktteilnehmer;

import java.util.List;

/**
 * Object containing information about a Konfigurationsprodukt
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Konfigurationsprodukt.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Konfigurationsprodukt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/Konfigurationsprodukt.json>`_
 */
public class Konfigurationsprodukt extends COM {
    private String leistungskurvendefinition;
    private Marktteilnehmer marktpartner;
    private String produktcode;
    private String schaltzeitdefinition;

    public Konfigurationsprodukt() {
    }

    private Konfigurationsprodukt(KonfigurationsproduktBuilder builder) {
        super(builder);
        this.leistungskurvendefinition = builder.leistungskurvendefinition;
        this.marktpartner = builder.marktpartner;
        this.produktcode = builder.produktcode;
        this.schaltzeitdefinition = builder.schaltzeitdefinition;
    }

    public String getLeistungskurvendefinition() {
        return leistungskurvendefinition;
    }

    public void setLeistungskurvendefinition(String leistungskurvendefinition) {
        this.leistungskurvendefinition = leistungskurvendefinition;
    }

    public Marktteilnehmer getMarktpartner() {
        return marktpartner;
    }

    public void setMarktpartner(Marktteilnehmer marktpartner) {
        this.marktpartner = marktpartner;
    }

    public String getProduktcode() {
        return produktcode;
    }

    public void setProduktcode(String produktcode) {
        this.produktcode = produktcode;
    }

    public String getSchaltzeitdefinition() {
        return schaltzeitdefinition;
    }

    public void setSchaltzeitdefinition(String schaltzeitdefinition) {
        this.schaltzeitdefinition = schaltzeitdefinition;
    }

    public static KonfigurationsproduktBuilder builder() {
        return new KonfigurationsproduktBuilder();
    }

    public static class KonfigurationsproduktBuilder extends COMBuilder {
        private String leistungskurvendefinition;
        private Marktteilnehmer marktpartner;
        private String produktcode;
        private String schaltzeitdefinition;

        private KonfigurationsproduktBuilder() {
        }

        public String getLeistungskurvendefinition() {
            return leistungskurvendefinition;
        }

        public KonfigurationsproduktBuilder setLeistungskurvendefinition(String leistungskurvendefinition) {
            this.leistungskurvendefinition = leistungskurvendefinition;
            return this;
        }

        public Marktteilnehmer getMarktpartner() {
            return marktpartner;
        }

        public KonfigurationsproduktBuilder setMarktpartner(Marktteilnehmer marktpartner) {
            this.marktpartner = marktpartner;
            return this;
        }

        public String getProduktcode() {
            return produktcode;
        }

        public KonfigurationsproduktBuilder setProduktcode(String produktcode) {
            this.produktcode = produktcode;
            return this;
        }

        public String getSchaltzeitdefinition() {
            return schaltzeitdefinition;
        }

        public KonfigurationsproduktBuilder setSchaltzeitdefinition(String schaltzeitdefinition) {
            this.schaltzeitdefinition = schaltzeitdefinition;
            return this;
        }

        public KonfigurationsproduktBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public KonfigurationsproduktBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Konfigurationsprodukt build() {
            return new Konfigurationsprodukt(this);
        }
    }
}