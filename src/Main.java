import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Bouteille bouteille = new Bouteille(0, LocalDate.now());
        BouteilleVin bouteilleVin = new BouteilleVin(0, LocalDate.now(), "Rouge");
        BouteilleLait bouteilleLait = new BouteilleLait(0, LocalDate.of(2021, 4, 3), LocalDate.of(2022, 8, 9));

        System.out.println(bouteilleVin.toString());

    }
}