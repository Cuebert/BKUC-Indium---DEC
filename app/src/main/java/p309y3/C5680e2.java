package p309y3;

import java.io.IOException;
import p152l5.C3876c;
import p152l5.InterfaceC3877d;
import p152l5.InterfaceC3878e;

/* renamed from: y3.e2 */
/* loaded from: classes.dex */
final class C5680e2 implements InterfaceC3877d<C5653b5> {

    /* renamed from: A */
    private static final C3876c f20925A;

    /* renamed from: B */
    private static final C3876c f20926B;

    /* renamed from: C */
    private static final C3876c f20927C;

    /* renamed from: D */
    private static final C3876c f20928D;

    /* renamed from: E */
    private static final C3876c f20929E;

    /* renamed from: F */
    private static final C3876c f20930F;

    /* renamed from: G */
    private static final C3876c f20931G;

    /* renamed from: H */
    private static final C3876c f20932H;

    /* renamed from: I */
    private static final C3876c f20933I;

    /* renamed from: J */
    private static final C3876c f20934J;

    /* renamed from: K */
    private static final C3876c f20935K;

    /* renamed from: L */
    private static final C3876c f20936L;

    /* renamed from: M */
    private static final C3876c f20937M;

    /* renamed from: N */
    private static final C3876c f20938N;

    /* renamed from: O */
    private static final C3876c f20939O;

    /* renamed from: P */
    private static final C3876c f20940P;

    /* renamed from: Q */
    private static final C3876c f20941Q;

    /* renamed from: R */
    private static final C3876c f20942R;

    /* renamed from: S */
    private static final C3876c f20943S;

    /* renamed from: T */
    private static final C3876c f20944T;

    /* renamed from: U */
    private static final C3876c f20945U;

    /* renamed from: V */
    private static final C3876c f20946V;

    /* renamed from: W */
    private static final C3876c f20947W;

    /* renamed from: X */
    private static final C3876c f20948X;

    /* renamed from: Y */
    private static final C3876c f20949Y;

    /* renamed from: Z */
    private static final C3876c f20950Z;

    /* renamed from: a */
    static final C5680e2 f20951a = new C5680e2();

    /* renamed from: a0 */
    private static final C3876c f20952a0;

    /* renamed from: b */
    private static final C3876c f20953b;

    /* renamed from: b0 */
    private static final C3876c f20954b0;

    /* renamed from: c */
    private static final C3876c f20955c;

    /* renamed from: c0 */
    private static final C3876c f20956c0;

    /* renamed from: d */
    private static final C3876c f20957d;

    /* renamed from: d0 */
    private static final C3876c f20958d0;

    /* renamed from: e */
    private static final C3876c f20959e;

    /* renamed from: e0 */
    private static final C3876c f20960e0;

    /* renamed from: f */
    private static final C3876c f20961f;

    /* renamed from: f0 */
    private static final C3876c f20962f0;

    /* renamed from: g */
    private static final C3876c f20963g;

    /* renamed from: h */
    private static final C3876c f20964h;

    /* renamed from: i */
    private static final C3876c f20965i;

    /* renamed from: j */
    private static final C3876c f20966j;

    /* renamed from: k */
    private static final C3876c f20967k;

    /* renamed from: l */
    private static final C3876c f20968l;

    /* renamed from: m */
    private static final C3876c f20969m;

    /* renamed from: n */
    private static final C3876c f20970n;

    /* renamed from: o */
    private static final C3876c f20971o;

    /* renamed from: p */
    private static final C3876c f20972p;

    /* renamed from: q */
    private static final C3876c f20973q;

    /* renamed from: r */
    private static final C3876c f20974r;

    /* renamed from: s */
    private static final C3876c f20975s;

    /* renamed from: t */
    private static final C3876c f20976t;

    /* renamed from: u */
    private static final C3876c f20977u;

    /* renamed from: v */
    private static final C3876c f20978v;

    /* renamed from: w */
    private static final C3876c f20979w;

    /* renamed from: x */
    private static final C3876c f20980x;

    /* renamed from: y */
    private static final C3876c f20981y;

    /* renamed from: z */
    private static final C3876c f20982z;

    static {
        C3876c.b m16477a = C3876c.m16477a("systemInfo");
        C5686e8 c5686e8 = new C5686e8();
        c5686e8.m20673a(1);
        f20953b = m16477a.m16482b(c5686e8.m20674b()).m16481a();
        C3876c.b m16477a2 = C3876c.m16477a("eventName");
        C5686e8 c5686e82 = new C5686e8();
        c5686e82.m20673a(2);
        f20955c = m16477a2.m16482b(c5686e82.m20674b()).m16481a();
        C3876c.b m16477a3 = C3876c.m16477a("isThickClient");
        C5686e8 c5686e83 = new C5686e8();
        c5686e83.m20673a(37);
        f20957d = m16477a3.m16482b(c5686e83.m20674b()).m16481a();
        C3876c.b m16477a4 = C3876c.m16477a("modelDownloadLogEvent");
        C5686e8 c5686e84 = new C5686e8();
        c5686e84.m20673a(3);
        f20959e = m16477a4.m16482b(c5686e84.m20674b()).m16481a();
        C3876c.b m16477a5 = C3876c.m16477a("customModelLoadLogEvent");
        C5686e8 c5686e85 = new C5686e8();
        c5686e85.m20673a(20);
        f20961f = m16477a5.m16482b(c5686e85.m20674b()).m16481a();
        C3876c.b m16477a6 = C3876c.m16477a("customModelInferenceLogEvent");
        C5686e8 c5686e86 = new C5686e8();
        c5686e86.m20673a(4);
        f20963g = m16477a6.m16482b(c5686e86.m20674b()).m16481a();
        C3876c.b m16477a7 = C3876c.m16477a("customModelCreateLogEvent");
        C5686e8 c5686e87 = new C5686e8();
        c5686e87.m20673a(29);
        f20964h = m16477a7.m16482b(c5686e87.m20674b()).m16481a();
        C3876c.b m16477a8 = C3876c.m16477a("onDeviceFaceDetectionLogEvent");
        C5686e8 c5686e88 = new C5686e8();
        c5686e88.m20673a(5);
        f20965i = m16477a8.m16482b(c5686e88.m20674b()).m16481a();
        C3876c.b m16477a9 = C3876c.m16477a("onDeviceFaceLoadLogEvent");
        C5686e8 c5686e89 = new C5686e8();
        c5686e89.m20673a(59);
        f20966j = m16477a9.m16482b(c5686e89.m20674b()).m16481a();
        C3876c.b m16477a10 = C3876c.m16477a("onDeviceTextDetectionLogEvent");
        C5686e8 c5686e810 = new C5686e8();
        c5686e810.m20673a(6);
        f20967k = m16477a10.m16482b(c5686e810.m20674b()).m16481a();
        C3876c.b m16477a11 = C3876c.m16477a("onDeviceBarcodeDetectionLogEvent");
        C5686e8 c5686e811 = new C5686e8();
        c5686e811.m20673a(7);
        f20968l = m16477a11.m16482b(c5686e811.m20674b()).m16481a();
        C3876c.b m16477a12 = C3876c.m16477a("onDeviceBarcodeLoadLogEvent");
        C5686e8 c5686e812 = new C5686e8();
        c5686e812.m20673a(58);
        f20969m = m16477a12.m16482b(c5686e812.m20674b()).m16481a();
        C3876c.b m16477a13 = C3876c.m16477a("onDeviceImageLabelCreateLogEvent");
        C5686e8 c5686e813 = new C5686e8();
        c5686e813.m20673a(48);
        f20970n = m16477a13.m16482b(c5686e813.m20674b()).m16481a();
        C3876c.b m16477a14 = C3876c.m16477a("onDeviceImageLabelLoadLogEvent");
        C5686e8 c5686e814 = new C5686e8();
        c5686e814.m20673a(49);
        f20971o = m16477a14.m16482b(c5686e814.m20674b()).m16481a();
        C3876c.b m16477a15 = C3876c.m16477a("onDeviceImageLabelDetectionLogEvent");
        C5686e8 c5686e815 = new C5686e8();
        c5686e815.m20673a(18);
        f20972p = m16477a15.m16482b(c5686e815.m20674b()).m16481a();
        C3876c.b m16477a16 = C3876c.m16477a("onDeviceObjectCreateLogEvent");
        C5686e8 c5686e816 = new C5686e8();
        c5686e816.m20673a(26);
        f20973q = m16477a16.m16482b(c5686e816.m20674b()).m16481a();
        C3876c.b m16477a17 = C3876c.m16477a("onDeviceObjectLoadLogEvent");
        C5686e8 c5686e817 = new C5686e8();
        c5686e817.m20673a(27);
        f20974r = m16477a17.m16482b(c5686e817.m20674b()).m16481a();
        C3876c.b m16477a18 = C3876c.m16477a("onDeviceObjectInferenceLogEvent");
        C5686e8 c5686e818 = new C5686e8();
        c5686e818.m20673a(28);
        f20975s = m16477a18.m16482b(c5686e818.m20674b()).m16481a();
        C3876c.b m16477a19 = C3876c.m16477a("onDevicePoseDetectionLogEvent");
        C5686e8 c5686e819 = new C5686e8();
        c5686e819.m20673a(44);
        f20976t = m16477a19.m16482b(c5686e819.m20674b()).m16481a();
        C3876c.b m16477a20 = C3876c.m16477a("onDeviceSegmentationLogEvent");
        C5686e8 c5686e820 = new C5686e8();
        c5686e820.m20673a(45);
        f20977u = m16477a20.m16482b(c5686e820.m20674b()).m16481a();
        C3876c.b m16477a21 = C3876c.m16477a("onDeviceSmartReplyLogEvent");
        C5686e8 c5686e821 = new C5686e8();
        c5686e821.m20673a(19);
        f20978v = m16477a21.m16482b(c5686e821.m20674b()).m16481a();
        C3876c.b m16477a22 = C3876c.m16477a("onDeviceLanguageIdentificationLogEvent");
        C5686e8 c5686e822 = new C5686e8();
        c5686e822.m20673a(21);
        f20979w = m16477a22.m16482b(c5686e822.m20674b()).m16481a();
        C3876c.b m16477a23 = C3876c.m16477a("onDeviceTranslationLogEvent");
        C5686e8 c5686e823 = new C5686e8();
        c5686e823.m20673a(22);
        f20980x = m16477a23.m16482b(c5686e823.m20674b()).m16481a();
        C3876c.b m16477a24 = C3876c.m16477a("cloudFaceDetectionLogEvent");
        C5686e8 c5686e824 = new C5686e8();
        c5686e824.m20673a(8);
        f20981y = m16477a24.m16482b(c5686e824.m20674b()).m16481a();
        C3876c.b m16477a25 = C3876c.m16477a("cloudCropHintDetectionLogEvent");
        C5686e8 c5686e825 = new C5686e8();
        c5686e825.m20673a(9);
        f20982z = m16477a25.m16482b(c5686e825.m20674b()).m16481a();
        C3876c.b m16477a26 = C3876c.m16477a("cloudDocumentTextDetectionLogEvent");
        C5686e8 c5686e826 = new C5686e8();
        c5686e826.m20673a(10);
        f20925A = m16477a26.m16482b(c5686e826.m20674b()).m16481a();
        C3876c.b m16477a27 = C3876c.m16477a("cloudImagePropertiesDetectionLogEvent");
        C5686e8 c5686e827 = new C5686e8();
        c5686e827.m20673a(11);
        f20926B = m16477a27.m16482b(c5686e827.m20674b()).m16481a();
        C3876c.b m16477a28 = C3876c.m16477a("cloudImageLabelDetectionLogEvent");
        C5686e8 c5686e828 = new C5686e8();
        c5686e828.m20673a(12);
        f20927C = m16477a28.m16482b(c5686e828.m20674b()).m16481a();
        C3876c.b m16477a29 = C3876c.m16477a("cloudLandmarkDetectionLogEvent");
        C5686e8 c5686e829 = new C5686e8();
        c5686e829.m20673a(13);
        f20928D = m16477a29.m16482b(c5686e829.m20674b()).m16481a();
        C3876c.b m16477a30 = C3876c.m16477a("cloudLogoDetectionLogEvent");
        C5686e8 c5686e830 = new C5686e8();
        c5686e830.m20673a(14);
        f20929E = m16477a30.m16482b(c5686e830.m20674b()).m16481a();
        C3876c.b m16477a31 = C3876c.m16477a("cloudSafeSearchDetectionLogEvent");
        C5686e8 c5686e831 = new C5686e8();
        c5686e831.m20673a(15);
        f20930F = m16477a31.m16482b(c5686e831.m20674b()).m16481a();
        C3876c.b m16477a32 = C3876c.m16477a("cloudTextDetectionLogEvent");
        C5686e8 c5686e832 = new C5686e8();
        c5686e832.m20673a(16);
        f20931G = m16477a32.m16482b(c5686e832.m20674b()).m16481a();
        C3876c.b m16477a33 = C3876c.m16477a("cloudWebSearchDetectionLogEvent");
        C5686e8 c5686e833 = new C5686e8();
        c5686e833.m20673a(17);
        f20932H = m16477a33.m16482b(c5686e833.m20674b()).m16481a();
        C3876c.b m16477a34 = C3876c.m16477a("automlImageLabelingCreateLogEvent");
        C5686e8 c5686e834 = new C5686e8();
        c5686e834.m20673a(23);
        f20933I = m16477a34.m16482b(c5686e834.m20674b()).m16481a();
        C3876c.b m16477a35 = C3876c.m16477a("automlImageLabelingLoadLogEvent");
        C5686e8 c5686e835 = new C5686e8();
        c5686e835.m20673a(24);
        f20934J = m16477a35.m16482b(c5686e835.m20674b()).m16481a();
        C3876c.b m16477a36 = C3876c.m16477a("automlImageLabelingInferenceLogEvent");
        C5686e8 c5686e836 = new C5686e8();
        c5686e836.m20673a(25);
        f20935K = m16477a36.m16482b(c5686e836.m20674b()).m16481a();
        C3876c.b m16477a37 = C3876c.m16477a("isModelDownloadedLogEvent");
        C5686e8 c5686e837 = new C5686e8();
        c5686e837.m20673a(39);
        f20936L = m16477a37.m16482b(c5686e837.m20674b()).m16481a();
        C3876c.b m16477a38 = C3876c.m16477a("deleteModelLogEvent");
        C5686e8 c5686e838 = new C5686e8();
        c5686e838.m20673a(40);
        f20937M = m16477a38.m16482b(c5686e838.m20674b()).m16481a();
        C3876c.b m16477a39 = C3876c.m16477a("aggregatedAutomlImageLabelingInferenceLogEvent");
        C5686e8 c5686e839 = new C5686e8();
        c5686e839.m20673a(30);
        f20938N = m16477a39.m16482b(c5686e839.m20674b()).m16481a();
        C3876c.b m16477a40 = C3876c.m16477a("aggregatedCustomModelInferenceLogEvent");
        C5686e8 c5686e840 = new C5686e8();
        c5686e840.m20673a(31);
        f20939O = m16477a40.m16482b(c5686e840.m20674b()).m16481a();
        C3876c.b m16477a41 = C3876c.m16477a("aggregatedOnDeviceFaceDetectionLogEvent");
        C5686e8 c5686e841 = new C5686e8();
        c5686e841.m20673a(32);
        f20940P = m16477a41.m16482b(c5686e841.m20674b()).m16481a();
        C3876c.b m16477a42 = C3876c.m16477a("aggregatedOnDeviceBarcodeDetectionLogEvent");
        C5686e8 c5686e842 = new C5686e8();
        c5686e842.m20673a(33);
        f20941Q = m16477a42.m16482b(c5686e842.m20674b()).m16481a();
        C3876c.b m16477a43 = C3876c.m16477a("aggregatedOnDeviceImageLabelDetectionLogEvent");
        C5686e8 c5686e843 = new C5686e8();
        c5686e843.m20673a(34);
        f20942R = m16477a43.m16482b(c5686e843.m20674b()).m16481a();
        C3876c.b m16477a44 = C3876c.m16477a("aggregatedOnDeviceObjectInferenceLogEvent");
        C5686e8 c5686e844 = new C5686e8();
        c5686e844.m20673a(35);
        f20943S = m16477a44.m16482b(c5686e844.m20674b()).m16481a();
        C3876c.b m16477a45 = C3876c.m16477a("aggregatedOnDeviceTextDetectionLogEvent");
        C5686e8 c5686e845 = new C5686e8();
        c5686e845.m20673a(36);
        f20944T = m16477a45.m16482b(c5686e845.m20674b()).m16481a();
        C3876c.b m16477a46 = C3876c.m16477a("aggregatedOnDevicePoseDetectionLogEvent");
        C5686e8 c5686e846 = new C5686e8();
        c5686e846.m20673a(46);
        f20945U = m16477a46.m16482b(c5686e846.m20674b()).m16481a();
        C3876c.b m16477a47 = C3876c.m16477a("aggregatedOnDeviceSegmentationLogEvent");
        C5686e8 c5686e847 = new C5686e8();
        c5686e847.m20673a(47);
        f20946V = m16477a47.m16482b(c5686e847.m20674b()).m16481a();
        C3876c.b m16477a48 = C3876c.m16477a("remoteConfigLogEvent");
        C5686e8 c5686e848 = new C5686e8();
        c5686e848.m20673a(42);
        f20947W = m16477a48.m16482b(c5686e848.m20674b()).m16481a();
        C3876c.b m16477a49 = C3876c.m16477a("inputImageConstructionLogEvent");
        C5686e8 c5686e849 = new C5686e8();
        c5686e849.m20673a(50);
        f20948X = m16477a49.m16482b(c5686e849.m20674b()).m16481a();
        C3876c.b m16477a50 = C3876c.m16477a("leakedHandleEvent");
        C5686e8 c5686e850 = new C5686e8();
        c5686e850.m20673a(51);
        f20949Y = m16477a50.m16482b(c5686e850.m20674b()).m16481a();
        C3876c.b m16477a51 = C3876c.m16477a("cameraSourceLogEvent");
        C5686e8 c5686e851 = new C5686e8();
        c5686e851.m20673a(52);
        f20950Z = m16477a51.m16482b(c5686e851.m20674b()).m16481a();
        C3876c.b m16477a52 = C3876c.m16477a("imageLabelOptionalModuleLogEvent");
        C5686e8 c5686e852 = new C5686e8();
        c5686e852.m20673a(53);
        f20952a0 = m16477a52.m16482b(c5686e852.m20674b()).m16481a();
        C3876c.b m16477a53 = C3876c.m16477a("languageIdentificationOptionalModuleLogEvent");
        C5686e8 c5686e853 = new C5686e8();
        c5686e853.m20673a(54);
        f20954b0 = m16477a53.m16482b(c5686e853.m20674b()).m16481a();
        C3876c.b m16477a54 = C3876c.m16477a("faceDetectionOptionalModuleLogEvent");
        C5686e8 c5686e854 = new C5686e8();
        c5686e854.m20673a(60);
        f20956c0 = m16477a54.m16482b(c5686e854.m20674b()).m16481a();
        C3876c.b m16477a55 = C3876c.m16477a("nlClassifierOptionalModuleLogEvent");
        C5686e8 c5686e855 = new C5686e8();
        c5686e855.m20673a(55);
        f20958d0 = m16477a55.m16482b(c5686e855.m20674b()).m16481a();
        C3876c.b m16477a56 = C3876c.m16477a("nlClassifierClientLibraryLogEvent");
        C5686e8 c5686e856 = new C5686e8();
        c5686e856.m20673a(56);
        f20960e0 = m16477a56.m16482b(c5686e856.m20674b()).m16481a();
        C3876c.b m16477a57 = C3876c.m16477a("accelerationAllowlistLogEvent");
        C5686e8 c5686e857 = new C5686e8();
        c5686e857.m20673a(57);
        f20962f0 = m16477a57.m16482b(c5686e857.m20674b()).m16481a();
    }

    private C5680e2() {
    }

    @Override // p152l5.InterfaceC3877d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79a(Object obj, Object obj2) throws IOException {
        C5653b5 c5653b5 = (C5653b5) obj;
        InterfaceC3878e interfaceC3878e = (InterfaceC3878e) obj2;
        interfaceC3878e.mo16483a(f20953b, c5653b5.m20667c());
        interfaceC3878e.mo16483a(f20955c, c5653b5.m20666b());
        interfaceC3878e.mo16483a(f20957d, null);
        interfaceC3878e.mo16483a(f20959e, null);
        interfaceC3878e.mo16483a(f20961f, null);
        interfaceC3878e.mo16483a(f20963g, null);
        interfaceC3878e.mo16483a(f20964h, null);
        interfaceC3878e.mo16483a(f20965i, null);
        interfaceC3878e.mo16483a(f20966j, null);
        interfaceC3878e.mo16483a(f20967k, null);
        interfaceC3878e.mo16483a(f20968l, null);
        interfaceC3878e.mo16483a(f20969m, null);
        interfaceC3878e.mo16483a(f20970n, null);
        interfaceC3878e.mo16483a(f20971o, null);
        interfaceC3878e.mo16483a(f20972p, null);
        interfaceC3878e.mo16483a(f20973q, null);
        interfaceC3878e.mo16483a(f20974r, null);
        interfaceC3878e.mo16483a(f20975s, null);
        interfaceC3878e.mo16483a(f20976t, null);
        interfaceC3878e.mo16483a(f20977u, null);
        interfaceC3878e.mo16483a(f20978v, null);
        interfaceC3878e.mo16483a(f20979w, null);
        interfaceC3878e.mo16483a(f20980x, null);
        interfaceC3878e.mo16483a(f20981y, null);
        interfaceC3878e.mo16483a(f20982z, null);
        interfaceC3878e.mo16483a(f20925A, null);
        interfaceC3878e.mo16483a(f20926B, null);
        interfaceC3878e.mo16483a(f20927C, null);
        interfaceC3878e.mo16483a(f20928D, null);
        interfaceC3878e.mo16483a(f20929E, null);
        interfaceC3878e.mo16483a(f20930F, null);
        interfaceC3878e.mo16483a(f20931G, null);
        interfaceC3878e.mo16483a(f20932H, null);
        interfaceC3878e.mo16483a(f20933I, null);
        interfaceC3878e.mo16483a(f20934J, null);
        interfaceC3878e.mo16483a(f20935K, null);
        interfaceC3878e.mo16483a(f20936L, null);
        interfaceC3878e.mo16483a(f20937M, null);
        interfaceC3878e.mo16483a(f20938N, null);
        interfaceC3878e.mo16483a(f20939O, null);
        interfaceC3878e.mo16483a(f20940P, null);
        interfaceC3878e.mo16483a(f20941Q, null);
        interfaceC3878e.mo16483a(f20942R, null);
        interfaceC3878e.mo16483a(f20943S, null);
        interfaceC3878e.mo16483a(f20944T, null);
        interfaceC3878e.mo16483a(f20945U, null);
        interfaceC3878e.mo16483a(f20946V, null);
        interfaceC3878e.mo16483a(f20947W, null);
        interfaceC3878e.mo16483a(f20948X, c5653b5.m20665a());
        interfaceC3878e.mo16483a(f20949Y, null);
        interfaceC3878e.mo16483a(f20950Z, null);
        interfaceC3878e.mo16483a(f20952a0, null);
        interfaceC3878e.mo16483a(f20954b0, null);
        interfaceC3878e.mo16483a(f20956c0, null);
        interfaceC3878e.mo16483a(f20958d0, null);
        interfaceC3878e.mo16483a(f20960e0, null);
        interfaceC3878e.mo16483a(f20962f0, null);
    }
}
