package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: androidx.core.app.h */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0575h extends Service {

    /* renamed from: u */
    static final Object f3080u = new Object();

    /* renamed from: v */
    static final HashMap<ComponentName, h> f3081v = new HashMap<>();

    /* renamed from: n */
    b f3082n;

    /* renamed from: o */
    h f3083o;

    /* renamed from: p */
    a f3084p;

    /* renamed from: q */
    boolean f3085q = false;

    /* renamed from: r */
    boolean f3086r = false;

    /* renamed from: s */
    boolean f3087s = false;

    /* renamed from: t */
    final ArrayList<d> f3088t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.h$a */
    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e m2769a = AbstractServiceC0575h.this.m2769a();
                if (m2769a == null) {
                    return null;
                }
                AbstractServiceC0575h.this.mo2772f(m2769a.getIntent());
                m2769a.mo2784a();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            AbstractServiceC0575h.this.m2774h();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            AbstractServiceC0575h.this.m2774h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.h$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        e mo2778a();

        /* renamed from: b */
        IBinder mo2779b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.h$c */
    /* loaded from: classes.dex */
    public static final class c extends h {

        /* renamed from: d */
        private final Context f3090d;

        /* renamed from: e */
        private final PowerManager.WakeLock f3091e;

        /* renamed from: f */
        private final PowerManager.WakeLock f3092f;

        /* renamed from: g */
        boolean f3093g;

        /* renamed from: h */
        boolean f3094h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3090d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3091e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3092f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.AbstractServiceC0575h.h
        /* renamed from: a */
        void mo2780a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f3105a);
            if (this.f3090d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3093g) {
                        this.f3093g = true;
                        if (!this.f3094h) {
                            this.f3091e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC0575h.h
        /* renamed from: c */
        public void mo2781c() {
            synchronized (this) {
                if (this.f3094h) {
                    if (this.f3093g) {
                        this.f3091e.acquire(60000L);
                    }
                    this.f3094h = false;
                    this.f3092f.release();
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC0575h.h
        /* renamed from: d */
        public void mo2782d() {
            synchronized (this) {
                if (!this.f3094h) {
                    this.f3094h = true;
                    this.f3092f.acquire(600000L);
                    this.f3091e.release();
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC0575h.h
        /* renamed from: e */
        public void mo2783e() {
            synchronized (this) {
                this.f3093g = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.h$d */
    /* loaded from: classes.dex */
    public final class d implements e {

        /* renamed from: a */
        final Intent f3095a;

        /* renamed from: b */
        final int f3096b;

        d(Intent intent, int i10) {
            this.f3095a = intent;
            this.f3096b = i10;
        }

        @Override // androidx.core.app.AbstractServiceC0575h.e
        /* renamed from: a */
        public void mo2784a() {
            AbstractServiceC0575h.this.stopSelf(this.f3096b);
        }

        @Override // androidx.core.app.AbstractServiceC0575h.e
        public Intent getIntent() {
            return this.f3095a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.h$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo2784a();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.h$f */
    /* loaded from: classes.dex */
    static final class f extends JobServiceEngine implements b {

        /* renamed from: a */
        final AbstractServiceC0575h f3098a;

        /* renamed from: b */
        final Object f3099b;

        /* renamed from: c */
        JobParameters f3100c;

        /* renamed from: androidx.core.app.h$f$a */
        /* loaded from: classes.dex */
        final class a implements e {

            /* renamed from: a */
            final JobWorkItem f3101a;

            a(JobWorkItem jobWorkItem) {
                this.f3101a = jobWorkItem;
            }

            @Override // androidx.core.app.AbstractServiceC0575h.e
            /* renamed from: a */
            public void mo2784a() {
                synchronized (f.this.f3099b) {
                    JobParameters jobParameters = f.this.f3100c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3101a);
                    }
                }
            }

            @Override // androidx.core.app.AbstractServiceC0575h.e
            public Intent getIntent() {
                return this.f3101a.getIntent();
            }
        }

        f(AbstractServiceC0575h abstractServiceC0575h) {
            super(abstractServiceC0575h);
            this.f3099b = new Object();
            this.f3098a = abstractServiceC0575h;
        }

        @Override // androidx.core.app.AbstractServiceC0575h.b
        /* renamed from: a */
        public e mo2778a() {
            synchronized (this.f3099b) {
                JobParameters jobParameters = this.f3100c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                dequeueWork.getIntent().setExtrasClassLoader(this.f3098a.getClassLoader());
                return new a(dequeueWork);
            }
        }

        @Override // androidx.core.app.AbstractServiceC0575h.b
        /* renamed from: b */
        public IBinder mo2779b() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f3100c = jobParameters;
            this.f3098a.m2771d(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean m2770b = this.f3098a.m2770b();
            synchronized (this.f3099b) {
                this.f3100c = null;
            }
            return m2770b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.h$g */
    /* loaded from: classes.dex */
    public static final class g extends h {

        /* renamed from: d */
        private final JobInfo f3103d;

        /* renamed from: e */
        private final JobScheduler f3104e;

        g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            m2785b(i10);
            this.f3103d = new JobInfo.Builder(i10, this.f3105a).setOverrideDeadline(0L).build();
            this.f3104e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.AbstractServiceC0575h.h
        /* renamed from: a */
        void mo2780a(Intent intent) {
            this.f3104e.enqueue(this.f3103d, new JobWorkItem(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.h$h */
    /* loaded from: classes.dex */
    public static abstract class h {

        /* renamed from: a */
        final ComponentName f3105a;

        /* renamed from: b */
        boolean f3106b;

        /* renamed from: c */
        int f3107c;

        h(ComponentName componentName) {
            this.f3105a = componentName;
        }

        /* renamed from: a */
        abstract void mo2780a(Intent intent);

        /* renamed from: b */
        void m2785b(int i10) {
            if (!this.f3106b) {
                this.f3106b = true;
                this.f3107c = i10;
            } else {
                if (this.f3107c == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f3107c);
            }
        }

        /* renamed from: c */
        public void mo2781c() {
        }

        /* renamed from: d */
        public void mo2782d() {
        }

        /* renamed from: e */
        public void mo2783e() {
        }
    }

    public AbstractServiceC0575h() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3088t = null;
        } else {
            this.f3088t = new ArrayList<>();
        }
    }

    /* renamed from: c */
    public static void m2767c(Context context, ComponentName componentName, int i10, Intent intent) {
        if (intent != null) {
            synchronized (f3080u) {
                h m2768e = m2768e(context, componentName, true, i10);
                m2768e.m2785b(i10);
                m2768e.mo2780a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: e */
    static h m2768e(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap<ComponentName, h> hashMap = f3081v;
        h hVar = hashMap.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else if (z10) {
            cVar = new g(context, componentName, i10);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        h hVar2 = cVar;
        hashMap.put(componentName, hVar2);
        return hVar2;
    }

    /* renamed from: a */
    e m2769a() {
        b bVar = this.f3082n;
        if (bVar != null) {
            return bVar.mo2778a();
        }
        synchronized (this.f3088t) {
            if (this.f3088t.size() <= 0) {
                return null;
            }
            return this.f3088t.remove(0);
        }
    }

    /* renamed from: b */
    boolean m2770b() {
        a aVar = this.f3084p;
        if (aVar != null) {
            aVar.cancel(this.f3085q);
        }
        this.f3086r = true;
        return m2773g();
    }

    /* renamed from: d */
    void m2771d(boolean z10) {
        if (this.f3084p == null) {
            this.f3084p = new a();
            h hVar = this.f3083o;
            if (hVar != null && z10) {
                hVar.mo2782d();
            }
            this.f3084p.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: f */
    protected abstract void mo2772f(Intent intent);

    /* renamed from: g */
    public boolean m2773g() {
        return true;
    }

    /* renamed from: h */
    void m2774h() {
        ArrayList<d> arrayList = this.f3088t;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3084p = null;
                ArrayList<d> arrayList2 = this.f3088t;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m2771d(false);
                } else if (!this.f3087s) {
                    this.f3083o.mo2781c();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f3082n;
        if (bVar != null) {
            return bVar.mo2779b();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3082n = new f(this);
            this.f3083o = null;
        } else {
            this.f3082n = null;
            this.f3083o = m2768e(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f3088t;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3087s = true;
                this.f3083o.mo2781c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f3088t == null) {
            return 2;
        }
        this.f3083o.mo2783e();
        synchronized (this.f3088t) {
            ArrayList<d> arrayList = this.f3088t;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            m2771d(true);
        }
        return 3;
    }
}
