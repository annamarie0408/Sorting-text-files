//Java program Chapter 20 Part 1 -- Anna Collins
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class acollins_Main {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            //This will try to read the file
            File fileInput = new File("src/words.txt");
            Scanner sc = new Scanner(fileInput);
            String token = "";
            ArrayList<String> temps = new ArrayList<String>();
            String temp;

            //Will read through the file and assign each line to the arraylist
            while (sc.hasNextLine()){
                token = sc.next();
                temps.add(token);

            }
            sc.close();
            String[] tempArray = temps.toArray(new String[0]);

            //Will read through the array list and sort as needed
           for (int i = 0; i < tempArray.length; i++){
               for (int x = i; x < tempArray.length; x++){
                   if (tempArray[i].compareTo(tempArray[x])>0){
                       temp = tempArray[i];
                       tempArray[i] = tempArray[x];
                       tempArray[x] = temp;

                   }
               }

           }
           //Displays the new assorted array
           System.out.println("Here are all the files sorted in Alphabetical order");
           for (int i =0; i < tempArray.length; i++){
               System.out.println(tempArray[i]);
           }
        }
        catch (FileNotFoundException e){
            System.out.println("Unable to locate the file" + e.toString());

        }
    }
}
