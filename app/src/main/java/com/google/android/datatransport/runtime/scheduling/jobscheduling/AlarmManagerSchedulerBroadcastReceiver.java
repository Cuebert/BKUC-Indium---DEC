package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p003a2.AbstractC0020o;
import p003a2.C0025t;
import p149l2.C3869a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m7212b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        C0025t.m161f(context);
        AbstractC0020o.a mo118d = AbstractC0020o.m148a().mo116b(queryParameter).mo118d(C3869a.m16472b(intValue));
        if (queryParameter2 != null) {
            mo118d.mo117c(Base64.decode(queryParameter2, 0));
        }
        C0025t.m159c().m162e().m14933v(mo118d.mo115a(), i10, new Runnable() { // from class: h2.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m7212b();
            }
        });
    }
}
