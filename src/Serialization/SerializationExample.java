package Serialization;


	import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;
	import java.io.IOException;

	public class SerializationExample {
	    public static void main(String[] args) {
	        Person person = new Person("John Doe", 30);
	        
	        try {
	            FileOutputStream fileOut = new FileOutputStream("D:\\person.txt");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(person);
	            out.close();
	            fileOut.close();
	            System.out.println("Serialized data is saved in person.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}