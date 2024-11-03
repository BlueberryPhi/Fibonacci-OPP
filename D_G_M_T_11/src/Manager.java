/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {

    public void saveToFile(List<Integer> list, String fileName) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i) + "\n");
            }
            writer.close();  
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void ejecutar() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> fibonacciList = fibonacci.getFibonacciList();

        Splitter splitter = new Splitter();
        List<Integer> evenNumbers = splitter.getEvenNumbers(fibonacciList);
        List<Integer> oddNumbers = splitter.getOddNumbers(fibonacciList);

       
        saveToFile(fibonacciList, "fibonacci.txt");
        saveToFile(evenNumbers, "fibonacci_pares.txt");
        saveToFile(oddNumbers, "fibonacci_impares.txt");

        System.out.println("Archivos generados correctamente.");
    }
}
