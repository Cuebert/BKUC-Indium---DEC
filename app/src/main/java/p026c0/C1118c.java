package p026c0;

import android.media.MediaCodec;
import androidx.camera.core.C0398d3;
import androidx.camera.core.C0499z1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p014b0.C0960a;
import p014b0.C0965f;
import p279w.AbstractC5073r0;

/* renamed from: c0.c */
/* loaded from: classes.dex */
public class C1118c {

    /* renamed from: a */
    private final boolean f5443a;

    public C1118c() {
        this.f5443a = C0960a.m6139a(C0965f.class) != null;
    }

    /* renamed from: b */
    private int m6506b(AbstractC5073r0 abstractC5073r0) {
        if (abstractC5073r0.m19678e() == MediaCodec.class || abstractC5073r0.m19678e() == C0398d3.class) {
            return 2;
        }
        return abstractC5073r0.m19678e() == C0499z1.class ? 0 : 1;
    }

    /* renamed from: c */
    public /* synthetic */ int m6507c(AbstractC5073r0 abstractC5073r0, AbstractC5073r0 abstractC5073r02) {
        return m6506b(abstractC5073r0) - m6506b(abstractC5073r02);
    }

    /* renamed from: d */
    public void m6508d(List<AbstractC5073r0> list) {
        if (this.f5443a) {
            Collections.sort(list, new Comparator() { // from class: c0.b
                public /* synthetic */ C1117b() {
                }

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m6507c;
                    m6507c = C1118c.this.m6507c((AbstractC5073r0) obj, (AbstractC5073r0) obj2);
                    return m6507c;
                }
            });
        }
    }
}
