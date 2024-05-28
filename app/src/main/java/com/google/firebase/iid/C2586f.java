package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.zzf;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p085g4.C3265m;
import p085g4.C3269o;
import p093h0.C3362g;
import p224r5.C4436h;
import p224r5.C4438j;
import p224r5.C4443o;

/* renamed from: com.google.firebase.iid.f */
/* loaded from: classes.dex */
final class C2586f {

    /* renamed from: g */
    private static int f10180g;

    /* renamed from: h */
    private static PendingIntent f10181h;

    /* renamed from: b */
    private final Context f10183b;

    /* renamed from: c */
    private final C4438j f10184c;

    /* renamed from: e */
    private Messenger f10186e;

    /* renamed from: f */
    private zzf f10187f;

    /* renamed from: a */
    private final C3362g<String, C3265m<Bundle>> f10182a = new C3362g<>();

    /* renamed from: d */
    private Messenger f10185d = new Messenger(new HandlerC2592i(this, Looper.getMainLooper()));

    public C2586f(Context context, C4438j c4438j) {
        this.f10183b = context;
        this.f10184c = c4438j;
    }

    /* renamed from: b */
    private static synchronized String m11934b() {
        String num;
        synchronized (C2586f.class) {
            int i10 = f10180g;
            f10180g = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    /* renamed from: c */
    private static synchronized void m11935c(Context context, Intent intent) {
        synchronized (C2586f.class) {
            if (f10181h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f10181h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f10181h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m11936d(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzf.C2612a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzf) {
                        this.f10187f = (zzf) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f10186e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 49);
                        sb2.append("Unexpected response, no error or registration id ");
                        sb2.append(valueOf2);
                        Log.w("FirebaseInstanceId", sb2.toString());
                        return;
                    }
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            m11938f(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        Log.w("FirebaseInstanceId", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                        return;
                    }
                    synchronized (this.f10182a) {
                        for (int i10 = 0; i10 < this.f10182a.size(); i10++) {
                            m11938f(this.f10182a.m14840i(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    }
                    return;
                } else {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    m11938f(group, extras);
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* renamed from: f */
    private final void m11938f(String str, Bundle bundle) {
        synchronized (this.f10182a) {
            C3265m<Bundle> remove = this.f10182a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
            } else {
                remove.m14514c(bundle);
            }
        }
    }

    /* renamed from: g */
    private final Bundle m11939g(Bundle bundle) throws IOException {
        Bundle m11940h = m11940h(bundle);
        if (m11940h == null || !m11940h.containsKey("google.messenger")) {
            return m11940h;
        }
        Bundle m11940h2 = m11940h(bundle);
        if (m11940h2 == null || !m11940h2.containsKey("google.messenger")) {
            return m11940h2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        if (r8.f10187f != null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [g4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.concurrent.TimeUnit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00cd -> B:21:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00d3 -> B:21:0x00d8). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.os.Bundle m11940h(android.os.Bundle r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2586f.m11940h(android.os.Bundle):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle m11941a(Bundle bundle) throws IOException {
        if (this.f10184c.m18247g() >= 12000000) {
            try {
                return (Bundle) C3269o.m14526a(C4443o.m18255e(this.f10183b).m18258f(1, bundle));
            } catch (InterruptedException | ExecutionException e10) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e10);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
                    sb2.append("Error making request: ");
                    sb2.append(valueOf);
                    Log.d("FirebaseInstanceId", sb2.toString());
                }
                if ((e10.getCause() instanceof C4436h) && ((C4436h) e10.getCause()).m18237a() == 4) {
                    return m11939g(bundle);
                }
                return null;
            }
        }
        return m11939g(bundle);
    }
}
