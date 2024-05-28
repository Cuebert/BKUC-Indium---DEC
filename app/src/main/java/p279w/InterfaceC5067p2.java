package p279w;

import android.content.Context;
import androidx.camera.core.C0459p1;

/* renamed from: w.p2 */
/* loaded from: classes.dex */
public interface InterfaceC5067p2 {

    /* renamed from: a */
    public static final InterfaceC5067p2 f19286a = new a();

    /* renamed from: w.p2$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5067p2 {
        a() {
        }

        @Override // p279w.InterfaceC5067p2
        /* renamed from: a */
        public InterfaceC5061o0 mo1381a(b bVar, int i10) {
            return null;
        }
    }

    /* renamed from: w.p2$b */
    /* loaded from: classes.dex */
    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* renamed from: w.p2$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC5067p2 mo17636a(Context context) throws C0459p1;
    }

    /* renamed from: a */
    InterfaceC5061o0 mo1381a(b bVar, int i10);
}
