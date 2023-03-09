import java.time.LocalDate;

public class BouteilleLait extends Bouteille {

    private LocalDate dateDePeremption;

    public BouteilleLait(int contenu, LocalDate dateMiseEnBouteille, LocalDate dateDePeremption) {
        super(contenu, dateMiseEnBouteille);
        this.dateDePeremption = dateDePeremption;
    }

    public Boolean estPerime() {

        LocalDate dateNow = LocalDate.now();
        if(dateNow.isAfter(this.dateDePeremption)) {
            return true;
        }
        return false;
    }

    public String toString() {

        String perime;

        if (this.estPerime() == true) {
            perime = "est perimé";
        } else {
            perime = "n'est pas périmé";
        }
        return super.toString() + " " + perime;
    }

    public LocalDate getDateDePeremption() {
        return this.dateDePeremption;
    }
    public void setDateDePeremption(LocalDate dateDePeremption) {
        this.dateDePeremption = dateDePeremption;
    }

}
