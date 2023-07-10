import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");


//        1. Add "Coll" to the end of the list
//        2. Add "Tiree" to the start of the list
//        3. Add "Islay" after "Jura" and before "Mull"
//        4. Print out the index position of "Skye"
//        5. Remove "Tresco" from the list by name
//        6. Remove "Arran" from the list by index
//        7. Print the number of islands in your arraylist
//        8. Sort the list alphabetically
//        9. Print out all the islands using a for loop
        scottishIslands.add("Coll");
        scottishIslands.add(0,"Tiree");
        scottishIslands.add(scottishIslands.indexOf("Mull"),"Islay" );

        System.out.println("Index position of Skye is "+scottishIslands.indexOf("Skye"));

        scottishIslands.remove("Tresco");
        scottishIslands.remove(scottishIslands.indexOf("Arran"));

        System.out.println("Number of Islands is "+scottishIslands.size());

        Collections.sort(scottishIslands);

        for (String  scottishIsland : scottishIslands){
            System.out.println(scottishIsland);
        }
        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
//        2. Print the difference between the largest and smallest value
//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println("List of even numbers is: "+ evenNumbers);

        System.out.println("Range of numbers is "+(Collections.max(numbers)-Collections.min(numbers)));

        int sumOfNumbers = 0;

        for (int number : numbers){
            if (number == 1){
                if (numbers.indexOf(number) == 0){
                    if (numbers.get(numbers.indexOf(number) +1 ) == 1){
                        System.out.println("true");
                        break;
                    }
                } else if (numbers.indexOf(number) == numbers.size()-1){
                    if (numbers.get(numbers.indexOf(number) -1 ) == 1){
                        System.out.println("true");
                        break;
                    }
                } else {
                    if (numbers.get(numbers.indexOf(number) +1 ) == 1 || numbers.get(numbers.indexOf(number) -1 ) == 1){
                        System.out.println("true");
                        break;
                    }
                }
            }
        }
        for (int number : numbers){
            sumOfNumbers += number;
        }
        System.out.println("Sum of numbers is "+ sumOfNumbers);
        int sumOfNumberWithBias = 0;
        for (int number : numbers){
            if (number == 13){
                break;
            }
            sumOfNumberWithBias += number;
        }
        System.out.println("Sum of numbers without number 13 and after is "+sumOfNumberWithBias);

    }

}
