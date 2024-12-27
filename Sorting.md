import java.util.*;

import java.io.*;


class Text{
        private String id;
        private String first;
        private String last;

        public Text(String x,String y,String z){
            this.id = x;
            this.first = y;
            this.last = z;
        }

        public String get_id(){
            return id;
        }
        public String get_first(){
            return first.strip();
        }
        public String get_last(){
            return last;
        }

        @Override
        public String toString() {
            return id +" "+first+""+last;
        }
}



public class Sorting{
    public static void main(String arg[])throws FileNotFoundException{
        Scanner file = new Scanner(new File("student.csv"));
        Scanner input = new Scanner(System.in); 
        Vector<Text> vec = new Vector<>();
        
        for(int x = 0 ;x<7;x++){
            file.nextLine();
        }

        while (file.hasNextLine()){
            String read  = file.nextLine();
            StringTokenizer token = new StringTokenizer(read,",");
            token.nextToken();
            vec.addElement(new Text(token.nextToken(),token.nextToken(),token.nextToken()));
        }
        

        System.out.println("Choose -n for sort by ID ");
        System.out.println("Choose -f for sort by First name ");
        System.out.println("Choose -l for sort by Last name ");
        System.out.println("Choose -s for sort by Search Student ");


        System.out.print("Choose function: ");
        String mode = input.nextLine().toLowerCase();
        
        switch(mode){
            case "-n":
                sort_id(vec);
                break;
            case "-f":
                sort_first(vec);
                break;
            case "-l":
                sort_last(vec);
                break;
            case "-s":
                System.out.print("Enter name that want to search: ");
                String name = input.nextLine().toUpperCase();
                int index = find_index(vec, name);
                if (index != -1){
                    System.out.println("Find at index: "+index);
                }
                else{
                    System.out.println("Not found");
                }
                break;
            default: 
                System.out.println("Invalid option --> Please Enter -n, -f, -l, -s only"); 
                break;
        }
    }

    static void sort_first(Vector<Text> vec){
        Text keep;
        for(int i = 0 ; i<vec.size()-1;i++){
            for(int j = 0;j<vec.size()-1;j++){
                if(vec.get(j).get_first().compareTo(vec.get(j+1).get_first()) > 0){
                    keep = vec.get(j);
                    vec.set(j,vec.get(j+1));
                    vec.set(j+1,keep);
                }
                
            }
           
           
        } 
        for(int i = 0;i<vec.size();i++){
            System.out.println(vec.get(i));
        }
       

          
    }

    static void sort_last(Vector<Text> vec){
        Text keep;
        for(int i = 0 ; i<vec.size()-1;i++){
            for(int j = 0;j<vec.size()-1;j++){
                if(vec.get(j).get_last().compareTo(vec.get(j+1).get_last()) > 0){
                    keep = vec.get(j);
                    vec.set(j,vec.get(j+1));
                    vec.set(j+1,keep);
                }
                
            }
           
           
        } 
        for(int i = 0;i<vec.size();i++){
            System.out.println(vec.get(i));
        }
    }

    static void sort_id(Vector<Text> vec){
        Text keep;
        for(int i = 0 ; i<vec.size()-1;i++){
            for(int j = 0;j<vec.size()-1;j++){
                if(vec.get(j).get_id().compareTo(vec.get(j+1).get_id()) > 0){
                    keep = vec.get(j);
                    vec.set(j,vec.get(j+1));
                    vec.set(j+1,keep);
                }
                
            }
           
        } 
        for(int i = 0;i<vec.size();i++){
            System.out.println(vec.get(i));
        }
    }
    static int find_index(Vector<Text> vec,String name){
        for(int i = 0 ;i<vec.size();i++){
            if(name.equals(vec.get(i).get_first())){
                return i;
            }
        }
        return -1;     
        
    }


}

