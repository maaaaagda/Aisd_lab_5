/**
 * Created by Magdalena Polak on 22.03.2016.
 */
public interface Queue {

    public void enqueue(Object value); //wstaw do kolejki

    public Object dequeue() throws NullPointerException; //pobierz z kolejki

    public void clear(); //usuñ wszystkie elementy

    public int size();  //d³ugoœæ kolejki

    public boolean isEmpty(); // true jeœli kolejka jest pusta
}