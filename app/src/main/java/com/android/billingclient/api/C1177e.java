package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC2024r5;
import com.google.android.gms.internal.play_billing.C1968j5;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p171n1.C4037o;
import p171n1.C4039p;
import p171n1.C4041q;
import p171n1.C4042r;
import p171n1.C4043s;
import p171n1.C4044t;

/* renamed from: com.android.billingclient.api.e */
/* loaded from: classes.dex */
public class C1177e {

    /* renamed from: a */
    private boolean f5566a;

    /* renamed from: b */
    private String f5567b;

    /* renamed from: c */
    private String f5568c;

    /* renamed from: d */
    private c f5569d;

    /* renamed from: e */
    private AbstractC2024r5 f5570e;

    /* renamed from: f */
    private ArrayList f5571f;

    /* renamed from: g */
    private boolean f5572g;

    /* renamed from: com.android.billingclient.api.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private String f5573a;

        /* renamed from: b */
        private String f5574b;

        /* renamed from: c */
        private List f5575c;

        /* renamed from: d */
        private ArrayList f5576d;

        /* renamed from: e */
        private boolean f5577e;

        /* renamed from: f */
        private c.a f5578f;

        /* synthetic */ a(C4037o c4037o) {
            c.a m6897a = c.m6897a();
            c.a.m6906b(m6897a);
            this.f5578f = m6897a;
        }

        /* renamed from: a */
        public C1177e m6885a() {
            ArrayList arrayList;
            AbstractC2024r5 m9560s;
            ArrayList arrayList2 = this.f5576d;
            boolean z10 = true;
            boolean z11 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            List list = this.f5575c;
            boolean z12 = (list == null || list.isEmpty()) ? false : true;
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z11 && z12) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (z11) {
                if (!this.f5576d.contains(null)) {
                    if (this.f5576d.size() > 1) {
                        SkuDetails skuDetails = (SkuDetails) this.f5576d.get(0);
                        String m6792b = skuDetails.m6792b();
                        ArrayList arrayList3 = this.f5576d;
                        int size = arrayList3.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i10);
                            if (!m6792b.equals("play_pass_subs") && !skuDetails2.m6792b().equals("play_pass_subs") && !m6792b.equals(skuDetails2.m6792b())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String m6796f = skuDetails.m6796f();
                        ArrayList arrayList4 = this.f5576d;
                        int size2 = arrayList4.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i11);
                            if (!m6792b.equals("play_pass_subs") && !skuDetails3.m6792b().equals("play_pass_subs") && !m6796f.equals(skuDetails3.m6796f())) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            } else {
                b bVar = (b) this.f5575c.get(0);
                for (int i12 = 0; i12 < this.f5575c.size(); i12++) {
                    b bVar2 = (b) this.f5575c.get(i12);
                    if (bVar2 != null) {
                        if (i12 != 0 && !bVar2.m6890b().m6918c().equals(bVar.m6890b().m6918c()) && !bVar2.m6890b().m6918c().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    } else {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                String m6920e = bVar.m6890b().m6920e();
                for (b bVar3 : this.f5575c) {
                    if (!bVar.m6890b().m6918c().equals("play_pass_subs") && !bVar3.m6890b().m6918c().equals("play_pass_subs") && !m6920e.equals(bVar3.m6890b().m6920e())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            }
            C1177e c1177e = new C1177e(null);
            if ((!z11 || ((SkuDetails) this.f5576d.get(0)).m6796f().isEmpty()) && (!z12 || ((b) this.f5575c.get(0)).m6890b().m6920e().isEmpty())) {
                z10 = false;
            }
            c1177e.f5566a = z10;
            c1177e.f5567b = this.f5573a;
            c1177e.f5568c = this.f5574b;
            c1177e.f5569d = this.f5578f.m6907a();
            ArrayList arrayList5 = this.f5576d;
            if (arrayList5 != null) {
                arrayList = new ArrayList(arrayList5);
            } else {
                arrayList = new ArrayList();
            }
            c1177e.f5571f = arrayList;
            c1177e.f5572g = this.f5577e;
            List list2 = this.f5575c;
            if (list2 != null) {
                m9560s = AbstractC2024r5.m9559r(list2);
            } else {
                m9560s = AbstractC2024r5.m9560s();
            }
            c1177e.f5570e = m9560s;
            return c1177e;
        }

        /* renamed from: b */
        public a m6886b(String str) {
            this.f5573a = str;
            return this;
        }

        /* renamed from: c */
        public a m6887c(String str) {
            this.f5574b = str;
            return this;
        }

        /* renamed from: d */
        public a m6888d(List<b> list) {
            this.f5575c = new ArrayList(list);
            return this;
        }
    }

    /* renamed from: com.android.billingclient.api.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final C1181g f5579a;

        /* renamed from: b */
        private final String f5580b;

        /* renamed from: com.android.billingclient.api.e$b$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private C1181g f5581a;

            /* renamed from: b */
            private String f5582b;

            /* synthetic */ a(C4039p c4039p) {
            }

            /* renamed from: a */
            public b m6894a() {
                C1968j5.m9472c(this.f5581a, "ProductDetails is required for constructing ProductDetailsParams.");
                C1968j5.m9472c(this.f5582b, "offerToken is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            /* renamed from: b */
            public a m6895b(String str) {
                this.f5582b = str;
                return this;
            }

            /* renamed from: c */
            public a m6896c(C1181g c1181g) {
                this.f5581a = c1181g;
                if (c1181g.m6916a() != null) {
                    Objects.requireNonNull(c1181g.m6916a());
                    this.f5582b = c1181g.m6916a().m6926d();
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, C4041q c4041q) {
            this.f5579a = aVar.f5581a;
            this.f5580b = aVar.f5582b;
        }

        /* renamed from: a */
        public static a m6889a() {
            return new a(null);
        }

        /* renamed from: b */
        public final C1181g m6890b() {
            return this.f5579a;
        }

        /* renamed from: c */
        public final String m6891c() {
            return this.f5580b;
        }
    }

    /* renamed from: com.android.billingclient.api.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private String f5583a;

        /* renamed from: b */
        private String f5584b;

        /* renamed from: c */
        private int f5585c = 0;

        /* renamed from: d */
        private int f5586d = 0;

        /* renamed from: com.android.billingclient.api.e$c$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private String f5587a;

            /* renamed from: b */
            private String f5588b;

            /* renamed from: c */
            private boolean f5589c;

            /* renamed from: d */
            private int f5590d = 0;

            /* renamed from: e */
            private int f5591e = 0;

            /* synthetic */ a(C4042r c4042r) {
            }

            /* renamed from: b */
            static /* synthetic */ a m6906b(a aVar) {
                aVar.f5589c = true;
                return aVar;
            }

            /* renamed from: a */
            public c m6907a() {
                boolean z10 = (TextUtils.isEmpty(this.f5587a) && TextUtils.isEmpty(null)) ? false : true;
                boolean isEmpty = true ^ TextUtils.isEmpty(this.f5588b);
                if (z10 && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f5589c && !z10 && !isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(null);
                cVar.f5583a = this.f5587a;
                cVar.f5585c = this.f5590d;
                cVar.f5586d = this.f5591e;
                cVar.f5584b = this.f5588b;
                return cVar;
            }
        }

        /* synthetic */ c(C4043s c4043s) {
        }

        /* renamed from: a */
        public static a m6897a() {
            return new a(null);
        }

        @Deprecated
        /* renamed from: b */
        final int m6902b() {
            return this.f5585c;
        }

        /* renamed from: c */
        final int m6903c() {
            return this.f5586d;
        }

        /* renamed from: d */
        final String m6904d() {
            return this.f5583a;
        }

        /* renamed from: e */
        final String m6905e() {
            return this.f5584b;
        }
    }

    /* synthetic */ C1177e(C4044t c4044t) {
    }

    /* renamed from: a */
    public static a m6867a() {
        return new a(null);
    }

    @Deprecated
    /* renamed from: b */
    public final int m6875b() {
        return this.f5569d.m6902b();
    }

    /* renamed from: c */
    public final int m6876c() {
        return this.f5569d.m6903c();
    }

    /* renamed from: d */
    public final String m6877d() {
        return this.f5567b;
    }

    /* renamed from: e */
    public final String m6878e() {
        return this.f5568c;
    }

    /* renamed from: f */
    public final String m6879f() {
        return this.f5569d.m6904d();
    }

    /* renamed from: g */
    public final String m6880g() {
        return this.f5569d.m6905e();
    }

    /* renamed from: h */
    public final ArrayList m6881h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5571f);
        return arrayList;
    }

    /* renamed from: i */
    public final List m6882i() {
        return this.f5570e;
    }

    /* renamed from: q */
    public final boolean m6883q() {
        return this.f5572g;
    }

    /* renamed from: r */
    public final boolean m6884r() {
        return (this.f5567b == null && this.f5568c == null && this.f5569d.m6905e() == null && this.f5569d.m6902b() == 0 && this.f5569d.m6903c() == 0 && !this.f5566a && !this.f5572g) ? false : true;
    }
}
