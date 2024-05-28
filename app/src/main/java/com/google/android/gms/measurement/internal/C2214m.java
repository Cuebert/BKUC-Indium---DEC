package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.C0587a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes.dex */
public final class C2214m extends AbstractC2165h5 {

    /* renamed from: c */
    private long f8281c;

    /* renamed from: d */
    private String f8282d;

    /* renamed from: e */
    private AccountManager f8283e;

    /* renamed from: f */
    private Boolean f8284f;

    /* renamed from: g */
    private long f8285g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2214m(C2219m4 c2219m4) {
        super(c2219m4);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2165h5
    /* renamed from: j */
    protected final boolean mo9920j() {
        Calendar calendar = Calendar.getInstance();
        this.f8281c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f8282d = sb2.toString();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final long m10091o() {
        mo9917h();
        return this.f8285g;
    }

    /* renamed from: p */
    public final long m10092p() {
        m9921k();
        return this.f8281c;
    }

    /* renamed from: q */
    public final String m10093q() {
        m9921k();
        return this.f8282d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m10094r() {
        mo9917h();
        this.f8284f = null;
        this.f8285g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m10095s() {
        Account[] result;
        mo9917h();
        long mo13781a = this.f8118a.mo9767e().mo13781a();
        if (mo13781a - this.f8285g > 86400000) {
            this.f8284f = null;
        }
        Boolean bool = this.f8284f;
        if (bool == null) {
            if (C0587a.m3027a(this.f8118a.mo9763c(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f8118a.mo9765d().m10055y().m9893a("Permission error checking for dasher/unicorn accounts");
                this.f8285g = mo13781a;
                this.f8284f = Boolean.FALSE;
                return false;
            }
            if (this.f8283e == null) {
                this.f8283e = AccountManager.get(this.f8118a.mo9763c());
            }
            try {
                result = this.f8283e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                this.f8118a.mo9765d().m10050t().m9894b("Exception checking account types", e10);
            }
            if (result != null && result.length > 0) {
                this.f8284f = Boolean.TRUE;
                this.f8285g = mo13781a;
                return true;
            }
            Account[] result2 = this.f8283e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f8284f = Boolean.TRUE;
                this.f8285g = mo13781a;
                return true;
            }
            this.f8285g = mo13781a;
            this.f8284f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
