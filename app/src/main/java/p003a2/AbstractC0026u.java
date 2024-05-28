package p003a2;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p109i2.InterfaceC3475d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a2.u */
/* loaded from: classes.dex */
public abstract class AbstractC0026u implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a2.u$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        AbstractC0026u mo123a();

        /* renamed from: b */
        a mo124b(Context context);
    }

    /* renamed from: b */
    abstract InterfaceC3475d mo121b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C0025t mo122c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo121b().close();
    }
}
