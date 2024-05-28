package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.C0578k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.m */
/* loaded from: classes.dex */
public class C0580m {

    /* renamed from: a */
    private static final Object f3206a = new Object();

    /* renamed from: b */
    private static final Object f3207b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Bundle m2956a(C0578k.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat m2800d = aVar.m2800d();
        bundle2.putInt("icon", m2800d != null ? m2800d.m3222k() : 0);
        bundle2.putCharSequence("title", aVar.m2804h());
        bundle2.putParcelable("actionIntent", aVar.m2797a());
        if (aVar.m2799c() != null) {
            bundle = new Bundle(aVar.m2799c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m2798b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m2958c(aVar.m2801e()));
        bundle2.putBoolean("showsUserInterface", aVar.m2803g());
        bundle2.putInt("semanticAction", aVar.m2802f());
        return bundle2;
    }

    /* renamed from: b */
    private static Bundle m2957b(C0583p c0583p) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c0583p.m3006i());
        bundle.putCharSequence("label", c0583p.m3005h());
        bundle.putCharSequenceArray("choices", c0583p.m3002e());
        bundle.putBoolean("allowFreeFormInput", c0583p.m3000c());
        bundle.putBundle("extras", c0583p.m3004g());
        Set<String> m3001d = c0583p.m3001d();
        if (m3001d != null && !m3001d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(m3001d.size());
            Iterator<String> it = m3001d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    private static Bundle[] m2958c(C0583p[] c0583pArr) {
        if (c0583pArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0583pArr.length];
        for (int i10 = 0; i10 < c0583pArr.length; i10++) {
            bundleArr[i10] = m2957b(c0583pArr[i10]);
        }
        return bundleArr;
    }
}
