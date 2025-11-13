package day8;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        //english to spanish dictionary
         Map<String,String> englSpanDictionary = new HashMap<String,String>();
        // Putting things inside our dictionary
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sábado");
        englSpanDictionary.put("Sunday", "Domingo");
         // Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.keySet());
        System.out.println(englSpanDictionary.values());
        System.out.println("size:"+englSpanDictionary.size());

         System.out.println();
        System.out.println();
        
        // Shopping List
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        // Put some stuff in dictionary
        shoppingList.put("ham", false);
        shoppingList.put("sandwich", Boolean.TRUE);
        shoppingList.put("ice cream", Boolean.TRUE);
        shoppingList.put("eggs", Boolean.FALSE);
        shoppingList.put("sugar", false);

         System.out.println(shoppingList.get("ham"));
        System.out.println(shoppingList.get("ice cream"));

         System.out.println(shoppingList.toString());

         System.out.println(shoppingList.isEmpty());

         shoppingList.remove("eggs");

         shoppingList.replace("sandwich", Boolean.FALSE);

        System.out.println(shoppingList.toString());




         shoppingList.clear();
         System.out.println(shoppingList.toString());
         System.out.println(shoppingList.isEmpty());
    }
}