package p121j0;

import android.view.View;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public class C3591a {
    /* renamed from: a */
    public static String m15408a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
