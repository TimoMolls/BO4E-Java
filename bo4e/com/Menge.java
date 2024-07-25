package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Mengeneinheit;

import java.util.List;

/**
 * Abbildung einer Menge mit Wert und Einheit.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Menge.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Menge JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.1/src/bo4e_schemas/com/Menge.json>`_
 */
public class Menge extends COM {
    /**
     * Gibt die Einheit zum jeweiligen Wert an
     */
    private Mengeneinheit einheit;
    /**
     * Gibt den absoluten Wert der Menge an
     */
    private Double wert;

    public Menge() {
    }

    private Menge(MengeBuilder builder) {
        super(builder);
        this.einheit = builder.einheit;
        this.wert = builder.wert;
    }

    public Mengeneinheit getEinheit() {
        return einheit;
    }

    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    public Double getWert() {
        return wert;
    }

    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static class MengeBuilder extends COMBuilder {
        /**
         * Gibt die Einheit zum jeweiligen Wert an
         */
        private Mengeneinheit einheit;
        /**
         * Gibt den absoluten Wert der Menge an
         */
        private Double wert;
    
        public Mengeneinheit getEinheit() {
            return einheit;
        }
    
        public MengeBuilder setEinheit(Mengeneinheit einheit) {
            this.einheit = einheit;
            return this;
        }
    
        public Double getWert() {
            return wert;
        }
    
        public MengeBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }
    
        public MengeBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public MengeBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Menge build() {
            return new Menge(this);
        }
    }
}