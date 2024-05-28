package androidx.core.text;

import java.util.Locale;

/* renamed from: androidx.core.text.d */
/* loaded from: classes.dex */
public final class C0645d {

    /* renamed from: a */
    public static final InterfaceC0644c f3480a = new e(null, false);

    /* renamed from: b */
    public static final InterfaceC0644c f3481b = new e(null, true);

    /* renamed from: c */
    public static final InterfaceC0644c f3482c;

    /* renamed from: d */
    public static final InterfaceC0644c f3483d;

    /* renamed from: e */
    public static final InterfaceC0644c f3484e;

    /* renamed from: f */
    public static final InterfaceC0644c f3485f;

    /* renamed from: androidx.core.text.d$a */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b */
        static final a f3486b = new a(true);

        /* renamed from: a */
        private final boolean f3487a;

        private a(boolean z10) {
            this.f3487a = z10;
        }

        @Override // androidx.core.text.C0645d.c
        /* renamed from: a */
        public int mo3446a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int m3444a = C0645d.m3444a(Character.getDirectionality(charSequence.charAt(i10)));
                if (m3444a != 0) {
                    if (m3444a != 1) {
                        continue;
                        i10++;
                    } else if (!this.f3487a) {
                        return 1;
                    }
                } else if (this.f3487a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f3487a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.d$b */
    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a */
        static final b f3488a = new b();

        private b() {
        }

        @Override // androidx.core.text.C0645d.c
        /* renamed from: a */
        public int mo3446a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = C0645d.m3445b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.d$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo3446a(CharSequence charSequence, int i10, int i11);
    }

    /* renamed from: androidx.core.text.d$d */
    /* loaded from: classes.dex */
    private static abstract class d implements InterfaceC0644c {

        /* renamed from: a */
        private final c f3489a;

        d(c cVar) {
            this.f3489a = cVar;
        }

        /* renamed from: c */
        private boolean m3447c(CharSequence charSequence, int i10, int i11) {
            int mo3446a = this.f3489a.mo3446a(charSequence, i10, i11);
            if (mo3446a == 0) {
                return true;
            }
            if (mo3446a != 1) {
                return mo3448b();
            }
            return false;
        }

        @Override // androidx.core.text.InterfaceC0644c
        /* renamed from: a */
        public boolean mo3443a(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                if (this.f3489a == null) {
                    return mo3448b();
                }
                return m3447c(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        protected abstract boolean mo3448b();
    }

    /* renamed from: androidx.core.text.d$e */
    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: b */
        private final boolean f3490b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f3490b = z10;
        }

        @Override // androidx.core.text.C0645d.d
        /* renamed from: b */
        protected boolean mo3448b() {
            return this.f3490b;
        }
    }

    /* renamed from: androidx.core.text.d$f */
    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b */
        static final f f3491b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.C0645d.d
        /* renamed from: b */
        protected boolean mo3448b() {
            return C0646e.m3449a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f3488a;
        f3482c = new e(bVar, false);
        f3483d = new e(bVar, true);
        f3484e = new e(a.f3486b, false);
        f3485f = f.f3491b;
    }

    /* renamed from: a */
    static int m3444a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m3445b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
