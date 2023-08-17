package annotation;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: MyAnnotation
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/16 21:40
 * @Version 1.0
 */
@Target({TYPE, FIELD, METHOD, CONSTRUCTOR})
public @interface MyAnnotation {
    String[] value() default "hello";
}
