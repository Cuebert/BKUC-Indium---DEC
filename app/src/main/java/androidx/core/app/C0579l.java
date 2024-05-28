package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.C0578k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p093h0.C3357b;

/* renamed from: androidx.core.app.l */
/* loaded from: classes.dex */
public class C0579l implements InterfaceC0577j {

    /* renamed from: a */
    private final Context f3197a;

    /* renamed from: b */
    private final Notification.Builder f3198b;

    /* renamed from: c */
    private final C0578k.e f3199c;

    /* renamed from: d */
    private RemoteViews f3200d;

    /* renamed from: e */
    private RemoteViews f3201e;

    /* renamed from: f */
    private final List<Bundle> f3202f = new ArrayList();

    /* renamed from: g */
    private final Bundle f3203g = new Bundle();

    /* renamed from: h */
    private int f3204h;

    /* renamed from: i */
    private RemoteViews f3205i;

    /* renamed from: androidx.core.app.l$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Notification m2912a(Notification.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        static Notification.Builder m2913b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        /* renamed from: c */
        static Notification.Builder m2914c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        /* renamed from: d */
        static Notification.Builder m2915d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.l$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static Notification.Builder m2916a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* renamed from: androidx.core.app.l$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static Notification.Builder m2917a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.app.l$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        static Notification.Builder m2918a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* renamed from: b */
        static Notification.Action.Builder m2919b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* renamed from: c */
        static Notification.Action.Builder m2920c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* renamed from: d */
        static Notification.Action m2921d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* renamed from: e */
        static Notification.Action.Builder m2922e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        /* renamed from: f */
        static String m2923f(Notification notification) {
            return notification.getGroup();
        }

        /* renamed from: g */
        static Notification.Builder m2924g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* renamed from: h */
        static Notification.Builder m2925h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        /* renamed from: i */
        static Notification.Builder m2926i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        /* renamed from: j */
        static Notification.Builder m2927j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.l$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        static Notification.Builder m2928a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* renamed from: b */
        static Notification.Builder m2929b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* renamed from: c */
        static Notification.Builder m2930c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        /* renamed from: d */
        static Notification.Builder m2931d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* renamed from: e */
        static Notification.Builder m2932e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* renamed from: f */
        static Notification.Builder m2933f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* renamed from: androidx.core.app.l$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        static Notification.Action.Builder m2934a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* renamed from: b */
        static Notification.Builder m2935b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: androidx.core.app.l$g */
    /* loaded from: classes.dex */
    public static class g {
        /* renamed from: a */
        static Notification.Action.Builder m2936a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        /* renamed from: b */
        static Notification.Builder m2937b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* renamed from: c */
        static Notification.Builder m2938c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* renamed from: d */
        static Notification.Builder m2939d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* renamed from: e */
        static Notification.Builder m2940e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.l$h */
    /* loaded from: classes.dex */
    public static class h {
        /* renamed from: a */
        static Notification.Builder m2941a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* renamed from: b */
        static Notification.Builder m2942b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        /* renamed from: c */
        static Notification.Builder m2943c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        /* renamed from: d */
        static Notification.Builder m2944d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        /* renamed from: e */
        static Notification.Builder m2945e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        /* renamed from: f */
        static Notification.Builder m2946f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        /* renamed from: g */
        static Notification.Builder m2947g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* renamed from: androidx.core.app.l$i */
    /* loaded from: classes.dex */
    public static class i {
        /* renamed from: a */
        static Notification.Builder m2948a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        /* renamed from: b */
        static Notification.Action.Builder m2949b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* renamed from: androidx.core.app.l$j */
    /* loaded from: classes.dex */
    public static class j {
        /* renamed from: a */
        static Notification.Builder m2950a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        /* renamed from: b */
        static Notification.Builder m2951b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        /* renamed from: c */
        static Notification.Action.Builder m2952c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        /* renamed from: d */
        static Notification.Builder m2953d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: androidx.core.app.l$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        static Notification.Action.Builder m2954a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        /* renamed from: b */
        static Notification.Builder m2955b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    public C0579l(C0578k.e eVar) {
        List list;
        int i10;
        Object obj;
        this.f3199c = eVar;
        Context context = eVar.f3157a;
        this.f3197a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3198b = h.m2941a(context, eVar.f3146K);
        } else {
            this.f3198b = new Notification.Builder(eVar.f3157a);
        }
        Notification notification = eVar.f3153R;
        this.f3198b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f3165i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f3161e).setContentText(eVar.f3162f).setContentInfo(eVar.f3167k).setContentIntent(eVar.f3163g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f3164h, (notification.flags & 128) != 0).setLargeIcon(eVar.f3166j).setNumber(eVar.f3168l).setProgress(eVar.f3176t, eVar.f3177u, eVar.f3178v);
        a.m2913b(a.m2915d(a.m2914c(this.f3198b, eVar.f3173q), eVar.f3171o), eVar.f3169m);
        Iterator<C0578k.a> it = eVar.f3158b.iterator();
        while (it.hasNext()) {
            m2905b(it.next());
        }
        Bundle bundle = eVar.f3139D;
        if (bundle != null) {
            this.f3203g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f3200d = eVar.f3143H;
        this.f3201e = eVar.f3144I;
        b.m2916a(this.f3198b, eVar.f3170n);
        d.m2926i(this.f3198b, eVar.f3182z);
        d.m2924g(this.f3198b, eVar.f3179w);
        d.m2927j(this.f3198b, eVar.f3181y);
        d.m2925h(this.f3198b, eVar.f3180x);
        this.f3204h = eVar.f3150O;
        e.m2929b(this.f3198b, eVar.f3138C);
        e.m2930c(this.f3198b, eVar.f3140E);
        e.m2933f(this.f3198b, eVar.f3141F);
        e.m2931d(this.f3198b, eVar.f3142G);
        e.m2932e(this.f3198b, notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            list = m2906e(m2907g(eVar.f3159c), eVar.f3156U);
        } else {
            list = eVar.f3156U;
        }
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                e.m2928a(this.f3198b, (String) it2.next());
            }
        }
        this.f3205i = eVar.f3145J;
        if (eVar.f3160d.size() > 0) {
            Bundle bundle2 = eVar.m2843d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f3160d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), C0580m.m2956a(eVar.f3160d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.m2843d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3203g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 23 && (obj = eVar.f3155T) != null) {
            f.m2935b(this.f3198b, obj);
        }
        if (i13 >= 24) {
            c.m2917a(this.f3198b, eVar.f3139D);
            g.m2940e(this.f3198b, eVar.f3175s);
            RemoteViews remoteViews = eVar.f3143H;
            if (remoteViews != null) {
                g.m2938c(this.f3198b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f3144I;
            if (remoteViews2 != null) {
                g.m2937b(this.f3198b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f3145J;
            if (remoteViews3 != null) {
                g.m2939d(this.f3198b, remoteViews3);
            }
        }
        if (i13 >= 26) {
            h.m2942b(this.f3198b, eVar.f3147L);
            h.m2945e(this.f3198b, eVar.f3174r);
            h.m2946f(this.f3198b, eVar.f3148M);
            h.m2947g(this.f3198b, eVar.f3149N);
            h.m2944d(this.f3198b, eVar.f3150O);
            if (eVar.f3137B) {
                h.m2943c(this.f3198b, eVar.f3136A);
            }
            if (!TextUtils.isEmpty(eVar.f3146K)) {
                this.f3198b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<C0582o> it3 = eVar.f3159c.iterator();
            while (it3.hasNext()) {
                i.m2948a(this.f3198b, it3.next().m2986h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            j.m2950a(this.f3198b, eVar.f3152Q);
            j.m2951b(this.f3198b, C0578k.d.m2830a(null));
        }
        if (i14 >= 31 && (i10 = eVar.f3151P) != 0) {
            k.m2955b(this.f3198b, i10);
        }
        if (eVar.f3154S) {
            if (this.f3199c.f3180x) {
                this.f3204h = 2;
            } else {
                this.f3204h = 1;
            }
            this.f3198b.setVibrate(null);
            this.f3198b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f3198b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f3199c.f3179w)) {
                    d.m2924g(this.f3198b, "silent");
                }
                h.m2944d(this.f3198b, this.f3204h);
            }
        }
    }

    /* renamed from: b */
    private void m2905b(C0578k.a aVar) {
        Notification.Action.Builder m2922e;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        IconCompat m2800d = aVar.m2800d();
        if (i10 >= 23) {
            m2922e = f.m2934a(m2800d != null ? m2800d.m3230s() : null, aVar.m2804h(), aVar.m2797a());
        } else {
            m2922e = d.m2922e(m2800d != null ? m2800d.m3222k() : 0, aVar.m2804h(), aVar.m2797a());
        }
        if (aVar.m2801e() != null) {
            for (RemoteInput remoteInput : C0583p.m2998b(aVar.m2801e())) {
                d.m2920c(m2922e, remoteInput);
            }
        }
        if (aVar.m2799c() != null) {
            bundle = new Bundle(aVar.m2799c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m2798b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            g.m2936a(m2922e, aVar.m2798b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.m2802f());
        if (i11 >= 28) {
            i.m2949b(m2922e, aVar.m2802f());
        }
        if (i11 >= 29) {
            j.m2952c(m2922e, aVar.m2806j());
        }
        if (i11 >= 31) {
            k.m2954a(m2922e, aVar.m2805i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m2803g());
        d.m2919b(m2922e, bundle);
        d.m2918a(this.f3198b, d.m2921d(m2922e));
    }

    /* renamed from: e */
    private static List<String> m2906e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C3357b c3357b = new C3357b(list.size() + list2.size());
        c3357b.addAll(list);
        c3357b.addAll(list2);
        return new ArrayList(c3357b);
    }

    /* renamed from: g */
    private static List<String> m2907g(List<C0582o> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C0582o> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m2985g());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m2908h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.InterfaceC0577j
    /* renamed from: a */
    public Notification.Builder mo2795a() {
        return this.f3198b;
    }

    /* renamed from: c */
    public Notification m2909c() {
        Bundle m2796a;
        RemoteViews m2903f;
        RemoteViews m2901d;
        C0578k.g gVar = this.f3199c.f3172p;
        if (gVar != null) {
            gVar.mo2811b(this);
        }
        RemoteViews m2902e = gVar != null ? gVar.m2902e(this) : null;
        Notification m2910d = m2910d();
        if (m2902e != null) {
            m2910d.contentView = m2902e;
        } else {
            RemoteViews remoteViews = this.f3199c.f3143H;
            if (remoteViews != null) {
                m2910d.contentView = remoteViews;
            }
        }
        if (gVar != null && (m2901d = gVar.m2901d(this)) != null) {
            m2910d.bigContentView = m2901d;
        }
        if (gVar != null && (m2903f = this.f3199c.f3172p.m2903f(this)) != null) {
            m2910d.headsUpContentView = m2903f;
        }
        if (gVar != null && (m2796a = C0578k.m2796a(m2910d)) != null) {
            gVar.mo2824a(m2796a);
        }
        return m2910d;
    }

    /* renamed from: d */
    protected Notification m2910d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return a.m2912a(this.f3198b);
        }
        if (i10 >= 24) {
            Notification m2912a = a.m2912a(this.f3198b);
            if (this.f3204h != 0) {
                if (d.m2923f(m2912a) != null && (m2912a.flags & 512) != 0 && this.f3204h == 2) {
                    m2908h(m2912a);
                }
                if (d.m2923f(m2912a) != null && (m2912a.flags & 512) == 0 && this.f3204h == 1) {
                    m2908h(m2912a);
                }
            }
            return m2912a;
        }
        c.m2917a(this.f3198b, this.f3203g);
        Notification m2912a2 = a.m2912a(this.f3198b);
        RemoteViews remoteViews = this.f3200d;
        if (remoteViews != null) {
            m2912a2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f3201e;
        if (remoteViews2 != null) {
            m2912a2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f3205i;
        if (remoteViews3 != null) {
            m2912a2.headsUpContentView = remoteViews3;
        }
        if (this.f3204h != 0) {
            if (d.m2923f(m2912a2) != null && (m2912a2.flags & 512) != 0 && this.f3204h == 2) {
                m2908h(m2912a2);
            }
            if (d.m2923f(m2912a2) != null && (m2912a2.flags & 512) == 0 && this.f3204h == 1) {
                m2908h(m2912a2);
            }
        }
        return m2912a2;
    }

    /* renamed from: f */
    public Context m2911f() {
        return this.f3197a;
    }
}
