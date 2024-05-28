package p282w2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p321z2.C5984j;

/* renamed from: w2.a */
/* loaded from: classes.dex */
public class ServiceConnectionC5103a implements ServiceConnection {

    /* renamed from: a */
    boolean f19365a = false;

    /* renamed from: b */
    private final BlockingQueue f19366b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public IBinder m19743a(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C5984j.m21285i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f19365a) {
            this.f19365a = true;
            IBinder iBinder = (IBinder) this.f19366b.poll(j10, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f19366b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
