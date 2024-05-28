package p308y2;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: y2.g */
/* loaded from: classes.dex */
public interface InterfaceC5612g {
    /* renamed from: b */
    void mo20634b(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: e */
    <T extends LifecycleCallback> T mo20635e(String str, Class<T> cls);

    /* renamed from: g */
    Activity mo20636g();

    void startActivityForResult(Intent intent, int i10);
}
