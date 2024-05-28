package p306y0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: y0.b */
/* loaded from: classes.dex */
class C5590b {

    /* renamed from: y0.b$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        void mo20553a(T t10, Rect rect);
    }

    /* renamed from: y0.b$b */
    /* loaded from: classes.dex */
    public interface b<T, V> {
        /* renamed from: a */
        V mo20555a(T t10, int i10);

        /* renamed from: b */
        int mo20556b(T t10);
    }

    /* renamed from: y0.b$c */
    /* loaded from: classes.dex */
    private static class c<T> implements Comparator<T> {

        /* renamed from: n */
        private final Rect f20736n = new Rect();

        /* renamed from: o */
        private final Rect f20737o = new Rect();

        /* renamed from: p */
        private final boolean f20738p;

        /* renamed from: q */
        private final a<T> f20739q;

        c(boolean z10, a<T> aVar) {
            this.f20738p = z10;
            this.f20739q = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            Rect rect = this.f20736n;
            Rect rect2 = this.f20737o;
            this.f20739q.mo20553a(t10, rect);
            this.f20739q.mo20553a(t11, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                return this.f20738p ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f20738p ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return this.f20738p ? 1 : -1;
            }
            if (i16 > i17) {
                return this.f20738p ? -1 : 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m20559a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean m20560b = m20560b(i10, rect, rect2);
        if (m20560b(i10, rect, rect3) || !m20560b) {
            return false;
        }
        return !m20568j(i10, rect, rect3) || i10 == 17 || i10 == 66 || m20569k(i10, rect, rect2) < m20571m(i10, rect, rect3);
    }

    /* renamed from: b */
    private static boolean m20560b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static <L, T> T m20561c(L l10, b<L, T> bVar, a<T> aVar, T t10, Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        if (i10 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i10 == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t11 = null;
        int mo20556b = bVar.mo20556b(l10);
        Rect rect3 = new Rect();
        for (int i11 = 0; i11 < mo20556b; i11++) {
            T mo20555a = bVar.mo20555a(l10, i11);
            if (mo20555a != t10) {
                aVar.mo20553a(mo20555a, rect3);
                if (m20566h(i10, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t11 = mo20555a;
                }
            }
        }
        return t11;
    }

    /* renamed from: d */
    public static <L, T> T m20562d(L l10, b<L, T> bVar, a<T> aVar, T t10, int i10, boolean z10, boolean z11) {
        int mo20556b = bVar.mo20556b(l10);
        ArrayList arrayList = new ArrayList(mo20556b);
        for (int i11 = 0; i11 < mo20556b; i11++) {
            arrayList.add(bVar.mo20555a(l10, i11));
        }
        Collections.sort(arrayList, new c(z10, aVar));
        if (i10 == 1) {
            return (T) m20564f(t10, arrayList, z11);
        }
        if (i10 == 2) {
            return (T) m20563e(t10, arrayList, z11);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    private static <T> T m20563e(T t10, ArrayList<T> arrayList, boolean z10) {
        int size = arrayList.size();
        int lastIndexOf = (t10 == null ? -1 : arrayList.lastIndexOf(t10)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m20564f(T t10, ArrayList<T> arrayList, boolean z10) {
        int size = arrayList.size();
        int indexOf = (t10 == null ? size : arrayList.indexOf(t10)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m20565g(int i10, int i11) {
        return (i10 * 13 * i10) + (i11 * i11);
    }

    /* renamed from: h */
    private static boolean m20566h(int i10, Rect rect, Rect rect2, Rect rect3) {
        if (!m20567i(rect, rect2, i10)) {
            return false;
        }
        if (m20567i(rect, rect3, i10) && !m20559a(i10, rect, rect2, rect3)) {
            return !m20559a(i10, rect, rect3, rect2) && m20565g(m20569k(i10, rect, rect2), m20573o(i10, rect, rect2)) < m20565g(m20569k(i10, rect, rect3), m20573o(i10, rect, rect3));
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m20567i(Rect rect, Rect rect2, int i10) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 == 130) {
            int i17 = rect.top;
            int i18 = rect2.top;
            return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: j */
    private static boolean m20568j(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            return rect.left >= rect2.right;
        }
        if (i10 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i10 == 66) {
            return rect.right <= rect2.left;
        }
        if (i10 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: k */
    private static int m20569k(int i10, Rect rect, Rect rect2) {
        return Math.max(0, m20570l(i10, rect, rect2));
    }

    /* renamed from: l */
    private static int m20570l(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else if (i10 == 130) {
            i11 = rect2.top;
            i12 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i11 - i12;
    }

    /* renamed from: m */
    private static int m20571m(int i10, Rect rect, Rect rect2) {
        return Math.max(1, m20572n(i10, rect, rect2));
    }

    /* renamed from: n */
    private static int m20572n(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.left;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.top;
        } else if (i10 == 66) {
            i11 = rect2.right;
            i12 = rect.right;
        } else if (i10 == 130) {
            i11 = rect2.bottom;
            i12 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i11 - i12;
    }

    /* renamed from: o */
    private static int m20573o(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
