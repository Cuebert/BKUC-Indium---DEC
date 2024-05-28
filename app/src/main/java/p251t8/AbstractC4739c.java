package p251t8;

import com.roblox.client.signup.C2897a;
import org.json.JSONObject;
import p100h7.C3417j;
import p300x7.C5563e;

/* renamed from: t8.c */
/* loaded from: classes.dex */
public abstract class AbstractC4739c {

    /* renamed from: a */
    protected C5563e f18567a;

    /* renamed from: b */
    protected C2897a.z f18568b;

    public AbstractC4739c(C5563e c5563e, C2897a.z zVar) {
        this.f18567a = c5563e;
        this.f18568b = zVar;
    }

    /* renamed from: a */
    public abstract C3417j mo18888a(String str, String str2, String str3);

    /* renamed from: b */
    public abstract String mo18889b(int i10, JSONObject jSONObject);

    /* renamed from: c */
    public void m18890c() {
        this.f18568b.mo13136c();
    }

    /* renamed from: d */
    public void m18891d(Integer num) {
        this.f18568b.mo13134a(C2897a.a0.INVALID, num);
    }

    /* renamed from: e */
    public void m18892e(Integer num) {
        this.f18568b.mo13134a(C2897a.a0.VALID, num);
    }
}
