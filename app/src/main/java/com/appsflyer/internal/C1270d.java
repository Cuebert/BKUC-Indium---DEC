package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.Gravity;
import android.webkit.URLUtil;
import com.appsflyer.AFLogger;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.appsflyer.internal.d */
/* loaded from: classes.dex */
public final class C1270d {
    private static char AFInAppEventParameterName = 37945;
    private static char AFInAppEventType = 2566;
    private static char AFKeystoreWrapper = 53514;
    private static int AFVersionDeclaration = 0;
    private static int getLevel = 1;
    private static char valueOf = 4568;
    private static long values = 123364835749994368L;

    C1270d() {
    }

    private static String AFInAppEventParameterName(String str) {
        boolean z10 = str != null;
        char[] cArr = str;
        if (z10) {
            int i10 = getLevel + 121;
            AFVersionDeclaration = i10 % 128;
            int i11 = i10 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[cArr2.length];
        char[] cArr4 = new char[2];
        int i12 = 0;
        while (true) {
            if ((i12 < cArr2.length ? ']' : 'S') != ']') {
                return new String(cArr3, 1, (int) cArr3[0]);
            }
            int i13 = AFVersionDeclaration + 99;
            getLevel = i13 % 128;
            int i14 = i13 % 2;
            cArr4[0] = cArr2[i12];
            int i15 = i12 + 1;
            cArr4[1] = cArr2[i15];
            C1265by.AFInAppEventParameterName(cArr4, AFKeystoreWrapper, AFInAppEventParameterName, valueOf, AFInAppEventType);
            cArr3[i12] = cArr4[0];
            cArr3[i15] = cArr4[1];
            i12 += 2;
        }
    }

    private static String AFKeystoreWrapper(String str, Long l10) {
        if (str != null && l10 != null) {
            int i10 = getLevel + 49;
            AFVersionDeclaration = i10 % 128;
            int i11 = i10 % 2;
            if (str.length() == 32) {
                StringBuilder sb2 = new StringBuilder(str);
                String obj = l10.toString();
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= obj.length()) {
                        break;
                    }
                    int i14 = getLevel + 85;
                    AFVersionDeclaration = i14 % 128;
                    if ((i14 % 2 != 0 ? '4' : '\r') != '4') {
                        i13 += Character.getNumericValue(obj.charAt(i12));
                        i12++;
                    } else {
                        i13 >>= Character.getNumericValue(obj.charAt(i12));
                        i12 += 49;
                    }
                }
                String hexString = Integer.toHexString(i13);
                sb2.replace(7, hexString.length() + 7, hexString);
                int i15 = 0;
                while (true) {
                    if (i15 >= sb2.length()) {
                        break;
                    }
                    j10 += Character.getNumericValue(sb2.charAt(i15));
                    i15++;
                }
                while (true) {
                    if ((j10 > 100 ? (char) 28 : (char) 24) == 24) {
                        break;
                    }
                    int i16 = getLevel + 13;
                    int i17 = i16 % 128;
                    AFVersionDeclaration = i17;
                    j10 = i16 % 2 != 0 ? j10 & 100 : j10 % 100;
                    int i18 = i17 + 3;
                    getLevel = i18 % 128;
                    int i19 = i18 % 2;
                }
                sb2.insert(23, (int) j10);
                if (j10 < 10) {
                    sb2.insert(23, AFInAppEventParameterName("큮\ud8fc").intern());
                }
                return sb2.toString();
            }
        }
        return values("嗧䨅됯ṗ䡹뉢\u1c8f䛡낍᪦䓢꽘ᥧ䍚굀ᜰ䇃ꯣᗘ羑ꧩᑇ縿꡵መ籫ꛏწ窢꒙ຢ祈ꍑ").intern();
    }

    private static boolean valueOf(String str) {
        int i10 = AFVersionDeclaration + 51;
        getLevel = i10 % 128;
        int i11 = i10 % 2;
        try {
            Class.forName(str);
            int i12 = AFVersionDeclaration + 79;
            getLevel = i12 % 128;
            int i13 = i12 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String values(Context context, long j10) {
        String AFInAppEventParameterName2;
        String intern;
        String AFInAppEventParameterName3;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        sb3.append((valueOf(AFInAppEventParameterName("閺ﱤ⭾\ud861툗룹㮄\udec8镣뛫煄깅\ue9f4猽嵵䑱柖㼜\uf675鉀煄깅\ue9f4猽嵵䑱柖㼜\uf262∩핁\u17ed䝟燎卭瑕").intern()) ? values("師䆚") : AFInAppEventParameterName("큮\ud8fc")).intern());
        StringBuilder sb5 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFKeystoreWrapper2 = AFKeystoreWrapper(packageName);
        sb3.append(values("師䆚").intern());
        sb5.append(AFKeystoreWrapper2);
        if (values(context) == null) {
            sb3.append(AFInAppEventParameterName("큮\ud8fc").intern());
            sb5.append(packageName);
        } else {
            sb3.append(values("師䆚").intern());
            sb5.append(packageName);
            int i10 = AFVersionDeclaration + 111;
            getLevel = i10 % 128;
            int i11 = i10 % 2;
        }
        String valueOf2 = valueOf(context);
        if (valueOf2 == null) {
            sb3.append(AFInAppEventParameterName("큮\ud8fc").intern());
            sb5.append(packageName);
        } else {
            sb3.append(values("師䆚").intern());
            sb5.append(valueOf2);
        }
        sb5.append(values(context, packageName));
        sb2.append(sb5.toString());
        try {
            sb2.append(new SimpleDateFormat(values("ދᡲჯक़Ǖ㨚㊏⬀⏵將咊䴦䕌緇癷滈权鿈頜").intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            sb2.append(j10);
            if (!(!valueOf(AFInAppEventParameterName("洰⊭⭾\ud861툗룹㮄\udec8\uf4b9թ\uef45㧀\uf21d䕻錰䇷\udb0d\ue1aa\ue2d6噗ᬤ㸬㏡⅀\udb0d\ue1aa").intern()))) {
                int i12 = getLevel + 33;
                AFVersionDeclaration = i12 % 128;
                int i13 = i12 % 2;
                AFInAppEventParameterName2 = values("師䆚");
            } else {
                AFInAppEventParameterName2 = AFInAppEventParameterName("큮\ud8fc");
            }
            sb4.append(AFInAppEventParameterName2.intern());
            if (valueOf(values("룷꜖渀㔁ﰮ茼䨣ᄥ\ud816齇♇\ued6f둰筼ɣ즋邕埉ẍꖰ沢㎰𥉉臃").intern())) {
                int i14 = AFVersionDeclaration + 57;
                getLevel = i14 % 128;
                if ((i14 % 2 == 0 ? '0' : (char) 0) != 0) {
                    values("師䆚").intern();
                    throw null;
                }
                intern = values("師䆚").intern();
                int i15 = getLevel + 21;
                AFVersionDeclaration = i15 % 128;
                int i16 = i15 % 2;
            } else {
                intern = AFInAppEventParameterName("큮\ud8fc").intern();
            }
            sb4.append(intern);
            if (valueOf(AFInAppEventParameterName("\ude82\ue6a8⭾\ud861툗룹㮄\udec8\uf4b9թ\uef45㧀⋽䜪嗚\uee4fᵧ߂왴֙\ude9b죷").intern())) {
                int i17 = getLevel + 77;
                AFVersionDeclaration = i17 % 128;
                int i18 = i17 % 2;
                AFInAppEventParameterName3 = values("師䆚");
            } else {
                AFInAppEventParameterName3 = AFInAppEventParameterName("큮\ud8fc");
            }
            sb4.append(AFInAppEventParameterName3.intern());
            sb4.append((valueOf(values("㧥☄氤뉋\uf866㺖䒷誧킆ᛣ崗挣ꤒ\uef74㕴箂").intern()) ? values("師䆚") : AFInAppEventParameterName("큮\ud8fc")).intern());
            String AFInAppEventType2 = C1220af.AFInAppEventType(C1220af.values(sb2.toString()));
            String obj = sb3.toString();
            StringBuilder sb6 = new StringBuilder(AFInAppEventType2);
            sb6.setCharAt(17, Integer.toString(Integer.parseInt(obj, 2), 16).charAt(0));
            String obj2 = sb6.toString();
            String obj3 = sb4.toString();
            StringBuilder sb7 = new StringBuilder(obj2);
            sb7.setCharAt(27, Integer.toString(Integer.parseInt(obj3, 2), 16).charAt(0));
            return AFKeystoreWrapper(sb7.toString(), Long.valueOf(j10));
        } catch (PackageManager.NameNotFoundException unused) {
            return values("嗧䨅됯ṗ䡹뉢\u1c8f䛡낍᪦䓢꽘ᥧ䍚굀ᜰ䇃ꯣᗘ羑ꧩᑇ縿꡵መ籫ꛏწ窢꒙ຢ祈ꍑ").intern();
        }
    }

    private static String valueOf(Context context) {
        PackageManager packageManager;
        String packageName;
        int i10 = getLevel + 41;
        AFVersionDeclaration = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? '#' : ':') != ':') {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } else {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            }
            String str = packageManager.getPackageInfo(packageName, 0).packageName;
            int i11 = AFVersionDeclaration + 47;
            getLevel = i11 % 128;
            int i12 = i11 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: com.appsflyer.internal.d$e */
    /* loaded from: classes.dex */
    static class e extends HashMap<String, Object> {
        private static int AFInAppEventParameterName = 0;
        private static int AFLogger$LogLevel = 1;
        private static char[] valueOf = {28, '9', '9', '9', 'O', 'e', 'h', 129, 260, 266, 271, 272, 253, 243, 264, 270, 261, 258, 243, 239, 263, 265, 'g', 209, 207, 205, 205, '2', 'J', '2', '4', '2', 'J', 'N', '5', 'K', 'L', '1', '0', '4', 'M', 'a', 'a', 'c', 'c', 's', 231, 233, 237, 234, 231, 232, 244, 255, 248, 238, 239, 247, 237, 228, 219, 241, 273, 271, 273, 270, 261, 234, 244, 276, 268, 271, 276, 270, 238, 236, 265, 271, 275, 270, 268, 266, ':', 'l', 'i', 'n', 'j', 'k', 'i', 'j', 't', 's', 'k', '<', 'X', '7', 166, 'g', 166, 'g', 167, 'f', 167, 'f', 156, 163, 151, 170, 158, 153, 'h', 'h'};
        private static long values = 3100330032987487916L;
        private final Context AFInAppEventType;
        private final Map<String, Object> AFKeystoreWrapper;

        /* renamed from: com.appsflyer.internal.d$e$d */
        /* loaded from: classes.dex */
        public static class d {
            Boolean AFInAppEventParameterName;
            public final Boolean valueOf;
            public final String values;

            d() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public d(String str, Boolean bool) {
                this.values = str;
                this.valueOf = bool;
            }

            static byte[] AFInAppEventType(byte[] bArr) throws Exception {
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    bArr[i10] = (byte) (bArr[i10] ^ ((i10 % 2) + 42));
                }
                return bArr;
            }

            static byte[] valueOf(String str) throws Exception {
                return str.getBytes();
            }

            static String values(byte[] bArr) throws Exception {
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArr) {
                    String hexString = Integer.toHexString(b10);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(hexString);
                    }
                    sb2.append(hexString);
                }
                return sb2.toString();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Map<String, Object> map, Context context) {
            this.AFKeystoreWrapper = map;
            this.AFInAppEventType = context;
            put(valueOf(), AFInAppEventParameterName());
        }

        private String AFInAppEventParameterName() {
            String obj;
            int i10;
            try {
                String obj2 = this.AFKeystoreWrapper.get(AFInAppEventParameterName("薝ṹ藼ꂳ鎙\uee9e덭輝缥ᦂ雳맚烨ᓞ鱋븉").intern()).toString();
                String obj3 = this.AFKeystoreWrapper.get(AFInAppEventParameterName(new int[]{7, 15, 157, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", !URLUtil.isJavaScriptUrl("javascript:")).intern()).toString();
                String replaceAll = AFInAppEventParameterName(new int[]{22, 5, 157, 1}, "\u0001\u0000\u0000\u0001\u0001", !TextUtils.equals(BuildConfig.FLAVOR, BuildConfig.FLAVOR)).intern().replaceAll(AFInAppEventParameterName("툮\ueaaf툃呱꺒펩\uf849쑣⢙").intern(), BuildConfig.FLAVOR);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj2);
                sb2.append(obj3);
                sb2.append(replaceAll);
                String values2 = C1220af.values(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(BuildConfig.FLAVOR);
                sb3.append(values2.substring(0, 16));
                obj = sb3.toString();
            } catch (Exception e10) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(AFInAppEventParameterName("꾊偓꿬\uee9e层ⅳㆁ෩唹垦奛㬺嫩嫼厮㳿徝䁖䱲↓䕋䟒䤀⭈䫺䪢䏍⳼侠瀧籮ᇭ畋瞋礯᭕穌竗珓ᰎ羹怲沏ƴ散杼楱ଭ").intern());
                sb4.append(e10);
                AFLogger.AFInAppEventParameterName(sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(BuildConfig.FLAVOR);
                sb5.append(AFInAppEventParameterName(new int[]{27, 18, 0, 13}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", PhoneNumberUtils.isGlobalPhoneNumber(BuildConfig.FLAVOR)).intern());
                obj = sb5.toString();
            }
            try {
                Intent registerReceiver = this.AFInAppEventType.registerReceiver(null, new IntentFilter(AFInAppEventParameterName(new int[]{45, 37, 163, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", !TextUtils.isGraphic(BuildConfig.FLAVOR)).intern()));
                int i11 = -2700;
                if ((registerReceiver != null ? 'a' : 'D') == 'a') {
                    int i12 = AFInAppEventParameterName + 17;
                    AFLogger$LogLevel = i12 % 128;
                    int i13 = i12 % 2;
                    i11 = registerReceiver.getIntExtra(AFInAppEventParameterName(new int[]{82, 11, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", !URLUtil.isJavaScriptUrl("javascript:")).intern(), -2700);
                }
                String str = this.AFInAppEventType.getApplicationInfo().nativeLibraryDir;
                if (str != null) {
                    int i14 = AFInAppEventParameterName + 107;
                    AFLogger$LogLevel = i14 % 128;
                    int i15 = i14 % 2;
                    if (str.contains(AFInAppEventParameterName(new int[]{93, 3, 0, 3}, "\u0000\u0000\u0000", !URLUtil.isHttpUrl("http://")).intern())) {
                        int i16 = AFLogger$LogLevel + 73;
                        AFInAppEventParameterName = i16 % 128;
                        if ((i16 % 2 != 0 ? (char) 16 : '\"') != 16) {
                            i10 = 1;
                            int size = ((SensorManager) this.AFInAppEventType.getSystemService(AFInAppEventParameterName("妿ટ姌둖篔ۢ䒔磣ꌓ൸").intern())).getSensorList(-1).size();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(AFInAppEventParameterName("涞淼颍㲲ⓔ").intern());
                            sb6.append(i11);
                            sb6.append(AFInAppEventParameterName("㓷印㓑\ueda4ʵ脧").intern());
                            sb6.append(i10);
                            sb6.append(AFInAppEventParameterName("ᓹꮼᓟᕣ襺瑞").intern());
                            sb6.append(size);
                            sb6.append(AFInAppEventParameterName("⳰赻Ⳗ㎧鱤盬").intern());
                            sb6.append(this.AFKeystoreWrapper.size());
                            String obj4 = sb6.toString();
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(obj);
                            sb7.append(d.values(d.AFInAppEventType(d.valueOf(obj4))));
                            return sb7.toString();
                        }
                    }
                }
                i10 = 0;
                int size2 = ((SensorManager) this.AFInAppEventType.getSystemService(AFInAppEventParameterName("妿ટ姌둖篔ۢ䒔磣ꌓ൸").intern())).getSensorList(-1).size();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(AFInAppEventParameterName("涞淼颍㲲ⓔ").intern());
                sb62.append(i11);
                sb62.append(AFInAppEventParameterName("㓷印㓑\ueda4ʵ脧").intern());
                sb62.append(i10);
                sb62.append(AFInAppEventParameterName("ᓹꮼᓟᕣ襺瑞").intern());
                sb62.append(size2);
                sb62.append(AFInAppEventParameterName("⳰赻Ⳗ㎧鱤盬").intern());
                sb62.append(this.AFKeystoreWrapper.size());
                String obj42 = sb62.toString();
                StringBuilder sb72 = new StringBuilder();
                sb72.append(obj);
                sb72.append(d.values(d.AFInAppEventType(d.valueOf(obj42))));
                return sb72.toString();
            } catch (Exception e11) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(AFInAppEventParameterName("꾊偓꿬\uee9e层ⅳㆁ෩唹垦奛㬺嫩嫼厮㳿徝䁖䱲↓䕋䟒䤀⭈䫺䪢䏍⳼侠瀧籮ᇭ畋瞋礯᭕穌竗珓ᰎ羹怲沏ƴ散杼楱ଭ").intern());
                sb8.append(e11);
                AFLogger.AFInAppEventParameterName(sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj);
                sb9.append(AFInAppEventParameterName(new int[]{96, 16, 54, 9}, null, !Gravity.isHorizontal(0)).intern());
                return sb9.toString();
            }
        }

        private static StringBuilder valueOf(String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                if (i10 >= 3) {
                    break;
                }
                int i11 = AFLogger$LogLevel + 19;
                AFInAppEventParameterName = i11 % 128;
                if ((i11 % 2 != 0 ? '<' : ')') != '<') {
                    arrayList.add(Integer.valueOf(strArr[i10].length()));
                    i10++;
                } else {
                    arrayList.add(Integer.valueOf(strArr[i10].length()));
                    i10 += 0;
                }
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb2 = new StringBuilder();
            int i12 = 0;
            while (i12 < intValue) {
                int i13 = AFLogger$LogLevel + 75;
                AFInAppEventParameterName = i13 % 128;
                int i14 = i13 % 2;
                Integer num = null;
                for (int i15 = 0; i15 < 3; i15++) {
                    int i16 = AFLogger$LogLevel + 31;
                    AFInAppEventParameterName = i16 % 128;
                    int i17 = i16 % 2;
                    int charAt = strArr[i15].charAt(i12);
                    if ((num == null ? 'U' : '8') != 'U') {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                }
                sb2.append(Integer.toHexString(num.intValue()));
                i12++;
                int i18 = AFLogger$LogLevel + 1;
                AFInAppEventParameterName = i18 % 128;
                int i19 = i18 % 2;
            }
            return sb2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
        private String valueOf() {
            int i10 = AFLogger$LogLevel + 49;
            AFInAppEventParameterName = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 4;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.AFKeystoreWrapper.get(AFInAppEventParameterName("薝ṹ藼ꂳ鎙\uee9e덭輝缥ᦂ雳맚烨ᓞ鱋븉").intern()).toString();
                String obj2 = this.AFKeystoreWrapper.get(AFInAppEventParameterName("羹毌翛픒࠻甂ឞ⯴蔏").intern()).toString();
                if ((obj2 == null ? (char) 27 : '%') != '%') {
                    int i13 = AFLogger$LogLevel + 81;
                    AFInAppEventParameterName = i13 % 128;
                    int i14 = i13 % 2;
                    obj2 = AFInAppEventParameterName("墧꺥壩၆❫婬矶䮰ꈋ\ua95b∪絀").intern();
                }
                StringBuilder sb2 = new StringBuilder(obj);
                sb2.reverse();
                StringBuilder valueOf2 = valueOf(num, obj2, sb2.toString());
                int length = valueOf2.length();
                if (length > 4) {
                    valueOf2.delete(4, length);
                } else {
                    while (true) {
                        if ((length < 4 ? '\f' : '9') != '\f') {
                            break;
                        }
                        length++;
                        valueOf2.append('1');
                    }
                }
                valueOf2.insert(0, AFInAppEventParameterName("骭\ue135髆忼㴛䀥䧐").intern());
                i12 = valueOf2.toString();
                return i12;
            } catch (Exception e10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(AFInAppEventParameterName("㘷栢㙑훯᥄摵쪏\uf6e7첄濗ᱝ쀴썔抍ᚨ쟱옠砧ॴ\ub74f6羣ఆ큆퍇狓ۖퟶ혈䠃㥺\ueaaa\uecf5俻㱽\ue056\ue3a9䊠㛈\ue713\ue615塚⦒諾ﲋ彃").intern());
                sb3.append(e10);
                AFLogger.AFInAppEventParameterName(sb3.toString());
                int[] iArr = new int[i12];
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 7;
                iArr[2] = 0;
                iArr[3] = 7;
                return AFInAppEventParameterName(iArr, "\u0001\u0000\u0000\u0000\u0001\u0001\u0000", Process.supportsProcesses()).intern();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v12, types: [char[]] */
        private static String AFInAppEventParameterName(String str) {
            if (!(str == 0)) {
                int i10 = AFLogger$LogLevel + 3;
                AFInAppEventParameterName = i10 % 128;
                int i11 = i10 % 2;
                str = str.toCharArray();
            }
            char[] valueOf2 = C1266bz.valueOf(values, (char[]) str);
            int i12 = 4;
            while (true) {
                if (!(i12 < valueOf2.length)) {
                    break;
                }
                int i13 = AFLogger$LogLevel + 39;
                AFInAppEventParameterName = i13 % 128;
                int i14 = i13 % 2;
                valueOf2[i12] = (char) ((valueOf2[i12] ^ valueOf2[i12 % 4]) ^ ((i12 - 4) * values));
                i12++;
            }
            String str2 = new String(valueOf2, 4, valueOf2.length - 4);
            int i15 = AFInAppEventParameterName + 19;
            AFLogger$LogLevel = i15 % 128;
            if ((i15 % 2 == 0 ? '!' : '7') == '7') {
                return str2;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v21, types: [byte[]] */
        private static String AFInAppEventParameterName(int[] iArr, String str, boolean z10) {
            int i10 = 0;
            if (!(str == 0)) {
                str = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) str;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            char[] cArr = new char[i12];
            System.arraycopy(valueOf, i11, cArr, 0, i12);
            if (bArr != null) {
                char[] cArr2 = new char[i12];
                char c10 = 0;
                for (int i15 = 0; i15 < i12; i15++) {
                    if ((bArr[i15] == 1 ? 'b' : (char) 20) != 20) {
                        cArr2[i15] = (char) (((cArr[i15] << 1) + 1) - c10);
                    } else {
                        cArr2[i15] = (char) ((cArr[i15] << 1) - c10);
                    }
                    c10 = cArr2[i15];
                }
                cArr = cArr2;
            }
            if (i14 > 0) {
                int i16 = AFInAppEventParameterName + 125;
                AFLogger$LogLevel = i16 % 128;
                if (i16 % 2 == 0) {
                    char[] cArr3 = new char[i12];
                    System.arraycopy(cArr, 0, cArr3, 0, i12);
                    System.arraycopy(cArr3, 1, cArr, i12 >>> i14, i14);
                    System.arraycopy(cArr3, i14, cArr, 1, i12 << i14);
                } else {
                    char[] cArr4 = new char[i12];
                    System.arraycopy(cArr, 0, cArr4, 0, i12);
                    int i17 = i12 - i14;
                    System.arraycopy(cArr4, 0, cArr, i17, i14);
                    System.arraycopy(cArr4, i14, cArr, 0, i17);
                }
            }
            if (z10) {
                char[] cArr5 = new char[i12];
                for (int i18 = 0; i18 < i12; i18++) {
                    cArr5[i18] = cArr[(i12 - i18) - 1];
                }
                cArr = cArr5;
            }
            if (i13 > 0) {
                int i19 = AFInAppEventParameterName + 65;
                while (true) {
                    AFLogger$LogLevel = i19 % 128;
                    int i20 = i19 % 2;
                    if (i10 >= i12) {
                        break;
                    }
                    cArr[i10] = (char) (cArr[i10] - iArr[2]);
                    i10++;
                    i19 = AFInAppEventParameterName + 7;
                }
            }
            return new String(cArr);
        }
    }

    private static String AFKeystoreWrapper(String str) {
        int i10 = 1;
        if (!str.contains(values("\udb3b쒕").intern())) {
            int i11 = AFVersionDeclaration + 97;
            getLevel = i11 % 128;
            if (!(i11 % 2 == 0)) {
                return str;
            }
            throw null;
        }
        String[] split = str.split(AFInAppEventParameterName("귫౮ቮ᪺").intern());
        int length = split.length;
        StringBuilder sb2 = new StringBuilder();
        int i12 = length - 1;
        sb2.append(split[i12]);
        sb2.append(values("\udb3b쒕").intern());
        int i13 = AFVersionDeclaration + 79;
        getLevel = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            if ((i10 < i12 ? (char) 31 : '\f') != '\f') {
                int i15 = getLevel + 107;
                AFVersionDeclaration = i15 % 128;
                int i16 = i15 % 2;
                sb2.append(split[i10]);
                sb2.append(values("\udb3b쒕").intern());
                i10++;
            } else {
                sb2.append(split[0]);
                return sb2.toString();
            }
        }
    }

    private static String values(Context context) {
        if ((System.getProperties().containsKey(values("\ue219ﷳ\udbd3립鞅痓卿ㅀས\ued15쬗꣣蛈撬䊬").intern()) ? 'A' : '[') != 'A') {
            return null;
        }
        try {
            Matcher matcher = Pattern.compile(AFInAppEventParameterName("쨩ℏ즼㊈視鹫缡ꭖ㚛泧䕰뫰").intern()).matcher(context.getCacheDir().getPath().replace(AFInAppEventParameterName("ᨎ쭜䶴陊\uf408帬祖軖").intern(), BuildConfig.FLAVOR));
            if ((matcher.find() ? '/' : (char) 19) == 19) {
                return null;
            }
            int i10 = AFVersionDeclaration + 109;
            getLevel = i10 % 128;
            int i11 = i10 % 2;
            String group = matcher.group(1);
            int i12 = getLevel + 117;
            AFVersionDeclaration = i12 % 128;
            int i13 = i12 % 2;
            return group;
        } catch (Exception e10) {
            C1224aj valueOf2 = C1224aj.valueOf();
            String intern = AFInAppEventParameterName("湀\ud841倴連断\u2fec팷惂뤚뫗\uf31d戴\ue9f4猽㪬⎮髼ᐁ").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AFInAppEventParameterName("壐樅\ueda7弙삤烉ӯ븢꜡㙤㕌櫩钴후嫶䌌볃놙倴連ᷤ蓉섎奱걏︠\uf837푤ꍟԅଣ窀\uf31d戴\ue9f4猽㪬⎮髼ᐁ륞㠻").intern());
            sb2.append(e10);
            valueOf2.AFInAppEventType(null, intern, sb2.toString());
            return null;
        }
    }

    private static String values(Context context, String str) {
        try {
            Iterator it = ((List) PackageManager.class.getDeclaredMethod(AFInAppEventParameterName("\uf6b8鿮钴후돘≷蕃昴钸䙡삤烉迏꣪璿\ue58b荤ᑪ䶴陊㪬⎮髼ᐁ쓎\ud849").intern(), Integer.TYPE).invoke(context.getPackageManager(), 0)).iterator();
            int i10 = getLevel + 123;
            AFVersionDeclaration = i10 % 128;
            int i11 = i10 % 2;
            while (it.hasNext()) {
                int i12 = getLevel + 39;
                AFVersionDeclaration = i12 % 128;
                int i13 = i12 % 2;
                if (!(!((PackageItemInfo) ((ApplicationInfo) it.next())).packageName.equals(str))) {
                    int i14 = getLevel + 13;
                    AFVersionDeclaration = i14 % 128;
                    if (!(i14 % 2 != 0)) {
                        return Boolean.TRUE.toString();
                    }
                    Boolean.TRUE.toString();
                    throw null;
                }
            }
        } catch (IllegalAccessException e10) {
            C1224aj valueOf2 = C1224aj.valueOf();
            String intern = AFInAppEventParameterName("꾭孶倴連断\u2fec팷惂偸빁㛓ே삤烉⸳\uf401篛䠭쑅뒕䥦\uf855铺ꢻ㜃ꨍ").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AFInAppEventParameterName("求좌\ueda7弙삤烉ӯ븢寬쇈䃺裒ꠃ\u0a57榐햘㛓ே삤烉⸳\uf401鞾嗉\udbf1㛐钴후嵵䑱ӯ븢\uf837푤ꍟԅଣ窀\uf31d戴\ue9f4猽㪬⎮髼ᐁ륞㠻").intern());
            sb2.append(e10);
            valueOf2.AFInAppEventType(null, intern, sb2.toString());
        } catch (NoSuchMethodException e11) {
            C1224aj valueOf3 = C1224aj.valueOf();
            String intern2 = AFInAppEventParameterName("꾭孶倴連断\u2fec팷惂偸빁㛓ே삤烉⸳\uf401篛䠭쑅뒕䥦\uf855铺ꢻ㜃ꨍ").intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(AFInAppEventParameterName("求좌\ueda7弙삤烉ӯ븢寬쇈䃺裒ꠃ\u0a57榐햘㛓ே삤烉⸳\uf401鞾嗉\udbf1㛐钴후嵵䑱ӯ븢\uf837푤ꍟԅଣ窀\uf31d戴\ue9f4猽㪬⎮髼ᐁ륞㠻").intern());
            sb3.append(e11);
            valueOf3.AFInAppEventType(null, intern2, sb3.toString());
        } catch (InvocationTargetException e12) {
            C1224aj valueOf4 = C1224aj.valueOf();
            String intern3 = AFInAppEventParameterName("꾭孶倴連断\u2fec팷惂偸빁㛓ே삤烉⸳\uf401篛䠭쑅뒕䥦\uf855铺ꢻ㜃ꨍ").intern();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(AFInAppEventParameterName("求좌\ueda7弙삤烉ӯ븢寬쇈䃺裒ꠃ\u0a57榐햘㛓ே삤烉⸳\uf401鞾嗉\udbf1㛐钴후嵵䑱ӯ븢\uf837푤ꍟԅଣ窀\uf31d戴\ue9f4猽㪬⎮髼ᐁ륞㠻").intern());
            sb4.append(e12);
            valueOf4.AFInAppEventType(null, intern3, sb4.toString());
        }
        return Boolean.FALSE.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6, types: [char[]] */
    private static String values(String str) {
        int i10 = 1;
        if (str != 0) {
            int i11 = getLevel + 1;
            AFVersionDeclaration = i11 % 128;
            if ((i11 % 2 != 0 ? (char) 11 : '\n') != '\n') {
                str.toCharArray();
                throw null;
            }
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        char c10 = cArr[0];
        char[] cArr2 = new char[cArr.length - 1];
        while (i10 < cArr.length) {
            int i12 = getLevel + 119;
            AFVersionDeclaration = i12 % 128;
            if ((i12 % 2 != 0 ? '3' : '#') != '3') {
                cArr2[i10 - 1] = (char) ((cArr[i10] ^ (i10 * c10)) ^ values);
                i10++;
            } else {
                cArr2[i10 % 0] = (char) ((cArr[i10] | (i10 * c10)) & values);
                i10 += 27;
            }
        }
        return new String(cArr2);
    }
}
