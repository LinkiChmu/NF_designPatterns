package adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        MemoryCard memoryCard = new MemoryCard();
        USB usb = new CardReader(memoryCard);

        Computer computer = new Computer();
        computer.connect(usb);
    }
}
