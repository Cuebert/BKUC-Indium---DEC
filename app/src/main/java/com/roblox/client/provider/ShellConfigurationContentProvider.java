package com.roblox.client.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.util.SparseArray;
import com.roblox.client.C2748c0;
import com.roblox.client.C2877p0;
import p033c7.C1134c;
import p033c7.C1137f;
import p034c8.C1140c;
import p048d8.C3019c;
import p048d8.C3020d;
import p048d8.C3021e;
import p048d8.C3023g;
import p048d8.InterfaceC3022f;
import p262u6.C4867c;
import p262u6.EnumC4865a;

/* loaded from: classes.dex */
public class ShellConfigurationContentProvider extends ContentProvider {

    /* renamed from: o */
    private UriMatcher f11452o;

    /* renamed from: q */
    private C4867c f11454q;

    /* renamed from: r */
    private C4867c.a f11455r;

    /* renamed from: n */
    private final String f11451n = "rbx.config";

    /* renamed from: p */
    private SparseArray<InterfaceC3022f> f11453p = new SparseArray<>();

    /* renamed from: a */
    private boolean m12963a() {
        if (!C1134c.m6537a().mo6658x()) {
            return true;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            return callingPackage.startsWith("com.roblox.client") || callingPackage.startsWith("com.tencent.roblox");
        }
        return false;
    }

    /* renamed from: e */
    private void m12964e(String str, InterfaceC3022f interfaceC3022f) {
        m12965f(str, interfaceC3022f, interfaceC3022f.mo13487c(InterfaceC3022f.a.GET));
        m12965f(str, interfaceC3022f, interfaceC3022f.mo13487c(InterfaceC3022f.a.POST));
    }

    /* renamed from: f */
    private void m12965f(String str, InterfaceC3022f interfaceC3022f, EnumC4865a enumC4865a) {
        if (enumC4865a != null) {
            this.f11452o.addURI(str, enumC4865a.f18746n, enumC4865a.f18747o);
            this.f11453p.put(enumC4865a.f18747o, interfaceC3022f);
        }
    }

    /* renamed from: g */
    private void m12966g() {
        this.f11452o = new UriMatcher(-1);
        String m12967b = m12967b(getContext());
        m12964e(m12967b, new C3021e());
        m12964e(m12967b, new C3019c(this, getContext()));
        m12964e(m12967b, new C3023g(getContext()));
        m12964e(m12967b, new C3020d(getContext()));
    }

    /* renamed from: b */
    public String m12967b(Context context) {
        return context.getPackageName() + context.getString(C2748c0.f10500C4);
    }

    /* renamed from: c */
    public C4867c.a m12968c() {
        return this.f11455r;
    }

    /* renamed from: d */
    public C4867c m12969d() {
        return this.f11454q;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (!m12963a()) {
            return null;
        }
        InterfaceC3022f interfaceC3022f = this.f11453p.get(this.f11452o.match(uri));
        if (interfaceC3022f != null) {
            interfaceC3022f.mo13481b(uri, contentValues);
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C1137f.m6665c().m6668d(C2877p0.m12884Q(getContext().getApplicationContext()));
        m12966g();
        C1140c c1140c = new C1140c(getContext());
        this.f11455r = c1140c;
        this.f11454q = c1140c.mo6672d();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!m12963a()) {
            return null;
        }
        InterfaceC3022f interfaceC3022f = this.f11453p.get(this.f11452o.match(uri));
        if (interfaceC3022f != null) {
            return interfaceC3022f.mo13486a(uri);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
