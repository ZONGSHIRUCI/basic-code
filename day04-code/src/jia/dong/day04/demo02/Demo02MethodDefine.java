package jia.dong.day04.demo02;
/*
方法其实就是若干语句的功能集合。

方法好比是一个工厂
蒙牛工厂 原料：牛奶、饲料、水
         产出物：奶制品
钢铁工厂 原料：铁矿石、煤炭
         产出物：钢铁建材

参数：     进入方法的数据
返回值：   从方法中出来的数据

定义方法的完整格式：
修饰符 返回值类型 方法名称（参数类型 参数名称，、、、）{
    方法体
    return 返回值；
}

修饰符：现阶段的固定写法：public static
返回值类型：也就是方法最终产生的数据是什么类型
方法名称：方法的名字，规则和变量一样 小驼峰
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据对应的变量名称
ps:
参数如果有多个 使用逗号进行分割
方法体：方法需要做的事情，若干行代码
return：两个作用，第一停止当前方法，第二将后面的返回值还给调用处
返回值：也就是方法执行后最终产生的数据结果
return后边的返回值必须和方法名称前面的返回值类型保持对应

定义一个两个int数字相加的方法，三要素
返回值类型 int
返回值类型 int
方法名称 sum
参数列表 int a,int b

方法的三种调用格式
1，单独调用
2，打印调用
3，赋值调用
*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("==========");

        //打印调用
        System.out.println(sum(10,20));
        System.out.println("==========");

        //赋值调用
        int number=sum(15,25);
        System.out.println("变量的值:"+number);
    }
    public static int sum(int a,int b){
        System.out.println("方法执行了");
        int result=a+b;
        return result;
    }
}
