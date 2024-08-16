import java.util.Stack;

public class ACClient {
    InvokerInterface invokerInterface;
    Stack<InvokerInterface> history = new Stack<>();
    public ACClient(InvokerInterface invokerInterface) {
       this.invokerInterface = invokerInterface;
    }

    public void pressButton() {
        history.push(invokerInterface);
        invokerInterface.execute();
    }

    public void undo() {
        if (history != null) {
            InvokerInterface invokerInterface1 = history.pop();
            invokerInterface1.undo();
        }
    }
}
