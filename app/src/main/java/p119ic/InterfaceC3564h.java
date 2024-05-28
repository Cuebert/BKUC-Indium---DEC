package p119ic;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ic.h */
/* loaded from: classes.dex */
public @interface InterfaceC3564h {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
