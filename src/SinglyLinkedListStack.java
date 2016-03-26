import java.util.EmptyStackException;

/**
 * Created by Magdalena Polak on 22.03.2016.
 */
public class SinglyLinkedListStack
{
    private static class Element
    {
        private Element _next;
        private Object _value;
        public Element(Object value)
        {
            set_value(value);
        }
        public void set_value(Object value)
        {
            _value = value;

        }
        public Object get_value()
        {
            return _value;
        }
        public Element get_next()
        {
            return _next;
        }
        public Element set_next(Element next)
        {
            return _next = next;
        }
    }
    private int _size;
    private Element _first = new Element(null);

    public void push(Object value)
    {
        Element e = new Element(value);
        if(_first.get_value()== null)
        {
            _first = e;
            e._next = null;
            _size++;
        }
        else
        {
            Element f = _first;
            while (f.get_next() != null)
            {
                f = f.get_next();
            }
            ++_size;
            f.set_next(new Element(value));
        }
    }

    public Object pop() throws EmptyStackException
    {
        if(_first.get_value() == null)
        {
            throw new EmptyStackException();
        }
        else if(_first.get_next()== null)
        {
            --_size;
            return _first.get_value();

        }
        else
        {
            Element f = _first;
            while (f.get_next().get_next() != null)
            {
                f = f.get_next();

            }
            Element g = f.get_next();
             f.set_next(null);
            --_size;
            return g.get_value();
        }

    }
    public Object peek() throws EmptyStackException {
        Object result = pop();
        push(result);
        return result;
    }

    public void clear()
    {
        _size = 0;
        _first = new Element(null);
    }

    public int size()
    {
        return  _size;
    }

    public boolean isEmpty()
    {
        return false;
    }
    public void printList()
    {
        Element temp =_first;
        while (temp != null)
        {
            System.out.println(temp.get_value());
            temp = temp.get_next();
        }
        System.out.println(" ");
    }
}
