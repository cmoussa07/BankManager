public class Main {
    public static void main(String[] args) {

        CheckingAccount checking = new CheckingAccount();

        checking.account = "CC-001";
        checking.balance = 2000.00;
        checking.limit = 500.00;

        System.out.println("\n[Compte Courant]");
        System.out.println("Numéro : " + checking.account);
        System.out.println("Solde : " + checking.balance + " FCFA");
        System.out.println("Limite : " + checking.limit + " FCFA");

        SavingsAccount savings = new SavingsAccount();

        savings.account = "SA-001";
        savings.balance = 5000.00;
        savings.interestRate = 3.5;

        System.out.println("\n[Compte Épargne]");
        System.out.println("Numéro : " + savings.account);
        System.out.println("Solde : " + savings.balance + " FCFA");
        System.out.println("Taux : " + savings.interestRate + " %");

        COD cod = new COD();

        cod.account = "COD-001";
        cod.balance = 10000.00;
        cod.durationMonths = 12;

        System.out.println("\n[Certificat de Dépôt]");
        System.out.println("Numéro : " + cod.account);
        System.out.println("Solde : " + cod.balance + " FCFA");
        System.out.println("Durée : " + cod.durationMonths + " mois");
    }
}