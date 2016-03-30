import java.util.EmptyStackException;
import java.util.Queue;

/**
 * Created by Magdalena Polak on 22.03.2016.
 */
public class DynamicTableStack
{
        public Object [] stack = new Object[0];
        public int MAX_SIZE;
        public int size = 0;
        public DynamicTableStack(int MAX_SIZE)
        {
                assert MAX_SIZE > 0 : "The size has to be greater than 0";
                this.MAX_SIZE = MAX_SIZE;
                stack = new Object[MAX_SIZE];
        }
        public void push(Object value)
        {

                System.out.println("dlugos" + stack.length);
              if(MAX_SIZE*3/4<size)
              {
                      Object extendedStack [] = new Object[stack.length*2];
                      for(int i = 0; i< stack.length; i++)
                      {
                            extendedStack[i] = stack[i];
                      }
                      stack = extendedStack;
                      MAX_SIZE=MAX_SIZE*2;
              }
                else if(MAX_SIZE*2/10>size)
              {
                      Object minishedStack [] = new Object[stack.length/2];
                      for(int i = 0; i< minishedStack.length; i++)
                      {
                              minishedStack[i] = stack[i];
                      }
                      stack = minishedStack;
                      MAX_SIZE=MAX_SIZE/2;
              }
                size++;
                for(int i = 0; i< stack.length; i++)
                {
                       if(stack[i]==null)
                       {
                               stack[i] = value;
                            //   System.out.println(stack[i] + " " + value);
                               break;
                       }
                }

        }
        public Object pop()
        {
                Object o;
                assert stack.length == 0 : "Empty stack";
                for (int i = 0; i<stack.length; i++)
                {
                        if(stack[i] == null) {
                                o = stack[i - 1] ;
                                stack[i - 1] = null;
                                return o;


                        }

                }
               return -1;

        }
        public Object peek() throws EmptyStackException {
                Object result = pop();
                push(result);
                return result;
        }
        public void clear()
        {
                stack = new Object[MAX_SIZE];
        }
        public int size()
        {
                return stack.length;
        }
        public boolean isEmpty()
        {
                for (Object aStack : stack) {
                        if(aStack == null)
                                return true;
                }
                return false;
        }
        public void printStack()
        {
                for (Object aStack : stack) {
                        System.out.println(aStack);
                }
        }
        public void printStackClear()
        {
                for (Object aStack : stack) {
                        if(aStack != null)
                        System.out.println(aStack);
                }
        }
}







/*

        Ale robiliœmy stos
        Jeden na liœcie jednokierunkowej a drugi na tablicy
        I ten na tablicy mia³ byæ "dynamiczny"
        czyli ze co? Emotikon unsure
        wyt³umaczy³ wam chociaz czy sami mieliscie sie domyslic?

        Czyli jak tablica sie zapelnila do 75% to powiêkszy³a rozmiar dwukrotnie a tak naprawdê to nie ona a tworzy³o sie druga wiêksza i przypisywalo referencje do niej tej pierwszej tablicy
        Jak bylo mniej ni¿ 25% elementów to zmniejszaj¹ siê dwukrotnie
        I tu te¿ analogicznie z ta referencje
        Referencja8
        ahaaa, spoko, moze cos pokminie teraz

        A z ta lista nie wiem jak bylo bo w sumie czyta³em jak uratowaæ uk³ad ch³odzenia w laptopie i na koniec tylko to z tablica zrobi³em xD
        Ale jak dobrze pamiêtam to tam ma byæ bezpoœredni¹ implementacja stosu nieograniczonego tak jak Rataj na wyk³adzie cos mówi³ ponoæ

        */