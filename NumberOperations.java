import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
public class NumberOperations {
    public static void main(String[] args) {
        ArrayList <Number> list = new ArrayList<>();
        list.add(10); list.add(20.5); list.add(30); list.add(40.7); list.add(50); list.add(60.3); list.add(70); list.add(80.1); list.add(90); list.add(100.7);
        System.out.println("All numbers:"+list);
//Завдання 5,6
        System.out.println("5,6)__________________________________");
        String s_1 = ""; String s_2 = "";
        for(Number i : list){
            double n_2 = i.doubleValue();
            String res = String.format("%.2f", n_2);
            s_2 += res+"; ";
            n_2 = Math.ceil(n_2);
            int n_2_i = (int) (n_2);
            s_1 += n_2_i+ "; ";
        }
        System.out.println("Whole numbers: ["+ s_1+"]");
        System.out.println("Fractional numbers: ["+ s_2+"]");
//Завдання 7
        System.out.println("7)__________________________________");
        ArrayList <Integer> list_i = new ArrayList<>();
        ArrayList <Double> list_d = new ArrayList<>();
        for (Number number : list) {
            if (number instanceof Integer) {
                list_i.add((Integer) number);
            } else if (number instanceof Double) {
                list_d.add((Double) number);
            }
        }
        System.out.println("Whole numbers: " + list_i);
        System.out.println("Fractional numbers: " + list_d);
//Вибіркове завдання 5
        System.out.println("5)__________________________________");
        Number max = list.get(0); // Припускаємо, що перший елемент є максимальним
        for (Number num : list) {
            if (num.doubleValue() > max.doubleValue()) {
                max = num;
            }
        }
        System.out.println("The largest number in the list: " + max);
    }
}