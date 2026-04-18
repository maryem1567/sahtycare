import java.lang.*;
class RendezVous {

    private String date;
    private String heure;
    private Patient patient;
    private Medecin medecin;

    public RendezVous(String date, String heure, Patient patient, Medecin medecin) {
        this.date = date;
        this.heure = heure;
        this.patient = patient;
        this.medecin = medecin;
    }

    public void afficher() {
        System.out.println("RDV: " + date + " " + heure);
    }
}