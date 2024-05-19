package Collections.IteratorIterableImplementation;

import java.util.Iterator;

// We are creating our own List
public class OurGenericList<T> implements Iterable<T>{
    private T[] items;
    private int size;
    public OurGenericList(){
        size = 0;
        items = (T[])new Object[100];
    }

    public void add(T item){
        items[size++] = item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T>{
        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
