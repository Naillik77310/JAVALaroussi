import java.util.ArrayList;

public class Traitement {
    public static void main(String[] args) {
        Produit p1 = new Produit(1,"toto",55,12.2,10);
        p1.moinsQuantite(20);
        p1.plusQuantite(10);
        System.out.println(p1);
        System.out.println(p1.estimation());
        System.out.println(p1.alerte());
        System.out.println(p1.validation(40));
        Categorie p2 = new Categorie(2,"féculent");
        Categorie p3 = new Categorie(3,"Alcool");
        ArrayList<Produit> leProduit = new ArrayList<Produit>();
        leProduit.add(new Produit(2,"pate",200,1.1,50,p2));
        leProduit.add(new Produit(3,"vodka",20,20.5,5,p3));
        for(Produit produit : leProduit){
            System.out.println(produit);
        }



    }
}
