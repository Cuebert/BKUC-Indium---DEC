package backtraceio.library.common;

import backtraceio.library.models.BacktraceResult;
import p020b6.C1055f;
import p020b6.C1056g;
import p020b6.EnumC1053d;

/* loaded from: classes.dex */
public class BacktraceSerializeHelper {
    public static BacktraceResult backtraceResultFromJson(String str) {
        return (BacktraceResult) new C1055f().m6305j(str, BacktraceResult.class);
    }

    private static C1055f buildGson() {
        return new C1056g().m6330c(EnumC1053d.f5249r).m6329b();
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) buildGson().m6305j(str, cls);
    }

    public static String toJson(Object obj) {
        return buildGson().m6313s(obj);
    }
}
