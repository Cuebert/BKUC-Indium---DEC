package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.db */
/* loaded from: classes.dex */
public abstract class AbstractC1538db {

    /* renamed from: a */
    final Unsafe f6749a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1538db(Unsafe unsafe) {
        this.f6749a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo7956a(Object obj, long j10);

    /* renamed from: b */
    public abstract float mo7957b(Object obj, long j10);

    /* renamed from: c */
    public abstract void mo7958c(Object obj, long j10, boolean z10);

    /* renamed from: d */
    public abstract void mo7959d(Object obj, long j10, byte b10);

    /* renamed from: e */
    public abstract void mo7960e(Object obj, long j10, double d10);

    /* renamed from: f */
    public abstract void mo7961f(Object obj, long j10, float f10);

    /* renamed from: g */
    public abstract boolean mo7962g(Object obj, long j10);

    /* renamed from: h */
    public final int m8060h(Class<?> cls) {
        return this.f6749a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m8061i(Class<?> cls) {
        return this.f6749a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m8062j(Object obj, long j10) {
        return this.f6749a.getInt(obj, j10);
    }

    /* renamed from: k */
    public final long m8063k(Object obj, long j10) {
        return this.f6749a.getLong(obj, j10);
    }

    /* renamed from: l */
    public final long m8064l(Field field) {
        return this.f6749a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m8065m(Object obj, long j10) {
        return this.f6749a.getObject(obj, j10);
    }

    /* renamed from: n */
    public final void m8066n(Object obj, long j10, int i10) {
        this.f6749a.putInt(obj, j10, i10);
    }

    /* renamed from: o */
    public final void m8067o(Object obj, long j10, long j11) {
        this.f6749a.putLong(obj, j10, j11);
    }

    /* renamed from: p */
    public final void m8068p(Object obj, long j10, Object obj2) {
        this.f6749a.putObject(obj, j10, obj2);
    }
}
