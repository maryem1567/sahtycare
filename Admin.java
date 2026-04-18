import java.lang.*;

class Admin extends User {

    public Admin(int id, String nom, String email, String motDePasse) {
        super(id, nom, email, motDePasse);
    }

    public void gererUtilisateurs() {
        System.out.println(nom + " gère les utilisateurs");
    }
}