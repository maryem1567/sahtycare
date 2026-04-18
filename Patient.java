import java.lang.*;
import java.util.ArrayList;

class Patient extends User {

    private ArrayList<RendezVous> rendezVousList = new ArrayList<>();
    private ArrayList<Analyse> analyses = new ArrayList<>();

    public Patient(int id, String nom, String email, String motDePasse) {
        super(id, nom, email, motDePasse);
    }

    public void ajouterRendezVous(RendezVous r) {
        rendezVousList.add(r);
        System.out.println("Rendez-vous ajouté pour " + nom);
    }

    public void ajouterAnalyse(Analyse a) {
        analyses.add(a);
        System.out.println("Analyse ajoutée pour " + nom);
    }

    public void afficherInfos() {
        System.out.println("Patient: " + nom);
        System.out.println("Nombre RDV: " + rendezVousList.size());
        System.out.println("Nombre analyses: " + analyses.size());
    }
}