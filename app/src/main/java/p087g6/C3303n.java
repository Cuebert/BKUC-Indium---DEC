package p087g6;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import java.util.UUID;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;

/* renamed from: g6.n */
/* loaded from: classes.dex */
public class C3303n {

    /* renamed from: b */
    @RecentlyNonNull
    public static final C3617d<?> f13768b = C3617d.m15462c(C3303n.class).m15480b(C3631q.m15529h(C3298i.class)).m15480b(C3631q.m15529h(Context.class)).m15484f(new InterfaceC3622h() { // from class: g6.b0
        @Override // p126j5.InterfaceC3622h
        /* renamed from: a */
        public final Object mo230a(InterfaceC3619e interfaceC3619e) {
            return new C3303n((Context) interfaceC3619e.mo15448a(Context.class));
        }
    }).m15482d();

    /* renamed from: a */
    private final Context f13769a;

    public C3303n(@RecentlyNonNull Context context) {
        this.f13769a = context;
    }

    /* renamed from: b */
    private final SharedPreferences m14577b() {
        return this.f13769a.getSharedPreferences("com.google.mlkit.internal", 0);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public synchronized String m14578a() {
        String string = m14577b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m14577b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
