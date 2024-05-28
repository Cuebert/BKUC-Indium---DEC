package p044d4;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C2362a;
import p295x2.C5506a;

/* renamed from: d4.e */
/* loaded from: classes.dex */
public final class C2972e {

    /* renamed from: a */
    public static final C5506a.g<C2362a> f12651a;

    /* renamed from: b */
    public static final C5506a.g<C2362a> f12652b;

    /* renamed from: c */
    public static final C5506a.a<C2362a, C2968a> f12653c;

    /* renamed from: d */
    static final C5506a.a<C2362a, C2971d> f12654d;

    /* renamed from: e */
    public static final Scope f12655e;

    /* renamed from: f */
    public static final Scope f12656f;

    /* renamed from: g */
    public static final C5506a<C2968a> f12657g;

    /* renamed from: h */
    public static final C5506a<C2971d> f12658h;

    static {
        C5506a.g<C2362a> gVar = new C5506a.g<>();
        f12651a = gVar;
        C5506a.g<C2362a> gVar2 = new C5506a.g<>();
        f12652b = gVar2;
        C2969b c2969b = new C2969b();
        f12653c = c2969b;
        C2970c c2970c = new C2970c();
        f12654d = c2970c;
        f12655e = new Scope("profile");
        f12656f = new Scope("email");
        f12657g = new C5506a<>("SignIn.API", c2969b, gVar);
        f12658h = new C5506a<>("SignIn.INTERNAL_API", c2970c, gVar2);
    }
}
