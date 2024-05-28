package p048d8;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import p262u6.EnumC4865a;

/* renamed from: d8.f */
/* loaded from: classes.dex */
public interface InterfaceC3022f {

    /* renamed from: d8.f$a */
    /* loaded from: classes.dex */
    public enum a {
        GET,
        POST
    }

    /* renamed from: a */
    Cursor mo13486a(Uri uri);

    /* renamed from: b */
    void mo13481b(Uri uri, ContentValues contentValues);

    /* renamed from: c */
    EnumC4865a mo13487c(a aVar);
}
