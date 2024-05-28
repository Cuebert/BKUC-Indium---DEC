package p095h2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p003a2.AbstractC0020o;
import p056e2.C3061a;
import p109i2.InterfaceC3475d;
import p149l2.C3869a;

/* renamed from: h2.d */
/* loaded from: classes.dex */
public class C3370d implements InterfaceC3390x {

    /* renamed from: a */
    private final Context f14134a;

    /* renamed from: b */
    private final InterfaceC3475d f14135b;

    /* renamed from: c */
    private final AbstractC3372f f14136c;

    public C3370d(Context context, InterfaceC3475d interfaceC3475d, AbstractC3372f abstractC3372f) {
        this.f14134a = context;
        this.f14135b = interfaceC3475d;
        this.f14136c = abstractC3372f;
    }

    /* renamed from: d */
    private boolean m14896d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // p095h2.InterfaceC3390x
    /* renamed from: a */
    public void mo14897a(AbstractC0020o abstractC0020o, int i10) {
        mo14898b(abstractC0020o, i10, false);
    }

    @Override // p095h2.InterfaceC3390x
    /* renamed from: b */
    public void mo14898b(AbstractC0020o abstractC0020o, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f14134a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f14134a.getSystemService("jobscheduler");
        int m14899c = m14899c(abstractC0020o);
        if (!z10 && m14896d(jobScheduler, m14899c, i10)) {
            C3061a.m13516b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC0020o);
            return;
        }
        long mo15204A = this.f14135b.mo15204A(abstractC0020o);
        JobInfo.Builder m14906c = this.f14136c.m14906c(new JobInfo.Builder(m14899c, componentName), abstractC0020o.mo114d(), mo15204A, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC0020o.mo112b());
        persistableBundle.putInt("priority", C3869a.m16471a(abstractC0020o.mo114d()));
        if (abstractC0020o.mo113c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC0020o.mo113c(), 0));
        }
        m14906c.setExtras(persistableBundle);
        C3061a.m13517c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC0020o, Integer.valueOf(m14899c), Long.valueOf(this.f14136c.m14907g(abstractC0020o.mo114d(), mo15204A, i10)), Long.valueOf(mo15204A), Integer.valueOf(i10));
        jobScheduler.schedule(m14906c.build());
    }

    /* renamed from: c */
    int m14899c(AbstractC0020o abstractC0020o) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f14134a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC0020o.mo112b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C3869a.m16471a(abstractC0020o.mo114d())).array());
        if (abstractC0020o.mo113c() != null) {
            adler32.update(abstractC0020o.mo113c());
        }
        return (int) adler32.getValue();
    }
}
