package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadingFromArrayFiles {
    public static void main(String[] args) {

        try(FileInputStream fi=new FileInputStream("people.bin")){

            ObjectInputStream os=new ObjectInputStream(fi);

            //pierwszy sposob
            Person1[] tab1=(Person1[])os.readObject();
        //drugi sposob
            ArrayList<Person1>peopleList=new ArrayList<Person1>(Arrays.asList(tab1));


            for (Person1 person1:tab1){
                System.out.println(person1);
            }

            for (Person1 person1:peopleList){
                System.out.println(person1);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
