package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.content.C0587a;
import androidx.core.graphics.drawable.IconCompat;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p182o0.C4109b;
import p182o0.C4110c;
import p182o0.C4111d;
import p182o0.C4113f;

/* renamed from: androidx.core.app.k */
/* loaded from: classes.dex */
public class C0578k {

    /* renamed from: androidx.core.app.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Bundle f3108a;

        /* renamed from: b */
        private IconCompat f3109b;

        /* renamed from: c */
        private final C0583p[] f3110c;

        /* renamed from: d */
        private final C0583p[] f3111d;

        /* renamed from: e */
        private boolean f3112e;

        /* renamed from: f */
        boolean f3113f;

        /* renamed from: g */
        private final int f3114g;

        /* renamed from: h */
        private final boolean f3115h;

        /* renamed from: i */
        @Deprecated
        public int f3116i;

        /* renamed from: j */
        public CharSequence f3117j;

        /* renamed from: k */
        public PendingIntent f3118k;

        /* renamed from: l */
        private boolean f3119l;

        /* renamed from: androidx.core.app.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6035a {

            /* renamed from: a */
            private final IconCompat f3120a;

            /* renamed from: b */
            private final CharSequence f3121b;

            /* renamed from: c */
            private final PendingIntent f3122c;

            /* renamed from: d */
            private boolean f3123d;

            /* renamed from: e */
            private final Bundle f3124e;

            /* renamed from: f */
            private ArrayList<C0583p> f3125f;

            /* renamed from: g */
            private int f3126g;

            /* renamed from: h */
            private boolean f3127h;

            /* renamed from: i */
            private boolean f3128i;

            /* renamed from: j */
            private boolean f3129j;

            public C6035a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            /* renamed from: c */
            private void m2807c() {
                if (this.f3128i) {
                    Objects.requireNonNull(this.f3122c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* renamed from: a */
            public C6035a m2808a(C0583p c0583p) {
                if (this.f3125f == null) {
                    this.f3125f = new ArrayList<>();
                }
                if (c0583p != null) {
                    this.f3125f.add(c0583p);
                }
                return this;
            }

            /* renamed from: b */
            public a m2809b() {
                m2807c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C0583p> arrayList3 = this.f3125f;
                if (arrayList3 != null) {
                    Iterator<C0583p> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        C0583p next = it.next();
                        if (next.m3007k()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                C0583p[] c0583pArr = arrayList.isEmpty() ? null : (C0583p[]) arrayList.toArray(new C0583p[arrayList.size()]);
                return new a(this.f3120a, this.f3121b, this.f3122c, this.f3124e, arrayList2.isEmpty() ? null : (C0583p[]) arrayList2.toArray(new C0583p[arrayList2.size()]), c0583pArr, this.f3123d, this.f3126g, this.f3127h, this.f3128i, this.f3129j);
            }

            /* renamed from: d */
            public C6035a m2810d(boolean z10) {
                this.f3123d = z10;
                return this;
            }

            public C6035a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.m3219i(null, BuildConfig.FLAVOR, i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C6035a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0583p[] c0583pArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f3123d = true;
                this.f3127h = true;
                this.f3120a = iconCompat;
                this.f3121b = e.m2831e(charSequence);
                this.f3122c = pendingIntent;
                this.f3124e = bundle;
                this.f3125f = c0583pArr == null ? null : new ArrayList<>(Arrays.asList(c0583pArr));
                this.f3123d = z10;
                this.f3126g = i10;
                this.f3127h = z11;
                this.f3128i = z12;
                this.f3129j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.m3219i(null, BuildConfig.FLAVOR, i10) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m2797a() {
            return this.f3118k;
        }

        /* renamed from: b */
        public boolean m2798b() {
            return this.f3112e;
        }

        /* renamed from: c */
        public Bundle m2799c() {
            return this.f3108a;
        }

        /* renamed from: d */
        public IconCompat m2800d() {
            int i10;
            if (this.f3109b == null && (i10 = this.f3116i) != 0) {
                this.f3109b = IconCompat.m3219i(null, BuildConfig.FLAVOR, i10);
            }
            return this.f3109b;
        }

        /* renamed from: e */
        public C0583p[] m2801e() {
            return this.f3110c;
        }

        /* renamed from: f */
        public int m2802f() {
            return this.f3114g;
        }

        /* renamed from: g */
        public boolean m2803g() {
            return this.f3113f;
        }

        /* renamed from: h */
        public CharSequence m2804h() {
            return this.f3117j;
        }

        /* renamed from: i */
        public boolean m2805i() {
            return this.f3119l;
        }

        /* renamed from: j */
        public boolean m2806j() {
            return this.f3115h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0583p[] c0583pArr, C0583p[] c0583pArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f3113f = true;
            this.f3109b = iconCompat;
            if (iconCompat != null && iconCompat.m3224m() == 2) {
                this.f3116i = iconCompat.m3222k();
            }
            this.f3117j = e.m2831e(charSequence);
            this.f3118k = pendingIntent;
            this.f3108a = bundle == null ? new Bundle() : bundle;
            this.f3110c = c0583pArr;
            this.f3111d = c0583pArr2;
            this.f3112e = z10;
            this.f3114g = i10;
            this.f3113f = z11;
            this.f3115h = z12;
            this.f3119l = z13;
        }
    }

    /* renamed from: androidx.core.app.k$b */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: e */
        private IconCompat f3130e;

        /* renamed from: f */
        private IconCompat f3131f;

        /* renamed from: g */
        private boolean f3132g;

        /* renamed from: h */
        private CharSequence f3133h;

        /* renamed from: i */
        private boolean f3134i;

        /* renamed from: androidx.core.app.k$b$a */
        /* loaded from: classes.dex */
        private static class a {
            /* renamed from: a */
            static Notification.BigPictureStyle m2815a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            /* renamed from: b */
            static Notification.BigPictureStyle m2816b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigPictureStyle m2817c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static void m2818d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: e */
            static void m2819e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.k$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C6036b {
            /* renamed from: a */
            static void m2820a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.k$b$c */
        /* loaded from: classes.dex */
        private static class c {
            /* renamed from: a */
            static void m2821a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            static void m2822b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            static void m2823c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.C0578k.g
        /* renamed from: b */
        public void mo2811b(InterfaceC0577j interfaceC0577j) {
            int i10 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle m2817c = a.m2817c(a.m2816b(interfaceC0577j.mo2795a()), this.f3194b);
            IconCompat iconCompat = this.f3130e;
            if (iconCompat != null) {
                if (i10 >= 31) {
                    c.m2821a(m2817c, this.f3130e.m3231t(interfaceC0577j instanceof C0579l ? ((C0579l) interfaceC0577j).m2911f() : null));
                } else if (iconCompat.m3224m() == 1) {
                    m2817c = a.m2815a(m2817c, this.f3130e.m3221j());
                }
            }
            if (this.f3132g) {
                IconCompat iconCompat2 = this.f3131f;
                if (iconCompat2 == null) {
                    a.m2818d(m2817c, null);
                } else if (i10 >= 23) {
                    C6036b.m2820a(m2817c, this.f3131f.m3231t(interfaceC0577j instanceof C0579l ? ((C0579l) interfaceC0577j).m2911f() : null));
                } else if (iconCompat2.m3224m() == 1) {
                    a.m2818d(m2817c, this.f3131f.m3221j());
                } else {
                    a.m2818d(m2817c, null);
                }
            }
            if (this.f3196d) {
                a.m2819e(m2817c, this.f3195c);
            }
            if (i10 >= 31) {
                c.m2823c(m2817c, this.f3134i);
                c.m2822b(m2817c, this.f3133h);
            }
        }

        @Override // androidx.core.app.C0578k.g
        /* renamed from: c */
        protected String mo2812c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public b m2813h(Bitmap bitmap) {
            this.f3131f = bitmap == null ? null : IconCompat.m3215e(bitmap);
            this.f3132g = true;
            return this;
        }

        /* renamed from: i */
        public b m2814i(Bitmap bitmap) {
            this.f3130e = bitmap == null ? null : IconCompat.m3215e(bitmap);
            return this;
        }
    }

    /* renamed from: androidx.core.app.k$c */
    /* loaded from: classes.dex */
    public static class c extends g {

        /* renamed from: e */
        private CharSequence f3135e;

        /* renamed from: androidx.core.app.k$c$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static Notification.BigTextStyle m2826a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            /* renamed from: b */
            static Notification.BigTextStyle m2827b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            /* renamed from: c */
            static Notification.BigTextStyle m2828c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            /* renamed from: d */
            static Notification.BigTextStyle m2829d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.C0578k.g
        /* renamed from: a */
        public void mo2824a(Bundle bundle) {
            super.mo2824a(bundle);
        }

        @Override // androidx.core.app.C0578k.g
        /* renamed from: b */
        public void mo2811b(InterfaceC0577j interfaceC0577j) {
            Notification.BigTextStyle m2826a = a.m2826a(a.m2828c(a.m2827b(interfaceC0577j.mo2795a()), this.f3194b), this.f3135e);
            if (this.f3196d) {
                a.m2829d(m2826a, this.f3195c);
            }
        }

        @Override // androidx.core.app.C0578k.g
        /* renamed from: c */
        protected String mo2812c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public c m2825h(CharSequence charSequence) {
            this.f3135e = e.m2831e(charSequence);
            return this;
        }
    }

    /* renamed from: androidx.core.app.k$d */
    /* loaded from: classes.dex */
    public static final class d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m2830a(d dVar) {
            return null;
        }
    }

    /* renamed from: androidx.core.app.k$f */
    /* loaded from: classes.dex */
    public static class f extends g {

        /* renamed from: e */
        private int f3183e;

        /* renamed from: f */
        private C0582o f3184f;

        /* renamed from: g */
        private PendingIntent f3185g;

        /* renamed from: h */
        private PendingIntent f3186h;

        /* renamed from: i */
        private PendingIntent f3187i;

        /* renamed from: j */
        private boolean f3188j;

        /* renamed from: k */
        private Integer f3189k;

        /* renamed from: l */
        private Integer f3190l;

        /* renamed from: m */
        private IconCompat f3191m;

        /* renamed from: n */
        private CharSequence f3192n;

        /* renamed from: androidx.core.app.k$f$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static void m2879a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.k$f$b */
        /* loaded from: classes.dex */
        public static class b {
            /* renamed from: a */
            static Notification.Builder m2880a(Notification.Builder builder, Notification.Action action) {
                return builder.addAction(action);
            }

            /* renamed from: b */
            static Notification.Action.Builder m2881b(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            /* renamed from: c */
            static Notification.Action.Builder m2882c(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            /* renamed from: d */
            static Notification.Action m2883d(Notification.Action.Builder builder) {
                return builder.build();
            }

            /* renamed from: e */
            static Notification.Action.Builder m2884e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }
        }

        /* renamed from: androidx.core.app.k$f$c */
        /* loaded from: classes.dex */
        static class c {
            /* renamed from: a */
            static Notification.Builder m2885a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            /* renamed from: b */
            static Notification.Builder m2886b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.k$f$d */
        /* loaded from: classes.dex */
        public static class d {
            /* renamed from: a */
            static Notification.Action.Builder m2887a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            /* renamed from: b */
            static void m2888b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.k$f$e */
        /* loaded from: classes.dex */
        public static class e {
            /* renamed from: a */
            static Notification.Builder m2889a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            /* renamed from: b */
            static Notification.Action.Builder m2890b(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        /* renamed from: androidx.core.app.k$f$f, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C6037f {
            /* renamed from: a */
            static Notification.Builder m2891a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.app.k$f$g */
        /* loaded from: classes.dex */
        public static class g {
            /* renamed from: a */
            static Notification.CallStyle m2892a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            /* renamed from: b */
            static Notification.CallStyle m2893b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            /* renamed from: c */
            static Notification.CallStyle m2894c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            /* renamed from: d */
            static Notification.CallStyle m2895d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            /* renamed from: e */
            static Notification.Action.Builder m2896e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            /* renamed from: f */
            static Notification.CallStyle m2897f(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            /* renamed from: g */
            static Notification.CallStyle m2898g(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            /* renamed from: h */
            static Notification.CallStyle m2899h(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            /* renamed from: i */
            static Notification.CallStyle m2900i(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private f(int i10, C0582o c0582o, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (c0582o != null && !TextUtils.isEmpty(c0582o.m2981c())) {
                this.f3183e = i10;
                this.f3184f = c0582o;
                this.f3185g = pendingIntent3;
                this.f3186h = pendingIntent2;
                this.f3187i = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }

        /* renamed from: h */
        public static f m2868h(C0582o c0582o, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new f(1, c0582o, null, pendingIntent, pendingIntent2);
        }

        /* renamed from: i */
        public static f m2869i(C0582o c0582o, PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new f(2, c0582o, pendingIntent, null, null);
        }

        /* renamed from: j */
        private static Notification.Action m2870j(a aVar) {
            Notification.Action.Builder m2884e;
            Bundle bundle;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                IconCompat m2800d = aVar.m2800d();
                m2884e = d.m2887a(m2800d == null ? null : m2800d.m3230s(), aVar.m2804h(), aVar.m2797a());
            } else {
                IconCompat m2800d2 = aVar.m2800d();
                m2884e = b.m2884e((m2800d2 == null || m2800d2.m3224m() != 2) ? 0 : m2800d2.m3222k(), aVar.m2804h(), aVar.m2797a());
            }
            if (aVar.m2799c() != null) {
                bundle = new Bundle(aVar.m2799c());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m2798b());
            if (i10 >= 24) {
                e.m2890b(m2884e, aVar.m2798b());
            }
            if (i10 >= 31) {
                g.m2896e(m2884e, aVar.m2805i());
            }
            b.m2881b(m2884e, bundle);
            C0583p[] m2801e = aVar.m2801e();
            if (m2801e != null) {
                for (RemoteInput remoteInput : C0583p.m2998b(m2801e)) {
                    b.m2882c(m2884e, remoteInput);
                }
            }
            return b.m2883d(m2884e);
        }

        /* renamed from: l */
        private String m2871l() {
            int i10 = this.f3183e;
            if (i10 == 1) {
                return this.f3193a.f3157a.getResources().getString(C4113f.f16734e);
            }
            if (i10 == 2) {
                return this.f3193a.f3157a.getResources().getString(C4113f.f16735f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f3193a.f3157a.getResources().getString(C4113f.f16736g);
        }

        /* renamed from: m */
        private boolean m2872m(a aVar) {
            return aVar != null && aVar.m2799c().getBoolean("key_action_priority");
        }

        /* renamed from: n */
        private a m2873n(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C0587a.m3029c(this.f3193a.f3157a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f3193a.f3157a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a m2809b = new a.C6035a(IconCompat.m3218h(this.f3193a.f3157a, i10), spannableStringBuilder, pendingIntent).m2809b();
            m2809b.m2799c().putBoolean("key_action_priority", true);
            return m2809b;
        }

        /* renamed from: o */
        private a m2874o() {
            int i10;
            int i11 = C4111d.f16683b;
            int i12 = C4111d.f16682a;
            PendingIntent pendingIntent = this.f3185g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f3188j;
            int i13 = z10 ? i11 : i12;
            if (z10) {
                i10 = C4113f.f16731b;
            } else {
                i10 = C4113f.f16730a;
            }
            return m2873n(i13, i10, this.f3189k, C4109b.f16678a, pendingIntent);
        }

        /* renamed from: p */
        private a m2875p() {
            int i10 = C4111d.f16684c;
            PendingIntent pendingIntent = this.f3186h;
            if (pendingIntent == null) {
                return m2873n(i10, C4113f.f16733d, this.f3190l, C4109b.f16679b, this.f3187i);
            }
            return m2873n(i10, C4113f.f16732c, this.f3190l, C4109b.f16679b, pendingIntent);
        }

        @Override // androidx.core.app.C0578k.g
        /* renamed from: a */
        public void mo2824a(Bundle bundle) {
            super.mo2824a(bundle);
            bundle.putInt("android.callType", this.f3183e);
            bundle.putBoolean("android.callIsVideo", this.f3188j);
            C0582o c0582o = this.f3184f;
            if (c0582o != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c0582o.m2986h());
                } else {
                    bundle.putParcelable("android.callPersonCompat", c0582o.m2987i());
                }
            }
            IconCompat iconCompat = this.f3191m;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    bundle.putParcelable("android.verificationIcon", iconCompat.m3231t(this.f3193a.f3157a));
                } else {
                    bundle.putParcelable("android.verificationIconCompat", iconCompat.m3229r());
                }
            }
            bundle.putCharSequence("android.verificationText", this.f3192n);
            bundle.putParcelable("android.answerIntent", this.f3185g);
            bundle.putParcelable("android.declineIntent", this.f3186h);
            bundle.putParcelable("android.hangUpIntent", this.f3187i);
            Integer num = this.f3189k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f3190l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.C0578k.g
        /* renamed from: b */
        public void mo2811b(InterfaceC0577j interfaceC0577j) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r1 = null;
            Notification.CallStyle m2892a = null;
            charSequence = null;
            if (i10 >= 31) {
                int i11 = this.f3183e;
                if (i11 == 1) {
                    m2892a = g.m2892a(this.f3184f.m2986h(), this.f3186h, this.f3185g);
                } else if (i11 == 2) {
                    m2892a = g.m2893b(this.f3184f.m2986h(), this.f3187i);
                } else if (i11 != 3) {
                    if (Log.isLoggable("NotifCompat", 3)) {
                        Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f3183e));
                    }
                } else {
                    m2892a = g.m2894c(this.f3184f.m2986h(), this.f3187i, this.f3185g);
                }
                if (m2892a != null) {
                    e.m2889a(interfaceC0577j.mo2795a());
                    a.m2879a(m2892a, interfaceC0577j.mo2795a());
                    Integer num = this.f3189k;
                    if (num != null) {
                        g.m2895d(m2892a, num.intValue());
                    }
                    Integer num2 = this.f3190l;
                    if (num2 != null) {
                        g.m2897f(m2892a, num2.intValue());
                    }
                    g.m2900i(m2892a, this.f3192n);
                    IconCompat iconCompat = this.f3191m;
                    if (iconCompat != null) {
                        g.m2899h(m2892a, iconCompat.m3231t(this.f3193a.f3157a));
                    }
                    g.m2898g(m2892a, this.f3188j);
                    return;
                }
                return;
            }
            Notification.Builder mo2795a = interfaceC0577j.mo2795a();
            C0582o c0582o = this.f3184f;
            mo2795a.setContentTitle(c0582o != null ? c0582o.m2981c() : null);
            Bundle bundle = this.f3193a.f3139D;
            if (bundle != null && bundle.containsKey("android.text")) {
                charSequence = this.f3193a.f3139D.getCharSequence("android.text");
            }
            if (charSequence == null) {
                charSequence = m2871l();
            }
            mo2795a.setContentText(charSequence);
            C0582o c0582o2 = this.f3184f;
            if (c0582o2 != null) {
                if (i10 >= 23 && c0582o2.m2979a() != null) {
                    d.m2888b(mo2795a, this.f3184f.m2979a().m3231t(this.f3193a.f3157a));
                }
                if (i10 >= 28) {
                    C6037f.m2891a(mo2795a, this.f3184f.m2986h());
                } else {
                    c.m2885a(mo2795a, this.f3184f.m2982d());
                }
            }
            ArrayList<a> m2876k = m2876k();
            if (i10 >= 24) {
                e.m2889a(mo2795a);
            }
            Iterator<a> it = m2876k.iterator();
            while (it.hasNext()) {
                b.m2880a(mo2795a, m2870j(it.next()));
            }
            c.m2886b(mo2795a, "call");
        }

        @Override // androidx.core.app.C0578k.g
        /* renamed from: c */
        protected String mo2812c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        /* renamed from: k */
        public ArrayList<a> m2876k() {
            a m2875p = m2875p();
            a m2874o = m2874o();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(m2875p);
            int i10 = 2;
            ArrayList<a> arrayList2 = this.f3193a.f3158b;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.m2806j()) {
                        arrayList.add(aVar);
                    } else if (!m2872m(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (m2874o != null && i10 == 1) {
                        arrayList.add(m2874o);
                        i10--;
                    }
                }
            }
            if (m2874o != null && i10 >= 1) {
                arrayList.add(m2874o);
            }
            return arrayList;
        }

        /* renamed from: q */
        public f m2877q(int i10) {
            this.f3189k = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: r */
        public f m2878r(int i10) {
            this.f3190l = Integer.valueOf(i10);
            return this;
        }
    }

    /* renamed from: androidx.core.app.k$g */
    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a */
        protected e f3193a;

        /* renamed from: b */
        CharSequence f3194b;

        /* renamed from: c */
        CharSequence f3195c;

        /* renamed from: d */
        boolean f3196d = false;

        /* renamed from: a */
        public void mo2824a(Bundle bundle) {
            if (this.f3196d) {
                bundle.putCharSequence("android.summaryText", this.f3195c);
            }
            CharSequence charSequence = this.f3194b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String mo2812c = mo2812c();
            if (mo2812c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo2812c);
            }
        }

        /* renamed from: b */
        public abstract void mo2811b(InterfaceC0577j interfaceC0577j);

        /* renamed from: c */
        protected abstract String mo2812c();

        /* renamed from: d */
        public RemoteViews m2901d(InterfaceC0577j interfaceC0577j) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m2902e(InterfaceC0577j interfaceC0577j) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m2903f(InterfaceC0577j interfaceC0577j) {
            return null;
        }

        /* renamed from: g */
        public void m2904g(e eVar) {
            if (this.f3193a != eVar) {
                this.f3193a = eVar;
                if (eVar != null) {
                    eVar.m2835B(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2796a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: androidx.core.app.k$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: A */
        boolean f3136A;

        /* renamed from: B */
        boolean f3137B;

        /* renamed from: C */
        String f3138C;

        /* renamed from: D */
        Bundle f3139D;

        /* renamed from: E */
        int f3140E;

        /* renamed from: F */
        int f3141F;

        /* renamed from: G */
        Notification f3142G;

        /* renamed from: H */
        RemoteViews f3143H;

        /* renamed from: I */
        RemoteViews f3144I;

        /* renamed from: J */
        RemoteViews f3145J;

        /* renamed from: K */
        String f3146K;

        /* renamed from: L */
        int f3147L;

        /* renamed from: M */
        String f3148M;

        /* renamed from: N */
        long f3149N;

        /* renamed from: O */
        int f3150O;

        /* renamed from: P */
        int f3151P;

        /* renamed from: Q */
        boolean f3152Q;

        /* renamed from: R */
        Notification f3153R;

        /* renamed from: S */
        boolean f3154S;

        /* renamed from: T */
        Object f3155T;

        /* renamed from: U */
        @Deprecated
        public ArrayList<String> f3156U;

        /* renamed from: a */
        public Context f3157a;

        /* renamed from: b */
        public ArrayList<a> f3158b;

        /* renamed from: c */
        public ArrayList<C0582o> f3159c;

        /* renamed from: d */
        ArrayList<a> f3160d;

        /* renamed from: e */
        CharSequence f3161e;

        /* renamed from: f */
        CharSequence f3162f;

        /* renamed from: g */
        PendingIntent f3163g;

        /* renamed from: h */
        PendingIntent f3164h;

        /* renamed from: i */
        RemoteViews f3165i;

        /* renamed from: j */
        Bitmap f3166j;

        /* renamed from: k */
        CharSequence f3167k;

        /* renamed from: l */
        int f3168l;

        /* renamed from: m */
        int f3169m;

        /* renamed from: n */
        boolean f3170n;

        /* renamed from: o */
        boolean f3171o;

        /* renamed from: p */
        g f3172p;

        /* renamed from: q */
        CharSequence f3173q;

        /* renamed from: r */
        CharSequence f3174r;

        /* renamed from: s */
        CharSequence[] f3175s;

        /* renamed from: t */
        int f3176t;

        /* renamed from: u */
        int f3177u;

        /* renamed from: v */
        boolean f3178v;

        /* renamed from: w */
        String f3179w;

        /* renamed from: x */
        boolean f3180x;

        /* renamed from: y */
        String f3181y;

        /* renamed from: z */
        boolean f3182z;

        /* renamed from: androidx.core.app.k$e$a */
        /* loaded from: classes.dex */
        static class a {
            /* renamed from: a */
            static AudioAttributes m2863a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* renamed from: b */
            static AudioAttributes.Builder m2864b() {
                return new AudioAttributes.Builder();
            }

            /* renamed from: c */
            static AudioAttributes.Builder m2865c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            /* renamed from: d */
            static AudioAttributes.Builder m2866d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            /* renamed from: e */
            static AudioAttributes.Builder m2867e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f3158b = new ArrayList<>();
            this.f3159c = new ArrayList<>();
            this.f3160d = new ArrayList<>();
            this.f3170n = true;
            this.f3182z = false;
            this.f3140E = 0;
            this.f3141F = 0;
            this.f3147L = 0;
            this.f3150O = 0;
            this.f3151P = 0;
            Notification notification = new Notification();
            this.f3153R = notification;
            this.f3157a = context;
            this.f3146K = str;
            notification.when = System.currentTimeMillis();
            this.f3153R.audioStreamType = -1;
            this.f3169m = 0;
            this.f3156U = new ArrayList<>();
            this.f3152Q = true;
        }

        /* renamed from: e */
        protected static CharSequence m2831e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: f */
        private Bitmap m2832f(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f3157a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C4110c.f16681b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C4110c.f16680a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        /* renamed from: r */
        private void m2833r(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f3153R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f3153R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        /* renamed from: A */
        public e m2834A(Uri uri) {
            Notification notification = this.f3153R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder m2867e = a.m2867e(a.m2865c(a.m2864b(), 4), 5);
            this.f3153R.audioAttributes = a.m2863a(m2867e);
            return this;
        }

        /* renamed from: B */
        public e m2835B(g gVar) {
            if (this.f3172p != gVar) {
                this.f3172p = gVar;
                if (gVar != null) {
                    gVar.m2904g(this);
                }
            }
            return this;
        }

        /* renamed from: C */
        public e m2836C(CharSequence charSequence) {
            this.f3153R.tickerText = m2831e(charSequence);
            return this;
        }

        /* renamed from: D */
        public e m2837D(long[] jArr) {
            this.f3153R.vibrate = jArr;
            return this;
        }

        /* renamed from: E */
        public e m2838E(int i10) {
            this.f3141F = i10;
            return this;
        }

        /* renamed from: F */
        public e m2839F(long j10) {
            this.f3153R.when = j10;
            return this;
        }

        /* renamed from: a */
        public e m2840a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3158b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public e m2841b(a aVar) {
            if (aVar != null) {
                this.f3158b.add(aVar);
            }
            return this;
        }

        /* renamed from: c */
        public Notification m2842c() {
            return new C0579l(this).m2909c();
        }

        /* renamed from: d */
        public Bundle m2843d() {
            if (this.f3139D == null) {
                this.f3139D = new Bundle();
            }
            return this.f3139D;
        }

        /* renamed from: g */
        public e m2844g(boolean z10) {
            m2833r(16, z10);
            return this;
        }

        /* renamed from: h */
        public e m2845h(String str) {
            this.f3138C = str;
            return this;
        }

        /* renamed from: i */
        public e m2846i(String str) {
            this.f3146K = str;
            return this;
        }

        /* renamed from: j */
        public e m2847j(int i10) {
            this.f3140E = i10;
            return this;
        }

        /* renamed from: k */
        public e m2848k(boolean z10) {
            this.f3136A = z10;
            this.f3137B = true;
            return this;
        }

        /* renamed from: l */
        public e m2849l(RemoteViews remoteViews) {
            this.f3153R.contentView = remoteViews;
            return this;
        }

        /* renamed from: m */
        public e m2850m(PendingIntent pendingIntent) {
            this.f3163g = pendingIntent;
            return this;
        }

        /* renamed from: n */
        public e m2851n(CharSequence charSequence) {
            this.f3162f = m2831e(charSequence);
            return this;
        }

        /* renamed from: o */
        public e m2852o(CharSequence charSequence) {
            this.f3161e = m2831e(charSequence);
            return this;
        }

        /* renamed from: p */
        public e m2853p(int i10) {
            Notification notification = this.f3153R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: q */
        public e m2854q(PendingIntent pendingIntent) {
            this.f3153R.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: s */
        public e m2855s(PendingIntent pendingIntent, boolean z10) {
            this.f3164h = pendingIntent;
            m2833r(128, z10);
            return this;
        }

        /* renamed from: t */
        public e m2856t(Bitmap bitmap) {
            this.f3166j = m2832f(bitmap);
            return this;
        }

        /* renamed from: u */
        public e m2857u(int i10, int i11, int i12) {
            Notification notification = this.f3153R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* renamed from: v */
        public e m2858v(boolean z10) {
            this.f3182z = z10;
            return this;
        }

        /* renamed from: w */
        public e m2859w(int i10) {
            this.f3168l = i10;
            return this;
        }

        /* renamed from: x */
        public e m2860x(boolean z10) {
            m2833r(2, z10);
            return this;
        }

        /* renamed from: y */
        public e m2861y(int i10) {
            this.f3169m = i10;
            return this;
        }

        /* renamed from: z */
        public e m2862z(int i10) {
            this.f3153R.icon = i10;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
