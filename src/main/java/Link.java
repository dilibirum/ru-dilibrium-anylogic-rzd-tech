import java.lang.annotation.*;
@Target(value=ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)

public @interface Link {
    String url();
    String type() default "string";
}
