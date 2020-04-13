package Q2;

public interface simpleLog<T> {

    //insert item
    void insert(T t);
    //check if full
    boolean isFull();
    //get log's size
    int size();
    //check item's existence
    boolean search(T t);
    //delete log
    void clear();
    //display item
    String toString();

}
