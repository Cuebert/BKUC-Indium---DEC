package p048d8;

import android.database.Cursor;
import android.net.Uri;
import p034c8.C1138a;
import p048d8.InterfaceC3022f;
import p262u6.EnumC4865a;

/* renamed from: d8.e */
/* loaded from: classes.dex */
public class C3021e extends AbstractC3017a {
    @Override // p048d8.InterfaceC3022f
    /* renamed from: a */
    public Cursor mo13486a(Uri uri) {
        return new C1138a();
    }

    @Override // p048d8.InterfaceC3022f
    /* renamed from: c */
    public EnumC4865a mo13487c(InterfaceC3022f.a aVar) {
        if (aVar == InterfaceC3022f.a.GET) {
            return EnumC4865a.GetPing;
        }
        return null;
    }
}
