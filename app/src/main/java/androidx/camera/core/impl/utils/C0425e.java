package androidx.camera.core.impl.utils;

import android.location.Location;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p002a1.C0005a;

/* renamed from: androidx.camera.core.impl.utils.e */
/* loaded from: classes.dex */
public final class C0425e {

    /* renamed from: c */
    private static final String f1926c = "e";

    /* renamed from: d */
    private static final ThreadLocal<SimpleDateFormat> f1927d = new a();

    /* renamed from: e */
    private static final ThreadLocal<SimpleDateFormat> f1928e = new b();

    /* renamed from: f */
    private static final ThreadLocal<SimpleDateFormat> f1929f = new c();

    /* renamed from: g */
    private static final List<String> f1930g = m2064e();

    /* renamed from: h */
    private static final List<String> f1931h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    private final C0005a f1932a;

    /* renamed from: b */
    private boolean f1933b = false;

    /* renamed from: androidx.camera.core.impl.utils.e$a */
    /* loaded from: classes.dex */
    class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.e$b */
    /* loaded from: classes.dex */
    class b extends ThreadLocal<SimpleDateFormat> {
        b() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.e$c */
    /* loaded from: classes.dex */
    class c extends ThreadLocal<SimpleDateFormat> {
        c() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.utils.e$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.impl.utils.e$d$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            final double f1934a;

            a(double d10) {
                this.f1934a = d10;
            }

            /* renamed from: a */
            double m2082a() {
                return this.f1934a / 2.23694d;
            }
        }

        /* renamed from: a */
        static a m2079a(double d10) {
            return new a(d10 * 0.621371d);
        }

        /* renamed from: b */
        static a m2080b(double d10) {
            return new a(d10 * 1.15078d);
        }

        /* renamed from: c */
        static a m2081c(double d10) {
            return new a(d10);
        }
    }

    private C0425e(C0005a c0005a) {
        this.f1932a = c0005a;
    }

    /* renamed from: a */
    private static Date m2060a(String str) throws ParseException {
        return f1927d.get().parse(str);
    }

    /* renamed from: b */
    private static Date m2061b(String str) throws ParseException {
        return f1929f.get().parse(str);
    }

    /* renamed from: c */
    private static Date m2062c(String str) throws ParseException {
        return f1928e.get().parse(str);
    }

    /* renamed from: d */
    public static C0425e m2063d(InputStream inputStream) throws IOException {
        return new C0425e(new C0005a(inputStream));
    }

    /* renamed from: e */
    public static List<String> m2064e() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    /* renamed from: o */
    private long m2065o(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return m2061b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* renamed from: p */
    private long m2066p(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return m2060a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return m2062c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return m2065o(str + " " + str2);
    }

    /* renamed from: f */
    public String m2067f() {
        return this.f1932a.m56f("ImageDescription");
    }

    /* renamed from: g */
    public int m2068g() {
        return this.f1932a.m58h("ImageLength", 0);
    }

    /* renamed from: h */
    public Location m2069h() {
        double m2082a;
        String m56f = this.f1932a.m56f("GPSProcessingMethod");
        double[] m59l = this.f1932a.m59l();
        double m55e = this.f1932a.m55e(0.0d);
        double m57g = this.f1932a.m57g("GPSSpeed", 0.0d);
        String m56f2 = this.f1932a.m56f("GPSSpeedRef");
        if (m56f2 == null) {
            m56f2 = "K";
        }
        long m2066p = m2066p(this.f1932a.m56f("GPSDateStamp"), this.f1932a.m56f("GPSTimeStamp"));
        if (m59l == null) {
            return null;
        }
        if (m56f == null) {
            m56f = f1926c;
        }
        Location location = new Location(m56f);
        location.setLatitude(m59l[0]);
        location.setLongitude(m59l[1]);
        if (m55e != 0.0d) {
            location.setAltitude(m55e);
        }
        if (m57g != 0.0d) {
            char c10 = 65535;
            int hashCode = m56f2.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && m56f2.equals("N")) {
                        c10 = 1;
                    }
                } else if (m56f2.equals("M")) {
                    c10 = 0;
                }
            } else if (m56f2.equals("K")) {
                c10 = 2;
            }
            if (c10 == 0) {
                m2082a = d.m2081c(m57g).m2082a();
            } else if (c10 != 1) {
                m2082a = d.m2079a(m57g).m2082a();
            } else {
                m2082a = d.m2080b(m57g).m2082a();
            }
            location.setSpeed((float) m2082a);
        }
        if (m2066p != -1) {
            location.setTime(m2066p);
        }
        return location;
    }

    /* renamed from: i */
    public int m2070i() {
        return this.f1932a.m58h("Orientation", 0);
    }

    /* renamed from: j */
    public int m2071j() {
        switch (m2070i()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    public long m2072k() {
        long m2065o = m2065o(this.f1932a.m56f("DateTimeOriginal"));
        if (m2065o == -1) {
            return -1L;
        }
        String m56f = this.f1932a.m56f("SubSecTimeOriginal");
        if (m56f == null) {
            return m2065o;
        }
        try {
            long parseLong = Long.parseLong(m56f);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return m2065o + parseLong;
        } catch (NumberFormatException unused) {
            return m2065o;
        }
    }

    /* renamed from: l */
    public int m2073l() {
        return this.f1932a.m58h("ImageWidth", 0);
    }

    /* renamed from: m */
    public boolean m2074m() {
        return m2070i() == 2;
    }

    /* renamed from: n */
    public boolean m2075n() {
        int m2070i = m2070i();
        return m2070i == 4 || m2070i == 5 || m2070i == 7;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(m2073l()), Integer.valueOf(m2068g()), Integer.valueOf(m2071j()), Boolean.valueOf(m2075n()), Boolean.valueOf(m2074m()), m2069h(), Long.valueOf(m2072k()), m2067f());
    }
}
