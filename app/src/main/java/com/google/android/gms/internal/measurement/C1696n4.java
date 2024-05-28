package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* loaded from: classes.dex */
public final class C1696n4 extends AbstractC1732p8<C1696n4, C1680m4> implements InterfaceC1829v9 {
    public static final /* synthetic */ int zza = 0;
    private static final C1696n4 zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private C1760r4 zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private C1632j4 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private InterfaceC1844w8<C1531d4> zzi = AbstractC1732p8.m8667k();
    private InterfaceC1844w8<C1856x4> zzj = AbstractC1732p8.m8667k();
    private String zzp = BuildConfig.FLAVOR;
    private String zzq = BuildConfig.FLAVOR;
    private String zzr = BuildConfig.FLAVOR;
    private String zzs = BuildConfig.FLAVOR;
    private String zzu = BuildConfig.FLAVOR;
    private String zzv = BuildConfig.FLAVOR;
    private String zzw = BuildConfig.FLAVOR;
    private String zzz = BuildConfig.FLAVOR;
    private String zzB = BuildConfig.FLAVOR;
    private String zzE = BuildConfig.FLAVOR;
    private String zzF = BuildConfig.FLAVOR;
    private InterfaceC1844w8<C1887z3> zzH = AbstractC1732p8.m8667k();
    private String zzI = BuildConfig.FLAVOR;
    private String zzM = BuildConfig.FLAVOR;
    private String zzP = BuildConfig.FLAVOR;
    private String zzQ = BuildConfig.FLAVOR;
    private String zzS = BuildConfig.FLAVOR;
    private InterfaceC1812u8 zzU = AbstractC1732p8.m8673s();
    private String zzX = BuildConfig.FLAVOR;
    private String zzY = BuildConfig.FLAVOR;
    private String zzab = BuildConfig.FLAVOR;

    static {
        C1696n4 c1696n4 = new C1696n4();
        zze = c1696n4;
        AbstractC1732p8.m8671o(C1696n4.class, c1696n4);
    }

    private C1696n4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public static /* synthetic */ void m8494B0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzg |= 64;
        c1696n4.zzX = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public static /* synthetic */ void m8495C0(C1696n4 c1696n4, String str) {
        c1696n4.zzg |= 128;
        c1696n4.zzY = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public static /* synthetic */ void m8496D0(C1696n4 c1696n4, Iterable iterable) {
        c1696n4.m8534c1();
        AbstractC1890z6.m9142c(iterable, c1696n4.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public static /* synthetic */ void m8498F0(C1696n4 c1696n4, int i10) {
        c1696n4.m8534c1();
        c1696n4.zzi.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public static /* synthetic */ void m8499G0(C1696n4 c1696n4, int i10, C1856x4 c1856x4) {
        c1856x4.getClass();
        c1696n4.m8536d1();
        c1696n4.zzj.set(i10, c1856x4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public static /* synthetic */ void m8500H0(C1696n4 c1696n4, C1856x4 c1856x4) {
        c1856x4.getClass();
        c1696n4.m8536d1();
        c1696n4.zzj.add(c1856x4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public static /* synthetic */ void m8501I0(C1696n4 c1696n4, Iterable iterable) {
        c1696n4.m8536d1();
        AbstractC1890z6.m9142c(iterable, c1696n4.zzj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public static /* synthetic */ void m8502J0(C1696n4 c1696n4, int i10) {
        c1696n4.m8536d1();
        c1696n4.zzj.remove(i10);
    }

    /* renamed from: J1 */
    public static C1680m4 m8503J1() {
        return zze.m8682p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public static /* synthetic */ void m8504K0(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 2;
        c1696n4.zzk = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public static /* synthetic */ void m8506L0(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 4;
        c1696n4.zzl = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* synthetic */ void m8507M(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 1073741824;
        c1696n4.zzO = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public static /* synthetic */ void m8508M0(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 8;
        c1696n4.zzm = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static /* synthetic */ void m8509N(C1696n4 c1696n4) {
        c1696n4.zzf &= Integer.MAX_VALUE;
        c1696n4.zzP = zze.zzP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public static /* synthetic */ void m8510N0(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 16;
        c1696n4.zzn = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public static /* synthetic */ void m8511O0(C1696n4 c1696n4) {
        c1696n4.zzf &= -17;
        c1696n4.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static /* synthetic */ void m8512P(C1696n4 c1696n4, int i10) {
        c1696n4.zzg |= 2;
        c1696n4.zzR = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public static /* synthetic */ void m8513P0(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 32;
        c1696n4.zzo = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public static /* synthetic */ void m8514Q0(C1696n4 c1696n4) {
        c1696n4.zzf &= -33;
        c1696n4.zzo = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static /* synthetic */ void m8515R(C1696n4 c1696n4, int i10, C1531d4 c1531d4) {
        c1531d4.getClass();
        c1696n4.m8534c1();
        c1696n4.zzi.set(i10, c1531d4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public static /* synthetic */ void m8516R0(C1696n4 c1696n4, String str) {
        c1696n4.zzf |= 64;
        c1696n4.zzp = "android";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static /* synthetic */ void m8517S(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzg |= 4;
        c1696n4.zzS = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public static /* synthetic */ void m8518S0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 128;
        c1696n4.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public static /* synthetic */ void m8519T0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 256;
        c1696n4.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static /* synthetic */ void m8520U(C1696n4 c1696n4, C1760r4 c1760r4) {
        c1760r4.getClass();
        c1696n4.zzT = c1760r4;
        c1696n4.zzg |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public static /* synthetic */ void m8521U0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 512;
        c1696n4.zzs = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static /* synthetic */ void m8522V(C1696n4 c1696n4, Iterable iterable) {
        InterfaceC1812u8 interfaceC1812u8 = c1696n4.zzU;
        if (!interfaceC1812u8.mo7888a()) {
            int size = interfaceC1812u8.size();
            c1696n4.zzU = interfaceC1812u8.mo8008g(size == 0 ? 10 : size + size);
        }
        AbstractC1890z6.m9142c(iterable, c1696n4.zzU);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V0 */
    public static /* synthetic */ void m8523V0(C1696n4 c1696n4, int i10) {
        c1696n4.zzf |= 1024;
        c1696n4.zzt = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static /* synthetic */ void m8524W(C1696n4 c1696n4, C1531d4 c1531d4) {
        c1531d4.getClass();
        c1696n4.m8534c1();
        c1696n4.zzi.add(c1531d4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public static /* synthetic */ void m8525W0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 2048;
        c1696n4.zzu = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public static /* synthetic */ void m8526X0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 4096;
        c1696n4.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static /* synthetic */ void m8527Y(C1696n4 c1696n4, long j10) {
        c1696n4.zzg |= 16;
        c1696n4.zzV = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public static /* synthetic */ void m8528Y0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 8192;
        c1696n4.zzw = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static /* synthetic */ void m8529Z(C1696n4 c1696n4, long j10) {
        c1696n4.zzg |= 32;
        c1696n4.zzW = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public static /* synthetic */ void m8530Z0(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 16384;
        c1696n4.zzx = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a1 */
    public static /* synthetic */ void m8531a1(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 32768;
        c1696n4.zzy = 46000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public static /* synthetic */ void m8532b0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 65536;
        c1696n4.zzz = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public static /* synthetic */ void m8533c0(C1696n4 c1696n4) {
        c1696n4.zzf &= -65537;
        c1696n4.zzz = zze.zzz;
    }

    /* renamed from: c1 */
    private final void m8534c1() {
        InterfaceC1844w8<C1531d4> interfaceC1844w8 = this.zzi;
        if (interfaceC1844w8.mo7888a()) {
            return;
        }
        this.zzi = AbstractC1732p8.m8668l(interfaceC1844w8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public static /* synthetic */ void m8535d0(C1696n4 c1696n4, boolean z10) {
        c1696n4.zzf |= 131072;
        c1696n4.zzA = z10;
    }

    /* renamed from: d1 */
    private final void m8536d1() {
        InterfaceC1844w8<C1856x4> interfaceC1844w8 = this.zzj;
        if (interfaceC1844w8.mo7888a()) {
            return;
        }
        this.zzj = AbstractC1732p8.m8668l(interfaceC1844w8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public static /* synthetic */ void m8537e0(C1696n4 c1696n4) {
        c1696n4.zzf &= -131073;
        c1696n4.zzA = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public static /* synthetic */ void m8538f0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 262144;
        c1696n4.zzB = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static /* synthetic */ void m8539g0(C1696n4 c1696n4) {
        c1696n4.zzf &= -262145;
        c1696n4.zzB = zze.zzB;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public static /* synthetic */ void m8540h0(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 524288;
        c1696n4.zzC = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public static /* synthetic */ void m8541i0(C1696n4 c1696n4, int i10) {
        c1696n4.zzf |= 1048576;
        c1696n4.zzD = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public static /* synthetic */ void m8542j0(C1696n4 c1696n4, String str) {
        c1696n4.zzf |= 2097152;
        c1696n4.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public static /* synthetic */ void m8543k0(C1696n4 c1696n4) {
        c1696n4.zzf &= -2097153;
        c1696n4.zzE = zze.zzE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public static /* synthetic */ void m8544l0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 4194304;
        c1696n4.zzF = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public static /* synthetic */ void m8545m0(C1696n4 c1696n4, boolean z10) {
        c1696n4.zzf |= 8388608;
        c1696n4.zzG = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public static /* synthetic */ void m8546n0(C1696n4 c1696n4, Iterable iterable) {
        InterfaceC1844w8<C1887z3> interfaceC1844w8 = c1696n4.zzH;
        if (!interfaceC1844w8.mo7888a()) {
            c1696n4.zzH = AbstractC1732p8.m8668l(interfaceC1844w8);
        }
        AbstractC1890z6.m9142c(iterable, c1696n4.zzH);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public static /* synthetic */ void m8548p0(C1696n4 c1696n4, String str) {
        str.getClass();
        c1696n4.zzf |= 16777216;
        c1696n4.zzI = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public static /* synthetic */ void m8549q0(C1696n4 c1696n4, int i10) {
        c1696n4.zzf |= 33554432;
        c1696n4.zzJ = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public static /* synthetic */ void m8550r0(C1696n4 c1696n4, int i10) {
        c1696n4.zzf |= 1;
        c1696n4.zzh = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public static /* synthetic */ void m8551s0(C1696n4 c1696n4) {
        c1696n4.zzf &= -268435457;
        c1696n4.zzM = zze.zzM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public static /* synthetic */ void m8552t0(C1696n4 c1696n4, long j10) {
        c1696n4.zzf |= 536870912;
        c1696n4.zzN = j10;
    }

    /* renamed from: A */
    public final String m8553A() {
        return this.zzP;
    }

    /* renamed from: A0 */
    public final boolean m8554A0() {
        return (this.zzg & 128) != 0;
    }

    /* renamed from: A1 */
    public final long m8555A1() {
        return this.zzV;
    }

    /* renamed from: B */
    public final String m8556B() {
        return this.zzI;
    }

    /* renamed from: B1 */
    public final long m8557B1() {
        return this.zzm;
    }

    /* renamed from: C */
    public final String m8558C() {
        return this.zzX;
    }

    /* renamed from: C1 */
    public final long m8559C1() {
        return this.zzx;
    }

    /* renamed from: D */
    public final String m8560D() {
        return this.zzF;
    }

    /* renamed from: D1 */
    public final long m8561D1() {
        return this.zzo;
    }

    /* renamed from: E */
    public final String m8562E() {
        return this.zzE;
    }

    /* renamed from: E1 */
    public final long m8563E1() {
        return this.zzn;
    }

    /* renamed from: F */
    public final String m8564F() {
        return this.zzq;
    }

    /* renamed from: F1 */
    public final long m8565F1() {
        return this.zzl;
    }

    /* renamed from: G */
    public final String m8566G() {
        return this.zzp;
    }

    /* renamed from: G1 */
    public final long m8567G1() {
        return this.zzk;
    }

    /* renamed from: H */
    public final String m8568H() {
        return this.zzz;
    }

    /* renamed from: H1 */
    public final long m8569H1() {
        return this.zzy;
    }

    /* renamed from: I */
    public final String m8570I() {
        return this.zzs;
    }

    /* renamed from: I1 */
    public final C1531d4 m8571I1(int i10) {
        return this.zzi.get(i10);
    }

    /* renamed from: J */
    public final List<C1887z3> m8572J() {
        return this.zzH;
    }

    /* renamed from: K */
    public final List<C1531d4> m8573K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final List<C1856x4> m8574L() {
        return this.zzj;
    }

    /* renamed from: L1 */
    public final C1856x4 m8575L1(int i10) {
        return this.zzj.get(i10);
    }

    /* renamed from: M1 */
    public final String m8576M1() {
        return this.zzS;
    }

    /* renamed from: N1 */
    public final String m8577N1() {
        return this.zzv;
    }

    /* renamed from: O1 */
    public final String m8578O1() {
        return this.zzB;
    }

    /* renamed from: a0 */
    public final int m8579a0() {
        return this.zzJ;
    }

    /* renamed from: b1 */
    public final int m8580b1() {
        return this.zzD;
    }

    /* renamed from: e1 */
    public final boolean m8581e1() {
        return (this.zzf & 524288) != 0;
    }

    /* renamed from: f1 */
    public final boolean m8582f1() {
        return (this.zzg & 16) != 0;
    }

    /* renamed from: g1 */
    public final boolean m8583g1() {
        return (this.zzf & 8) != 0;
    }

    /* renamed from: h1 */
    public final boolean m8584h1() {
        return (this.zzf & 16384) != 0;
    }

    /* renamed from: i1 */
    public final boolean m8585i1() {
        return (this.zzf & 131072) != 0;
    }

    /* renamed from: j1 */
    public final boolean m8586j1() {
        return (this.zzf & 32) != 0;
    }

    /* renamed from: k1 */
    public final boolean m8587k1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: l1 */
    public final boolean m8588l1() {
        return (this.zzf & 1) != 0;
    }

    /* renamed from: m1 */
    public final boolean m8589m1() {
        return (this.zzg & 2) != 0;
    }

    /* renamed from: n1 */
    public final boolean m8590n1() {
        return (this.zzf & 8388608) != 0;
    }

    /* renamed from: o1 */
    public final boolean m8591o1() {
        return (this.zzf & 4) != 0;
    }

    /* renamed from: p1 */
    public final boolean m8592p1() {
        return (this.zzf & 1024) != 0;
    }

    /* renamed from: q1 */
    public final boolean m8593q1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: r1 */
    public final boolean m8594r1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: s1 */
    public final int m8595s1() {
        return this.zzi.size();
    }

    /* renamed from: t1 */
    public final int m8596t1() {
        return this.zzh;
    }

    /* renamed from: u0 */
    public final boolean m8597u0() {
        return this.zzA;
    }

    /* renamed from: u1 */
    public final int m8598u1() {
        return this.zzR;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC1732p8
    /* renamed from: v */
    public final Object mo7884v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC1732p8.m8670n(zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,", new Object[]{"zzf", "zzg", "zzh", "zzi", C1531d4.class, "zzj", C1856x4.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", C1887z3.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C1823v3.f7259a, "zzaa", "zzab", "zzac", "zzad"});
        }
        if (i11 == 3) {
            return new C1696n4();
        }
        C1807u3 c1807u3 = null;
        if (i11 == 4) {
            return new C1680m4(c1807u3);
        }
        if (i11 != 5) {
            return null;
        }
        return zze;
    }

    /* renamed from: v0 */
    public final boolean m8599v0() {
        return this.zzG;
    }

    /* renamed from: v1 */
    public final int m8600v1() {
        return this.zzt;
    }

    /* renamed from: w */
    public final String m8601w() {
        return this.zzu;
    }

    /* renamed from: w0 */
    public final boolean m8602w0() {
        return (this.zzf & 1073741824) != 0;
    }

    /* renamed from: w1 */
    public final int m8603w1() {
        return this.zzj.size();
    }

    /* renamed from: x */
    public final String m8604x() {
        return this.zzw;
    }

    /* renamed from: x0 */
    public final boolean m8605x0() {
        return (this.zzf & 33554432) != 0;
    }

    /* renamed from: x1 */
    public final long m8606x1() {
        return this.zzO;
    }

    /* renamed from: y */
    public final String m8607y() {
        return this.zzY;
    }

    /* renamed from: y0 */
    public final boolean m8608y0() {
        return (this.zzf & 1048576) != 0;
    }

    /* renamed from: y1 */
    public final long m8609y1() {
        return this.zzN;
    }

    /* renamed from: z */
    public final String m8610z() {
        return this.zzr;
    }

    /* renamed from: z0 */
    public final boolean m8611z0() {
        return (this.zzf & 536870912) != 0;
    }

    /* renamed from: z1 */
    public final long m8612z1() {
        return this.zzC;
    }
}
