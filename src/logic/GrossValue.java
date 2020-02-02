package logic;

import data.Product;

class GrossValue {
    public static void main(String[] args) {
        Product microwave = new Product("Mikrofalówka", "Podgrzewa jedzenie", 180, "AGD");
        Product watch = new Product("Zegarek", "Odmierza czas", 1050, "Akcesoria");
        double accesoryVAT = 0.23;
        double agdVAT = 0.21;

        switch (microwave.getCategory()) {
            case "AGD":
                System.out.println("Cena mikrofalówki z uwzględnieniem podatku VAT (21%): " + (microwave.getPrice() * agdVAT + microwave.getPrice()));
                break;
            case "Akcesoria":
                System.out.println(microwave.getName() + "nie należy do kategorii " + microwave.getCategory());
                break;
        }
        switch (watch.getCategory()) {
            case "Akcesoria":
                System.out.println("Cena zegarka z uwzględnieniem podatku VAT (23%): " + (watch.getPrice() * accesoryVAT + watch.getPrice()));
                break;
            case "AGD":
                System.out.println(watch.getName() + " nie należy do kategorii " + watch.getCategory());
                break;
        }
    }

}


