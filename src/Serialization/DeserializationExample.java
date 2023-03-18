package Serialization;

	import java.io.FileInputStream;
	import java.io.ObjectInputStream;
	import java.io.IOException;
	import java.lang.ClassNotFoundException;

	public class DeserializationExample {
	    public static void main(String[] args) {
	        Person person = null;
	        
	        try {
	            FileInputStream fileIn = new FileInputStream("D:\\person.txt");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            person = (Person) in.readObject();
	            in.close();
	            fileIn.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        
	        System.out.println("Deserialized Person object:");
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }
	}

