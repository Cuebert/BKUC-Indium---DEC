package p255u;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p242t.C4577l;
import p242t.C4579n;

/* renamed from: u.d */
/* loaded from: classes.dex */
public class C4760d {

    /* renamed from: a */
    private final String f18610a;

    public C4760d(String str) {
        this.f18610a = str;
    }

    /* renamed from: a */
    public List<Size> m18935a(int i10) {
        C4579n c4579n = (C4579n) C4577l.m18665a(C4579n.class);
        if (c4579n == null) {
            return new ArrayList();
        }
        return c4579n.m18675a(this.f18610a, i10);
    }
}
