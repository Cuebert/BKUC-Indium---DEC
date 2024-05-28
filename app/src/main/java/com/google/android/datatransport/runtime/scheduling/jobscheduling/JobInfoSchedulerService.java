package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p003a2.AbstractC0020o;
import p003a2.C0025t;
import p149l2.C3869a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* renamed from: b */
    public /* synthetic */ void m7214b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        C0025t.m161f(getApplicationContext());
        AbstractC0020o.a mo118d = AbstractC0020o.m148a().mo116b(string).mo118d(C3869a.m16472b(i10));
        if (string2 != null) {
            mo118d.mo117c(Base64.decode(string2, 0));
        }
        C0025t.m159c().m162e().m14933v(mo118d.mo115a(), i11, new Runnable() { // from class: h2.e

            /* renamed from: o */
            public final /* synthetic */ JobParameters f14138o;

            public /* synthetic */ RunnableC3371e(JobParameters jobParameters2) {
                r2 = jobParameters2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m7214b(r2);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
