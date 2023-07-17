import java.util.*;

class MyHashSet<K>{
    private static final Object OBJ = new Object();
    Map<K,Object> map = new HashMap<>();
    private Integer value;

    public boolean add(K value){
        return map.put(value,OBJ)==null;
    }

    public boolean remove(K value){
        return map.remove(value)!=null;
    }

    @Override
    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<K> iterator(){
        return map.keySet().iterator();
    }
    public void getKey(Integer index){
        ArrayList<K> list = new ArrayList<>();
        for (K key: map.keySet()){
            list.add(key);
        }
        if (index>=0 && index<list.size()) System.out.printf("Элемент с индексом %s: %s\n",index,list.get(index));
        else System.out.printf("Элемент с таким индексом(%s) отсутствует.",index);
    }

}
public class Work {
    public static void main(String[] args) {
        MyHashSet<Integer> myHashSet = new MyHashSet<>();

        System.out.println(myHashSet.add(55));
        System.out.println(myHashSet.add(79));
        System.out.println(myHashSet.add(574));
        System.out.println(myHashSet.add(79));
        System.out.println(myHashSet.add(55));
        System.out.println(myHashSet.add(8));
        System.out.println();
        System.out.println(myHashSet.toString());
        System.out.println(myHashSet.remove(8));
        System.out.println(myHashSet.remove(8));
        System.out.println(myHashSet.toString());
        System.out.println();
        Iterator<Integer> iter = myHashSet.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        //Get element by index
        System.out.println();
        System.out.println();
        myHashSet.getKey(0);
        myHashSet.getKey(1);
        myHashSet.getKey(2);
        myHashSet.getKey(4);

    }
}

