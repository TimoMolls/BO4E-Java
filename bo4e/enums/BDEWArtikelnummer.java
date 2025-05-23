package bo4e.enums;

import java.io.IOException;

/**
 * BDEW Artikelnummern
 */
public enum BDEWArtikelnummer {
    ABGABE_KWKG, ABSCHLAG, AUSGLEICHSENERGIE, AUSGLEICHSENERGIE_UNTERDECKUNG, BEFESTIGUNGSEINRICHTUNG, BLINDMEHRARBEIT, BLINDMEHRLEISTUNG, ENERGIESTEUER, ENTGELT_ABRECHNUNG, ENTGELT_EINBAU_BETRIEB_WARTUNG_MESSTECHNIK, ENTGELT_FERNAUSLESUNG, ENTGELT_MESSUNG_ABLESUNG, ENTSPERRKOSTEN, FIXE_ARBEITSENTGELTKOMPONENTE, FIXE_LEISTUNGSENTGELTKOMPONENTE, GRUNDPREIS, INKASSOKOSTEN, KOMMUNIKATIONSEINRICHTUNG, KONZESSIONSABGABE, LEISTUNG, LEISTUNG_PAUSCHAL, MAHNKOSTEN, MEHRMENGE, MEHR_MINDERMENGEN, MINDERMENGE, MSB_INKL_MESSUNG, NOTSTROMLIEFERUNG_ARBEIT, NOTSTROMLIEFERUNG_LEISTUNG, OFFSHORE_HAFTUNGSUMLAGE, PARAGRAF_19__STROM_NEV_UMLAGE, PRUEFGEBUEHREN_AUSSERPLANMAESSIG, REGELENERGIE_ARBEIT, REGELENERGIE_LEISTUNG, RESERVELEISTUNG, RESERVENETZKAPAZITAET, SINGULAER_GENUTZTE_BETRIEBSMITTEL, SMARTMETER_GATEWAY, SPERRKOSTEN, STEUERBOX, TECHNISCHE_STEUEREINRICHTUNG, UMLAGE_ABSCHALTBARE_LASTEN, UNTERMESSUNG, WANDLER_MENGENUMWERTER, WIRKARBEIT, ZAEHLEINRICHTUNG, ZUSAETZLICHE_ABLESUNG;

    public String toValue() {
        switch (this) {
            case ABGABE_KWKG: return "ABGABE_KWKG";
            case ABSCHLAG: return "ABSCHLAG";
            case AUSGLEICHSENERGIE: return "AUSGLEICHSENERGIE";
            case AUSGLEICHSENERGIE_UNTERDECKUNG: return "AUSGLEICHSENERGIE_UNTERDECKUNG";
            case BEFESTIGUNGSEINRICHTUNG: return "BEFESTIGUNGSEINRICHTUNG";
            case BLINDMEHRARBEIT: return "BLINDMEHRARBEIT";
            case BLINDMEHRLEISTUNG: return "BLINDMEHRLEISTUNG";
            case ENERGIESTEUER: return "ENERGIESTEUER";
            case ENTGELT_ABRECHNUNG: return "ENTGELT_ABRECHNUNG";
            case ENTGELT_EINBAU_BETRIEB_WARTUNG_MESSTECHNIK: return "ENTGELT_EINBAU_BETRIEB_WARTUNG_MESSTECHNIK";
            case ENTGELT_FERNAUSLESUNG: return "ENTGELT_FERNAUSLESUNG";
            case ENTGELT_MESSUNG_ABLESUNG: return "ENTGELT_MESSUNG_ABLESUNG";
            case ENTSPERRKOSTEN: return "ENTSPERRKOSTEN";
            case FIXE_ARBEITSENTGELTKOMPONENTE: return "FIXE_ARBEITSENTGELTKOMPONENTE";
            case FIXE_LEISTUNGSENTGELTKOMPONENTE: return "FIXE_LEISTUNGSENTGELTKOMPONENTE";
            case GRUNDPREIS: return "GRUNDPREIS";
            case INKASSOKOSTEN: return "INKASSOKOSTEN";
            case KOMMUNIKATIONSEINRICHTUNG: return "KOMMUNIKATIONSEINRICHTUNG";
            case KONZESSIONSABGABE: return "KONZESSIONSABGABE";
            case LEISTUNG: return "LEISTUNG";
            case LEISTUNG_PAUSCHAL: return "LEISTUNG_PAUSCHAL";
            case MAHNKOSTEN: return "MAHNKOSTEN";
            case MEHRMENGE: return "MEHRMENGE";
            case MEHR_MINDERMENGEN: return "MEHR_MINDERMENGEN";
            case MINDERMENGE: return "MINDERMENGE";
            case MSB_INKL_MESSUNG: return "MSB_INKL_MESSUNG";
            case NOTSTROMLIEFERUNG_ARBEIT: return "NOTSTROMLIEFERUNG_ARBEIT";
            case NOTSTROMLIEFERUNG_LEISTUNG: return "NOTSTROMLIEFERUNG_LEISTUNG";
            case OFFSHORE_HAFTUNGSUMLAGE: return "OFFSHORE_HAFTUNGSUMLAGE";
            case PARAGRAF_19__STROM_NEV_UMLAGE: return "PARAGRAF_19_STROM_NEV_UMLAGE";
            case PRUEFGEBUEHREN_AUSSERPLANMAESSIG: return "PRUEFGEBUEHREN_AUSSERPLANMAESSIG";
            case REGELENERGIE_ARBEIT: return "REGELENERGIE_ARBEIT";
            case REGELENERGIE_LEISTUNG: return "REGELENERGIE_LEISTUNG";
            case RESERVELEISTUNG: return "RESERVELEISTUNG";
            case RESERVENETZKAPAZITAET: return "RESERVENETZKAPAZITAET";
            case SINGULAER_GENUTZTE_BETRIEBSMITTEL: return "SINGULAER_GENUTZTE_BETRIEBSMITTEL";
            case SMARTMETER_GATEWAY: return "SMARTMETER_GATEWAY";
            case SPERRKOSTEN: return "SPERRKOSTEN";
            case STEUERBOX: return "STEUERBOX";
            case TECHNISCHE_STEUEREINRICHTUNG: return "TECHNISCHE_STEUEREINRICHTUNG";
            case UMLAGE_ABSCHALTBARE_LASTEN: return "UMLAGE_ABSCHALTBARE_LASTEN";
            case UNTERMESSUNG: return "UNTERMESSUNG";
            case WANDLER_MENGENUMWERTER: return "WANDLER_MENGENUMWERTER";
            case WIRKARBEIT: return "WIRKARBEIT";
            case ZAEHLEINRICHTUNG: return "ZAEHLEINRICHTUNG";
            case ZUSAETZLICHE_ABLESUNG: return "ZUSAETZLICHE_ABLESUNG";
        }
        return null;
    }

    public static BDEWArtikelnummer forValue(String value) throws IOException {
        if (value.equals("ABGABE_KWKG")) return ABGABE_KWKG;
        if (value.equals("ABSCHLAG")) return ABSCHLAG;
        if (value.equals("AUSGLEICHSENERGIE")) return AUSGLEICHSENERGIE;
        if (value.equals("AUSGLEICHSENERGIE_UNTERDECKUNG")) return AUSGLEICHSENERGIE_UNTERDECKUNG;
        if (value.equals("BEFESTIGUNGSEINRICHTUNG")) return BEFESTIGUNGSEINRICHTUNG;
        if (value.equals("BLINDMEHRARBEIT")) return BLINDMEHRARBEIT;
        if (value.equals("BLINDMEHRLEISTUNG")) return BLINDMEHRLEISTUNG;
        if (value.equals("ENERGIESTEUER")) return ENERGIESTEUER;
        if (value.equals("ENTGELT_ABRECHNUNG")) return ENTGELT_ABRECHNUNG;
        if (value.equals("ENTGELT_EINBAU_BETRIEB_WARTUNG_MESSTECHNIK")) return ENTGELT_EINBAU_BETRIEB_WARTUNG_MESSTECHNIK;
        if (value.equals("ENTGELT_FERNAUSLESUNG")) return ENTGELT_FERNAUSLESUNG;
        if (value.equals("ENTGELT_MESSUNG_ABLESUNG")) return ENTGELT_MESSUNG_ABLESUNG;
        if (value.equals("ENTSPERRKOSTEN")) return ENTSPERRKOSTEN;
        if (value.equals("FIXE_ARBEITSENTGELTKOMPONENTE")) return FIXE_ARBEITSENTGELTKOMPONENTE;
        if (value.equals("FIXE_LEISTUNGSENTGELTKOMPONENTE")) return FIXE_LEISTUNGSENTGELTKOMPONENTE;
        if (value.equals("GRUNDPREIS")) return GRUNDPREIS;
        if (value.equals("INKASSOKOSTEN")) return INKASSOKOSTEN;
        if (value.equals("KOMMUNIKATIONSEINRICHTUNG")) return KOMMUNIKATIONSEINRICHTUNG;
        if (value.equals("KONZESSIONSABGABE")) return KONZESSIONSABGABE;
        if (value.equals("LEISTUNG")) return LEISTUNG;
        if (value.equals("LEISTUNG_PAUSCHAL")) return LEISTUNG_PAUSCHAL;
        if (value.equals("MAHNKOSTEN")) return MAHNKOSTEN;
        if (value.equals("MEHRMENGE")) return MEHRMENGE;
        if (value.equals("MEHR_MINDERMENGEN")) return MEHR_MINDERMENGEN;
        if (value.equals("MINDERMENGE")) return MINDERMENGE;
        if (value.equals("MSB_INKL_MESSUNG")) return MSB_INKL_MESSUNG;
        if (value.equals("NOTSTROMLIEFERUNG_ARBEIT")) return NOTSTROMLIEFERUNG_ARBEIT;
        if (value.equals("NOTSTROMLIEFERUNG_LEISTUNG")) return NOTSTROMLIEFERUNG_LEISTUNG;
        if (value.equals("OFFSHORE_HAFTUNGSUMLAGE")) return OFFSHORE_HAFTUNGSUMLAGE;
        if (value.equals("PARAGRAF_19_STROM_NEV_UMLAGE")) return PARAGRAF_19__STROM_NEV_UMLAGE;
        if (value.equals("PRUEFGEBUEHREN_AUSSERPLANMAESSIG")) return PRUEFGEBUEHREN_AUSSERPLANMAESSIG;
        if (value.equals("REGELENERGIE_ARBEIT")) return REGELENERGIE_ARBEIT;
        if (value.equals("REGELENERGIE_LEISTUNG")) return REGELENERGIE_LEISTUNG;
        if (value.equals("RESERVELEISTUNG")) return RESERVELEISTUNG;
        if (value.equals("RESERVENETZKAPAZITAET")) return RESERVENETZKAPAZITAET;
        if (value.equals("SINGULAER_GENUTZTE_BETRIEBSMITTEL")) return SINGULAER_GENUTZTE_BETRIEBSMITTEL;
        if (value.equals("SMARTMETER_GATEWAY")) return SMARTMETER_GATEWAY;
        if (value.equals("SPERRKOSTEN")) return SPERRKOSTEN;
        if (value.equals("STEUERBOX")) return STEUERBOX;
        if (value.equals("TECHNISCHE_STEUEREINRICHTUNG")) return TECHNISCHE_STEUEREINRICHTUNG;
        if (value.equals("UMLAGE_ABSCHALTBARE_LASTEN")) return UMLAGE_ABSCHALTBARE_LASTEN;
        if (value.equals("UNTERMESSUNG")) return UNTERMESSUNG;
        if (value.equals("WANDLER_MENGENUMWERTER")) return WANDLER_MENGENUMWERTER;
        if (value.equals("WIRKARBEIT")) return WIRKARBEIT;
        if (value.equals("ZAEHLEINRICHTUNG")) return ZAEHLEINRICHTUNG;
        if (value.equals("ZUSAETZLICHE_ABLESUNG")) return ZUSAETZLICHE_ABLESUNG;
        throw new IOException("Cannot deserialize BDEWArtikelnummer");
    }
}
