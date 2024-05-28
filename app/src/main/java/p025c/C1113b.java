package p025c;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0587a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p025c.AbstractC1112a;
import p093h0.C3356a;

/* renamed from: c.b */
/* loaded from: classes.dex */
public final class C1113b extends AbstractC1112a<String[], Map<String, Boolean>> {
    /* renamed from: e */
    static Intent m6495e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // p025c.AbstractC1112a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo4537a(Context context, String[] strArr) {
        return m6495e(strArr);
    }

    @Override // p025c.AbstractC1112a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC1112a.a<Map<String, Boolean>> mo6493b(Context context, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            C3356a c3356a = new C3356a();
            boolean z10 = true;
            for (String str : strArr) {
                boolean z11 = C0587a.m3027a(context, str) == 0;
                c3356a.put(str, Boolean.valueOf(z11));
                if (!z11) {
                    z10 = false;
                }
            }
            if (z10) {
                return new AbstractC1112a.a<>(c3356a);
            }
            return null;
        }
        return new AbstractC1112a.a<>(Collections.emptyMap());
    }

    @Override // p025c.AbstractC1112a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> mo4538c(int i10, Intent intent) {
        if (i10 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i11 = 0; i11 < length; i11++) {
                hashMap.put(stringArrayExtra[i11], Boolean.valueOf(intArrayExtra[i11] == 0));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
