/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private List<Integer> fibonacciList;

    public Fibonacci() {
        fibonacciList = new ArrayList<>();
        generateFibonacci();
    }

   
    private void generateFibonacci() {
        int e1 = 0;
        int e2 = 1;
        int suma;

        fibonacciList.add(e1);
        fibonacciList.add(e2);

        do {
            suma = e1 + e2;
            if (suma > 1000000) break;
            fibonacciList.add(suma);
            e1 = e2;
            e2 = suma;
        } while (suma <= 1000000);
    }


    public List<Integer> getFibonacciList() {
        return fibonacciList;
    }
}
