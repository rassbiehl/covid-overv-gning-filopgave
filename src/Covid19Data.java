public class Covid19Data {
    String region;
    String aldersGruppe;
    int bekræftedeTilfælde;
    int døde;
    int indlagtePåIntensivAfdeling;
    int indlagte;
    String dato;

    public Covid19Data (String region, String aldersGruppe, int bekræftedeTilfælde, int døde, int indlagtePåIntensivAfdeling, int indlagte, String dato) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }
@Override
    public String toString() {
        return "region " + this.region + " aldersgruppe: " + this.aldersGruppe + " bekræftede tilfælde " + bekræftedeTilfælde + " døde: " + this.døde + " indlagte på intensiv afdeling: " + this.indlagtePåIntensivAfdeling + " indlagte: " + this.indlagte + " dato: " + this.dato;
    }
}
