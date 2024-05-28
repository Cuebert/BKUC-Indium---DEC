package p091gc;

import java.lang.annotation.Annotation;

/* renamed from: gc.x */
/* loaded from: classes.dex */
final class C3352x implements InterfaceC3351w {

    /* renamed from: a */
    private static final InterfaceC3351w f14026a = new C3352x();

    C3352x() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Annotation[] m14755a(Annotation[] annotationArr) {
        if (C3353y.m14767l(annotationArr, InterfaceC3351w.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f14026a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return InterfaceC3351w.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof InterfaceC3351w;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + InterfaceC3351w.class.getName() + "()";
    }
}
