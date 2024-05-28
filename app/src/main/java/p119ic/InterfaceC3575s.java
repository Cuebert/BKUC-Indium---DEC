package p119ic;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ic.s */
/* loaded from: classes.dex */
public @interface InterfaceC3575s {
    boolean encoded() default false;

    String value();
}
