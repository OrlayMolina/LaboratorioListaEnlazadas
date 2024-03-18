package org.example.laboratorio.ejercicio1;

public class LinkedListSimple {

    private int size;
    private Nodo primero;


    public LinkedListSimple() {
        size = 0;
    }

    public void agregarPrimero(int dato) {
        Nodo newNodo = new Nodo(dato);
        if (isEmpty()) {
            primero = newNodo;
        } else {
            newNodo.setNext(primero);
            primero = newNodo;
        }
        size++;
    }


    private boolean isEmpty() {
        return size == 0;
    }
    public int size() {//metodo creado
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int get(int indice) {//metodo creado
        int dato=0;
        if(indice<0|| indice>size){
            throw  new IndexOutOfBoundsException("Indice NO VALIDO, DE ACUERDO A LIMITES ESTABLECIDOS");
        }
        Nodo auxiliar= primero;
        int indiceAuxiliar=0;


        //Ejemplo iterar con for
        for(int i=0; i<=indice;i++){
            if(indiceAuxiliar==indice){
                dato=auxiliar.getDato();
                return dato;
            }

        }
        // Ejemplo iteracion con while
        while(auxiliar!=null){
            if(indiceAuxiliar==indice){
                dato=auxiliar.getDato();
                return dato;
            }
            auxiliar=auxiliar.getNext();
            indiceAuxiliar++;
        }
        return dato;
    }
    public void datoPosicionesImpares(LinkedListSimple linkedListSimple) {
        for (int i = 0; i < linkedListSimple.size(); i++) {
            if (i % 2 != 0) {
                System.out.println("Número en la posición impar No." + i + "-->" + linkedListSimple.get(i));
            }
        }
    }


}