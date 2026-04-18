import java.lang.*;
class Analyse {

    private String resultat;
    private String date;
    private Patient patient;

    public Analyse(String resultat, String date, Patient patient) {
        this.resultat = resultat;
        this.date = date;
        this.patient = patient;
    }

    public void afficher() {
        System.out.println("Analyse: " + resultat + " (" + date + ")");
    }
}