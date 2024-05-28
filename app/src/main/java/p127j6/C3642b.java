package p127j6;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p087g6.C3298i;
import p113i6.C3537c;
import p283w3.C5139ba;
import p283w3.C5153ca;
import p283w3.C5192f8;
import p283w3.C5324pa;
import p283w3.C5363sa;
import p283w3.C5387u8;
import p283w3.C5431y0;
import p283w3.EnumC5151c8;
import p283w3.EnumC5165d8;
import p283w3.EnumC5322p8;
import p283w3.EnumC5335q8;
import p283w3.EnumC5453z9;
import p283w3.InterfaceC5298na;

/* renamed from: j6.b */
/* loaded from: classes.dex */
public final class C3642b {

    /* renamed from: a */
    private static final SparseArray<EnumC5322p8> f15317a;

    /* renamed from: b */
    private static final SparseArray<EnumC5335q8> f15318b;

    /* renamed from: c */
    static final AtomicReference<String> f15319c;

    /* renamed from: d */
    @SuppressLint({"UseSparseArrays"})
    private static final Map<Integer, EnumC5453z9> f15320d;

    static {
        SparseArray<EnumC5322p8> sparseArray = new SparseArray<>();
        f15317a = sparseArray;
        SparseArray<EnumC5335q8> sparseArray2 = new SparseArray<>();
        f15318b = sparseArray2;
        f15319c = new AtomicReference<>();
        sparseArray.put(-1, EnumC5322p8.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC5322p8.FORMAT_CODE_128);
        sparseArray.put(2, EnumC5322p8.FORMAT_CODE_39);
        sparseArray.put(4, EnumC5322p8.FORMAT_CODE_93);
        sparseArray.put(8, EnumC5322p8.FORMAT_CODABAR);
        sparseArray.put(16, EnumC5322p8.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC5322p8.FORMAT_EAN_13);
        sparseArray.put(64, EnumC5322p8.FORMAT_EAN_8);
        sparseArray.put(128, EnumC5322p8.FORMAT_ITF);
        sparseArray.put(256, EnumC5322p8.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC5322p8.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC5322p8.FORMAT_UPC_E);
        sparseArray.put(2048, EnumC5322p8.FORMAT_PDF417);
        sparseArray.put(4096, EnumC5322p8.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC5335q8.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC5335q8.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC5335q8.TYPE_EMAIL);
        sparseArray2.put(3, EnumC5335q8.TYPE_ISBN);
        sparseArray2.put(4, EnumC5335q8.TYPE_PHONE);
        sparseArray2.put(5, EnumC5335q8.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC5335q8.TYPE_SMS);
        sparseArray2.put(7, EnumC5335q8.TYPE_TEXT);
        sparseArray2.put(8, EnumC5335q8.TYPE_URL);
        sparseArray2.put(9, EnumC5335q8.TYPE_WIFI);
        sparseArray2.put(10, EnumC5335q8.TYPE_GEO);
        sparseArray2.put(11, EnumC5335q8.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC5335q8.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f15320d = hashMap;
        hashMap.put(1, EnumC5453z9.CODE_128);
        hashMap.put(2, EnumC5453z9.CODE_39);
        hashMap.put(4, EnumC5453z9.CODE_93);
        hashMap.put(8, EnumC5453z9.CODABAR);
        hashMap.put(16, EnumC5453z9.DATA_MATRIX);
        hashMap.put(32, EnumC5453z9.EAN_13);
        hashMap.put(64, EnumC5453z9.EAN_8);
        hashMap.put(128, EnumC5453z9.ITF);
        hashMap.put(256, EnumC5453z9.QR_CODE);
        hashMap.put(512, EnumC5453z9.UPC_A);
        hashMap.put(1024, EnumC5453z9.UPC_E);
        hashMap.put(2048, EnumC5453z9.PDF417);
        hashMap.put(4096, EnumC5453z9.AZTEC);
    }

    /* renamed from: a */
    public static EnumC5322p8 m15549a(int i10) {
        EnumC5322p8 enumC5322p8 = f15317a.get(i10);
        return enumC5322p8 == null ? EnumC5322p8.FORMAT_UNKNOWN : enumC5322p8;
    }

    /* renamed from: b */
    public static EnumC5335q8 m15550b(int i10) {
        EnumC5335q8 enumC5335q8 = f15318b.get(i10);
        return enumC5335q8 == null ? EnumC5335q8.TYPE_UNKNOWN : enumC5335q8;
    }

    /* renamed from: c */
    public static C5153ca m15551c(C3537c c3537c) {
        int m15337a = c3537c.m15337a();
        C5431y0 c5431y0 = new C5431y0();
        if (m15337a == 0) {
            c5431y0.m20040f(f15320d.values());
        } else {
            for (Map.Entry<Integer, EnumC5453z9> entry : f15320d.entrySet()) {
                if ((entry.getKey().intValue() & m15337a) != 0) {
                    c5431y0.m20039e(entry.getValue());
                }
            }
        }
        C5139ba c5139ba = new C5139ba();
        c5139ba.m19762b(c5431y0.m20041g());
        return c5139ba.m19763c();
    }

    /* renamed from: d */
    public static String m15552d() {
        AtomicReference<String> atomicReference = f15319c;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        String str = true != C3651k.m15561c(C3298i.m14558c().m14562b()) ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
        atomicReference.set(str);
        return str;
    }

    /* renamed from: e */
    public static void m15553e(C5324pa c5324pa, EnumC5151c8 enumC5151c8) {
        c5324pa.m19905b(new InterfaceC5298na() { // from class: j6.a
            public /* synthetic */ C3641a() {
            }

            @Override // p283w3.InterfaceC5298na
            public final C5363sa zza() {
                EnumC5151c8 enumC5151c82 = EnumC5151c8.this;
                C5192f8 c5192f8 = new C5192f8();
                C5387u8 c5387u8 = new C5387u8();
                c5387u8.m19984b(enumC5151c82);
                c5192f8.m19817g(c5387u8.m19985c());
                return C5363sa.m19971d(c5192f8);
            }
        }, EnumC5165d8.ON_DEVICE_BARCODE_LOAD);
    }
}
