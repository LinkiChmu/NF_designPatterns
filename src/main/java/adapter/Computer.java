package adapter;

public class Computer {

    public void connect(USB usb) {
        System.out.println("Computer connecting with USB");
        usb.setUsbCable();
    }
}
