package MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyClass {
    private int myPrivateField;
    protected String myProtectedField;
    public double myPublicField;

    public MyClass() {
    }

    public MyClass(int myPrivateField, String myProtectedField, double myPublicField) {
        this.myPrivateField = myPrivateField;
        this.myProtectedField = myProtectedField;
        this.myPublicField = myPublicField;
    }

    private void myPrivateMethod() {
        System.out.println("Це приватний метод");
    }

    protected void myProtectedMethod() {
        System.out.println("Це захищений метод");
    }

    public void myPublicMethod() {
        System.out.println("Це публічний метод");
    }

    public static void main(String[] args) {
        Class<?> clazz = MyClass.class;

        // Виведення інформації про поля
        System.out.println("Поля:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Назва: " + field.getName());
            System.out.println("Тип: " + field.getType());
            System.out.println("Модифікатори доступу: " + field.getModifiers());
            System.out.println("---------------------");
        }

        // Виведення інформації про конструктори
        System.out.println("Конструктори:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Назва: " + constructor.getName());
            System.out.println("Параметри: " + constructor.getParameterCount());
            System.out.println("Модифікатори доступу: " + constructor.getModifiers());
            System.out.println("---------------------");
        }

        // Виведення інформації про методи
        System.out.println("Методи:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Назва: " + method.getName());
            System.out.println("Параметри: " + method.getParameterCount());
            System.out.println("Модифікатори доступу: " + method.getModifiers());
            System.out.println("---------------------");
        }
    }
}
