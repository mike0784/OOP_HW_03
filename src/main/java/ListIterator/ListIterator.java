package ListIterator;

import linkedList.linkList;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {
    linkList <T> current;

    /*public iterable(linkList<T> list) {
        this.current = list.getNext();
    }*/

    public <T> ListIterator(linkList<T> list) {
        this.current = list.getNext();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.item;
        current = current.getNext();
        return data;
    }
}
