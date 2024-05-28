package p314y8;

import android.os.Handler;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;

/* renamed from: y8.i */
/* loaded from: classes.dex */
public class C5915i {

    /* renamed from: a */
    private final String f21787a = "UserThemeListener";

    /* renamed from: b */
    private Connection f21788b;

    /* renamed from: c */
    private Handler f21789c;

    public C5915i(Handler handler) {
        this.f21789c = handler;
    }

    /* renamed from: a */
    public void m21044a() {
        if (this.f21788b == null) {
            this.f21788b = MemStorage.bind("ThemeUpdate", new Callback() { // from class: y8.h
            });
        }
    }

    /* renamed from: b */
    public void m21045b() {
        Connection connection = this.f21788b;
        if (connection != null) {
            connection.disconnect();
            this.f21788b = null;
        }
    }
}
