import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> san = new LinkedList<>(); // 1.LinkedList  тизменин  биринчи  элементин  алуу  үчүн  Java  программасы
        san.add(1);
        san.add(2);
        san.add(3);
        System.out.println("First elements: "+san.getFirst());

        LinkedList<Integer> san2 = new LinkedList<>(); // 2.LinkedList  тизменин  акыркы  элементин  алуу  үчүн  Java  программасы
        san2.add(7);
        san2.add(8);
        san2.add(9);
        System.out.println("Last elements: "+san2.getLast());

        LinkedList<String> name = new LinkedList<>(); // 3.LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасы
        name.add("Ronaldo");
        name.add("Messi");
        name.add("Benzema");

        if(name.contains(2)){
            System.out.println("2чи элемент шилтемеленген тизмеде бар.");
        } else {
            System.out.println("2чи элемент шилтемеленген тизмеде жок.");
        }

        LinkedList<String> animal = new LinkedList<>(); // 4.Эки LinkedList тизмесин салыштыруу үчүн Java программасы
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Mouse");

        LinkedList<String> animal2 = new LinkedList<>();
        animal2.add("Wolf");
        animal2.add("Lion");
        animal2.add("Bear");

        if(animal.equals(animal2)){
            System.out.println("Байланышкан тизмелердин экөө тең бирдей.");
        }else{
            System.out.println("Байланышкан тизмелердин экөө тең бирдей эмес.");
        }

        LinkedList<Integer> num = new LinkedList<>(); // 5.LinkedList тизме бош же жок экенин текшерүү үчүн Java программасы
        num.add(1);
        num.add(2);
        num.add(3);

        if (num.isEmpty()){
            System.out.println("Тизме бош");
        }else{
            System.out.println("Тизме бош емес!");
        }

        LinkedList<Integer> number = new LinkedList<>(); // 6.LinkedList тизмедеги элементти алмаштыруу үчүн Java программасы
        number.add(10);
        number.add(20);
        number.add(40);
        System.out.println("До елементы: "+number);
        number.set(2,30);
        System.out.println("После елементы: "+number);

        LinkedList<String> list = new LinkedList<>(); // 7.LinkedList  тизмени  массивдердин  тизмесине  которуу  үчүн  Java программасы
        list.add("Abdymomun");
        list.add("Matmusa");
        list.add("Baha");

        String [] array = list.toArray(new String[0]);
        System.out.println("Array: "+Arrays.toString(array));


 /*    1. LinkedList  тизменин  биринчи  элементин  алуу  үчүн  Java  программасын жазыңыз.
       2. LinkedList  тизменин  акыркы  элементин  алуу  үчүн  Java  программасын  жазыңыз.
       3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жазыңыз.
       4. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.
       5. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
       6. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.
       7. LinkedList  тизмени  массивдердин  тизмесине  которуу  үчүн  Java программасын жазыңыз*/

    }
}