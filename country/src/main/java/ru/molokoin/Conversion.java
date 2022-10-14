package ru.molokoin;

public class Conversion {
    /**
     * Проверяем содержимое объекта.
     * 
     * @param object
     * @return
     */
    public static Object checknull(Object object){
        Object result = new Object();
        if (object == null)throw new NullPointerException("Обнаружено пустое поле данных ...");
        
            return (Object)result;
    }
    public static int toint(Object object){
        String s = (String) object;
        return Integer.parseInt(s);
    }
    public static String toString(Object object){
        
        return "";
    }
}
