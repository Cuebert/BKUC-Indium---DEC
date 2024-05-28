package p231s;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C0654h;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.d */
/* loaded from: classes.dex */
public class C4484d extends C4483c {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final OutputConfiguration f18173a;

        /* renamed from: b */
        String f18174b;

        a(OutputConfiguration outputConfiguration) {
            this.f18173a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f18173a, aVar.f18173a) && Objects.equals(this.f18174b, aVar.f18174b);
        }

        public int hashCode() {
            int hashCode = this.f18173a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.f18174b;
            return (str == null ? 0 : str.hashCode()) ^ i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4484d(Surface surface) {
        this(new a(new OutputConfiguration(surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C4484d m18442f(OutputConfiguration outputConfiguration) {
        return new C4484d(new a(outputConfiguration));
    }

    @Override // p231s.C4483c, p231s.C4486f, p231s.C4482b.a
    /* renamed from: b */
    public String mo18438b() {
        return ((a) this.f18175a).f18174b;
    }

    @Override // p231s.C4483c, p231s.C4486f, p231s.C4482b.a
    /* renamed from: c */
    public Object mo18439c() {
        C0654h.m3462a(this.f18175a instanceof a);
        return ((a) this.f18175a).f18173a;
    }

    @Override // p231s.C4483c, p231s.C4486f, p231s.C4482b.a
    /* renamed from: d */
    public void mo18440d(String str) {
        ((a) this.f18175a).f18174b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4484d(Object obj) {
        super(obj);
    }
}
