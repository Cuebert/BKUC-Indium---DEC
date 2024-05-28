package p125j4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p093h0.C3362g;

/* renamed from: j4.h */
/* loaded from: classes.dex */
public class C3607h {

    /* renamed from: a */
    private final C3362g<String, C3608i> f15236a = new C3362g<>();

    /* renamed from: b */
    private final C3362g<String, PropertyValuesHolder[]> f15237b = new C3362g<>();

    /* renamed from: a */
    private static void m15429a(C3607h c3607h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c3607h.m15436h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c3607h.m15437i(objectAnimator.getPropertyName(), C3608i.m15438b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* renamed from: b */
    public static C3607h m15430b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return m15431c(context, resourceId);
    }

    /* renamed from: c */
    public static C3607h m15431c(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return m15432d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m15432d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    /* renamed from: d */
    private static C3607h m15432d(List<Animator> list) {
        C3607h c3607h = new C3607h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m15429a(c3607h, list.get(i10));
        }
        return c3607h;
    }

    /* renamed from: e */
    public C3608i m15433e(String str) {
        if (m15435g(str)) {
            return this.f15236a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3607h) {
            return this.f15236a.equals(((C3607h) obj).f15236a);
        }
        return false;
    }

    /* renamed from: f */
    public long m15434f() {
        int size = this.f15236a.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C3608i m14844m = this.f15236a.m14844m(i10);
            j10 = Math.max(j10, m14844m.m15441c() + m14844m.m15442d());
        }
        return j10;
    }

    /* renamed from: g */
    public boolean m15435g(String str) {
        return this.f15236a.get(str) != null;
    }

    /* renamed from: h */
    public void m15436h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f15237b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f15236a.hashCode();
    }

    /* renamed from: i */
    public void m15437i(String str, C3608i c3608i) {
        this.f15236a.put(str, c3608i);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f15236a + "}\n";
    }
}
