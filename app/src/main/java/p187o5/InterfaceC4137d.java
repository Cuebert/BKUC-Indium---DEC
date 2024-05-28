package p187o5;

/* renamed from: o5.d */
/* loaded from: classes.dex */
public @interface InterfaceC4137d {

    /* renamed from: o5.d$a */
    /* loaded from: classes.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
