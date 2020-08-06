package chapter5inheritance;

import java.lang.reflect.*;
import java.util.Scanner;

/**
 * @author Elio
 * @date 2020/7/29
 */
public class ReflectionTest {
    public static void main(String[] args)
            throws ReflectiveOperationException {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            name = in.next();
        }
        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();
        String mod = Modifier.toString(cl.getModifiers());
        if (mod.length() > 0) {
            System.out.print(mod + " ");
        }
        System.out.print("class " + name);
        if (supercl != null && supercl != Object.class) {
            System.out.print(" extends " + supercl.getName());
        }
        System.out.print("{\n");
        printConstructor(cl);
        System.out.println();
        printMethod(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");
    }

    public static void printConstructor(Class cl) {
        Constructor<?>[] clConstructors = cl.getConstructors();
        for (Constructor c : clConstructors) {
            String name = c.getName();
            System.out.print("   ");
            String mod = Modifier.toString(c.getModifiers());
            if (mod.length() > 0) {
                System.out.print(mod + " ");
            }
            System.out.print(name + "(");

            Class[] paraType = c.getParameterTypes();
            for (int j = 0; j < paraType.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paraType[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethod(Class cl) {
        Method[] clMethods = cl.getMethods();
        for (Method m : clMethods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("   ");

            String mod = Modifier.toString(m.getModifiers());
            if (mod.length() > 0) {
                System.out.print(mod + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");
            Class[] paraType = m.getParameterTypes();
            for (int j = 0; j < paraType.length; j++) {
                if (j > 0) {
                    System.out.print(",");
                }
                System.out.print(paraType[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl) {
        Field[] clFields = cl.getFields();
        for (Field f : clFields) {
            Class fieldType = f.getType();
            String name = f.getName();
            System.out.print("   ");
            String mod = Modifier.toString(f.getModifiers());
            if (mod.length() > 0) {
                System.out.print(mod + " ");
            }
            System.out.println(fieldType.getName() + " " + name + ";");
        }
    }
}


