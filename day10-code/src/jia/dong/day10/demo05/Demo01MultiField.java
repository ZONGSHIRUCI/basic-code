package jia.dong.day10.demo05;
/*
* 访问成员变量的两种方式
*
* 1，直接通过对象名称访问成员变量 看等号左边是谁 优先用谁 没有则向上找
* 2，间接通过成员方法访问成员变量 该方法属于谁优先用谁 没有则向上找*/
public class Demo01MultiField {
    public static void main(String[] args) {
        Fu obj=new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);//错误写法
        System.out.println("=================");
        obj.showNum();//子类没有覆盖重写 父 子类如果覆盖重写 子
    }
}
