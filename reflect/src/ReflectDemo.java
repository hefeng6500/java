import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) {
        try {
            // 获取类的Class对象
            Class<?> clazz = Class.forName("User");

            // 获取类的所有构造方法
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("Class的构造方法：");
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            // 创建对象实例
            System.out.println("\n创建对象实例：");
            Object obj = clazz.newInstance();
            System.out.println("创建的对象实例：" + obj);

            // 获取类的所有方法
            System.out.println("\nClass的方法：");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            // 调用指定方法
            System.out.println("\n调用setName方法：");
            Method setNameMethod = clazz.getDeclaredMethod("setName", String.class);
            setNameMethod.invoke(obj, "Tom");

            // 访问指定属性
            System.out.println("\n访问age属性：");
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(obj, 18);
            System.out.println("age属性的值：" + ageField.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
