import java.time.LocalDate;

public class Bouteille {

    protected int contenu;
    protected LocalDate dateMiseEnBouteille;

    public Bouteille(int contenu, LocalDate dateMiseEnBouteille) {
        this.contenu = contenu;
        this.dateMiseEnBouteille = dateMiseEnBouteille;
    }

    public boolean estVide() {
        if (this.contenu > 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Cette bouteille de contenance " + this.contenu + "ml et mise en bouteille le " + this.dateMiseEnBouteille;
    }

    public int getContenu() {
        return this.contenu;
    }
    public void setContenu(int contenu) {
        this.contenu = contenu;
    }

    public LocalDate getDateMiseEnBouteille() {
        return this.dateMiseEnBouteille;
    }
    public void setDateMiseEnBouteille(LocalDate dateMiseEnBouteille) {
        this.dateMiseEnBouteille = dateMiseEnBouteille;
    }


}
