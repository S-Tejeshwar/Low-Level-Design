public class Memento {

    State state;
    public Memento(State state) {
        this.state = state;
    }

    State getState() {
        return state;
    }
}
