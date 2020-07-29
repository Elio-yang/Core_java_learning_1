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
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0) {
            System.out.print(modifiers + " ");
        }
        System.out.print("class " + name);
        if (supercl != null && supercl != Object.class) {
            System.out.print("extends " + supercl.getName());
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
        Constructor[] constructors = cl.getConstructors();
        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
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
        Method[] methods = cl.getMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("   ");

            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
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

    public static void printFields( Class cl) {
        Field[] fields = cl.getFields();
        for (Field f : fields) {
            Class fieldType = f.getType();
            String name = f.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(fieldType.getName() + " " + name + ";");
        }
    }
}


