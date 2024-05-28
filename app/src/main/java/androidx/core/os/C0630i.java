package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.i */
/* loaded from: classes.dex */
final class C0630i implements InterfaceC0629h {

    /* renamed from: a */
    private final LocaleList f3396a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0630i(Object obj) {
        this.f3396a = (LocaleList) obj;
    }

    @Override // androidx.core.os.InterfaceC0629h
    /* renamed from: a */
    public Object mo3359a() {
        return this.f3396a;
    }

    public boolean equals(Object obj) {
        return this.f3396a.equals(((InterfaceC0629h) obj).mo3359a());
    }

    @Override // androidx.core.os.InterfaceC0629h
    public Locale get(int i10) {
        return this.f3396a.get(i10);
    }

    public int hashCode() {
        return this.f3396a.hashCode();
    }

    @Override // androidx.core.os.InterfaceC0629h
    public int size() {
        return this.f3396a.size();
    }

    public String toString() {
        return this.f3396a.toString();
    }
}
