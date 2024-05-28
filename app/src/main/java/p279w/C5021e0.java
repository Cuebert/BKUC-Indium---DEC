package p279w;

import androidx.camera.core.C0459p1;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0477u;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: w.e0 */
/* loaded from: classes.dex */
public final class C5021e0 {

    /* renamed from: a */
    private final Object f19158a = new Object();

    /* renamed from: b */
    private final Map<String, InterfaceC5017d0> f19159b = new LinkedHashMap();

    /* renamed from: c */
    private final Set<InterfaceC5017d0> f19160c = new HashSet();

    /* renamed from: a */
    public LinkedHashSet<InterfaceC5017d0> m19538a() {
        LinkedHashSet<InterfaceC5017d0> linkedHashSet;
        synchronized (this.f19158a) {
            linkedHashSet = new LinkedHashSet<>(this.f19159b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public void m19539b(InterfaceC5005a0 interfaceC5005a0) throws C0459p1 {
        synchronized (this.f19158a) {
            try {
                try {
                    for (String str : interfaceC5005a0.mo1785c()) {
                        C0463q1.m2202a("CameraRepository", "Added camera: " + str);
                        this.f19159b.put(str, interfaceC5005a0.mo1783a(str));
                    }
                } catch (C0477u e10) {
                    throw new C0459p1(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
