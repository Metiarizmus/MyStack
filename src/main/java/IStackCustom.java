public interface IStackCustom<E> {

    E addInTop(E value);
    E deleteTop();
    E getTop();
    E getAndRemoveTop();
    boolean isEmpty();


}
