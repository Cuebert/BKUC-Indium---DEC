package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0859z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p082g1.C3228b;

/* renamed from: androidx.loader.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0860a {

    /* renamed from: androidx.loader.app.a$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        /* renamed from: a */
        void mo4959a(C3228b<D> c3228b);

        /* renamed from: b */
        void mo4960b(C3228b<D> c3228b, D d10);

        /* renamed from: c */
        C3228b<D> mo4961c(int i10, Bundle bundle);
    }

    /* renamed from: b */
    public static <T extends InterfaceC0845l & InterfaceC0859z> AbstractC0860a m4955b(T t10) {
        return new C0861b(t10, t10.mo584i0());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo4956a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C3228b<D> mo4957c(int i10, Bundle bundle, a<D> aVar);

    /* renamed from: d */
    public abstract void mo4958d();
}
