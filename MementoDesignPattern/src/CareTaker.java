import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {

    Stack<Memento> history = new Stack<>();

    public void addHistory(Memento memento) {
        history.add(memento);
    }

    public Memento undo() {
        history.pop();
        Memento memento = history.peek();
        return memento;
    }

}
