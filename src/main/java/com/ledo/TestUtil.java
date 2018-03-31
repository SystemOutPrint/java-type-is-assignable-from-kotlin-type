package com.ledo;

/**
 * @author Jiahe Cai
 */
public class TestUtil {

    public static boolean isAssignableFromBooleanClass(Class<Boolean> clazz) {
        return Boolean.class.isAssignableFrom(clazz);
    }

    public static boolean isAssignableFromBooleanType(Class<Boolean> clazz) {
        return Boolean.TYPE.isAssignableFrom(clazz);
    }

    public static boolean isAssignableFromMyClass(Class<Dog> clazz) {
        return Dog.class.isAssignableFrom(clazz);
    }

}
