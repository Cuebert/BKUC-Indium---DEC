package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0957a {

    /* renamed from: a */
    private final DataSetObservable f5112a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f5113b;

    /* renamed from: a */
    public abstract void mo4713a(ViewGroup viewGroup, int i10, Object obj);

    /* renamed from: b */
    public abstract void mo4714b(ViewGroup viewGroup);

    /* renamed from: c */
    public abstract int mo6129c();

    /* renamed from: d */
    public int m6130d(Object obj) {
        return -1;
    }

    /* renamed from: e */
    public CharSequence m6131e(int i10) {
        return null;
    }

    /* renamed from: f */
    public float m6132f(int i10) {
        return 1.0f;
    }

    /* renamed from: g */
    public abstract Object mo4715g(ViewGroup viewGroup, int i10);

    /* renamed from: h */
    public abstract boolean mo4716h(View view, Object obj);

    /* renamed from: i */
    public void m6133i(DataSetObserver dataSetObserver) {
        this.f5112a.registerObserver(dataSetObserver);
    }

    /* renamed from: j */
    public abstract void mo4717j(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: k */
    public abstract Parcelable mo4718k();

    /* renamed from: l */
    public abstract void mo4719l(ViewGroup viewGroup, int i10, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m6134m(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f5113b = dataSetObserver;
        }
    }

    /* renamed from: n */
    public abstract void mo4720n(ViewGroup viewGroup);

    /* renamed from: o */
    public void m6135o(DataSetObserver dataSetObserver) {
        this.f5112a.unregisterObserver(dataSetObserver);
    }
}
