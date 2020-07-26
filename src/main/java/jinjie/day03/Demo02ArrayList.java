package jinjie.day03;

import java.util.ArrayList;

public class Demo02ArrayList {
    /*
    * 数组的长度不可以发生改变，但是ArrayList集合的长度是可以随意改变的
    * 对于ArrayList来说，有一个尖括号<E>代表泛型、
    * 泛型也就是装在集合当中的所有元素，全都是统一的类型
    * 注意泛型只能是引用类型，不能是基本类型
    * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容，如果内容为空，得到的是[ ]
    * ArrayList常用的方法有：
    * public boolean add(E e):向集合当中添加元素，参数类型和泛型一致，返回值代表是否添加成功
    * 对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用
    * 但是对于其他集合来说，add添加动作不一定成功
    * public E get(int index):从集合当中获取元素，参数是索引编号，返回值是对应位置的元素
    * public E remove(int index):从集合当中删选元素，参数是索引编号，返回值是被删除掉的元素
    * public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
    * */
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list，里面装的全部是String字符串类型
        ArrayList<String> list = new ArrayList<>();
        //向集合当中添加一些数据，需要用到add方法
        list.add("赵");
        System.out.println(list);
        String st = list.get(0);
        System.out.println(st);
        System.out.println(list.size());
        String remove = list.remove(0);
        System.out.println(remove);
        ArrayList<Integer> list2= new ArrayList<>();
    }
}
