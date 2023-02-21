package linkedList;

import iterable.ListIterator;

import java.util.Iterator;

public class linkList<T> implements Iterable<T> {
    public T item;
    linkList prev;

    public linkList next;
    int size = 0;
    public linkList  first = null;
    public linkList  last = null;

    public linkList(T item) {
        this.item = item;
    }

    public linkList() {

    }

    public void add(T value)
    {

        linkList node = new linkList(value);
        if(this.first == null)
        {
            this.first = node;
            this.last = node;
        }
        else
        {
            this.last.next = node;
            this.last = node;
        }
        this.size++;
    }

    public linkList getNext()
    {
        return this.next;
    }

    public linkList getFirst()
    {
        return this.first;
    }

    public int getSize()
    {
        return this.size;
    }

    public Boolean remove(T item)
    {
        linkList previos = null;
        linkList current = this.first;
        while(current != null)
        {
            if(current.item.equals(item))
            {
                if(previos != null)
                {
                    previos.next = current.next;
                    if(current.next != null) this.last = previos;
                }
                else
                {
                    this.last = this.last.next;
                    if(this.first == null) this.last = null;
                }
                this.size--;
                return true;
            }
            previos = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return String.format("Элемент: %s", this.item);
    }

    @Override
    public Iterator iterator() {
        return new ListIterator<T>(this);
    }
}
