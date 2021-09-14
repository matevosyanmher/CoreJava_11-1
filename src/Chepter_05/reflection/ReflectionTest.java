package Chepter_05.reflection;

import java.lang.invoke.TypeDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args)
            throws ReflectiveOperationException {
// read class name from command line args or user input

        String name;
        if (args.length > 0) name = args[0];
        else {
            var in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date");
            name = in.next();
        }
// print class name and superclass name (if != Object)
        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0) {
            System.out.print(modifiers + " ");
            System.out.println("class " + name);
            if (supercl != null && supercl != Object.class) {
                System.out.println(supercl.getName());
            }
        };

        System.out.println("\n{\n");
        printConstructors(cl);
        System.out.println();
//        printMethods(cl);
        System.out.println();
//        printFields(cl);
        System.out.println("}");

        /*Prints all constructors of a class
        @param cl a class
*/

    }

    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
             if (modifiers.length()>0) System.out.println(modifiers + " ");
            System.out.print(name + ")");

            // print parameter types
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }


}
