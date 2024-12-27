/**
 * Anawat Jandee
 * 672115049
 */

 import java.io.*;
 import java.util.*;
 
 class Student {
     private String SID;
     private String firstName;
     private String lastName;
 
     public Student(String SID, String firstName, String lastName) {
         this.SID = SID;
         this.firstName = firstName;
         this.lastName = lastName;
     }
 
     @Override
     public String toString() {
         return this.SID + ", " + this.firstName + " " + this.lastName;
     }
 
     public String getFirstName() {
         return firstName;
     }
 }
 







 public class Data {
     public static void main(String[] args) throws FileNotFoundException {
         File f = new File("student.csv"); // Replace with the actual path to your CSV file
         Scanner in = new Scanner(f);
 
         // Skip unnecessary lines
         for (int i = 0; i < 7; i++) {
             in.nextLine();
         }
 
         
         Vector<Student> students = new Vector<>();
 
         
         while (in.hasNextLine()) {
             String dataLine = in.nextLine();
             StringTokenizer tokenizer = new StringTokenizer(dataLine.trim(), ",");
             tokenizer.nextToken(); 
             students.addElement(new Student(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken()));
         }
 
         
         displayResults(students);
     }
 






     
     public static void displayResults(Vector<Student> students) {
         System.out.println("Total students: " + students.size());
 
         
         Map<Character, List<Student>> groupedStudents = new TreeMap<>();
         for (char ch = 'A'; ch <= 'Z'; ch++) {
             groupedStudents.put(ch, new ArrayList<>());
         }
         for (Student student : students) {
             char initial = Character.toUpperCase(student.getFirstName().charAt(0));
             groupedStudents.get(initial).add(student);
         }
 
         
         for (char ch = 'A'; ch <= 'Z'; ch++) {
             List<Student> studentList = groupedStudents.get(ch);
             System.out.println(ch + ": " + studentList.size());
             for (Student student : studentList) {
                 System.out.println(student);
             }
             if (!studentList.isEmpty()) {
                 System.out.println("...");
             }
         }
 
         System.out.println("Program terminate properly.");
     }
 }
 