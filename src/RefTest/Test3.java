package RefTest;

import Reflect.Person;

/**
 * 通过Class实例化其他类的对象
 */
public class Test3 {
    public static void main(String[] args){
        Class<?> demo=null;
        try {
            demo=Class.forName("Reflect.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Person per=null;
        try {
            per=(Person)demo.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        per.setAge(20);
        per.setName("Pa");
        System.out.println(per);

        /**
         *[Pa 20]
         */
    }
}
