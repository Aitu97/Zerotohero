package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {

    public static void main(String[] args) {

        String [] [] groupedNames= {{"Adilet", "Aimira", "Arslan", "Aitu", "Akylai"}, {"Nazire", "Yasemin", "Vitalii", "Nargiza", "Sasha"}};
        //Arrays.sort(groupedNames);
        //System.out.println((Arrays.toString(groupedNames[0][]));

        Scanner input=new Scanner(System.in);
        String name=input.next();

        for (int i=0; i<groupedNames.length; i++){
            for (int  a=0; a<groupedNames[i].length; a++){
                Arrays.sort(groupedNames[i]);
                if (groupedNames[i][a].equalsIgnoreCase(name)){
                    System.out.println(Arrays.deepToString(groupedNames));
                    System.out.println("in array  "+i+" in order "+a);

                }
            }
        }
    }
}
