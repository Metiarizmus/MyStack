import java.util.Iterator;

public class StackCustom<E> implements IStackCustom, Iterable{
    private int size;
    private Object[] array;
    private int top;


    public StackCustom(int m) {
        this.size = m;
        array = new Object[size];
        top = -1;
    }


    @Override
    public E addInTop(Object value) {
        array[++top] = value;

        return (E) value;
    }

    @Override
    public E deleteTop() {
        return (E) array[top--];
    }

    @Override
    public E getTop() {
        return (E) array[top];
    }

    @Override
    public E getAndRemoveTop() {
        return (E) array[top--];
    }

    @Override
    public boolean isEmpty() {
        return (top==-1);
    }

    @Override
    public Iterator<E> iterator() {

        Iterator<E> it = new Iterator<>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && array[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E) array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        return it;
    }


}
