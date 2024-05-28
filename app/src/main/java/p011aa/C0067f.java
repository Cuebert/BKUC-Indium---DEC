package p011aa;

import android.content.Context;
import android.util.Log;
import p019b5.C1012a;
import p019b5.InterfaceC1016c;
import p059e5.AbstractC3072d;
import p085g4.InterfaceC3253g;
import p085g4.InterfaceC3255h;

/* renamed from: aa.f */
/* loaded from: classes.dex */
public class C0067f {

    /* renamed from: a */
    private AbstractC3072d<InterfaceC1016c.c> f244a;

    /* renamed from: aa.f$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        private static final C0067f f245a = new C0067f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m291e(InterfaceC1016c.c cVar) {
        Log.d("DeviceIntegrityManager", "Successfully set integrity token provider");
        this.f244a = AbstractC3072d.m13542d(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m292f(Exception exc) {
        Log.e("DeviceIntegrityManager", "Failed to set token provider " + exc.getMessage());
    }

    /* renamed from: h */
    public static C0067f m293h() {
        return b.f245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.roblox.universalapp.messagebus.C2947b m294c(org.json.JSONObject r8) {
        /*
            r7 = this;
            java.lang.String r0 = "DeviceIntegrityManager"
            java.lang.String r1 = ""
            com.roblox.universalapp.messagebus.b r2 = new com.roblox.universalapp.messagebus.b
            r2.<init>()
            aa.h r3 = p011aa.EnumC0069h.TOKEN_PROVIDER_UNINITIALIZED
            java.lang.String r4 = com.roblox.universalapp.account.JNIAccountProtocol.getRequestHashKey()     // Catch: org.json.JSONException -> L1e
            java.lang.String r4 = r8.getString(r4)     // Catch: org.json.JSONException -> L1e
            java.lang.String r5 = com.roblox.universalapp.account.JNIAccountProtocol.getTimeoutKey()     // Catch: org.json.JSONException -> L1c
            long r5 = r8.getLong(r5)     // Catch: org.json.JSONException -> L1c
            goto L3a
        L1c:
            r8 = move-exception
            goto L20
        L1e:
            r8 = move-exception
            r4 = r1
        L20:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "JSON exception on retrieving integrity token: "
            r5.append(r6)
            java.lang.String r8 = r8.toString()
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            android.util.Log.e(r0, r8)
            r5 = 300(0x12c, double:1.48E-321)
        L3a:
            boolean r8 = r4.equals(r1)
            if (r8 == 0) goto L49
            aa.h r8 = p011aa.EnumC0069h.INVALID_NONCE
            org.json.JSONObject r8 = p011aa.C0068g.m298a(r1, r8)
            r2.f12129a = r8
            return r2
        L49:
            e5.d<b5.c$c> r8 = r7.f244a
            boolean r8 = r8.mo13538c()
            if (r8 == 0) goto Lcb
            e5.d<b5.c$c> r8 = r7.f244a
            java.lang.Object r8 = r8.mo13537b()
            b5.c$c r8 = (p019b5.InterfaceC1016c.c) r8
            b5.c$d$a r3 = p019b5.InterfaceC1016c.d.m6259b()
            b5.c$d$a r3 = r3.mo6262b(r4)
            b5.c$d r3 = r3.mo6261a()
            g4.l r8 = r8.mo6258a(r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L78 java.lang.InterruptedException -> L94 java.util.concurrent.ExecutionException -> Lb0
            java.lang.Object r8 = p085g4.C3269o.m14527b(r8, r5, r3)     // Catch: java.util.concurrent.TimeoutException -> L78 java.lang.InterruptedException -> L94 java.util.concurrent.ExecutionException -> Lb0
            b5.c$b r8 = (p019b5.InterfaceC1016c.b) r8     // Catch: java.util.concurrent.TimeoutException -> L78 java.lang.InterruptedException -> L94 java.util.concurrent.ExecutionException -> Lb0
            java.lang.String r1 = r8.mo6257a()     // Catch: java.util.concurrent.TimeoutException -> L78 java.lang.InterruptedException -> L94 java.util.concurrent.ExecutionException -> Lb0
            aa.h r3 = p011aa.EnumC0069h.RECEIVED     // Catch: java.util.concurrent.TimeoutException -> L78 java.lang.InterruptedException -> L94 java.util.concurrent.ExecutionException -> Lb0
            goto Lcb
        L78:
            r8 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Integrity request timed out: "
            r3.append(r4)
            java.lang.String r8 = r8.toString()
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            android.util.Log.e(r0, r8)
            aa.h r3 = p011aa.EnumC0069h.REQUEST_TIMEOUT
            goto Lcb
        L94:
            r8 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Integrity request interrupted: "
            r3.append(r4)
            java.lang.String r8 = r8.toString()
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            android.util.Log.e(r0, r8)
            aa.h r3 = p011aa.EnumC0069h.INTERRUPTED
            goto Lcb
        Lb0:
            r8 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception during integrity token retrieval: "
            r3.append(r4)
            java.lang.String r8 = r8.toString()
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            android.util.Log.e(r0, r8)
            aa.h r3 = p011aa.EnumC0069h.EXCEPTION
        Lcb:
            org.json.JSONObject r8 = p011aa.C0068g.m298a(r1, r3)
            r2.f12129a = r8
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p011aa.C0067f.m294c(org.json.JSONObject):com.roblox.universalapp.messagebus.b");
    }

    /* renamed from: d */
    public boolean m295d() {
        return true;
    }

    /* renamed from: g */
    public synchronized void m296g(Context context) {
        if (this.f244a.mo13538c()) {
            Log.d("DeviceIntegrityManager", "Token provider already initialized");
        } else {
            C1012a.m6251a(context.getApplicationContext()).mo6253a(InterfaceC1016c.a.m6254b().mo6256b(56711522248L).mo6255a()).mo14499f(new InterfaceC3255h() { // from class: aa.e
                @Override // p085g4.InterfaceC3255h
                public final void onSuccess(Object obj) {
                    C0067f.this.m291e((InterfaceC1016c.c) obj);
                }
            }).mo14497d(new InterfaceC3253g() { // from class: aa.d
                @Override // p085g4.InterfaceC3253g
                public final void onFailure(Exception exc) {
                    C0067f.m292f(exc);
                }
            });
        }
    }

    private C0067f() {
        this.f244a = AbstractC3072d.m13541a();
    }
}
