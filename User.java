import java.lang.*;

class User {
    protected int id;
    protected String nom;
    protected String email;
    protected String motDePasse;

    public User(int id, String nom, String email, String motDePasse) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public void seConnecter() {
        System.out.println(nom + " est connecté");
    }
}