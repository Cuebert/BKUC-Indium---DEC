package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.C0463q1;
import androidx.core.util.C0654h;
import com.appsflyer.oaid.BuildConfig;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p279w.EnumC5060o;

/* renamed from: androidx.camera.core.impl.utils.g */
/* loaded from: classes.dex */
public class C0427g {

    /* renamed from: c */
    static final String[] f1943c = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: d */
    private static final C0429i[] f1944d;

    /* renamed from: e */
    private static final C0429i[] f1945e;

    /* renamed from: f */
    private static final C0429i[] f1946f;

    /* renamed from: g */
    static final C0429i[] f1947g;

    /* renamed from: h */
    private static final C0429i[] f1948h;

    /* renamed from: i */
    static final C0429i[][] f1949i;

    /* renamed from: j */
    static final HashSet<String> f1950j;

    /* renamed from: a */
    private final List<Map<String, C0426f>> f1951a;

    /* renamed from: b */
    private final ByteOrder f1952b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.impl.utils.g$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1953a;

        /* renamed from: b */
        static final /* synthetic */ int[] f1954b;

        static {
            int[] iArr = new int[c.values().length];
            f1954b = iArr;
            try {
                iArr[c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1954b[c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC5060o.values().length];
            f1953a = iArr2;
            try {
                iArr2[EnumC5060o.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1953a[EnumC5060o.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1953a[EnumC5060o.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.g$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        private static final Pattern f1955c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        private static final Pattern f1956d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        private static final Pattern f1957e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        static final List<HashMap<String, C0429i>> f1958f = Collections.list(new a());

        /* renamed from: a */
        final List<Map<String, C0426f>> f1959a = Collections.list(new C6033b());

        /* renamed from: b */
        private final ByteOrder f1960b;

        /* renamed from: androidx.camera.core.impl.utils.g$b$a */
        /* loaded from: classes.dex */
        class a implements Enumeration<HashMap<String, C0429i>> {

            /* renamed from: a */
            int f1961a = 0;

            a() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public HashMap<String, C0429i> nextElement() {
                HashMap<String, C0429i> hashMap = new HashMap<>();
                for (C0429i c0429i : C0427g.f1949i[this.f1961a]) {
                    hashMap.put(c0429i.f1977b, c0429i);
                }
                this.f1961a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1961a < C0427g.f1949i.length;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.impl.utils.g$b$b */
        /* loaded from: classes.dex */
        public class C6033b implements Enumeration<Map<String, C0426f>> {

            /* renamed from: a */
            int f1962a = 0;

            C6033b() {
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, C0426f> nextElement() {
                this.f1962a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1962a < C0427g.f1949i.length;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.impl.utils.g$b$c */
        /* loaded from: classes.dex */
        public class c implements Enumeration<Map<String, C0426f>> {

            /* renamed from: a */
            final Enumeration<Map<String, C0426f>> f1964a;

            c() {
                this.f1964a = Collections.enumeration(b.this.f1959a);
            }

            @Override // java.util.Enumeration
            /* renamed from: a */
            public Map<String, C0426f> nextElement() {
                return new HashMap(this.f1964a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1964a.hasMoreElements();
            }
        }

        b(ByteOrder byteOrder) {
            this.f1960b = byteOrder;
        }

        /* renamed from: b */
        private static Pair<Integer, Integer> m2096b(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> m2096b = m2096b(split[0]);
                if (((Integer) m2096b.first).intValue() == 2) {
                    return m2096b;
                }
                for (int i10 = 1; i10 < split.length; i10++) {
                    Pair<Integer, Integer> m2096b2 = m2096b(split[i10]);
                    int intValue = (((Integer) m2096b2.first).equals(m2096b.first) || ((Integer) m2096b2.second).equals(m2096b.first)) ? ((Integer) m2096b.first).intValue() : -1;
                    int intValue2 = (((Integer) m2096b.second).intValue() == -1 || !(((Integer) m2096b2.first).equals(m2096b.second) || ((Integer) m2096b2.second).equals(m2096b.second))) ? -1 : ((Integer) m2096b.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        m2096b = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        m2096b = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return m2096b;
            }
            if (str.contains("/")) {
                String[] split2 = str.split("/", -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(2, -1);
            }
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    if (parseLong >= 0 && parseLong <= 65535) {
                        return new Pair<>(3, 4);
                    }
                    if (parseLong < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused3) {
                return new Pair<>(2, -1);
            }
        }

        /* renamed from: d */
        private void m2097d(String str, String str2, List<Map<String, C0426f>> list) {
            Iterator<Map<String, C0426f>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            m2098e(str, str2, list);
        }

        /* JADX WARN: Code restructure failed: missing block: B:96:0x018a, code lost:
        
            if (r7 != r0) goto L214;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m2098e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.C0426f>> r20) {
            /*
                Method dump skipped, instructions count: 772
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C0427g.b.m2098e(java.lang.String, java.lang.String, java.util.List):void");
        }

        /* renamed from: a */
        public C0427g m2099a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                m2097d("ExposureProgram", String.valueOf(0), list);
                m2097d("ExifVersion", "0230", list);
                m2097d("ComponentsConfiguration", "1,2,3,0", list);
                m2097d("MeteringMode", String.valueOf(0), list);
                m2097d("LightSource", String.valueOf(0), list);
                m2097d("FlashpixVersion", "0100", list);
                m2097d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m2097d("FileSource", String.valueOf(3), list);
                m2097d("SceneType", String.valueOf(1), list);
                m2097d("CustomRendered", String.valueOf(0), list);
                m2097d("SceneCaptureType", String.valueOf(0), list);
                m2097d("Contrast", String.valueOf(0), list);
                m2097d("Saturation", String.valueOf(0), list);
                m2097d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                m2097d("GPSVersionID", "2300", list);
                m2097d("GPSSpeedRef", "K", list);
                m2097d("GPSTrackRef", "T", list);
                m2097d("GPSImgDirectionRef", "T", list);
                m2097d("GPSDestBearingRef", "T", list);
                m2097d("GPSDestDistanceRef", "K", list);
            }
            return new C0427g(this.f1960b, list);
        }

        /* renamed from: c */
        public b m2100c(String str, String str2) {
            m2098e(str, str2, this.f1959a);
            return this;
        }

        /* renamed from: f */
        public b m2101f(long j10) {
            return m2100c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        /* renamed from: g */
        public b m2102g(EnumC5060o enumC5060o) {
            int i10;
            if (enumC5060o == EnumC5060o.UNKNOWN) {
                return this;
            }
            int i11 = a.f1953a[enumC5060o.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else {
                if (i11 != 3) {
                    C0463q1.m2212k("ExifData", "Unknown flash state: " + enumC5060o);
                    return this;
                }
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                m2100c("LightSource", String.valueOf(4));
            }
            return m2100c("Flash", String.valueOf(i10));
        }

        /* renamed from: h */
        public b m2103h(float f10) {
            return m2100c("FocalLength", new C0430j(f10 * 1000.0f, 1000L).toString());
        }

        /* renamed from: i */
        public b m2104i(int i10) {
            return m2100c("ImageLength", String.valueOf(i10));
        }

        /* renamed from: j */
        public b m2105j(int i10) {
            return m2100c("ImageWidth", String.valueOf(i10));
        }

        /* renamed from: k */
        public b m2106k(int i10) {
            return m2100c("SensitivityType", String.valueOf(3)).m2100c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        /* renamed from: l */
        public b m2107l(float f10) {
            return m2100c("FNumber", String.valueOf(f10));
        }

        /* renamed from: m */
        public b m2108m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                C0463q1.m2212k("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return m2100c("Orientation", String.valueOf(i11));
        }

        /* renamed from: n */
        public b m2109n(c cVar) {
            String valueOf;
            int i10 = a.f1954b[cVar.ordinal()];
            if (i10 != 1) {
                valueOf = i10 != 2 ? null : String.valueOf(1);
            } else {
                valueOf = String.valueOf(0);
            }
            return m2100c("WhiteBalance", valueOf);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.g$c */
    /* loaded from: classes.dex */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        C0429i[] c0429iArr = {new C0429i("ImageWidth", 256, 3, 4), new C0429i("ImageLength", 257, 3, 4), new C0429i("Make", 271, 2), new C0429i("Model", 272, 2), new C0429i("Orientation", 274, 3), new C0429i("XResolution", 282, 5), new C0429i("YResolution", 283, 5), new C0429i("ResolutionUnit", 296, 3), new C0429i("Software", 305, 2), new C0429i("DateTime", 306, 2), new C0429i("YCbCrPositioning", 531, 3), new C0429i("SubIFDPointer", 330, 4), new C0429i("ExifIFDPointer", 34665, 4), new C0429i("GPSInfoIFDPointer", 34853, 4)};
        f1944d = c0429iArr;
        C0429i[] c0429iArr2 = {new C0429i("ExposureTime", 33434, 5), new C0429i("FNumber", 33437, 5), new C0429i("ExposureProgram", 34850, 3), new C0429i("PhotographicSensitivity", 34855, 3), new C0429i("SensitivityType", 34864, 3), new C0429i("ExifVersion", 36864, 2), new C0429i("DateTimeOriginal", 36867, 2), new C0429i("DateTimeDigitized", 36868, 2), new C0429i("ComponentsConfiguration", 37121, 7), new C0429i("ShutterSpeedValue", 37377, 10), new C0429i("ApertureValue", 37378, 5), new C0429i("BrightnessValue", 37379, 10), new C0429i("ExposureBiasValue", 37380, 10), new C0429i("MaxApertureValue", 37381, 5), new C0429i("MeteringMode", 37383, 3), new C0429i("LightSource", 37384, 3), new C0429i("Flash", 37385, 3), new C0429i("FocalLength", 37386, 5), new C0429i("SubSecTime", 37520, 2), new C0429i("SubSecTimeOriginal", 37521, 2), new C0429i("SubSecTimeDigitized", 37522, 2), new C0429i("FlashpixVersion", 40960, 7), new C0429i("ColorSpace", 40961, 3), new C0429i("PixelXDimension", 40962, 3, 4), new C0429i("PixelYDimension", 40963, 3, 4), new C0429i("InteroperabilityIFDPointer", 40965, 4), new C0429i("FocalPlaneResolutionUnit", 41488, 3), new C0429i("SensingMethod", 41495, 3), new C0429i("FileSource", 41728, 7), new C0429i("SceneType", 41729, 7), new C0429i("CustomRendered", 41985, 3), new C0429i("ExposureMode", 41986, 3), new C0429i("WhiteBalance", 41987, 3), new C0429i("SceneCaptureType", 41990, 3), new C0429i("Contrast", 41992, 3), new C0429i("Saturation", 41993, 3), new C0429i("Sharpness", 41994, 3)};
        f1945e = c0429iArr2;
        C0429i[] c0429iArr3 = {new C0429i("GPSVersionID", 0, 1), new C0429i("GPSLatitudeRef", 1, 2), new C0429i("GPSLatitude", 2, 5, 10), new C0429i("GPSLongitudeRef", 3, 2), new C0429i("GPSLongitude", 4, 5, 10), new C0429i("GPSAltitudeRef", 5, 1), new C0429i("GPSAltitude", 6, 5), new C0429i("GPSTimeStamp", 7, 5), new C0429i("GPSSpeedRef", 12, 2), new C0429i("GPSTrackRef", 14, 2), new C0429i("GPSImgDirectionRef", 16, 2), new C0429i("GPSDestBearingRef", 23, 2), new C0429i("GPSDestDistanceRef", 25, 2)};
        f1946f = c0429iArr3;
        f1947g = new C0429i[]{new C0429i("SubIFDPointer", 330, 4), new C0429i("ExifIFDPointer", 34665, 4), new C0429i("GPSInfoIFDPointer", 34853, 4), new C0429i("InteroperabilityIFDPointer", 40965, 4)};
        C0429i[] c0429iArr4 = {new C0429i("InteroperabilityIndex", 1, 2)};
        f1948h = c0429iArr4;
        f1949i = new C0429i[][]{c0429iArr, c0429iArr2, c0429iArr3, c0429iArr4};
        f1950j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    C0427g(ByteOrder byteOrder, List<Map<String, C0426f>> list) {
        C0654h.m3470i(list.size() == f1949i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f1952b = byteOrder;
        this.f1951a = list;
    }

    /* renamed from: a */
    public static b m2093a() {
        return new b(ByteOrder.BIG_ENDIAN).m2100c("Orientation", String.valueOf(1)).m2100c("XResolution", "72/1").m2100c("YResolution", "72/1").m2100c("ResolutionUnit", String.valueOf(2)).m2100c("YCbCrPositioning", String.valueOf(1)).m2100c("Make", Build.MANUFACTURER).m2100c("Model", Build.MODEL);
    }

    /* renamed from: b */
    public Map<String, C0426f> m2094b(int i10) {
        C0654h.m3464c(i10, 0, f1949i.length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f1951a.get(i10);
    }

    /* renamed from: c */
    public ByteOrder m2095c() {
        return this.f1952b;
    }
}
