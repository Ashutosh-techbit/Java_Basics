import java.util.*;

// public class hello {
//     public static void main(String[] args){

//     //     List<Integer> list=new ArrayList<Integer>();
//         List<Integer> list2= new LinkedList<>();

    
        // list.add(12);
    //     list.add(13);
    //     list.add(52);
    //     list.add(89);
    //     list.add(34);
    //     list.add(53);
    //     list.add(76);

    //     list2.add(12);
    //     list2.add(45);
    //     list2.add(56);
    //     list2.add(79);


    //     System.out.println(list);

    //     System.out.println(list.size());

    //     System.out.println(list.contains(13));

    //     list.remove(2);
    //     list.remove(Integer.valueOf(13));
    //     System.out.println(list);

    //     list.addAll(list2);
    //     System.out.println(list);

    //     //    list.removeAll(list2);
    //     //    System.out.println(list);

    //     // list.retainAll(list2);

    //     // list.clear();
 
    //     System.out.println(list);

    //     // Object A[]= list.toArray();
    //     // for(Object e: A){
    //     //     Integer temp=(Integer) e;
    //     //     System.out.println(e);


    //     list.forEach(n->System.out.println(n));
    //     }       
    // }











//===================================================================================

// public class hello{
//     public static void main(String[] args){
//            List<Integer> list= new ArrayList<>();
//            list.add(12);
//            list.add(30);
//            list.add(34);
//            list.add(78);
//            list.add(56);
//            list.add(390);
//            list.add(63);
   
//            System.out.println(list);

//            System.out.println(list.get(1));

//            System.out.println(list.set(3,69));

//            list.add(3,99);
//            System.out.println(list);
          
        
//         for(int i=0;i<list.size();i++){
//                  System.out.println("number"+ list.get(i));
//            }

//            for(Integer i:list){
//             System.out.println("foreach"+i);
//            }
 
//            Iterator<Integer> i=list.iterator();
//            while(i.hasNext()){
//             System.out.println("iterator"+i.next());
//            }
            
        //    List<Integer> i=list.sublist(1,4);

//      }
// }



// public class hello{
//     public static void main(String[] args){
//         // Queue<Integer> q=new LinkedList<>();
//         Queue<Integer> q=new PriorityQueue<>();
//         q.offer(12);
//         q.offer(34);
//         q.offer(90);
//         q.offer(38);
//         q.offer(99);

//         System.out.println(q);
//         System.out.println(q.poll());
//         System.out.println(q);
        
//         System.out.println(q.peek());
//         System.out.println(q);

//         while(!q.isEmpty()){
//              System.out.println(q.poll());
//         }

//         System.out.println(q);


//     }
// }



// public class hello{
//     public static void main(String[] args){
//         ArrayDeque<Integer> dq=new ArrayDeque<>();

//         dq.offer(12);
//         dq.offerFirst(13);
//         dq.offerLast(14);
//         dq.offerLast(17);
//         dq.offerLast(20);

//         System.out.println(dq.poll());

//         System.out.println(dq.pollLast());

//         System.out.println(dq.peek());
//         System.out.println(dq.peekLast());
//         // 
//         System.out.println(dq);




//     }
// }




// public class hello{
//        public static void main(String[] args){

//         Queue<Integer> pq= new PriorityQueue<>();

//         pq.offer(122);
//         pq.offer(78);
//         pq.offer(34);
//         pq.offer(70);
//         pq.offer(67);

//         System.out.println(pq.poll());

//         System.out.println(pq);
//        }
// }



// public class hello{
//     public static void main(String[] args){

//       Set<Integer> s=new HashSet<>();
//       s.add(12);
//       s.add(12);
//       s.add(15);
//       s.add(30);
//       s.add(90);

//       s.remove(15);
//       System.out.println(s);
//     }
// }

// public class hello{
//     public static void main(String[] args){

//       Set<Integer> s=new LinkedHashSet<>();
//       s.add(12);
//       s.add(12);
//       s.add(15);
//       s.add(30);
//       s.add(90);

//       s.remove(15);
//       System.out.println(s);
//     }
// }



// Methods available in sorted interface

// public class hello{
//     public static void main(String[] args){

//     SortedSet<Integer> s=new TreeSet<>();
//       s.add(100);
//       s.add(12);
//       s.add(12);
//       s.add(15);
//       s.add(30);
//       s.add(90);

//       System.out.println(s);
//       System.out.println(s.first());

//       System.out.println(s.headSet(30));

//       System.out.println(s.last());

//       System.out.println(s.tailSet(15));

//       System.out.println(s.subSet(15, 95));

//       s.remove(15);
//       System.out.println(s);
//     }
// }






//                          MAP 

// public class hello{
//     public static void main(String[] args){
//         SortedMap<Integer,String> mp=new TreeMap<>();


//         mp.put(12,"divyansh");
//         mp.put(2,"ashish");
//         // mp.putIfAbsent(2,"amit");
//         mp.put(3,"telusko");

//         // mp.remove(2);
//         System.out.println(mp.containsKey(3));

//         System.out.println(mp.get(1));
//         // System.out.println(mp.set(1));
//         System.out.println(mp.getOrDefault(4, "shit"));

//         System.out.println(mp);

//     }
// }




//comparable interface 


// public class hello{
//     public static void main(String[] args){

//         Comparator<Integer> com= new Comparator<Integer>() {
//             public int compare(Integer i,Integer j){
//                 if(i%10 >j%10)
//                        return 1;
//                 else
//                 return -1;

//             }
//         };
//         List<Integer> l1 = new ArrayList<>();
//         l1.add(10);
//         l1.add(23);
//         l1.add(42);
//         l1.add(11);



//          Collections.sort(l1,com);

//         System.out.println(l1);

//     }
// }




class student implements Comparable<student> {
    int age;
    String name;

    public student(int age, String name){
        this.age=age;
        this.name=name;
    }
    // public String toString(){
    //     return "student [age="+age + "name=" +name +"]";
    // }

    public int toCompare(student that){
        if(this.age>that.age)
             return 1;
        else
            return -1;
    }
    @Override
    public int compareTo(student o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}

public class hello{
    public static void main(String[] args){

        Comparator<student> com= new Comparator<student>(){
              public int compare(student i,student j){
                if(i.age>j.age)
                    return 1;
                else
                    return -1;    
              }
        };

        List<student> stud= new ArrayList<>();

        stud.add(new student(12,"divyansh"));
        stud.add(new student(8,"ravi"));
        stud.add(new student(6,"ravikant"));
        stud.add(new student(18,"alex"));

        Collections.sort(stud);
        
        for(student i:stud)
             System.out.println(i);
    }
}