package p209q2;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import p085g4.AbstractC3263l;
import p295x2.C5507b;
import p295x2.InterfaceC5512g;

/* renamed from: q2.c */
/* loaded from: classes.dex */
public interface InterfaceC4295c extends InterfaceC5512g<C4300h> {
    /* renamed from: a */
    AbstractC3263l<PendingIntent> mo17676a(GetSignInIntentRequest getSignInIntentRequest);

    /* renamed from: b */
    AbstractC3263l<PendingIntent> mo17677b(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    /* renamed from: d */
    AbstractC3263l<Void> mo17678d();

    /* renamed from: e */
    SignInCredential mo17679e(Intent intent) throws C5507b;

    /* renamed from: f */
    AbstractC3263l<BeginSignInResult> mo17680f(BeginSignInRequest beginSignInRequest);

    /* renamed from: i */
    String mo17681i(Intent intent) throws C5507b;
}
