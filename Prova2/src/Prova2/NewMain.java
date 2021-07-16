/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova2;

/**
 *
 * @author Tony
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura lista[] = {new Quadrado(5), new Retangulo(10, 5), new Triangulo(2, 3, 5)};
                for(int i = 0; i < 3; i++){
                    lista[i].imprimirArea();
                    lista[i].imprimirPerimetro();        
                }
    }

    private static interface Figura {

        public void imprimirArea();

        public void imprimirPerimetro();
        
        public int calculaArea();
        
        public int calculaPerimetro();

    }

    private static class Retangulo implements Figura {
        
        int lado1;
        int lado2;

        public Retangulo(int lado1, int lado2) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        }
        
        

        public int getLado1() {
            return lado1;
        }

        public void setLado1(int lado1) {
            this.lado1 = lado1;
        }

        public int getLado2() {
            return lado2;
        }

        public void setLado2(int lado2) {
            this.lado2 = lado2;
        }

        @Override
        public void imprimirArea() {
            System.out.println(calculaArea());
        }

        @Override
        public void imprimirPerimetro() {
            System.out.println(calculaPerimetro());
        }

        @Override
        public int calculaArea() {
            int retArea;
            retArea = lado1 * lado2;
            return retArea;
        }

        @Override
        public int calculaPerimetro() {
            int retPer;
            retPer = 2*lado1 + 2*lado2;
            return retPer;
        }
    }

    private static class Triangulo implements Figura {

        int lado1;
        int lado2;
        int lado3;

        public Triangulo(int lado1, int lado2, int lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
        
        

        public int getLado1() {
            return lado1;
        }

        public void setLado1(int lado1) {
            this.lado1 = lado1;
        }

        public int getLado2() {
            return lado2;
        }

        public void setLado2(int lado2) {
            this.lado2 = lado2;
        }

        public int getLado3() {
            return lado3;
        }

        public void setLado3(int lado3) {
            this.lado3 = lado3;
        }
        
        

        @Override
        public void imprimirArea() {
            System.out.println(calculaArea());
        }

        @Override
        public void imprimirPerimetro() {
            System.out.println(calculaPerimetro());
        }

        @Override
        public int calculaArea() {
            int triArea;
            triArea = lado1 * lado2 * lado3;
            return triArea;
        }

        @Override
        public int calculaPerimetro() {
            int triPer;
            triPer = lado1 + lado2 + lado3;
            return triPer;
        }
    }

    private static class Quadrado implements Figura {

        int lado;

        public Quadrado(int lado) {
            this.lado = lado;
        }

        public int getLado() {
            return lado;
        }

        public void setLado(int lado) {
            this.lado = lado;
        }
        
        

        @Override
        public void imprimirArea() {
            System.out.println(calculaArea());
        }

        @Override
        public void imprimirPerimetro() {
            System.out.println(calculaPerimetro());
        }

        @Override
        public int calculaArea() {
            
            int quadArea;
            quadArea = lado * lado;
            return quadArea;
        }

        @Override
        public int calculaPerimetro() {
            int quadPer;
            quadPer = 4*lado;
            return quadPer;
        }
    }
}