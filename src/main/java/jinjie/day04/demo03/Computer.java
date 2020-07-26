package jinjie.day04.demo03;

public class Computer {
    public void powerOpen() {
        System.out.println("笔记本电脑打开");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    public void usbDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse){
            ((Mouse) usb).click();
        }else if (usb instanceof KeyBoard){
            ((KeyBoard) usb).qiao();
        }
        usb.close();
    }
}
