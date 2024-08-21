
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    Inventory inventory;

    public List<Coin> getCoinList() {
        return coins;
    }

    public void setCoinList(List<Coin> coins) {
        this.coins = coins;
    }

    public State getVendingMachineState() {
        return vendingMachine;
    }

    public void setVendingMachineState(State vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    List<Coin> coins;
    State vendingMachine;
    public VendingMachine() {
        vendingMachine = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();

    }


}
