package p251t8;

import com.roblox.client.signup.C2897a;
import org.json.JSONObject;
import p100h7.C3417j;
import p300x7.C5563e;

/* renamed from: t8.d */
/* loaded from: classes.dex */
public abstract class AbstractC4740d {

    /* renamed from: a */
    protected C5563e f18569a;

    /* renamed from: b */
    protected C2897a.d0 f18570b;

    public AbstractC4740d(C5563e c5563e, C2897a.d0 d0Var) {
        this.f18569a = c5563e;
        this.f18570b = d0Var;
    }

    /* renamed from: a */
    public abstract C3417j mo18884a(String str, String str2);

    /* renamed from: b */
    public abstract String mo18885b(int i10, JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m18893c(Integer num) {
        this.f18570b.mo13135b(C2897a.a0.INVALID, num);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m18894d() {
        this.f18570b.mo13135b(C2897a.a0.VALID, null);
    }
}
