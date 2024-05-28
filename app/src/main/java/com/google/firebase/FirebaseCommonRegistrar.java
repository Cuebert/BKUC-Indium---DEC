package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.appsflyer.oaid.BuildConfig;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.List;
import p007a6.C0036c;
import p007a6.C0038e;
import p007a6.C0041h;
import p126j5.C3617d;
import p126j5.InterfaceC3623i;
import p212q5.C4317d;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements InterfaceC3623i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m11869e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : BuildConfig.FLAVOR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m11870f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? BuildConfig.FLAVOR : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m11871g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : (i10 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? BuildConfig.FLAVOR : "embedded" : "auto";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m11872h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m11873i(installerPackageName) : BuildConfig.FLAVOR;
    }

    /* renamed from: i */
    private static String m11873i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // p126j5.InterfaceC3623i
    public List<C3617d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0036c.m232c());
        arrayList.add(C4317d.m17827e());
        arrayList.add(C0041h.m241b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C0041h.m241b("fire-core", "20.0.0"));
        arrayList.add(C0041h.m241b("device-name", m11873i(Build.PRODUCT)));
        arrayList.add(C0041h.m241b("device-model", m11873i(Build.DEVICE)));
        arrayList.add(C0041h.m241b("device-brand", m11873i(Build.BRAND)));
        arrayList.add(C0041h.m242c("android-target-sdk", new C0041h.a() { // from class: h5.e
            @Override // p007a6.C0041h.a
            /* renamed from: a */
            public final String mo244a(Object obj) {
                String m11869e;
                m11869e = FirebaseCommonRegistrar.m11869e((Context) obj);
                return m11869e;
            }
        }));
        arrayList.add(C0041h.m242c("android-min-sdk", new C0041h.a() { // from class: h5.f
            @Override // p007a6.C0041h.a
            /* renamed from: a */
            public final String mo244a(Object obj) {
                String m11870f;
                m11870f = FirebaseCommonRegistrar.m11870f((Context) obj);
                return m11870f;
            }
        }));
        arrayList.add(C0041h.m242c("android-platform", new C0041h.a() { // from class: h5.g
            @Override // p007a6.C0041h.a
            /* renamed from: a */
            public final String mo244a(Object obj) {
                String m11871g;
                m11871g = FirebaseCommonRegistrar.m11871g((Context) obj);
                return m11871g;
            }
        }));
        arrayList.add(C0041h.m242c("android-installer", new C0041h.a() { // from class: h5.d
            @Override // p007a6.C0041h.a
            /* renamed from: a */
            public final String mo244a(Object obj) {
                String m11872h;
                m11872h = FirebaseCommonRegistrar.m11872h((Context) obj);
                return m11872h;
            }
        }));
        String m238a = C0038e.m238a();
        if (m238a != null) {
            arrayList.add(C0041h.m241b("kotlin", m238a));
        }
        return arrayList;
    }
}
