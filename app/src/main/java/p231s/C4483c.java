package p231s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C0654h;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.c */
/* loaded from: classes.dex */
public class C4483c extends C4486f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final OutputConfiguration f18170a;

        /* renamed from: b */
        String f18171b;

        /* renamed from: c */
        boolean f18172c;

        a(OutputConfiguration outputConfiguration) {
            this.f18170a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f18170a, aVar.f18170a) && this.f18172c == aVar.f18172c && Objects.equals(this.f18171b, aVar.f18171b);
        }

        public int hashCode() {
            int hashCode = this.f18170a.hashCode() ^ 31;
            int i10 = (this.f18172c ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f18171b;
            return (str == null ? 0 : str.hashCode()) ^ i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4483c(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C4483c m18441e(OutputConfiguration outputConfiguration) {
        return new C4483c(new a(outputConfiguration));
    }

    @Override // p231s.C4486f, p231s.C4482b.a
    /* renamed from: a */
    public Surface mo18437a() {
        return ((OutputConfiguration) mo18439c()).getSurface();
    }

    @Override // p231s.C4486f, p231s.C4482b.a
    /* renamed from: b */
    public String mo18438b() {
        return ((a) this.f18175a).f18171b;
    }

    @Override // p231s.C4486f, p231s.C4482b.a
    /* renamed from: c */
    public Object mo18439c() {
        C0654h.m3462a(this.f18175a instanceof a);
        return ((a) this.f18175a).f18170a;
    }

    @Override // p231s.C4486f, p231s.C4482b.a
    /* renamed from: d */
    public void mo18440d(String str) {
        ((a) this.f18175a).f18171b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4483c(Object obj) {
        super(obj);
    }
}
