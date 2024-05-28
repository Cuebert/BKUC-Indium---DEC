package androidx.core.text;

import android.text.SpannableStringBuilder;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
/* loaded from: classes.dex */
public final class C0642a {

    /* renamed from: d */
    static final InterfaceC0644c f3450d;

    /* renamed from: e */
    private static final String f3451e;

    /* renamed from: f */
    private static final String f3452f;

    /* renamed from: g */
    static final C0642a f3453g;

    /* renamed from: h */
    static final C0642a f3454h;

    /* renamed from: a */
    private final boolean f3455a;

    /* renamed from: b */
    private final int f3456b;

    /* renamed from: c */
    private final InterfaceC0644c f3457c;

    /* renamed from: androidx.core.text.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f3458a;

        /* renamed from: b */
        private int f3459b;

        /* renamed from: c */
        private InterfaceC0644c f3460c;

        public a() {
            m3421c(C0642a.m3412e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0642a m3420b(boolean z10) {
            return z10 ? C0642a.f3454h : C0642a.f3453g;
        }

        /* renamed from: c */
        private void m3421c(boolean z10) {
            this.f3458a = z10;
            this.f3460c = C0642a.f3450d;
            this.f3459b = 2;
        }

        /* renamed from: a */
        public C0642a m3422a() {
            if (this.f3459b == 2 && this.f3460c == C0642a.f3450d) {
                return m3420b(this.f3458a);
            }
            return new C0642a(this.f3458a, this.f3459b, this.f3460c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f */
        private static final byte[] f3461f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f3462a;

        /* renamed from: b */
        private final boolean f3463b;

        /* renamed from: c */
        private final int f3464c;

        /* renamed from: d */
        private int f3465d;

        /* renamed from: e */
        private char f3466e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f3461f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f3462a = charSequence;
            this.f3463b = z10;
            this.f3464c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m3423c(char c10) {
            return c10 < 1792 ? f3461f[c10] : Character.getDirectionality(c10);
        }

        /* renamed from: f */
        private byte m3424f() {
            char charAt;
            int i10 = this.f3465d;
            do {
                int i11 = this.f3465d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3462a;
                int i12 = i11 - 1;
                this.f3465d = i12;
                charAt = charSequence.charAt(i12);
                this.f3466e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f3465d = i10;
            this.f3466e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        private byte m3425g() {
            char charAt;
            do {
                int i10 = this.f3465d;
                if (i10 >= this.f3464c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f3462a;
                this.f3465d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f3466e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m3426h() {
            char charAt;
            int i10 = this.f3465d;
            while (true) {
                int i11 = this.f3465d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3462a;
                int i12 = i11 - 1;
                this.f3465d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f3466e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f3465d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f3462a;
                            int i14 = i13 - 1;
                            this.f3465d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f3466e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f3465d = i10;
            this.f3466e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        private byte m3427i() {
            char charAt;
            int i10 = this.f3465d;
            while (true) {
                int i11 = this.f3465d;
                if (i11 < this.f3464c) {
                    CharSequence charSequence = this.f3462a;
                    this.f3465d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f3466e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f3465d;
                            if (i12 < this.f3464c) {
                                CharSequence charSequence2 = this.f3462a;
                                this.f3465d = i12 + 1;
                                charAt = charSequence2.charAt(i12);
                                this.f3466e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f3465d = i10;
                    this.f3466e = '<';
                    return (byte) 13;
                }
            }
        }

        /* renamed from: a */
        byte m3428a() {
            char charAt = this.f3462a.charAt(this.f3465d - 1);
            this.f3466e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3462a, this.f3465d);
                this.f3465d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3465d--;
            byte m3423c = m3423c(this.f3466e);
            if (!this.f3463b) {
                return m3423c;
            }
            char c10 = this.f3466e;
            if (c10 == '>') {
                return m3426h();
            }
            return c10 == ';' ? m3424f() : m3423c;
        }

        /* renamed from: b */
        byte m3429b() {
            char charAt = this.f3462a.charAt(this.f3465d);
            this.f3466e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f3462a, this.f3465d);
                this.f3465d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3465d++;
            byte m3423c = m3423c(this.f3466e);
            if (!this.f3463b) {
                return m3423c;
            }
            char c10 = this.f3466e;
            if (c10 == '<') {
                return m3427i();
            }
            return c10 == '&' ? m3425g() : m3423c;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0045. Please report as an issue. */
        /* renamed from: d */
        int m3430d() {
            this.f3465d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f3465d < this.f3464c && i10 == 0) {
                byte m3429b = m3429b();
                if (m3429b != 0) {
                    if (m3429b == 1 || m3429b == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (m3429b != 9) {
                        switch (m3429b) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f3465d > 0) {
                switch (m3428a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        i12--;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        i12--;
                    case 18:
                        i12++;
                }
            }
            return 0;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:33:0x001c. Please report as an issue. */
        /* renamed from: e */
        int m3431e() {
            this.f3465d = this.f3464c;
            int i10 = 0;
            int i11 = 0;
            while (this.f3465d > 0) {
                byte m3428a = m3428a();
                if (m3428a != 0) {
                    if (m3428a == 1 || m3428a == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                            i11 = i10;
                        }
                    } else if (m3428a != 9) {
                        switch (m3428a) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                    break;
                                } else {
                                    i11 = i10;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                        i11 = i10;
                    }
                }
            }
            return 0;
        }
    }

    static {
        InterfaceC0644c interfaceC0644c = C0645d.f3482c;
        f3450d = interfaceC0644c;
        f3451e = Character.toString((char) 8206);
        f3452f = Character.toString((char) 8207);
        f3453g = new C0642a(false, 2, interfaceC0644c);
        f3454h = new C0642a(true, 2, interfaceC0644c);
    }

    C0642a(boolean z10, int i10, InterfaceC0644c interfaceC0644c) {
        this.f3455a = z10;
        this.f3456b = i10;
        this.f3457c = interfaceC0644c;
    }

    /* renamed from: a */
    private static int m3409a(CharSequence charSequence) {
        return new b(charSequence, false).m3430d();
    }

    /* renamed from: b */
    private static int m3410b(CharSequence charSequence) {
        return new b(charSequence, false).m3431e();
    }

    /* renamed from: c */
    public static C0642a m3411c() {
        return new a().m3422a();
    }

    /* renamed from: e */
    static boolean m3412e(Locale locale) {
        return C0646e.m3449a(locale) == 1;
    }

    /* renamed from: f */
    private String m3413f(CharSequence charSequence, InterfaceC0644c interfaceC0644c) {
        boolean mo3443a = interfaceC0644c.mo3443a(charSequence, 0, charSequence.length());
        if (this.f3455a || !(mo3443a || m3410b(charSequence) == 1)) {
            return this.f3455a ? (!mo3443a || m3410b(charSequence) == -1) ? f3452f : BuildConfig.FLAVOR : BuildConfig.FLAVOR;
        }
        return f3451e;
    }

    /* renamed from: g */
    private String m3414g(CharSequence charSequence, InterfaceC0644c interfaceC0644c) {
        boolean mo3443a = interfaceC0644c.mo3443a(charSequence, 0, charSequence.length());
        if (this.f3455a || !(mo3443a || m3409a(charSequence) == 1)) {
            return this.f3455a ? (!mo3443a || m3409a(charSequence) == -1) ? f3452f : BuildConfig.FLAVOR : BuildConfig.FLAVOR;
        }
        return f3451e;
    }

    /* renamed from: d */
    public boolean m3415d() {
        return (this.f3456b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m3416h(CharSequence charSequence) {
        return m3417i(charSequence, this.f3457c, true);
    }

    /* renamed from: i */
    public CharSequence m3417i(CharSequence charSequence, InterfaceC0644c interfaceC0644c, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean mo3443a = interfaceC0644c.mo3443a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m3415d() && z10) {
            spannableStringBuilder.append((CharSequence) m3414g(charSequence, mo3443a ? C0645d.f3481b : C0645d.f3480a));
        }
        if (mo3443a != this.f3455a) {
            spannableStringBuilder.append(mo3443a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) m3413f(charSequence, mo3443a ? C0645d.f3481b : C0645d.f3480a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m3418j(String str) {
        return m3419k(str, this.f3457c, true);
    }

    /* renamed from: k */
    public String m3419k(String str, InterfaceC0644c interfaceC0644c, boolean z10) {
        if (str == null) {
            return null;
        }
        return m3417i(str, interfaceC0644c, z10).toString();
    }
}
