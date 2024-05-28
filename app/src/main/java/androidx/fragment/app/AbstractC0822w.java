package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0623b;
import androidx.core.view.C0690v;
import androidx.core.view.C0693y;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0687s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public abstract class AbstractC0822w {

    /* renamed from: androidx.fragment.app.w$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ int f4176n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f4177o;

        /* renamed from: p */
        final /* synthetic */ ArrayList f4178p;

        /* renamed from: q */
        final /* synthetic */ ArrayList f4179q;

        /* renamed from: r */
        final /* synthetic */ ArrayList f4180r;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4176n = i10;
            this.f4177o = arrayList;
            this.f4178p = arrayList2;
            this.f4179q = arrayList3;
            this.f4180r = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f4176n; i10++) {
                C0690v.m3796G0((View) this.f4177o.get(i10), (String) this.f4178p.get(i10));
                C0690v.m3796G0((View) this.f4179q.get(i10), (String) this.f4180r.get(i10));
            }
        }
    }

    /* renamed from: androidx.fragment.app.w$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ArrayList f4182n;

        /* renamed from: o */
        final /* synthetic */ Map f4183o;

        b(ArrayList arrayList, Map map) {
            this.f4182n = arrayList;
            this.f4183o = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4182n.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f4182n.get(i10);
                String m3806M = C0690v.m3806M(view);
                if (m3806M != null) {
                    C0690v.m3796G0(view, AbstractC0822w.m4805i(this.f4183o, m3806M));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.w$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ArrayList f4185n;

        /* renamed from: o */
        final /* synthetic */ Map f4186o;

        c(ArrayList arrayList, Map map) {
            this.f4185n = arrayList;
            this.f4186o = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4185n.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f4185n.get(i10);
                C0690v.m3796G0(view, (String) this.f4186o.get(C0690v.m3806M(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m4803d(List<View> list, View view) {
        int size = list.size();
        if (m4804h(list, view, size)) {
            return;
        }
        if (C0690v.m3806M(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!m4804h(list, childAt, size) && C0690v.m3806M(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m4804h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m4805i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m4806l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo4786A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo4787B(Object obj);

    /* renamed from: a */
    public abstract void mo4788a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo4789b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo4790c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo4791e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m4807f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (C0693y.m4023a(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    m4807f(arrayList, viewGroup.getChildAt(i10));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* renamed from: g */
    public abstract Object mo4792g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m4808j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m3806M = C0690v.m3806M(view);
            if (m3806M != null) {
                map.put(m3806M, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    m4808j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m4809k(View view, Rect rect) {
        if (C0690v.m3813T(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo4793m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo4794n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> m4810o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(C0690v.m3806M(view));
            C0690v.m3796G0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo4795p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo4796q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo4797r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m4811s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0687s.m3776a(viewGroup, new c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo4798t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo4799u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo4800v(Object obj, View view);

    /* renamed from: w */
    public void mo4801w(Fragment fragment, Object obj, C0623b c0623b, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m4812x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0687s.m3776a(view, new b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m4813y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String m3806M = C0690v.m3806M(view2);
            arrayList4.add(m3806M);
            if (m3806M != null) {
                C0690v.m3796G0(view2, null);
                String str = map.get(m3806M);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        C0690v.m3796G0(arrayList2.get(i11), m3806M);
                        break;
                    }
                    i11++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0687s.m3776a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo4802z(Object obj, View view, ArrayList<View> arrayList);
}
