package p132jb;

import kotlin.jvm.internal.C3844i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jb.l */
/* loaded from: classes.dex */
public class C3695l extends C3694k {
    /* renamed from: c */
    public static final boolean m15672c(String str, int i10, String other, int i11, int i12, boolean z10) {
        C3844i.m16253f(str, "<this>");
        C3844i.m16253f(other, "other");
        if (!z10) {
            return str.regionMatches(i10, other, i11, i12);
        }
        return str.regionMatches(z10, i10, other, i11, i12);
    }

    /* renamed from: d */
    public static final boolean m15673d(String str, String prefix, boolean z10) {
        C3844i.m16253f(str, "<this>");
        C3844i.m16253f(prefix, "prefix");
        if (!z10) {
            return str.startsWith(prefix);
        }
        return m15672c(str, 0, prefix, 0, prefix.length(), z10);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m15674e(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m15673d(str, str2, z10);
    }
}
