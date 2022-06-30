package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingFromFiles {
    public static void main(String[] args) {

        try(FileInputStream fi=new FileInputStream("people.bin")){

            ObjectInputStream os=new ObjectInputStream(fi);

            Person1 person2=(Person1)os.readObject();
            Person1 person3=(Person1)os.readObject();

            fi.close();
            System.out.println(person2);
            System.out.println(person3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
