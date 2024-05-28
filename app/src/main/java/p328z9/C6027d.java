package p328z9;

import android.content.Context;
import android.util.Log;
import p085g4.AbstractC3263l;
import p085g4.InterfaceC3253g;
import p085g4.InterfaceC3255h;
import p221r2.C4419a;

/* renamed from: z9.d */
/* loaded from: classes.dex */
public class C6027d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z9.d$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3255h<Void> {

        /* renamed from: a */
        final /* synthetic */ String f22110a;

        a(String str) {
            this.f22110a = str;
        }

        @Override // p085g4.InterfaceC3255h
        /* renamed from: a */
        public void onSuccess(Void r22) {
            Log.i(this.f22110a, "onSuccess.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z9.d$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC3253g {

        /* renamed from: a */
        final /* synthetic */ String f22112a;

        b(String str) {
            this.f22112a = str;
        }

        @Override // p085g4.InterfaceC3253g
        public void onFailure(Exception exc) {
            Log.i(this.f22112a, "onFailure.");
        }
    }

    /* renamed from: a */
    public void m21351a(Context context, String str) {
        AbstractC3263l<Void> mo17817y = C4419a.m18221a(context).mo17817y();
        mo17817y.mo14499f(new a(str));
        mo17817y.mo14497d(new b(str));
    }
}
