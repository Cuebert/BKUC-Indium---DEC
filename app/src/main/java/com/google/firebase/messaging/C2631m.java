package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p085g4.AbstractC3263l;
import p085g4.C3269o;
import p259u3.C4849i;
import p259u3.C4850j;
import p259u3.C4852l;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.m */
/* loaded from: classes.dex */
public final class C2631m implements Closeable {

    /* renamed from: n */
    private final URL f10294n;

    /* renamed from: o */
    private AbstractC3263l<Bitmap> f10295o;

    /* renamed from: p */
    private volatile InputStream f10296p;

    private C2631m(URL url) {
        this.f10294n = url;
    }

    /* renamed from: b */
    public static C2631m m12054b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C2631m(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    /* renamed from: l */
    private final byte[] m12055l() throws IOException {
        URLConnection openConnection = this.f10294n.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f10296p = inputStream;
                byte[] m19036b = C4849i.m19036b(C4849i.m19035a(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = m19036b.length;
                    String valueOf = String.valueOf(this.f10294n);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                    sb2.append("Downloaded ");
                    sb2.append(length);
                    sb2.append(" bytes from ");
                    sb2.append(valueOf);
                    Log.v("FirebaseMessaging", sb2.toString());
                }
                if (m19036b.length <= 1048576) {
                    return m19036b;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            C4852l.m19040b(th, th3);
                        }
                    }
                    throw th2;
                }
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    /* renamed from: c */
    public final AbstractC3263l<Bitmap> m12056c() {
        return (AbstractC3263l) C5984j.m21286j(this.f10295o);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4850j.m19038a(this.f10296p);
    }

    /* renamed from: e */
    public final void m12057e(Executor executor) {
        this.f10295o = C3269o.m14528c(executor, new Callable(this) { // from class: com.google.firebase.messaging.l

            /* renamed from: a */
            private final C2631m f10293a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10293a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10293a.m12058i();
            }
        });
    }

    /* renamed from: i */
    public final Bitmap m12058i() throws IOException {
        String valueOf = String.valueOf(this.f10294n);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Starting download of: ");
        sb2.append(valueOf);
        Log.i("FirebaseMessaging", sb2.toString());
        byte[] m12055l = m12055l();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m12055l, 0, m12055l.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f10294n);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 31);
                sb3.append("Successfully downloaded image: ");
                sb3.append(valueOf2);
                Log.d("FirebaseMessaging", sb3.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f10294n);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 24);
        sb4.append("Failed to decode image: ");
        sb4.append(valueOf3);
        throw new IOException(sb4.toString());
    }
}
