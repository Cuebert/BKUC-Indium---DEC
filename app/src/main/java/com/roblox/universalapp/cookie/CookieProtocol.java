package com.roblox.universalapp.cookie;

import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import com.roblox.universalapp.cookie.CookieProtocol;
import com.roblox.universalapp.cookie.JNICookieProtocol;
import java.util.concurrent.atomic.AtomicInteger;
import p035c9.C1151k;
import p191o9.C4161i;

/* loaded from: classes.dex */
public class CookieProtocol {

    /* renamed from: a */
    private static CookieProtocol f12117a;

    /* renamed from: b */
    private static AtomicInteger f12118b = new AtomicInteger();

    /* loaded from: classes.dex */
    public static class OnSetCookieHandlerImpl implements JNICookieProtocol.OnSetCookieHandler {
        private static final String TAG = "OnSetCookieHandlerImpl";

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onSetCookie$0(String str, Boolean bool) {
            if (bool.booleanValue()) {
                C1151k.m6712f(TAG, "Updated WebViewCookieHandler with Cookies from URL " + str);
                return;
            }
            C1151k.m6709c(TAG, "Failed to update WebViewCookieHandler with Cookies from URL " + str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onSetCookie$1(final String str, String str2) {
            C4161i.m17249e().mo15048i(str, str2, new ValueCallback() { // from class: da.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    CookieProtocol.OnSetCookieHandlerImpl.lambda$onSetCookie$0(str, (Boolean) obj);
                }
            });
        }

        public void onSetCookie(String[] strArr, final String str) {
            for (final String str2 : strArr) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: da.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CookieProtocol.OnSetCookieHandlerImpl.lambda$onSetCookie$1(str, str2);
                    }
                });
            }
        }
    }

    private CookieProtocol(JNICookieProtocol jNICookieProtocol) {
        jNICookieProtocol.updateOnSetCookieHandler(new OnSetCookieHandlerImpl());
    }

    /* renamed from: a */
    public static CookieProtocol m13354a() {
        if (f12118b.getAndIncrement() == 0) {
            f12117a = new CookieProtocol(JNICookieProtocol.m13357a());
        }
        return f12117a;
    }
}
