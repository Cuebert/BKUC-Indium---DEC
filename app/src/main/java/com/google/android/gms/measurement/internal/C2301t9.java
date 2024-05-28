package com.google.android.gms.measurement.internal;

import java.util.BitSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t9 */
/* loaded from: classes.dex */
public final class C2301t9 extends AbstractC2289s8 {

    /* renamed from: d */
    private String f8581d;

    /* renamed from: e */
    private Set<Integer> f8582e;

    /* renamed from: f */
    private Map<Integer, C2246o9> f8583f;

    /* renamed from: g */
    private Long f8584g;

    /* renamed from: h */
    private Long f8585h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2301t9(C2103b9 c2103b9) {
        super(c2103b9);
    }

    /* renamed from: n */
    private final C2246o9 m10308n(Integer num) {
        if (this.f8583f.containsKey(num)) {
            return this.f8583f.get(num);
        }
        C2246o9 c2246o9 = new C2246o9(this, this.f8581d, null);
        this.f8583f.put(num, c2246o9);
        return c2246o9;
    }

    /* renamed from: o */
    private final boolean m10309o(int i10, int i11) {
        BitSet bitSet;
        C2246o9 c2246o9 = this.f8583f.get(Integer.valueOf(i10));
        if (c2246o9 == null) {
            return false;
        }
        bitSet = c2246o9.f8413d;
        return bitSet.get(i11);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2289s8
    /* renamed from: l */
    protected final boolean mo9853l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|(2:4|(2:6|7)(1:509))(2:510|511))|8|(3:10|11|12)|16|(17:(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:486|(1:488)(1:490)|489)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:446|(6:447|448|449|450|451|(1:454)(1:453))|455)|44|(5:282|(3:284|(11:286|287|288|289|290|(5:341|298|299|(6:302|(1:337)(2:306|(8:312|313|(4:316|(2:318|319)(1:321)|320|314)|322|323|(4:326|(2:328|329)(1:331)|330|324)|332|333)(4:308|309|310|311))|334|335|311|300)|339)|(3:292|(1:294)|295)|298|299|(1:300)|339)|354)(1:445)|355|(10:358|(3:362|(4:365|(5:367|368|(1:370)(1:374)|371|372)(1:375)|373|363)|376)|377|(3:381|(4:384|(3:389|390|391)|392|382)|395)|396|(3:398|(6:401|(2:403|(3:405|406|407))(1:410)|408|409|407|399)|411)|412|(3:421|(8:424|(1:426)|427|(1:429)|430|(3:432|433|434)(1:436)|435|422)|437)|438|356)|444)|46|47|(3:175|(4:178|(9:180|(1:182)(1:279)|183|(9:185|186|187|188|189|190|191|192|(4:194|(11:195|196|197|198|199|200|201|(3:203|204|205)(1:249)|206|207|(1:210)(1:209))|211|212)(4:259|260|245|212))(1:278)|213|(4:216|(3:234|235|236)(6:218|219|(2:220|(2:222|(1:224)(2:225|226))(2:232|233))|(1:228)|229|230)|231|214)|237|238|239)(1:280)|240|176)|281)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:173)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|174)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:494|495))|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75)|508|36|37|38|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(2:2|(2:4|(2:6|7)(1:509))(2:510|511))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:486|(1:488)(1:490)|489)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:446|(6:447|448|449|450|451|(1:454)(1:453))|455)|44|(5:282|(3:284|(11:286|287|288|289|290|(5:341|298|299|(6:302|(1:337)(2:306|(8:312|313|(4:316|(2:318|319)(1:321)|320|314)|322|323|(4:326|(2:328|329)(1:331)|330|324)|332|333)(4:308|309|310|311))|334|335|311|300)|339)|(3:292|(1:294)|295)|298|299|(1:300)|339)|354)(1:445)|355|(10:358|(3:362|(4:365|(5:367|368|(1:370)(1:374)|371|372)(1:375)|373|363)|376)|377|(3:381|(4:384|(3:389|390|391)|392|382)|395)|396|(3:398|(6:401|(2:403|(3:405|406|407))(1:410)|408|409|407|399)|411)|412|(3:421|(8:424|(1:426)|427|(1:429)|430|(3:432|433|434)(1:436)|435|422)|437)|438|356)|444)|46|47|(3:175|(4:178|(9:180|(1:182)(1:279)|183|(9:185|186|187|188|189|190|191|192|(4:194|(11:195|196|197|198|199|200|201|(3:203|204|205)(1:249)|206|207|(1:210)(1:209))|211|212)(4:259|260|245|212))(1:278)|213|(4:216|(3:234|235|236)(6:218|219|(2:220|(2:222|(1:224)(2:225|226))(2:232|233))|(1:228)|229|230)|231|214)|237|238|239)(1:280)|240|176)|281)|49|50|(3:77|(6:80|(6:82|83|84|85|86|(3:(9:88|89|90|91|92|(1:94)(1:151)|95|96|(1:99)(1:98))|100|101)(4:158|159|150|101))(1:173)|102|(2:103|(2:105|(3:141|142|143)(8:107|(2:108|(4:110|(3:112|(1:114)(1:137)|115)(1:138)|116|(1:1)(2:120|(1:122)(2:123|124)))(2:139|140))|131|(1:133)(1:135)|134|126|127|128))(0))|144|78)|174)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:494|495))|508|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0a36, code lost:
    
        if (r7 != false) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x090a, code lost:
    
        if (r13 == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0750, code lost:
    
        if (r11 != null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0302, code lost:
    
        if (r5 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0220, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0221, code lost:
    
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x022a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x022b, code lost:
    
        r18 = "audience_id";
        r19 = "data";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0226, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0227, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0171, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b0 A[Catch: SQLiteException -> 0x0220, all -> 0x0af7, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:40:0x01aa, B:42:0x01b0, B:446:0x01be, B:447:0x01c3, B:449:0x01cd, B:450:0x01dd, B:464:0x01ec), top: B:39:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x01be A[Catch: SQLiteException -> 0x0220, all -> 0x0af7, TRY_ENTER, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:40:0x01aa, B:42:0x01b0, B:446:0x01be, B:447:0x01c3, B:449:0x01cd, B:450:0x01dd, B:464:0x01ec), top: B:39:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x081d  */
    /* JADX WARN: Type inference failed for: r4v45, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.internal.measurement.C1887z3> m10310m(java.lang.String r66, java.util.List<com.google.android.gms.internal.measurement.C1531d4> r67, java.util.List<com.google.android.gms.internal.measurement.C1856x4> r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            Method dump skipped, instructions count: 2815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2301t9.m10310m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
