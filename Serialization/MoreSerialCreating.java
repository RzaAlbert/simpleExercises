package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MoreSerialCreating {
    public static void main(String[] args) {

        try(FileOutputStream fs=new FileOutputStream("people2.bin");ObjectOutputStream os=new ObjectOutputStream(fs);){
            Person1 person=new Person1(7,"Bob");
            System.out.println(person);
            os.writeObject(person);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
