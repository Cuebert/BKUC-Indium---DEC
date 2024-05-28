package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: com.appsflyer.internal.ah */
/* loaded from: classes.dex */
final class C1222ah extends AbstractC1237aw<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1222ah(Context context) {
        super(context, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AbstractC1237aw
    /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public String AFKeystoreWrapper() {
        Cursor cursor;
        Throwable th;
        try {
            ContentResolver contentResolver = this.values.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.valueOf);
            cursor = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("aid"));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
        }
    }

    public final String AFInAppEventParameterName() {
        new Thread(this.AFInAppEventParameterName).start();
        return (String) super.AFInAppEventType();
    }

    @Override // com.appsflyer.internal.AbstractC1237aw
    public final /* synthetic */ String AFInAppEventType() {
        new Thread(this.AFInAppEventParameterName).start();
        return (String) super.AFInAppEventType();
    }
}
