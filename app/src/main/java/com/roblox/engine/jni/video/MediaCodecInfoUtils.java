package com.roblox.engine.jni.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class MediaCodecInfoUtils {

    /* renamed from: a */
    private static final Map<Integer, List<String>> f12107a = m13344d(MediaCodecInfo.CodecProfileLevel.class, "Profile");

    /* renamed from: b */
    private static final Map<Integer, List<String>> f12108b = m13344d(MediaCodecInfo.CodecProfileLevel.class, "Level");

    /* renamed from: c */
    private static final Map<Integer, List<String>> f12109c = m13344d(MediaCodecInfo.CodecProfileLevel.class, "AACObject");

    /* renamed from: d */
    private static final Map<String, String> f12110d;

    /* renamed from: e */
    private static final List<C2942a> f12111e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.engine.jni.video.MediaCodecInfoUtils$a */
    /* loaded from: classes.dex */
    public static class C2942a {

        /* renamed from: a */
        int f12112a;

        /* renamed from: b */
        int f12113b;

        /* renamed from: c */
        int f12114c;

        C2942a(int i10, int i11, int i12) {
            this.f12112a = i10;
            this.f12113b = i11;
            this.f12114c = i12;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f12110d = hashMap;
        f12111e = new ArrayList();
        hashMap.put("heic", "HEVC");
        hashMap.put("hevc", "HEVC");
        hashMap.put("avc", "AVC");
        hashMap.put("3gpp", "H263");
        hashMap.put("mpeg2", "MPEG2");
        hashMap.put("mp4v-es", "MPEG4");
        hashMap.put("vp8", "VP8");
        hashMap.put("vp9", "VP9");
        hashMap.put("av01", "AV1");
        hashMap.put("vorbis", "Vorbis");
        hashMap.put("opus", "Opus");
        int[] iArr = {160, 320, 640, 1280, 1920, 3840, 7680};
        int[] iArr2 = {90, 180, 360, 720, 1080, 2160, 4320};
        int[] iArr3 = {5, 12, 15, 24, 25, 30, 50, 60, 100, 120, 200, 240};
        for (int i10 = 0; i10 < 12; i10++) {
            int i11 = iArr3[i10];
            for (int i12 = 0; i12 < 7; i12++) {
                f12111e.add(new C2942a(iArr[i12], iArr2[i12], i11));
            }
        }
    }

    /* renamed from: a */
    private static <T> Field[] m13341a(Class<T> cls) {
        Field[] fields = cls.getFields();
        Field[] declaredFields = cls.getDeclaredFields();
        Field[] fieldArr = new Field[fields.length + declaredFields.length];
        System.arraycopy(fields, 0, fieldArr, 0, fields.length);
        System.arraycopy(declaredFields, 0, fieldArr, fields.length, declaredFields.length);
        return fieldArr;
    }

    /* renamed from: b */
    private static MediaCodecInfo.CodecCapabilities m13342b(MediaCodecInfo mediaCodecInfo, String str) {
        try {
            return mediaCodecInfo.getCapabilitiesForType(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static String m13343c(String str) {
        if (str.contains("aac") || str.contains("mp4a")) {
            return "AAC";
        }
        for (Map.Entry<String, String> entry : f12110d.entrySet()) {
            if (str.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* renamed from: d */
    private static Map<Integer, List<String>> m13344d(Class<?> cls, String str) {
        Field[] m13341a = m13341a(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : m13341a) {
            if (field.getName().contains(str)) {
                try {
                    int i10 = field.getInt(null);
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(Integer.valueOf(i10))) {
                        linkedHashMap.put(Integer.valueOf(i10), new ArrayList());
                    }
                    ((List) linkedHashMap.get(Integer.valueOf(i10))).add(name);
                } catch (IllegalAccessException unused) {
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Integer> arrayList = new ArrayList(linkedHashMap.keySet());
        Collections.sort(arrayList);
        for (Integer num : arrayList) {
            linkedHashMap2.put(num, (List) linkedHashMap.get(num));
        }
        return linkedHashMap2;
    }

    /* renamed from: e */
    private static <K, V> V m13345e(Map<K, V> map, K k10, V v10) {
        V v11 = map.get(k10);
        return (v11 != null || map.containsKey(k10)) ? v11 : v10;
    }

    /* renamed from: f */
    private static Pair<String, String> m13346f(String str, MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        List list;
        String str2;
        String str3;
        List<String> list2;
        String m13343c = m13343c(str);
        boolean equals = "AAC".equals(m13343c);
        if (equals) {
            list = (List) m13345e(f12109c, Integer.valueOf(codecProfileLevel.profile), Collections.emptyList());
        } else {
            list = (List) m13345e(f12107a, Integer.valueOf(codecProfileLevel.profile), Collections.emptyList());
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str2 = BuildConfig.FLAVOR;
            if (!hasNext) {
                str3 = BuildConfig.FLAVOR;
                break;
            }
            str3 = (String) it.next();
            if (m13343c == null || str3.contains(m13343c)) {
                break;
            }
        }
        if (str3.isEmpty()) {
            str3 = String.valueOf(codecProfileLevel.profile);
        }
        if (equals) {
            list2 = Collections.singletonList(String.valueOf(codecProfileLevel.level));
        } else {
            list2 = (List) m13345e(f12108b, Integer.valueOf(codecProfileLevel.level), Collections.emptyList());
        }
        for (String str4 : list2) {
            if (m13343c == null || str4.contains(m13343c)) {
                str2 = str4;
                break;
            }
        }
        if (str2.isEmpty()) {
            str2 = String.valueOf(codecProfileLevel.level);
        }
        return new Pair<>(str3, str2);
    }

    /* renamed from: g */
    private static String m13347g(MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            String m13343c = m13343c(str);
            if (m13343c != null) {
                return m13343c;
            }
        }
        return null;
    }

    public static VideoCodecCapability[] getHardwareVideoDecoders() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!m13348h(mediaCodecInfo) && !m13349i(mediaCodecInfo) && m13350j(mediaCodecInfo) && !mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        return m13352l(arrayList);
    }

    /* renamed from: h */
    private static boolean m13348h(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isAlias();
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m13349i(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29 && (!mediaCodecInfo.isHardwareAccelerated() || mediaCodecInfo.isSoftwareOnly())) {
            return true;
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.contains(".sw.dec") || lowerCase.contains(".sw.enc") || lowerCase.contains("ffmpeg");
    }

    /* renamed from: j */
    private static boolean m13350j(MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private static int m13351k(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: l */
    private static VideoCodecCapability[] m13352l(List<MediaCodecInfo> list) {
        String m13347g;
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : list) {
            if (m13350j(mediaCodecInfo) && (m13347g = m13347g(mediaCodecInfo)) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    VideoCodecSupportedType m13353m = m13353m(mediaCodecInfo, str);
                    if (m13353m != null) {
                        arrayList2.add(m13353m);
                    }
                }
                arrayList.add(new VideoCodecCapability(true, m13347g, (VideoCodecSupportedType[]) arrayList2.toArray(new VideoCodecSupportedType[0])));
            }
        }
        return (VideoCodecCapability[]) arrayList.toArray(new VideoCodecCapability[0]);
    }

    /* renamed from: m */
    private static VideoCodecSupportedType m13353m(MediaCodecInfo mediaCodecInfo, String str) {
        int i10;
        int i11;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        MediaCodecInfo.CodecCapabilities m13342b = m13342b(mediaCodecInfo, str);
        if (m13342b == null) {
            return null;
        }
        List<Pair> emptyList = m13342b.profileLevels == null ? Collections.emptyList() : new ArrayList();
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m13342b.profileLevels) {
            emptyList.add(m13346f(str, codecProfileLevel));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : emptyList) {
            arrayList.add((String) pair.first);
            arrayList2.add((String) pair.second);
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = m13342b.getVideoCapabilities();
        if (videoCapabilities == null || videoCapabilities.getBitrateRange() == null) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = videoCapabilities.getBitrateRange().getLower().intValue();
            i11 = videoCapabilities.getBitrateRange().getUpper().intValue();
        }
        if (videoCapabilities == null || videoCapabilities.getSupportedHeights() == null) {
            num = null;
            num2 = null;
        } else {
            num = videoCapabilities.getSupportedHeights().getLower();
            num2 = videoCapabilities.getSupportedHeights().getUpper();
        }
        if (videoCapabilities == null || videoCapabilities.getSupportedWidths() == null) {
            num3 = null;
            num4 = null;
        } else {
            num3 = videoCapabilities.getSupportedWidths().getLower();
            num4 = videoCapabilities.getSupportedWidths().getUpper();
        }
        ArrayList<C2942a> arrayList3 = new ArrayList();
        if (videoCapabilities != null) {
            for (C2942a c2942a : f12111e) {
                Integer num11 = num;
                if (videoCapabilities.areSizeAndRateSupported(c2942a.f12112a, c2942a.f12113b, c2942a.f12114c)) {
                    arrayList3.add(c2942a);
                }
                num = num11;
            }
        }
        Integer num12 = num;
        if (arrayList3.isEmpty()) {
            num5 = null;
            num6 = null;
            num7 = null;
            num8 = null;
            num9 = null;
            num10 = null;
        } else {
            num10 = Integer.MIN_VALUE;
            num7 = Integer.MIN_VALUE;
            num6 = Integer.MAX_VALUE;
            num5 = Integer.MAX_VALUE;
            num9 = Integer.MIN_VALUE;
            num8 = Integer.MAX_VALUE;
        }
        for (C2942a c2942a2 : arrayList3) {
            num6 = Integer.valueOf(Math.min(num6.intValue(), c2942a2.f12112a));
            num5 = Integer.valueOf(Math.min(num5.intValue(), c2942a2.f12113b));
            num7 = Integer.valueOf(Math.max(num7.intValue(), c2942a2.f12112a));
            num10 = Integer.valueOf(Math.max(num10.intValue(), c2942a2.f12113b));
            num8 = Integer.valueOf(Math.min(num8.intValue(), c2942a2.f12114c));
            num9 = Integer.valueOf(Math.max(num9.intValue(), c2942a2.f12114c));
        }
        if (num12 == null && num5 != null) {
            num12 = num5;
        }
        if (num3 == null && num6 != null) {
            num3 = num6;
        }
        if (num2 == null && num10 != null) {
            num2 = num10;
        }
        if (num4 == null && num7 != null) {
            num4 = num7;
        }
        return new VideoCodecSupportedType(str, Build.VERSION.SDK_INT >= 23 ? m13342b.getMaxSupportedInstances() : 0, (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]), m13351k(num3), m13351k(num4), m13351k(num12), m13351k(num2), m13351k(num8), m13351k(num9), i10, i11);
    }
}
