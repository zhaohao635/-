package jinjie.day04.demo03;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOpen();
        //向上转型
        USB usbMouse = new Mouse();   //多态的写法
        usbMouse.open();
        computer.usbDevice(usbMouse);
        //创建一个USB键盘
        KeyBoard keyboard = new KeyBoard();   //没有使用多态
        computer.usbDevice(keyboard);    //也发生了向上转型为USB
        computer.powerOff();

    }
}
