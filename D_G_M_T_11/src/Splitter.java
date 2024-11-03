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

public class Splitter {
    

    
    
    public List<Integer> getEvenNumbers(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

  
    
    
    
    public List<Integer> getOddNumbers(List<Integer> list) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
