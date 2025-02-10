import java.util.*;



public class Collection_frameworl {
    public static void main(String[] args) {
        // ArrayList<String> studentname = new ArrayList<>();
        // studentname.add("ashu"); 

        List<Integer> List = new ArrayList<>();

        
        List.add(2);
        List.add(4); 
        List.add(24); 
        List.add(22);
        List.add(1,42);
   
        // accessing index
        for(int i=0; i<List.size();i++){
            System.out.println("the list element is " + List.get(i));
        }

        // value access
        for(Integer li:List){
            System.out.println("foeach element " + li);
        }

        Iterator<Integer> it = List.iterator();
        while(it.hasNext()){
            System.out.println("iterartor " + it.next());
        }


        // List.remove(1);
        // List.remove(Integer.valueOf(4));

        // List.set(2,442);

        // System.out.println(List.contains(24));

        // List.clear();
        System.out.println(List);


    }
}  
