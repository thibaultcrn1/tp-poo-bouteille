import java.time.LocalDate;

public class BouteilleVin extends Bouteille {

    private String couleur;

    public BouteilleVin(int contenu, LocalDate dateMiseEnBouteille, String couleur) {
        super(contenu, dateMiseEnBouteille);
        this.couleur = couleur;
    }

    public String toString() {
        return "Cette bouteille de contenance " + this.contenu + "ml et mise en bouteille le " + this.dateMiseEnBouteille + " contient un vin de couleur " + this.couleur;
    }

    public String getCouleur() {
        return this.couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

}
