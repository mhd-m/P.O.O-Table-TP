package com.tp.basics;

public class Stock {

    private int nbordi = 0;
    private final int size;
    private final Ordi[] stock;

    // Constructor
    public Stock(int size) {
        this.size = size;
        this.stock = new Ordi[size];
    }

    // Add an Ordi
    public void addOrdi(Ordi ordi) {
        if (nbordi < size) {
            stock[nbordi] = ordi;
            nbordi++;
            System.out.println("Ordi ajouté avec succès !");
        } else {
            System.out.println("Pas de place disponible !");
        }
    }

    // Search for an Ordi
    public void rechercheOrdi(String modele, String marque) {
        boolean found = false;

        for (int i = 0; i < nbordi; i++) {
            if (stock[i] != null &&
                    (stock[i].getMarque().equals(marque)
                            || stock[i].getModel().equals(modele))) {

                System.out.println("Ordi est disponible !");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Ordi non trouvé !");
        }
    }


    public void suppOrdi(String modele, String marque) {
        for (int i = 0; i < nbordi; i++) {
            if (stock[i] != null &&
                    (stock[i].getMarque().equals(marque)
                            || stock[i].getModel().equals(modele))) {


                for (int j = i; j < nbordi - 1; j++) {
                    stock[j] = stock[j + 1];
                }
                stock[nbordi - 1] = null;
                nbordi--;
                System.out.println("Ordi supprimé !");
                return;
            }
        }
        System.out.println("Ordi non trouvé !");
    }

}
