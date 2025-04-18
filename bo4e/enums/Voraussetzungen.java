package bo4e.enums;

import java.io.IOException;

/**
 * Voraussetzungen, die erfüllt sein müssen, damit dieser Tarif zur Anwendung kommen kann.
 */
public enum Voraussetzungen {
    ALTER_KUNDENANLAGE, ALTVERTRAG, ANLAGEBESCHAFFENHEIT, ANSCHLUSSART, ANSCHLUSSWERT, AUSSCHLUSS_GROSSVERBRAUCHER, BESONDERE_VERBRAUCHSSTELLE, BESTIMMTER_ABNAHMEFALL, BESTIMMTE_VERTRAGSFORMALITAETEN, BETRIEBSSTUNDENBEGRENZUNG, DIREKTVERTRIEB, EINZUGSERMAECHTIGUNG, FAMILIENSTRUKTUR, FREIGABEZEITEN, GEWERBE, KOMBI_BONI, LASTPROFIL, LIEFERANBINDUNG_ALLE, LIEFERANBINDUNG_EINE, LIEFERUNGSBESCHRAENKUNG_GASART, MAX_ZAEHLER_LIEFERSTELLEN, MEHRERE_ZAEHLER_ABNAHMESTELLEN, MINDESTUMSATZ, MITGLIEDSCHAFT, NACHWEIS_ZAHLUNGSFAEHIGKEIT, NEUKUNDE, NEUKUNDE_MIT_VORAUSSETZUNGEN, NIEDRIGENERGIE, ONLINEVORAUSSETZUNG, ORTSTEILE_LIEFERGEBIET, SELBSTABLESUNG, STAATLICHE_FOERDERUNG, UMSTELLUNG_ENERGIEART, VORGESCHRIEBENE_ZUSATZANLAGE, WAERMEBEDARF_ERDGAS, ZAEHLERTYP_GROESSE, ZEITPUNKT, ZUSATZMODALITAET, ZUSATZPRODUKT;

    public String toValue() {
        switch (this) {
            case ALTER_KUNDENANLAGE: return "ALTER_KUNDENANLAGE";
            case ALTVERTRAG: return "ALTVERTRAG";
            case ANLAGEBESCHAFFENHEIT: return "ANLAGEBESCHAFFENHEIT";
            case ANSCHLUSSART: return "ANSCHLUSSART";
            case ANSCHLUSSWERT: return "ANSCHLUSSWERT";
            case AUSSCHLUSS_GROSSVERBRAUCHER: return "AUSSCHLUSS_GROSSVERBRAUCHER";
            case BESONDERE_VERBRAUCHSSTELLE: return "BESONDERE_VERBRAUCHSSTELLE";
            case BESTIMMTER_ABNAHMEFALL: return "BESTIMMTER_ABNAHMEFALL";
            case BESTIMMTE_VERTRAGSFORMALITAETEN: return "BESTIMMTE_VERTRAGSFORMALITAETEN";
            case BETRIEBSSTUNDENBEGRENZUNG: return "BETRIEBSSTUNDENBEGRENZUNG";
            case DIREKTVERTRIEB: return "DIREKTVERTRIEB";
            case EINZUGSERMAECHTIGUNG: return "EINZUGSERMAECHTIGUNG";
            case FAMILIENSTRUKTUR: return "FAMILIENSTRUKTUR";
            case FREIGABEZEITEN: return "FREIGABEZEITEN";
            case GEWERBE: return "GEWERBE";
            case KOMBI_BONI: return "KOMBI_BONI";
            case LASTPROFIL: return "LASTPROFIL";
            case LIEFERANBINDUNG_ALLE: return "LIEFERANBINDUNG_ALLE";
            case LIEFERANBINDUNG_EINE: return "LIEFERANBINDUNG_EINE";
            case LIEFERUNGSBESCHRAENKUNG_GASART: return "LIEFERUNGSBESCHRAENKUNG_GASART";
            case MAX_ZAEHLER_LIEFERSTELLEN: return "MAX_ZAEHLER_LIEFERSTELLEN";
            case MEHRERE_ZAEHLER_ABNAHMESTELLEN: return "MEHRERE_ZAEHLER_ABNAHMESTELLEN";
            case MINDESTUMSATZ: return "MINDESTUMSATZ";
            case MITGLIEDSCHAFT: return "MITGLIEDSCHAFT";
            case NACHWEIS_ZAHLUNGSFAEHIGKEIT: return "NACHWEIS_ZAHLUNGSFAEHIGKEIT";
            case NEUKUNDE: return "NEUKUNDE";
            case NEUKUNDE_MIT_VORAUSSETZUNGEN: return "NEUKUNDE_MIT_VORAUSSETZUNGEN";
            case NIEDRIGENERGIE: return "NIEDRIGENERGIE";
            case ONLINEVORAUSSETZUNG: return "ONLINEVORAUSSETZUNG";
            case ORTSTEILE_LIEFERGEBIET: return "ORTSTEILE_LIEFERGEBIET";
            case SELBSTABLESUNG: return "SELBSTABLESUNG";
            case STAATLICHE_FOERDERUNG: return "STAATLICHE_FOERDERUNG";
            case UMSTELLUNG_ENERGIEART: return "UMSTELLUNG_ENERGIEART";
            case VORGESCHRIEBENE_ZUSATZANLAGE: return "VORGESCHRIEBENE_ZUSATZANLAGE";
            case WAERMEBEDARF_ERDGAS: return "WAERMEBEDARF_ERDGAS";
            case ZAEHLERTYP_GROESSE: return "ZAEHLERTYP_GROESSE";
            case ZEITPUNKT: return "ZEITPUNKT";
            case ZUSATZMODALITAET: return "ZUSATZMODALITAET";
            case ZUSATZPRODUKT: return "ZUSATZPRODUKT";
        }
        return null;
    }

    public static Voraussetzungen forValue(String value) throws IOException {
        if (value.equals("ALTER_KUNDENANLAGE")) return ALTER_KUNDENANLAGE;
        if (value.equals("ALTVERTRAG")) return ALTVERTRAG;
        if (value.equals("ANLAGEBESCHAFFENHEIT")) return ANLAGEBESCHAFFENHEIT;
        if (value.equals("ANSCHLUSSART")) return ANSCHLUSSART;
        if (value.equals("ANSCHLUSSWERT")) return ANSCHLUSSWERT;
        if (value.equals("AUSSCHLUSS_GROSSVERBRAUCHER")) return AUSSCHLUSS_GROSSVERBRAUCHER;
        if (value.equals("BESONDERE_VERBRAUCHSSTELLE")) return BESONDERE_VERBRAUCHSSTELLE;
        if (value.equals("BESTIMMTER_ABNAHMEFALL")) return BESTIMMTER_ABNAHMEFALL;
        if (value.equals("BESTIMMTE_VERTRAGSFORMALITAETEN")) return BESTIMMTE_VERTRAGSFORMALITAETEN;
        if (value.equals("BETRIEBSSTUNDENBEGRENZUNG")) return BETRIEBSSTUNDENBEGRENZUNG;
        if (value.equals("DIREKTVERTRIEB")) return DIREKTVERTRIEB;
        if (value.equals("EINZUGSERMAECHTIGUNG")) return EINZUGSERMAECHTIGUNG;
        if (value.equals("FAMILIENSTRUKTUR")) return FAMILIENSTRUKTUR;
        if (value.equals("FREIGABEZEITEN")) return FREIGABEZEITEN;
        if (value.equals("GEWERBE")) return GEWERBE;
        if (value.equals("KOMBI_BONI")) return KOMBI_BONI;
        if (value.equals("LASTPROFIL")) return LASTPROFIL;
        if (value.equals("LIEFERANBINDUNG_ALLE")) return LIEFERANBINDUNG_ALLE;
        if (value.equals("LIEFERANBINDUNG_EINE")) return LIEFERANBINDUNG_EINE;
        if (value.equals("LIEFERUNGSBESCHRAENKUNG_GASART")) return LIEFERUNGSBESCHRAENKUNG_GASART;
        if (value.equals("MAX_ZAEHLER_LIEFERSTELLEN")) return MAX_ZAEHLER_LIEFERSTELLEN;
        if (value.equals("MEHRERE_ZAEHLER_ABNAHMESTELLEN")) return MEHRERE_ZAEHLER_ABNAHMESTELLEN;
        if (value.equals("MINDESTUMSATZ")) return MINDESTUMSATZ;
        if (value.equals("MITGLIEDSCHAFT")) return MITGLIEDSCHAFT;
        if (value.equals("NACHWEIS_ZAHLUNGSFAEHIGKEIT")) return NACHWEIS_ZAHLUNGSFAEHIGKEIT;
        if (value.equals("NEUKUNDE")) return NEUKUNDE;
        if (value.equals("NEUKUNDE_MIT_VORAUSSETZUNGEN")) return NEUKUNDE_MIT_VORAUSSETZUNGEN;
        if (value.equals("NIEDRIGENERGIE")) return NIEDRIGENERGIE;
        if (value.equals("ONLINEVORAUSSETZUNG")) return ONLINEVORAUSSETZUNG;
        if (value.equals("ORTSTEILE_LIEFERGEBIET")) return ORTSTEILE_LIEFERGEBIET;
        if (value.equals("SELBSTABLESUNG")) return SELBSTABLESUNG;
        if (value.equals("STAATLICHE_FOERDERUNG")) return STAATLICHE_FOERDERUNG;
        if (value.equals("UMSTELLUNG_ENERGIEART")) return UMSTELLUNG_ENERGIEART;
        if (value.equals("VORGESCHRIEBENE_ZUSATZANLAGE")) return VORGESCHRIEBENE_ZUSATZANLAGE;
        if (value.equals("WAERMEBEDARF_ERDGAS")) return WAERMEBEDARF_ERDGAS;
        if (value.equals("ZAEHLERTYP_GROESSE")) return ZAEHLERTYP_GROESSE;
        if (value.equals("ZEITPUNKT")) return ZEITPUNKT;
        if (value.equals("ZUSATZMODALITAET")) return ZUSATZMODALITAET;
        if (value.equals("ZUSATZPRODUKT")) return ZUSATZPRODUKT;
        throw new IOException("Cannot deserialize Voraussetzungen");
    }
}
