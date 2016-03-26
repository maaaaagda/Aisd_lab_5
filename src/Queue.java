/**
 * Created by Magdalena Polak on 22.03.2016.
 */
public interface Queue {

    public void enqueue(Object value); //wstaw do kolejki

    public Object dequeue() throws NullPointerException; //pobierz z kolejki

    public void clear(); //usu� wszystkie elementy

    public int size();  //d�ugo�� kolejki

    public boolean isEmpty(); // true je�li kolejka jest pusta
}