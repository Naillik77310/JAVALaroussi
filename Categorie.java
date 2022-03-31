public class Categorie {
    //atributs
    private int codeCategorie;
    private String nom;

    //constructeur

    public Categorie(int codeCategorie, String nom) {
        this.codeCategorie = codeCategorie;
        this.nom = nom;
    }
    
    //getter

    public int getCodeCategorie() {
        return codeCategorie;
    }
    public String getNom() {
        return nom;
    }
}
