package com.google.android.gms.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0578k;
import androidx.fragment.app.ActivityC0803d;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C1350c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p070f3.C3134h;
import p070f3.C3137k;
import p085g4.AbstractC3263l;
import p096h3.C3391a;
import p222r3.C4426e;
import p270v2.C4939a;
import p270v2.C4940b;
import p282w2.C5108f;
import p282w2.C5110h;
import p282w2.DialogFragmentC5104b;
import p295x2.InterfaceC5512g;
import p308y2.AbstractC5630t;
import p308y2.C5602b;
import p308y2.C5631u;
import p308y2.InterfaceC5612g;
import p321z2.AbstractDialogInterfaceOnClickListenerC6006w;
import p321z2.C5984j;
import p321z2.C6003t;

/* renamed from: com.google.android.gms.common.a */
/* loaded from: classes.dex */
public class C1342a extends C1379b {

    /* renamed from: c */
    private String f6120c;

    /* renamed from: e */
    private static final Object f6118e = new Object();

    /* renamed from: f */
    private static final C1342a f6119f = new C1342a();

    /* renamed from: d */
    public static final int f6117d = C1379b.f6256a;

    /* renamed from: o */
    public static C1342a m7385o() {
        return f6119f;
    }

    /* renamed from: z */
    public static final AbstractC3263l<Map<C5602b<?>, String>> m7386z(InterfaceC5512g<?> interfaceC5512g, InterfaceC5512g<?>... interfaceC5512gArr) {
        C5984j.m21287k(interfaceC5512g, "Requested API must not be null.");
        for (InterfaceC5512g<?> interfaceC5512g2 : interfaceC5512gArr) {
            C5984j.m21287k(interfaceC5512g2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(interfaceC5512gArr.length + 1);
        arrayList.add(interfaceC5512g);
        arrayList.addAll(Arrays.asList(interfaceC5512gArr));
        return C1350c.m7481y().m7483B(arrayList);
    }

    @Override // com.google.android.gms.common.C1379b
    /* renamed from: b */
    public Intent mo7387b(Context context, int i10, String str) {
        return super.mo7387b(context, i10, str);
    }

    @Override // com.google.android.gms.common.C1379b
    /* renamed from: c */
    public PendingIntent mo7388c(Context context, int i10, int i11) {
        return super.mo7388c(context, i10, i11);
    }

    @Override // com.google.android.gms.common.C1379b
    /* renamed from: e */
    public final String mo7389e(int i10) {
        return super.mo7389e(i10);
    }

    @Override // com.google.android.gms.common.C1379b
    /* renamed from: g */
    public int mo7390g(Context context) {
        return super.mo7390g(context);
    }

    @Override // com.google.android.gms.common.C1379b
    /* renamed from: h */
    public int mo7391h(Context context, int i10) {
        return super.mo7391h(context, i10);
    }

    @Override // com.google.android.gms.common.C1379b
    /* renamed from: j */
    public final boolean mo7392j(int i10) {
        return super.mo7392j(i10);
    }

    /* renamed from: l */
    public AbstractC3263l<Void> m7393l(InterfaceC5512g<?> interfaceC5512g, InterfaceC5512g<?>... interfaceC5512gArr) {
        return m7386z(interfaceC5512g, interfaceC5512gArr).mo14509p(C5110h.f19377a);
    }

    /* renamed from: m */
    public Dialog m7394m(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return m7398r(activity, i10, AbstractDialogInterfaceOnClickListenerC6006w.m21317b(activity, mo7387b(activity, i10, "d"), i11), onCancelListener);
    }

    /* renamed from: n */
    public PendingIntent m7395n(Context context, ConnectionResult connectionResult) {
        if (connectionResult.m7378A()) {
            return connectionResult.m7382z();
        }
        return mo7388c(context, connectionResult.m7380x(), 0);
    }

    /* renamed from: p */
    public boolean m7396p(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m7394m = m7394m(activity, i10, i11, onCancelListener);
        if (m7394m == null) {
            return false;
        }
        m7401u(activity, m7394m, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: q */
    public void m7397q(Context context, int i10) {
        m7402v(context, i10, null, m7591d(context, i10, 0, "n"));
    }

    /* renamed from: r */
    final Dialog m7398r(Context context, int i10, AbstractDialogInterfaceOnClickListenerC6006w abstractDialogInterfaceOnClickListenerC6006w, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C6003t.m21310d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m21309c = C6003t.m21309c(context, i10);
        if (m21309c != null) {
            builder.setPositiveButton(m21309c, abstractDialogInterfaceOnClickListenerC6006w);
        }
        String m21313g = C6003t.m21313g(context, i10);
        if (m21313g != null) {
            builder.setTitle(m21313g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: s */
    public final Dialog m7399s(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C6003t.m21310d(activity, 18));
        builder.setPositiveButton(BuildConfig.FLAVOR, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m7401u(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: t */
    public final C5631u m7400t(Context context, AbstractC5630t abstractC5630t) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C5631u c5631u = new C5631u(abstractC5630t);
        context.registerReceiver(c5631u, intentFilter);
        c5631u.m20650a(context);
        if (m7592i(context, "com.google.android.gms")) {
            return c5631u;
        }
        abstractC5630t.mo7496a();
        c5631u.m20651b();
        return null;
    }

    /* renamed from: u */
    final void m7401u(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC0803d) {
                C5108f.m19746p2(dialog, onCancelListener).mo4608o2(((ActivityC0803d) activity).m4617y0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC5104b.m19744a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: v */
    final void m7402v(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            m7403w(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String m21312f = C6003t.m21312f(context, i10);
        String m21311e = C6003t.m21311e(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C5984j.m21286j(context.getSystemService("notification"));
        C0578k.e m2835B = new C0578k.e(context).m2858v(true).m2844g(true).m2852o(m21312f).m2835B(new C0578k.c().m2825h(m21311e));
        if (C3134h.m13789c(context)) {
            C5984j.m21289m(C3137k.m13801e());
            m2835B.m2862z(context.getApplicationInfo().icon).m2861y(2);
            if (C3134h.m13790d(context)) {
                m2835B.m2840a(C4939a.f18993a, resources.getString(C4940b.f19008o), pendingIntent);
            } else {
                m2835B.m2850m(pendingIntent);
            }
        } else {
            m2835B.m2862z(R.drawable.stat_sys_warning).m2836C(resources.getString(C4940b.f19001h)).m2839F(System.currentTimeMillis()).m2850m(pendingIntent).m2851n(m21311e);
        }
        if (C3137k.m13804h()) {
            C5984j.m21289m(C3137k.m13804h());
            synchronized (f6118e) {
                str2 = this.f6120c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String m21308b = C6003t.m21308b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", m21308b, 4));
                } else if (!m21308b.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(m21308b);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            m2835B.m2846i(str2);
        }
        Notification m2842c = m2835B.m2842c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C1381d.f6260b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, m2842c);
    }

    /* renamed from: w */
    final void m7403w(Context context) {
        new HandlerC1383f(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: x */
    public final boolean m7404x(Activity activity, InterfaceC5612g interfaceC5612g, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m7398r = m7398r(activity, i10, AbstractDialogInterfaceOnClickListenerC6006w.m21318c(interfaceC5612g, mo7387b(activity, i10, "d"), 2), onCancelListener);
        if (m7398r == null) {
            return false;
        }
        m7401u(activity, m7398r, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: y */
    public final boolean m7405y(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent m7395n;
        if (C3391a.m14945a(context) || (m7395n = m7395n(context, connectionResult)) == null) {
            return false;
        }
        m7402v(context, connectionResult.m7380x(), null, C4426e.m18228a(context, 0, GoogleApiActivity.m7406a(context, m7395n, i10, true), C4426e.f18010a | 134217728));
        return true;
    }
}
