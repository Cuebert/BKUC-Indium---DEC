package p087g6;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g6.u */
/* loaded from: classes.dex */
public enum EnumC3310u implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = C3296g.m14553a().f13753a;
        handler.post(runnable);
    }
}
