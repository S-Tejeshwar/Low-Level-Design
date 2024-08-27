public class Main {
    public static void main(String[] args) {

       CareTaker careTaker = new CareTaker();
       State state1 = new State();
       state1.setHeight(10);
       state1.setWeight(20);

       Orginator orginator = new Orginator();
       Memento memento1 = orginator.createMemento(state1);

       careTaker.addHistory(memento1);

       State state2 = new State();
       state2.setWeight(50);
       state2.setHeight(100);

       Memento memento2 = orginator.createMemento(state2);
       careTaker.addHistory(memento2);

       Memento undoMemento = careTaker.undo();

       orginator.restoreMomentum(undoMemento);
       System.out.println(orginator.getMemento().getState());

    }
}