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

Choose function -n
622115040 SUCHANUN SIRIJANYA
662115007 CHONCHANUN KHACHONPHURITHANAKUL
662115016 NATTHAPHUM CHAIKHAN
662115039 MANAPAT KAEWLAI
672115001 KATIKA KANTHASON
672115002 KRITTAMETH TANSUWAN
672115004 JITTIPAT KAEWIJIT
672115005 CHETSADA KANKARN
672115006 CHANLACHAT PANYOYAI
672115007 CHANCHAKORN JULLAPECH
672115008 CHANYA BUNRUEANG
672115009 CHIDNUCHA POBKEEREE
672115010 NATANON SOMBOON
672115011 NATTHAPOOM SAENGKAEW
672115012 NUT SUPAPORN
672115013 NATTHAN CHAMPATHIP
672115014 NATTIKORN SAE-SUE
672115015 NATTAPON SUKKEAW
672115016 NATTHAPAT JAGKHURUANG
672115018 DALANPHOP KEAWSIRIPONG
672115019 THINNAPOP SRISOMBOON
672115020 TECHIT WONGKITI
672115024 TAT PUTJORN
672115028 NINA BURGER
672115037 PHUTAWAN MUEANGMA
672115039 METAVEE AEINJANG
672115041 RAPHEEPHAT AEIPHINGCHAI
672115042 RANTICHA CHUMJAI
672115043 WASINPAT YANIN
672115044 VIDCHAYADA ABHICHARTTIBUTRA
672115045 VIRAWIT KONGTHONG
672115046 SATTAPORN KOWARAKUN
672115047 SAMAKOM MAKHIAO
672115048 SUKRITPONG WONGPANYA
672115049 ANAWAT JANDEE

Choose function -f
672115049 ANAWAT JANDEE
672115007 CHANCHAKORN JULLAPECH
672115006 CHANLACHAT PANYOYAI
672115008 CHANYA BUNRUEANG
672115005 CHETSADA KANKARN
672115009 CHIDNUCHA POBKEEREE
662115007 CHONCHANUN KHACHONPHURITHANAKUL
672115018 DALANPHOP KEAWSIRIPONG
672115004 JITTIPAT KAEWIJIT
672115001 KATIKA KANTHASON
672115002 KRITTAMETH TANSUWAN
662115039 MANAPAT KAEWLAI
672115039 METAVEE AEINJANG
672115010 NATANON SOMBOON
672115015 NATTAPON SUKKEAW
672115013 NATTHAN CHAMPATHIP
672115016 NATTHAPAT JAGKHURUANG
662115016 NATTHAPHUM CHAIKHAN
672115011 NATTHAPOOM SAENGKAEW
672115014 NATTIKORN SAE-SUE
672115028 NINA BURGER
672115012 NUT SUPAPORN
672115037 PHUTAWAN MUEANGMA
672115042 RANTICHA CHUMJAI
672115041 RAPHEEPHAT AEIPHINGCHAI
672115047 SAMAKOM MAKHIAO
672115046 SATTAPORN KOWARAKUN
622115040 SUCHANUN SIRIJANYA
672115048 SUKRITPONG WONGPANYA
672115024 TAT PUTJORN
672115020 TECHIT WONGKITI
672115019 THINNAPOP SRISOMBOON
672115044 VIDCHAYADA ABHICHARTTIBUTRA
672115045 VIRAWIT KONGTHONG
672115043 WASINPAT YANIN

Choose function -l
672115044 VIDCHAYADA ABHICHARTTIBUTRA
672115039 METAVEE AEINJANG
672115041 RAPHEEPHAT AEIPHINGCHAI
672115008 CHANYA BUNRUEANG
672115028 NINA BURGER
662115016 NATTHAPHUM CHAIKHAN
672115013 NATTHAN CHAMPATHIP
672115042 RANTICHA CHUMJAI
672115016 NATTHAPAT JAGKHURUANG
672115049 ANAWAT JANDEE
672115007 CHANCHAKORN JULLAPECH
672115004 JITTIPAT KAEWIJIT
662115039 MANAPAT KAEWLAI
672115005 CHETSADA KANKARN
672115001 KATIKA KANTHASON
672115018 DALANPHOP KEAWSIRIPONG
662115007 CHONCHANUN KHACHONPHURITHANAKUL
672115045 VIRAWIT KONGTHONG
672115046 SATTAPORN KOWARAKUN
672115047 SAMAKOM MAKHIAO
672115037 PHUTAWAN MUEANGMA
672115006 CHANLACHAT PANYOYAI
672115009 CHIDNUCHA POBKEEREE
672115024 TAT PUTJORN
672115014 NATTIKORN SAE-SUE
672115011 NATTHAPOOM SAENGKAEW
622115040 SUCHANUN SIRIJANYA
672115010 NATANON SOMBOON
672115019 THINNAPOP SRISOMBOON
672115015 NATTAPON SUKKEAW
672115012 NUT SUPAPORN
672115002 KRITTAMETH TANSUWAN
672115020 TECHIT WONGKITI
672115048 SUKRITPONG WONGPANYA
672115043 WASINPAT YANIN

Choose function: -s 
Enter name that want to search: ANAWAT
Find at index: 34
