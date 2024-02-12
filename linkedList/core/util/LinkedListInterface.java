package core.util;

public interface LinkedListInterface<T> {
    void addToBeginning(T data);
    void addToEnd(T data);
    int getSize();
    T getElement(int index);
}
