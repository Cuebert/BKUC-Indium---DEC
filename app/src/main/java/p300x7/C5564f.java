package p300x7;

import android.content.Context;
import android.util.Log;
import com.birbit.android.jobqueue.C1294g;
import com.birbit.android.jobqueue.log.CustomLogger;
import p208q1.C4292a;

/* renamed from: x7.f */
/* loaded from: classes.dex */
public class C5564f {

    /* renamed from: a */
    public static boolean f20660a;

    /* renamed from: b */
    private static C1294g f20661b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x7.f$b */
    /* loaded from: classes.dex */
    public static class b implements CustomLogger {
        private b() {
        }

        @Override // com.birbit.android.jobqueue.log.CustomLogger
        /* renamed from: d */
        public void mo7139d(String str, Object... objArr) {
            Log.d("JobManager", String.format(str, objArr));
        }

        @Override // com.birbit.android.jobqueue.log.CustomLogger
        /* renamed from: e */
        public void mo7141e(Throwable th, String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr), th);
        }

        @Override // com.birbit.android.jobqueue.log.CustomLogger
        public boolean isDebugEnabled() {
            return C5564f.f20660a;
        }

        @Override // com.birbit.android.jobqueue.log.CustomLogger
        /* renamed from: e */
        public void mo7140e(String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m20441a(Context context, String str) {
        if (f20661b == null) {
            C4292a.b m17806b = new C4292a.b(context).m17811g(1).m17810f(3).m17809e(3).m17806b(120);
            if (f20660a) {
                m17806b.m17807c(new b());
            }
            if (str != null) {
                m17806b.m17808d(str);
            }
            f20661b = new C1294g(m17806b.m17805a());
        }
    }

    /* renamed from: b */
    public static C1294g m20442b() {
        return f20661b;
    }
}
