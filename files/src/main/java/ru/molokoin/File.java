@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface File {
    String name() default "noname";
    byte size() default "0";
    Extension extension () default Extension.OTHER;
}
