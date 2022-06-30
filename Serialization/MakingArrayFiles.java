package Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MakingArrayFiles {
    public static void main(String[] args) {


        //pierwszy sposob
      Person1[] tab=new Person1[3];

      tab[0]=new Person1(1,"Sue");
      tab[1]=new Person1(99,"Mike");
      tab[2]=new Person1(7,"Bob");

      //drugi sposob na arrayliscie
        ArrayList<Person1> peopleList=new ArrayList<Person1>(Arrays.asList(tab));


        try(FileOutputStream fs=new FileOutputStream("people.bin")){
            ObjectOutputStream os=new ObjectOutputStream(fs);

            os.writeObject(tab);
            os.writeObject(peopleList);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
