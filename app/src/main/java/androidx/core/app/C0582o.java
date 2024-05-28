package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.appsflyer.oaid.BuildConfig;

/* renamed from: androidx.core.app.o */
/* loaded from: classes.dex */
public class C0582o {

    /* renamed from: a */
    CharSequence f3231a;

    /* renamed from: b */
    IconCompat f3232b;

    /* renamed from: c */
    String f3233c;

    /* renamed from: d */
    String f3234d;

    /* renamed from: e */
    boolean f3235e;

    /* renamed from: f */
    boolean f3236f;

    /* renamed from: androidx.core.app.o$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static C0582o m2988a(Person person) {
            return new b().m2995f(person.getName()).m2992c(person.getIcon() != null ? IconCompat.m3211a(person.getIcon()) : null).m2996g(person.getUri()).m2994e(person.getKey()).m2991b(person.isBot()).m2993d(person.isImportant()).m2990a();
        }

        /* renamed from: b */
        static Person m2989b(C0582o c0582o) {
            return new Person.Builder().setName(c0582o.m2981c()).setIcon(c0582o.m2979a() != null ? c0582o.m2979a().m3230s() : null).setUri(c0582o.m2982d()).setKey(c0582o.m2980b()).setBot(c0582o.m2983e()).setImportant(c0582o.m2984f()).build();
        }
    }

    /* renamed from: androidx.core.app.o$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        CharSequence f3237a;

        /* renamed from: b */
        IconCompat f3238b;

        /* renamed from: c */
        String f3239c;

        /* renamed from: d */
        String f3240d;

        /* renamed from: e */
        boolean f3241e;

        /* renamed from: f */
        boolean f3242f;

        /* renamed from: a */
        public C0582o m2990a() {
            return new C0582o(this);
        }

        /* renamed from: b */
        public b m2991b(boolean z10) {
            this.f3241e = z10;
            return this;
        }

        /* renamed from: c */
        public b m2992c(IconCompat iconCompat) {
            this.f3238b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public b m2993d(boolean z10) {
            this.f3242f = z10;
            return this;
        }

        /* renamed from: e */
        public b m2994e(String str) {
            this.f3240d = str;
            return this;
        }

        /* renamed from: f */
        public b m2995f(CharSequence charSequence) {
            this.f3237a = charSequence;
            return this;
        }

        /* renamed from: g */
        public b m2996g(String str) {
            this.f3239c = str;
            return this;
        }
    }

    C0582o(b bVar) {
        this.f3231a = bVar.f3237a;
        this.f3232b = bVar.f3238b;
        this.f3233c = bVar.f3239c;
        this.f3234d = bVar.f3240d;
        this.f3235e = bVar.f3241e;
        this.f3236f = bVar.f3242f;
    }

    /* renamed from: a */
    public IconCompat m2979a() {
        return this.f3232b;
    }

    /* renamed from: b */
    public String m2980b() {
        return this.f3234d;
    }

    /* renamed from: c */
    public CharSequence m2981c() {
        return this.f3231a;
    }

    /* renamed from: d */
    public String m2982d() {
        return this.f3233c;
    }

    /* renamed from: e */
    public boolean m2983e() {
        return this.f3235e;
    }

    /* renamed from: f */
    public boolean m2984f() {
        return this.f3236f;
    }

    /* renamed from: g */
    public String m2985g() {
        String str = this.f3233c;
        if (str != null) {
            return str;
        }
        if (this.f3231a == null) {
            return BuildConfig.FLAVOR;
        }
        return "name:" + ((Object) this.f3231a);
    }

    /* renamed from: h */
    public Person m2986h() {
        return a.m2989b(this);
    }

    /* renamed from: i */
    public Bundle m2987i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f3231a);
        IconCompat iconCompat = this.f3232b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m3229r() : null);
        bundle.putString("uri", this.f3233c);
        bundle.putString("key", this.f3234d);
        bundle.putBoolean("isBot", this.f3235e);
        bundle.putBoolean("isImportant", this.f3236f);
        return bundle;
    }
}
