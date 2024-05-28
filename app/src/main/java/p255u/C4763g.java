package p255u;

import androidx.camera.camera2.internal.InterfaceC0313j2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p242t.C4573h;
import p279w.C5095y1;

/* renamed from: u.g */
/* loaded from: classes.dex */
public class C4763g {

    /* renamed from: a */
    private final C4573h f18612a;

    @FunctionalInterface
    /* renamed from: u.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo1682a(InterfaceC0313j2 interfaceC0313j2);
    }

    public C4763g(C5095y1 c5095y1) {
        this.f18612a = (C4573h) c5095y1.m19725b(C4573h.class);
    }

    /* renamed from: a */
    private void m18940a(Set<InterfaceC0313j2> set) {
        for (InterfaceC0313j2 interfaceC0313j2 : set) {
            interfaceC0313j2.mo1582a().mo1593p(interfaceC0313j2);
        }
    }

    /* renamed from: b */
    private void m18941b(Set<InterfaceC0313j2> set) {
        for (InterfaceC0313j2 interfaceC0313j2 : set) {
            interfaceC0313j2.mo1582a().mo1594q(interfaceC0313j2);
        }
    }

    /* renamed from: c */
    public void m18942c(InterfaceC0313j2 interfaceC0313j2, List<InterfaceC0313j2> list, List<InterfaceC0313j2> list2, a aVar) {
        InterfaceC0313j2 next;
        InterfaceC0313j2 next2;
        if (m18943d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<InterfaceC0313j2> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != interfaceC0313j2) {
                linkedHashSet.add(next2);
            }
            m18941b(linkedHashSet);
        }
        aVar.mo1682a(interfaceC0313j2);
        if (m18943d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<InterfaceC0313j2> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != interfaceC0313j2) {
                linkedHashSet2.add(next);
            }
            m18940a(linkedHashSet2);
        }
    }

    /* renamed from: d */
    public boolean m18943d() {
        return this.f18612a != null;
    }
}
