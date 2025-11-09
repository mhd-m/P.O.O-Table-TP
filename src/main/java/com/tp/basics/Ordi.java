package com.tp.basics;

public class Ordi {

    public String marque,model,processeur;
    int ram,stockage;
    public Ordi(String marque, String model, String processeur, int ram, int stockage) {
        this.marque = marque;
        this.model = model;
        this.processeur = processeur;
        this.ram = ram;
    }
    public void afficheinfo(){
        System.out.println("marque:"+marque);
        System.out.println("model:"+model);
        System.out.println("processeur:"+processeur);
        System.out.println("ram:"+ram);
        System.out.println("stockage:"+stockage);
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStockage() {
        return stockage;
    }

    public void setStockage(int stockage) {
        this.stockage = stockage;
    }
}
