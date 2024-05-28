package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;

/* renamed from: com.appsflyer.internal.bw */
/* loaded from: classes.dex */
public final class C1263bw extends AbstractC1257bq {
    public C1263bw(Runnable runnable) {
        super("samsung", runnable);
    }

    @Override // com.appsflyer.internal.AbstractC1260bt
    public final void AFInAppEventParameterName(Context context) {
        AFInAppEventParameterName(context, new AbstractC1237aw<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.bw.3
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
            
                if (r2 != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00d6, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.values.getPackageManager().resolveContentProvider(r10.valueOf, 128)).packageName;
                r10.AFInAppEventType.AFKeystoreWrapper.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.C1215aa.values(r10.values, r0)));
                r10.AFInAppEventType.AFKeystoreWrapper.put("api_ver_name", com.appsflyer.internal.C1215aa.AFKeystoreWrapper(r10.values, r0));
                r10.AFInAppEventType.AFKeystoreWrapper();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0111, code lost:
            
                return r10.AFInAppEventType.AFKeystoreWrapper;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00d3, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
            
                if (0 == 0) goto L25;
             */
            @Override // com.appsflyer.internal.AbstractC1237aw
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.Object> AFKeystoreWrapper() {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1263bw.AnonymousClass3.AFKeystoreWrapper():java.util.Map");
            }

            private static void values(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j10 = cursor.getLong(columnIndex);
                if (j10 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j10));
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
