package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MoreSerialReading {
    public static void main(String[] args) {

        try(FileInputStream fi=new FileInputStream("people2.bin"); ObjectInputStream os=new ObjectInputStream(fi);){


            Person1 person=(Person1)os.readObject();

            System.out.println(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
