package Q2;

public class Tester {

    public static void main(String[] args){
        ArrayLog<Integer> a = new ArrayLog<>(10);
        a.insert(20);
        a.insert(15);
        a.insert(13);
        System.out.println("Log Size "+a.size());
        System.out.println(a.toString());

        int num = 12;
        if(a.search(num)){
            System.out.println("Log contains "+num);
        }
        else
            System.out.println("Log does not contains "+num);

        ArrayLog<String> b = new ArrayLog<>(5);
        b.insert("James");
        b.insert("Ahmad");
        b.insert("Siti");
        b.insert("Ramesh");
        b.insert("John");
        b.insert("Abdullah");
        System.out.println(b.toString());

        String name = "Siti";
        if(b.search(name)){
            System.out.println("Log contains " + name);
        }else
            System.out.println("Log does not contains " + name);
        b.clear();
        System.out.println("Log Size "+b.size());
    }


}
