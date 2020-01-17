import java.util.*;

public class CollectionInJava {


    public static void main(String[]args){
 //       arrayList();//
  //      linkedList();
//        vector();
//        stack();
//        priorityQueue();
//        arrayDequeue();
//        treeMap();
  //      treeSet();
//        sortedMap();
 //       hashMap();
        hashSet();
//        hashTable();
//        linkedHashMap();
//        linkedHashSet();
//        systemProperties();
    }

    public static void arrayList(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("ArrayList------------------------");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void linkedList(){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        System.out.println("LinkedList------------------------");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void vector(){
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        System.out.println("Vector------------------------");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void stack(){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        System.out.println("stack------------------------");
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void priorityQueue(){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("Priority Queue------------------------");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void arrayDequeue(){
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
//Traversing elements
        System.out.println("ArrayDequeue------------------------");
        for (String str : deque) {
            System.out.println(str);
        }
    }

    public static void hashSet(){
        HashSet<String> set=new HashSet<String>();
        set.add("Ajay");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        System.out.println("HashSet------------------------");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void linkedHashSet(){
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        System.out.println("LinkedHashSet------------------------");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void treeSet(){
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//traversing elements
        System.out.println("TreeSet------------------------");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void hashMap(){
        Map map=new HashMap();
        Map map2 = new TreeMap();
        map2.put(1,"Ashish");
        map2.put(3,"Ankur");
        map2.put(4, "Rahul");



        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        //Traversing Map
        System.out.println("HashMap------------------------");
         map.putAll(map2);

        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void linkedHashMap(){
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        System.out.println("LinkedHAshMap------------------------");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static void treeMap(){
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("TreeMap------------------------");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static void sortedMap(){
        SortedMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("SortedMap------------------------");
        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: "+map.headMap(102));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(102));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map.subMap(100, 102));
    }

    public static void hashTable(){
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();

        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");
        System.out.println("HashTable------------------------");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static void systemProperties(){
        Properties p=System.getProperties();
        Set set=p.entrySet();
        System.out.println("SystemProperties------------------------");

        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }

}
