package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
final class C0824y extends Writer {

    /* renamed from: n */
    private final String f4192n;

    /* renamed from: o */
    private StringBuilder f4193o = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0824y(String str) {
        this.f4192n = str;
    }

    /* renamed from: b */
    private void m4820b() {
        if (this.f4193o.length() > 0) {
            Log.d(this.f4192n, this.f4193o.toString());
            StringBuilder sb2 = this.f4193o;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m4820b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m4820b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                m4820b();
            } else {
                this.f4193o.append(c10);
            }
        }
    }
}
