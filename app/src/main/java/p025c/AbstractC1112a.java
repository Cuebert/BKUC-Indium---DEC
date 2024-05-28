package p025c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* renamed from: c.a */
/* loaded from: classes.dex */
public abstract class AbstractC1112a<I, O> {

    /* renamed from: c.a$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        @SuppressLint({"UnknownNullness"})
        private final T f5441a;

        public a(@SuppressLint({"UnknownNullness"}) T t10) {
            this.f5441a = t10;
        }

        @SuppressLint({"UnknownNullness"})
        /* renamed from: a */
        public T m6494a() {
            return this.f5441a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo4537a(Context context, @SuppressLint({"UnknownNullness"}) I i10);

    /* renamed from: b */
    public a<O> mo6493b(Context context, @SuppressLint({"UnknownNullness"}) I i10) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: c */
    public abstract O mo4538c(int i10, Intent intent);
}
