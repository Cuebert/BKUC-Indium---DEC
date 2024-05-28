package p255u;

import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p242t.C4570e;

/* renamed from: u.c */
/* loaded from: classes.dex */
public class C4759c {

    /* renamed from: a */
    private final C4570e f18608a;

    /* renamed from: b */
    private final Set<Size> f18609b;

    public C4759c(C4570e c4570e) {
        Set<Size> emptySet;
        this.f18608a = c4570e;
        if (c4570e != null) {
            emptySet = new HashSet<>(c4570e.m18658a());
        } else {
            emptySet = Collections.emptySet();
        }
        this.f18609b = emptySet;
    }
}
