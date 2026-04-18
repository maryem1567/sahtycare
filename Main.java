import java.lang.*;
   public static void main(String[] args) {

        Patient p1 = new Patient(1, "Ali", "ali@mail.com", "1234");
        Medecin m1 = new Medecin(2, "Ahmed", "ahmed@mail.com", "1234", "Cardio");

        p1.seConnecter();
        m1.seConnecter();

        RendezVous r1 = new RendezVous("20-04-2026", "10:00", p1, m1);
        Analyse a1 = new Analyse("Normal", "18-04-2026", p1);

        p1.ajouterRendezVous(r1);
        m1.ajouterRendezVous(r1);

        p1.ajouterAnalyse(a1);

        p1.afficherInfos();
        m1.afficherRendezVous();

        r1.afficher();
        a1.afficher();
    }
}