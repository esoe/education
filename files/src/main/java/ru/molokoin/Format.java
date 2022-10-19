@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Format {
    String name() default "noname";
    byte size() default "0";
    Extension extension () default Extension.OTHER;
}
