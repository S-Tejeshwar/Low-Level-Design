public class Orginator {

    public Memento getMemento() {
        return memento;
    }

    Memento memento;

    public Memento createMemento(State state) {
        return memento = new Memento(state);
    }

    public void restoreMomentum(Memento memento) {
        this.memento = memento;
    }


}
