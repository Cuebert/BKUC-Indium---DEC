package com.google.mlkit.vision.common.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p248t5.InterfaceC4733b;
import p321z2.C5984j;

/* renamed from: com.google.mlkit.vision.common.internal.a */
/* loaded from: classes.dex */
public class C2709a {

    /* renamed from: a */
    private final Map<Class<Object>, InterfaceC4733b<Object>> f10311a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Class<Object> f10312a;

        /* renamed from: b */
        private final InterfaceC4733b<Object> f10313b;

        /* renamed from: c */
        private final int f10314c;

        /* renamed from: a */
        final int m12088a() {
            return this.f10314c;
        }

        /* renamed from: b */
        final InterfaceC4733b<Object> m12089b() {
            return this.f10313b;
        }

        /* renamed from: c */
        final Class<Object> m12090c() {
            return this.f10312a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2709a(Set<a> set) {
        HashMap hashMap = new HashMap();
        for (a aVar : set) {
            Class<Object> m12090c = aVar.m12090c();
            if (!this.f10311a.containsKey(m12090c) || aVar.m12088a() >= ((Integer) C5984j.m21286j((Integer) hashMap.get(m12090c))).intValue()) {
                this.f10311a.put(m12090c, aVar.m12089b());
                hashMap.put(m12090c, Integer.valueOf(aVar.m12088a()));
            }
        }
    }
}
