package p190o8;

import com.roblox.client.C2822f0;
import p300x7.C5563e;

/* renamed from: o8.b */
/* loaded from: classes.dex */
public class C4150b {
    /* renamed from: a */
    public void m17215a() {
        C5563e.m20379h().m20388A("Android-AppRouter-RouteHandledByLua");
    }

    /* renamed from: b */
    public void m17216b() {
        C5563e.m20379h().m20388A("Android-AppRouter-RouteHandledNatively");
    }

    /* renamed from: c */
    public void m17217c(String str, String str2) {
        C5563e.m20379h().m20388A("Android-AppRouter-ErrorIncorrectParamName");
        C2822f0.m12483e("appRouter", "incorrectParamName", "Event:" + str + ". URL:" + str2);
    }

    /* renamed from: d */
    public void m17218d(String str, String str2) {
        C5563e.m20379h().m20388A("Android-AppRouter-ErrorIncorrectParamValue");
        C2822f0.m12483e("appRouter", "incorrectParamValue", "Event:" + str + ". URL:" + str2);
    }

    /* renamed from: e */
    public void m17219e(String str) {
        C5563e.m20379h().m20388A("Android-AppRouter-ErrorInvalidJson");
        C2822f0.m12483e("appRouter", "invalidJson", str);
    }

    /* renamed from: f */
    public void m17220f(String str, String str2) {
        C5563e.m20379h().m20388A("Android-AppRouter-ErrorNoParamsFoundForEvent");
        C2822f0.m12483e("appRouter", "noParamsFoundForEvent", "Event:" + str + ". URL:" + str2);
    }

    /* renamed from: g */
    public void m17221g(String str) {
        C5563e.m20379h().m20388A("Android-AppRouter-ErrorNoRoutesParsed");
        C2822f0.m12483e("appRouter", "noRoutesParsed", str);
    }

    /* renamed from: h */
    public void m17222h() {
        C5563e.m20379h().m20388A("Android-AppRouter-ParseRouteCalled");
    }

    /* renamed from: i */
    public void m17223i() {
        C5563e.m20379h().m20388A("Android-AppRouter-PostEventWithParams");
    }

    /* renamed from: j */
    public void m17224j() {
        C5563e.m20379h().m20388A("Android-AppRouter-PostEventWithoutParams");
    }
}
