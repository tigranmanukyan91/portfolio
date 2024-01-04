package ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionImpl2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        //1st class name and 2nd class name and method's name
        //ReflectionAPI.Person java.lang.String setName
        Class<?> aClass = Class.forName(scanner.next());
        Class<?> aClass1 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method method = aClass.getMethod(methodName,aClass1);
        Object o1 = aClass.getConstructor().newInstance();
        Object o2 = aClass1.getConstructor(String.class).newInstance("String value");

        method.invoke(o1,o2);

        System.out.println(o1);
    }
}
