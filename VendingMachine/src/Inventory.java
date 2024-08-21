import java.util.List;

public class Inventory {
    ItemShelf[] itemShelves;

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }


    public Inventory(int itemCount) {
        this.itemShelves =new ItemShelf[itemCount];
        fillInventory();
    }

    public void fillInventory() {
        int startCode = 101;
        for (int i = 0; i<itemShelves.length; i++) {
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(startCode);
            itemShelf.setSoldOut(true);
            itemShelves[i] = itemShelf;
            startCode++;
        }
    }

    public Item getItem(int codeNumber) throws Exception {

        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.code == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber){
        for (ItemShelf itemShelf : itemShelves) {
            if (itemShelf.code == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }


}
