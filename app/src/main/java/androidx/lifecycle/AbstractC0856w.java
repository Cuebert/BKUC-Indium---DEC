package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public abstract class AbstractC0856w {

    /* renamed from: a */
    private final Map<String, Object> f4302a = new HashMap();

    /* renamed from: b */
    private volatile boolean f4303b = false;

    /* renamed from: b */
    private static void m4944b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m4945a() {
        this.f4303b = true;
        Map<String, Object> map = this.f4302a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f4302a.values().iterator();
                while (it.hasNext()) {
                    m4944b(it.next());
                }
            }
        }
        mo4677d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T m4946c(String str) {
        T t10;
        Map<String, Object> map = this.f4302a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f4302a.get(str);
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4677d() {
    }
}
