package ReflectionAPI;

import Annotations.MethodInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionAPIImpl {
    public static void main(String[] args) throws ClassNotFoundException {
        //1st method to get person class
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        //2nd method
        Class<Person> c = Person.class;
        //3rd method
        Class<?> person1 = Class.forName("ReflectionAPI.Person");

        Method[] methods = c.getMethods();
        for (Method method:methods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
        }

        System.out.println();

        //getDeclaredFields returns also private fields
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
            System.out.println(field.getType());
        }

        System.out.println();

        Annotation[] annotations = c.getAnnotations();
        for (Annotation annotation: annotations){
            if (annotation instanceof MethodInfo){
                System.out.println("Yes");
            }
        }
    }
}
