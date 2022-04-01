public class Produit {
    //attributs

    private int codeProduit;
    private String nom;
    private int qte;
    private double prixUnitaire;
    private int stockSecu;
    private Categorie categorie;

    @Override
    public String toString() {
        return "Produit{" +
                "codeProduit=" + codeProduit +
                ", nom='" + nom + '\'' +
                ", qte=" + qte +
                ", prixUnitaire=" + prixUnitaire +
                ", stockSecu=" + stockSecu +
                ", categorie=" + categorie +
                '}';
    }

//constructeur

    public Produit(int codeProduit, String nom, int qte, double prixUnitaire, int stockSecu) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.qte = qte;
        this.prixUnitaire = prixUnitaire;
        this.stockSecu = stockSecu;
    }

    public Produit(int codeProduit, String nom, int qte, double prixUnitaire, int stockSecu, Categorie categorie) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.qte = qte;
        this.prixUnitaire = prixUnitaire;
        this.stockSecu = stockSecu;
        this.categorie = categorie;
    }
    //getters

    public int getCodeProduit() {
        return codeProduit;
    }

    public String getNom() {
        return nom;
    }
    //setters

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public void setStockSecu(int stockSecu) {
        this.stockSecu = stockSecu;
    }

    //méthode

    public void plusQuantite(int quantite) {

        this.qte += quantite;
    }
    public void moinsQuantite(int quantite) {

        this.qte -= quantite;
    }
    public double estimation(){
        double prixTotal = 0;
        prixTotal = this.prixUnitaire * this.qte;
        return prixTotal;
    }
    public String alerte(){
        String message ="";
        if(this.qte <= this.stockSecu){
            message="Stock dangereux";
        }
        else{
            message="Stock bon";
        }
        return message;
    }
    public boolean validation(int quantiteCommande){
        if (this.qte - quantiteCommande > this.stockSecu){
            return true;
        }
        else{
            return false;
        }
    }




}
