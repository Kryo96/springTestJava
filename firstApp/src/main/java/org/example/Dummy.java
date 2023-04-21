package org.example;

public class Dummy {

    private int age;
    private Creatore creatore;

    public Dummy(int a){
        this.age = a;
    }

    public void sayhi(){

        System.out.println("hi");
        creatore.creaDummy();
    }

    // per far in modo che funzioni il set"alias", alias deve avere lo stesso nome definito nel xml per l'injection dei setter
    public void setAge(int a){
        System.out.println("assigned");
        this.age = a;
    }

    public int getAge(){
        return this.age;
    }

    public Creatore getCreatore() {
        return creatore;
    }

    public void setCreatore(Creatore creatore) {
        this.creatore = creatore;
    }
}
