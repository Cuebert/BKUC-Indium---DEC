package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.common.util.concurrent.p */
/* loaded from: classes.dex */
final class C2568p {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11862a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
