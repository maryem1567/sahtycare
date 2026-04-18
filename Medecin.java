import java.lang.*;
import java.util.ArrayList;

class Medecin extends User {

    private String specialite;
    private ArrayList<RendezVous> rendezVousList = new ArrayList<>();

    public Medecin(int id, String nom, String email, String motDePasse, String specialite) {
        super(id, nom, email, motDePasse);
        this.specialite = specialite;
    }

    public void ajouterRendezVous(RendezVous r) {
        rendezVousList.add(r);
        System.out.println("RDV ajouté pour Dr " + nom);
    }

    public void afficherRendezVous() {
        System.out.println("RDV du médecin " + nom + ": " + rendezVousList.size());
    }
}