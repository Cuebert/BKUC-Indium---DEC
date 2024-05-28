package p283w3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: w3.h5 */
/* loaded from: classes.dex */
final class C5215h5 implements InterfaceC3877d<C5205g8> {

    /* renamed from: A */
    private static final C3876c f19731A;

    /* renamed from: B */
    private static final C3876c f19732B;

    /* renamed from: C */
    private static final C3876c f19733C;

    /* renamed from: D */
    private static final C3876c f19734D;

    /* renamed from: E */
    private static final C3876c f19735E;

    /* renamed from: F */
    private static final C3876c f19736F;

    /* renamed from: G */
    private static final C3876c f19737G;

    /* renamed from: H */
    private static final C3876c f19738H;

    /* renamed from: I */
    private static final C3876c f19739I;

    /* renamed from: J */
    private static final C3876c f19740J;

    /* renamed from: K */
    private static final C3876c f19741K;

    /* renamed from: L */
    private static final C3876c f19742L;

    /* renamed from: M */
    private static final C3876c f19743M;

    /* renamed from: N */
    private static final C3876c f19744N;

    /* renamed from: O */
    private static final C3876c f19745O;

    /* renamed from: P */
    private static final C3876c f19746P;

    /* renamed from: Q */
    private static final C3876c f19747Q;

    /* renamed from: R */
    private static final C3876c f19748R;

    /* renamed from: S */
    private static final C3876c f19749S;

    /* renamed from: T */
    private static final C3876c f19750T;

    /* renamed from: U */
    private static final C3876c f19751U;

    /* renamed from: V */
    private static final C3876c f19752V;

    /* renamed from: W */
    private static final C3876c f19753W;

    /* renamed from: X */
    private static final C3876c f19754X;

    /* renamed from: Y */
    private static final C3876c f19755Y;

    /* renamed from: Z */
    private static final C3876c f19756Z;

    /* renamed from: a */
    static final C5215h5 f19757a = new C5215h5();

    /* renamed from: a0 */
    private static final C3876c f19758a0;

    /* renamed from: b */
    private static final C3876c f19759b;

    /* renamed from: b0 */
    private static final C3876c f19760b0;

    /* renamed from: c */
    private static final C3876c f19761c;

    /* renamed from: c0 */
    private static final C3876c f19762c0;

    /* renamed from: d */
    private static final C3876c f19763d;

    /* renamed from: d0 */
    private static final C3876c f19764d0;

    /* renamed from: e */
    private static final C3876c f19765e;

    /* renamed from: e0 */
    private static final C3876c f19766e0;

    /* renamed from: f */
    private static final C3876c f19767f;

    /* renamed from: f0 */
    private static final C3876c f19768f0;

    /* renamed from: g */
    private static final C3876c f19769g;

    /* renamed from: h */
    private static final C3876c f19770h;

    /* renamed from: i */
    private static final C3876c f19771i;

    /* renamed from: j */
    private static final C3876c f19772j;

    /* renamed from: k */
    private static final C3876c f19773k;

    /* renamed from: l */
    private static final C3876c f19774l;

    /* renamed from: m */
    private static final C3876c f19775m;

    /* renamed from: n */
    private static final C3876c f19776n;

    /* renamed from: o */
    private static final C3876c f19777o;

    /* renamed from: p */
    private static final C3876c f19778p;

    /* renamed from: q */
    private static final C3876c f19779q;

    /* renamed from: r */
    private static final C3876c f19780r;

    /* renamed from: s */
    private static final C3876c f19781s;

    /* renamed from: t */
    private static final C3876c f19782t;

    /* renamed from: u */
    private static final C3876c f19783u;

    /* renamed from: v */
    private static final C3876c f19784v;

    /* renamed from: w */
    private static final C3876c f19785w;

    /* renamed from: x */
    private static final C3876c f19786x;

    /* renamed from: y */
    private static final C3876c f19787y;

    /* renamed from: z */
    private static final C3876c f19788z;

    static {
        C3876c.b m16477a = C3876c.m16477a("systemInfo");
        C5406w1 c5406w1 = new C5406w1();
        c5406w1.m19999a(1);
        f19759b = m16477a.m16482b(c5406w1.m20000b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("eventName");
        C5406w1 c5406w12 = new C5406w1();
        c5406w12.m19999a(2);
        f19761c = m16477a2.m16482b(c5406w12.m20000b()).m16481a();
        C3876c.b m16477a3 = C3876c.m16477a("isThickClient");
        C5406w1 c5406w13 = new C5406w1();
        c5406w13.m19999a(37);
        f19763d = m16477a3.m16482b(c5406w13.m20000b()).m16481a();
        C3876c.b m16477a4 = C3876c.m16477a("modelDownloadLogEvent");
        C5406w1 c5406w14 = new C5406w1();
        c5406w14.m19999a(3);
        f19765e = m16477a4.m16482b(c5406w14.m20000b()).m16481a();
        C3876c.b m16477a5 = C3876c.m16477a("customModelLoadLogEvent");
        C5406w1 c5406w15 = new C5406w1();
        c5406w15.m19999a(20);
        f19767f = m16477a5.m16482b(c5406w15.m20000b()).m16481a();
        C3876c.b m16477a6 = C3876c.m16477a("customModelInferenceLogEvent");
        C5406w1 c5406w16 = new C5406w1();
        c5406w16.m19999a(4);
        f19769g = m16477a6.m16482b(c5406w16.m20000b()).m16481a();
        C3876c.b m16477a7 = C3876c.m16477a("customModelCreateLogEvent");
        C5406w1 c5406w17 = new C5406w1();
        c5406w17.m19999a(29);
        f19770h = m16477a7.m16482b(c5406w17.m20000b()).m16481a();
        C3876c.b m16477a8 = C3876c.m16477a("onDeviceFaceDetectionLogEvent");
        C5406w1 c5406w18 = new C5406w1();
        c5406w18.m19999a(5);
        f19771i = m16477a8.m16482b(c5406w18.m20000b()).m16481a();
        C3876c.b m16477a9 = C3876c.m16477a("onDeviceFaceLoadLogEvent");
        C5406w1 c5406w19 = new C5406w1();
        c5406w19.m19999a(59);
        f19772j = m16477a9.m16482b(c5406w19.m20000b()).m16481a();
        C3876c.b m16477a10 = C3876c.m16477a("onDeviceTextDetectionLogEvent");
        C5406w1 c5406w110 = new C5406w1();
        c5406w110.m19999a(6);
        f19773k = m16477a10.m16482b(c5406w110.m20000b()).m16481a();
        C3876c.b m16477a11 = C3876c.m16477a("onDeviceBarcodeDetectionLogEvent");
        C5406w1 c5406w111 = new C5406w1();
        c5406w111.m19999a(7);
        f19774l = m16477a11.m16482b(c5406w111.m20000b()).m16481a();
        C3876c.b m16477a12 = C3876c.m16477a("onDeviceBarcodeLoadLogEvent");
        C5406w1 c5406w112 = new C5406w1();
        c5406w112.m19999a(58);
        f19775m = m16477a12.m16482b(c5406w112.m20000b()).m16481a();
        C3876c.b m16477a13 = C3876c.m16477a("onDeviceImageLabelCreateLogEvent");
        C5406w1 c5406w113 = new C5406w1();
        c5406w113.m19999a(48);
        f19776n = m16477a13.m16482b(c5406w113.m20000b()).m16481a();
        C3876c.b m16477a14 = C3876c.m16477a("onDeviceImageLabelLoadLogEvent");
        C5406w1 c5406w114 = new C5406w1();
        c5406w114.m19999a(49);
        f19777o = m16477a14.m16482b(c5406w114.m20000b()).m16481a();
        C3876c.b m16477a15 = C3876c.m16477a("onDeviceImageLabelDetectionLogEvent");
        C5406w1 c5406w115 = new C5406w1();
        c5406w115.m19999a(18);
        f19778p = m16477a15.m16482b(c5406w115.m20000b()).m16481a();
        C3876c.b m16477a16 = C3876c.m16477a("onDeviceObjectCreateLogEvent");
        C5406w1 c5406w116 = new C5406w1();
        c5406w116.m19999a(26);
        f19779q = m16477a16.m16482b(c5406w116.m20000b()).m16481a();
        C3876c.b m16477a17 = C3876c.m16477a("onDeviceObjectLoadLogEvent");
        C5406w1 c5406w117 = new C5406w1();
        c5406w117.m19999a(27);
        f19780r = m16477a17.m16482b(c5406w117.m20000b()).m16481a();
        C3876c.b m16477a18 = C3876c.m16477a("onDeviceObjectInferenceLogEvent");
        C5406w1 c5406w118 = new C5406w1();
        c5406w118.m19999a(28);
        f19781s = m16477a18.m16482b(c5406w118.m20000b()).m16481a();
        C3876c.b m16477a19 = C3876c.m16477a("onDevicePoseDetectionLogEvent");
        C5406w1 c5406w119 = new C5406w1();
        c5406w119.m19999a(44);
        f19782t = m16477a19.m16482b(c5406w119.m20000b()).m16481a();
        C3876c.b m16477a20 = C3876c.m16477a("onDeviceSegmentationLogEvent");
        C5406w1 c5406w120 = new C5406w1();
        c5406w120.m19999a(45);
        f19783u = m16477a20.m16482b(c5406w120.m20000b()).m16481a();
        C3876c.b m16477a21 = C3876c.m16477a("onDeviceSmartReplyLogEvent");
        C5406w1 c5406w121 = new C5406w1();
        c5406w121.m19999a(19);
        f19784v = m16477a21.m16482b(c5406w121.m20000b()).m16481a();
        C3876c.b m16477a22 = C3876c.m16477a("onDeviceLanguageIdentificationLogEvent");
        C5406w1 c5406w122 = new C5406w1();
        c5406w122.m19999a(21);
        f19785w = m16477a22.m16482b(c5406w122.m20000b()).m16481a();
        C3876c.b m16477a23 = C3876c.m16477a("onDeviceTranslationLogEvent");
        C5406w1 c5406w123 = new C5406w1();
        c5406w123.m19999a(22);
        f19786x = m16477a23.m16482b(c5406w123.m20000b()).m16481a();
        C3876c.b m16477a24 = C3876c.m16477a("cloudFaceDetectionLogEvent");
        C5406w1 c5406w124 = new C5406w1();
        c5406w124.m19999a(8);
        f19787y = m16477a24.m16482b(c5406w124.m20000b()).m16481a();
        C3876c.b m16477a25 = C3876c.m16477a("cloudCropHintDetectionLogEvent");
        C5406w1 c5406w125 = new C5406w1();
        c5406w125.m19999a(9);
        f19788z = m16477a25.m16482b(c5406w125.m20000b()).m16481a();
        C3876c.b m16477a26 = C3876c.m16477a("cloudDocumentTextDetectionLogEvent");
        C5406w1 c5406w126 = new C5406w1();
        c5406w126.m19999a(10);
        f19731A = m16477a26.m16482b(c5406w126.m20000b()).m16481a();
        C3876c.b m16477a27 = C3876c.m16477a("cloudImagePropertiesDetectionLogEvent");
        C5406w1 c5406w127 = new C5406w1();
        c5406w127.m19999a(11);
        f19732B = m16477a27.m16482b(c5406w127.m20000b()).m16481a();
        C3876c.b m16477a28 = C3876c.m16477a("cloudImageLabelDetectionLogEvent");
        C5406w1 c5406w128 = new C5406w1();
        c5406w128.m19999a(12);
        f19733C = m16477a28.m16482b(c5406w128.m20000b()).m16481a();
        C3876c.b m16477a29 = C3876c.m16477a("cloudLandmarkDetectionLogEvent");
        C5406w1 c5406w129 = new C5406w1();
        c5406w129.m19999a(13);
        f19734D = m16477a29.m16482b(c5406w129.m20000b()).m16481a();
        C3876c.b m16477a30 = C3876c.m16477a("cloudLogoDetectionLogEvent");
        C5406w1 c5406w130 = new C5406w1();
        c5406w130.m19999a(14);
        f19735E = m16477a30.m16482b(c5406w130.m20000b()).m16481a();
        C3876c.b m16477a31 = C3876c.m16477a("cloudSafeSearchDetectionLogEvent");
        C5406w1 c5406w131 = new C5406w1();
        c5406w131.m19999a(15);
        f19736F = m16477a31.m16482b(c5406w131.m20000b()).m16481a();
        C3876c.b m16477a32 = C3876c.m16477a("cloudTextDetectionLogEvent");
        C5406w1 c5406w132 = new C5406w1();
        c5406w132.m19999a(16);
        f19737G = m16477a32.m16482b(c5406w132.m20000b()).m16481a();
        C3876c.b m16477a33 = C3876c.m16477a("cloudWebSearchDetectionLogEvent");
        C5406w1 c5406w133 = new C5406w1();
        c5406w133.m19999a(17);
        f19738H = m16477a33.m16482b(c5406w133.m20000b()).m16481a();
        C3876c.b m16477a34 = C3876c.m16477a("automlImageLabelingCreateLogEvent");
        C5406w1 c5406w134 = new C5406w1();
        c5406w134.m19999a(23);
        f19739I = m16477a34.m16482b(c5406w134.m20000b()).m16481a();
        C3876c.b m16477a35 = C3876c.m16477a("automlImageLabelingLoadLogEvent");
        C5406w1 c5406w135 = new C5406w1();
        c5406w135.m19999a(24);
        f19740J = m16477a35.m16482b(c5406w135.m20000b()).m16481a();
        C3876c.b m16477a36 = C3876c.m16477a("automlImageLabelingInferenceLogEvent");
        C5406w1 c5406w136 = new C5406w1();
        c5406w136.m19999a(25);
        f19741K = m16477a36.m16482b(c5406w136.m20000b()).m16481a();
        C3876c.b m16477a37 = C3876c.m16477a("isModelDownloadedLogEvent");
        C5406w1 c5406w137 = new C5406w1();
        c5406w137.m19999a(39);
        f19742L = m16477a37.m16482b(c5406w137.m20000b()).m16481a();
        C3876c.b m16477a38 = C3876c.m16477a("deleteModelLogEvent");
        C5406w1 c5406w138 = new C5406w1();
        c5406w138.m19999a(40);
        f19743M = m16477a38.m16482b(c5406w138.m20000b()).m16481a();
        C3876c.b m16477a39 = C3876c.m16477a("aggregatedAutomlImageLabelingInferenceLogEvent");
        C5406w1 c5406w139 = new C5406w1();
        c5406w139.m19999a(30);
        f19744N = m16477a39.m16482b(c5406w139.m20000b()).m16481a();
        C3876c.b m16477a40 = C3876c.m16477a("aggregatedCustomModelInferenceLogEvent");
        C5406w1 c5406w140 = new C5406w1();
        c5406w140.m19999a(31);
        f19745O = m16477a40.m16482b(c5406w140.m20000b()).m16481a();
        C3876c.b m16477a41 = C3876c.m16477a("aggregatedOnDeviceFaceDetectionLogEvent");
        C5406w1 c5406w141 = new C5406w1();
        c5406w141.m19999a(32);
        f19746P = m16477a41.m16482b(c5406w141.m20000b()).m16481a();
        C3876c.b m16477a42 = C3876c.m16477a("aggregatedOnDeviceBarcodeDetectionLogEvent");
        C5406w1 c5406w142 = new C5406w1();
        c5406w142.m19999a(33);
        f19747Q = m16477a42.m16482b(c5406w142.m20000b()).m16481a();
        C3876c.b m16477a43 = C3876c.m16477a("aggregatedOnDeviceImageLabelDetectionLogEvent");
        C5406w1 c5406w143 = new C5406w1();
        c5406w143.m19999a(34);
        f19748R = m16477a43.m16482b(c5406w143.m20000b()).m16481a();
        C3876c.b m16477a44 = C3876c.m16477a("aggregatedOnDeviceObjectInferenceLogEvent");
        C5406w1 c5406w144 = new C5406w1();
        c5406w144.m19999a(35);
        f19749S = m16477a44.m16482b(c5406w144.m20000b()).m16481a();
        C3876c.b m16477a45 = C3876c.m16477a("aggregatedOnDeviceTextDetectionLogEvent");
        C5406w1 c5406w145 = new C5406w1();
        c5406w145.m19999a(36);
        f19750T = m16477a45.m16482b(c5406w145.m20000b()).m16481a();
        C3876c.b m16477a46 = C3876c.m16477a("aggregatedOnDevicePoseDetectionLogEvent");
        C5406w1 c5406w146 = new C5406w1();
        c5406w146.m19999a(46);
        f19751U = m16477a46.m16482b(c5406w146.m20000b()).m16481a();
        C3876c.b m16477a47 = C3876c.m16477a("aggregatedOnDeviceSegmentationLogEvent");
        C5406w1 c5406w147 = new C5406w1();
        c5406w147.m19999a(47);
        f19752V = m16477a47.m16482b(c5406w147.m20000b()).m16481a();
        C3876c.b m16477a48 = C3876c.m16477a("remoteConfigLogEvent");
        C5406w1 c5406w148 = new C5406w1();
        c5406w148.m19999a(42);
        f19753W = m16477a48.m16482b(c5406w148.m20000b()).m16481a();
        C3876c.b m16477a49 = C3876c.m16477a("inputImageConstructionLogEvent");
        C5406w1 c5406w149 = new C5406w1();
        c5406w149.m19999a(50);
        f19754X = m16477a49.m16482b(c5406w149.m20000b()).m16481a();
        C3876c.b m16477a50 = C3876c.m16477a("leakedHandleEvent");
        C5406w1 c5406w150 = new C5406w1();
        c5406w150.m19999a(51);
        f19755Y = m16477a50.m16482b(c5406w150.m20000b()).m16481a();
        C3876c.b m16477a51 = C3876c.m16477a("cameraSourceLogEvent");
        C5406w1 c5406w151 = new C5406w1();
        c5406w151.m19999a(52);
        f19756Z = m16477a51.m16482b(c5406w151.m20000b()).m16481a();
        C3876c.b m16477a52 = C3876c.m16477a("imageLabelOptionalModuleLogEvent");
        C5406w1 c5406w152 = new C5406w1();
        c5406w152.m19999a(53);
        f19758a0 = m16477a52.m16482b(c5406w152.m20000b()).m16481a();
        C3876c.b m16477a53 = C3876c.m16477a("languageIdentificationOptionalModuleLogEvent");
        C5406w1 c5406w153 = new C5406w1();
        c5406w153.m19999a(54);
        f19760b0 = m16477a53.m16482b(c5406w153.m20000b()).m16481a();
        C3876c.b m16477a54 = C3876c.m16477a("faceDetectionOptionalModuleLogEvent");
        C5406w1 c5406w154 = new C5406w1();
        c5406w154.m19999a(60);
        f19762c0 = m16477a54.m16482b(c5406w154.m20000b()).m16481a();
        C3876c.b m16477a55 = C3876c.m16477a("nlClassifierOptionalModuleLogEvent");
        C5406w1 c5406w155 = new C5406w1();
        c5406w155.m19999a(55);
        f19764d0 = m16477a55.m16482b(c5406w155.m20000b()).m16481a();
        C3876c.b m16477a56 = C3876c.m16477a("nlClassifierClientLibraryLogEvent");
        C5406w1 c5406w156 = new C5406w1();
        c5406w156.m19999a(56);
        f19766e0 = m16477a56.m16482b(c5406w156.m20000b()).m16481a();
        C3876c.b m16477a57 = C3876c.m16477a("accelerationAllowlistLogEvent");
        C5406w1 c5406w157 = new C5406w1();
        c5406w157.m19999a(57);
        f19768f0 = m16477a57.m16482b(c5406w157.m20000b()).m16481a();
    }

    private C5215h5() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        C5205g8 c5205g8 = (C5205g8) obj;
        InterfaceC3878e interfaceC3878e = (InterfaceC3878e) obj2;
        interfaceC3878e.mo16483a(f19759b, c5205g8.m19833e());
        interfaceC3878e.mo16483a(f19761c, c5205g8.m19830b());
        interfaceC3878e.mo16483a(f19763d, c5205g8.m19834f());
        interfaceC3878e.mo16483a(f19765e, null);
        interfaceC3878e.mo16483a(f19767f, null);
        interfaceC3878e.mo16483a(f19769g, null);
        interfaceC3878e.mo16483a(f19770h, null);
        interfaceC3878e.mo16483a(f19771i, null);
        interfaceC3878e.mo16483a(f19772j, null);
        interfaceC3878e.mo16483a(f19773k, null);
        interfaceC3878e.mo16483a(f19774l, c5205g8.m19831c());
        interfaceC3878e.mo16483a(f19775m, c5205g8.m19832d());
        interfaceC3878e.mo16483a(f19776n, null);
        interfaceC3878e.mo16483a(f19777o, null);
        interfaceC3878e.mo16483a(f19778p, null);
        interfaceC3878e.mo16483a(f19779q, null);
        interfaceC3878e.mo16483a(f19780r, null);
        interfaceC3878e.mo16483a(f19781s, null);
        interfaceC3878e.mo16483a(f19782t, null);
        interfaceC3878e.mo16483a(f19783u, null);
        interfaceC3878e.mo16483a(f19784v, null);
        interfaceC3878e.mo16483a(f19785w, null);
        interfaceC3878e.mo16483a(f19786x, null);
        interfaceC3878e.mo16483a(f19787y, null);
        interfaceC3878e.mo16483a(f19788z, null);
        interfaceC3878e.mo16483a(f19731A, null);
        interfaceC3878e.mo16483a(f19732B, null);
        interfaceC3878e.mo16483a(f19733C, null);
        interfaceC3878e.mo16483a(f19734D, null);
        interfaceC3878e.mo16483a(f19735E, null);
        interfaceC3878e.mo16483a(f19736F, null);
        interfaceC3878e.mo16483a(f19737G, null);
        interfaceC3878e.mo16483a(f19738H, null);
        interfaceC3878e.mo16483a(f19739I, null);
        interfaceC3878e.mo16483a(f19740J, null);
        interfaceC3878e.mo16483a(f19741K, null);
        interfaceC3878e.mo16483a(f19742L, null);
        interfaceC3878e.mo16483a(f19743M, null);
        interfaceC3878e.mo16483a(f19744N, null);
        interfaceC3878e.mo16483a(f19745O, null);
        interfaceC3878e.mo16483a(f19746P, null);
        interfaceC3878e.mo16483a(f19747Q, c5205g8.m19829a());
        interfaceC3878e.mo16483a(f19748R, null);
        interfaceC3878e.mo16483a(f19749S, null);
        interfaceC3878e.mo16483a(f19750T, null);
        interfaceC3878e.mo16483a(f19751U, null);
        interfaceC3878e.mo16483a(f19752V, null);
        interfaceC3878e.mo16483a(f19753W, null);
        interfaceC3878e.mo16483a(f19754X, null);
        interfaceC3878e.mo16483a(f19755Y, null);
        interfaceC3878e.mo16483a(f19756Z, null);
        interfaceC3878e.mo16483a(f19758a0, null);
        interfaceC3878e.mo16483a(f19760b0, null);
        interfaceC3878e.mo16483a(f19762c0, null);
        interfaceC3878e.mo16483a(f19764d0, null);
        interfaceC3878e.mo16483a(f19766e0, null);
        interfaceC3878e.mo16483a(f19768f0, null);
    }
}
