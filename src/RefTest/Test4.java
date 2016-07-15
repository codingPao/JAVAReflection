package RefTest;

import Reflect.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过Class调用类中的构造函数
 */
public class Test4 {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("Reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person per1 = null;
        Person per2 = null;
        Person per3 = null;
        Person per4 = null;
        Constructor<?> cons[] = demo.getConstructors();
        //取得所有的构造函数
        try {
            per1 = (Person) cons[0].newInstance("Pa");
            per2 = (Person) cons[1].newInstance(20);
            per4 = (Person) cons[2].newInstance("Pa", 20);
            per3 = (Person) cons[3].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
        /**
         *  [Pa 0]
         *  [null 20]
         *  [null 0]
         *  [Pa 20]
         */

    }
}

