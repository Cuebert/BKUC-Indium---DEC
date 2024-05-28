package p119ic;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ic.c */
/* loaded from: classes.dex */
public @interface InterfaceC3559c {
    boolean encoded() default false;

    String value();
}
