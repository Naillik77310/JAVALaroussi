public class Traitement {
    public static void main(String[] args) {
        Produit p1 = new Produit(1,"toto",55,12.2f,10);
        p1.moinsQuantite(20);
        p1.plusQuantite(10);
        System.out.println(p1);
        System.out.println(p1.estimation());
        System.out.println(p1.alerte());
        System.out.println(p1.validation(40));

    }
}
