package p235s3;

import android.os.Handler;
import android.os.Looper;

/* renamed from: s3.i */
/* loaded from: classes.dex */
public class HandlerC4526i extends Handler {

    /* renamed from: a */
    private final Looper f18273a;

    public HandlerC4526i(Looper looper) {
        super(looper);
        this.f18273a = Looper.getMainLooper();
    }

    public HandlerC4526i(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f18273a = Looper.getMainLooper();
    }
}
