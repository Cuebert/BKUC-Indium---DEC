package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.a */
/* loaded from: classes.dex */
public class C1214a {
    private static int AppsFlyerConversionListener = 0;
    public static final int AppsFlyerInAppPurchaseValidatorListener = 0;
    public static final byte[] AppsFlyerLib = null;
    private static int getSdkVersion = 1;
    public static byte[] onAppOpenAttribution;
    private static Object onAttributionFailure;
    public static byte[] onConversionDataFail;
    private static Object onDeepLinking;
    private static int onValidateInApp;
    private static int onValidateInAppFailure;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        r0 = (r0 + 26) - 1;
        com.appsflyer.internal.C1214a.onValidateInApp = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        if ((r0 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r12 == true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        r12 = r1;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        r6 = -r6;
        r1 = (r1 | r6) + (r1 & r6);
        r6 = r0 + 1;
        r1 = r12;
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r5 = r5 + 1;
        r11[r5] = (byte) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r5 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r9 = r1;
        r1 = r12;
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        r6 = -r13[r6];
        r1 = (r1 | r6) + (r1 & r6);
        r6 = r10 + 1;
        r1 = r9;
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        r12 = new java.lang.String(r11, 0);
        r11 = com.appsflyer.internal.C1214a.onValidateInApp;
        r13 = (r11 & 49) + (r11 | 49);
        com.appsflyer.internal.C1214a.getSdkVersion = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if ((r13 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        r13 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r13 != 'R') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r13 = 'R';
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0062, code lost:
    
        if (r8 != '\f') goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if ((r13 == null ? '/' : 'L') != 'L') goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r11, short r12, byte r13) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1214a.$$c(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:(39:13|(2:1040|1041)|(37:1036|1037|(37:18|19|(1:21)(1:1033)|22|(1:24)(1:1031)|25|(31:27|28|29|30|(3:(1:33)(1:49)|34|(4:36|37|38|39)(1:48))|(1:51)(6:1010|1011|1012|1013|1014|1015)|52|(2:(1:55)(1:68)|(4:57|58|59|60))|69|70|71|72|73|74|75|76|(1:78)(1:1002)|79|(1:81)(1:1001)|82|(1:84)(1:1000)|85|(1:87)(1:999)|88|(1:90)(1:998)|91|(1:93)(1:997)|94|95|(3:99|(18:104|105|106|(10:(1:109)(1:987)|110|(9:112|113|114|115|116|117|118|119|120)(1:986)|956|957|958|959|960|961|963)(1:988)|(14:770|771|772|773|774|775|776|777|778|779|780|781|(3:(1:783)(1:938)|784|(1:936)(17:(1:787)(1:935)|788|(1:(1:791)(1:(1:932)(1:933)))(1:934)|792|793|794|795|796|(4:(1:799)(1:815)|800|(6:802|803|804|(1:806)(1:810)|807|808)(2:813|814)|809)|816|817|818|819|(1:821)(1:923)|822|(6:824|825|826|827|828|829)(6:838|(1:840)(1:922)|841|(3:(1:844)(1:910)|845|(6:847|848|849|850|828|829)(12:858|859|860|861|862|863|864|865|866|867|868|869))(4:911|912|913|914)|870|871)|830))|937)(1:123)|124|125|126|127|128|129|130|131|132|133|134|135|(18:136|137|138|139|140|141|(5:143|144|145|146|147)(16:703|704|705|706|707|708|709|710|711|712|713|714|715|716|717|718)|148|149|150|151|(1:153)(1:690)|154|(43:534|535|536|537|538|539|540|541|542|543|544|(7:545|546|547|548|549|550|(6:552|553|554|555|(1:557)(1:661)|(4:559|560|561|562)(1:570))(1:662))|571|572|573|574|575|576|577|578|579|580|581|582|583|584|585|586|587|588|589|590|591|592|593|594|(1:596)|597|598|599|(1:601)(1:605)|(1:603)|604)(63:156|157|158|(1:160)(1:529)|(1:162)(1:528)|(1:164)(1:527)|165|166|167|168|169|170|171|172|173|(3:(1:175)(1:497)|176|(2:495|496)(8:178|179|180|181|182|(1:184)(1:487)|185|(4:187|188|189|190)(0)))|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|(1:271)(1:425)|272|(5:274|275|276|277|278)|314)|(1:316)(1:424)|317|(12:319|320|321|322|323|324|325|326|327|328|329|(5:331|332|333|334|335))(9:402|403|404|405|406|407|408|409|410)|(17:337|338|(1:340)(1:377)|341|342|343|344|345|346|347|348|349|350|351|352|353|354)(6:382|383|(1:385)(1:389)|386|387|388)))(2:101|102)|103)|993)|1030|30|(0)|(0)(0)|52|(0)|69|70|71|72|73|74|75|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|95|(4:97|99|(0)(0)|103)|994|995)|1035|(0)(0)|25|(0)|1030|30|(0)|(0)(0)|52|(0)|69|70|71|72|73|74|75|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|95|(0)|994|995)|16|(0)|1035|(0)(0)|25|(0)|1030|30|(0)|(0)(0)|52|(0)|69|70|71|72|73|74|75|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|95|(0)|994|995)|70|71|72|73|74|75|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|95|(0)|994|995) */
    /* JADX WARN: Can't wrap try/catch for region: R(49:2|3|(1:5)(1:1055)|6|(1:8)(1:1054)|9|10|11|(39:13|(2:1040|1041)|(37:1036|1037|(37:18|19|(1:21)(1:1033)|22|(1:24)(1:1031)|25|(31:27|28|29|30|(3:(1:33)(1:49)|34|(4:36|37|38|39)(1:48))|(1:51)(6:1010|1011|1012|1013|1014|1015)|52|(2:(1:55)(1:68)|(4:57|58|59|60))|69|70|71|72|73|74|75|76|(1:78)(1:1002)|79|(1:81)(1:1001)|82|(1:84)(1:1000)|85|(1:87)(1:999)|88|(1:90)(1:998)|91|(1:93)(1:997)|94|95|(3:99|(18:104|105|106|(10:(1:109)(1:987)|110|(9:112|113|114|115|116|117|118|119|120)(1:986)|956|957|958|959|960|961|963)(1:988)|(14:770|771|772|773|774|775|776|777|778|779|780|781|(3:(1:783)(1:938)|784|(1:936)(17:(1:787)(1:935)|788|(1:(1:791)(1:(1:932)(1:933)))(1:934)|792|793|794|795|796|(4:(1:799)(1:815)|800|(6:802|803|804|(1:806)(1:810)|807|808)(2:813|814)|809)|816|817|818|819|(1:821)(1:923)|822|(6:824|825|826|827|828|829)(6:838|(1:840)(1:922)|841|(3:(1:844)(1:910)|845|(6:847|848|849|850|828|829)(12:858|859|860|861|862|863|864|865|866|867|868|869))(4:911|912|913|914)|870|871)|830))|937)(1:123)|124|125|126|127|128|129|130|131|132|133|134|135|(18:136|137|138|139|140|141|(5:143|144|145|146|147)(16:703|704|705|706|707|708|709|710|711|712|713|714|715|716|717|718)|148|149|150|151|(1:153)(1:690)|154|(43:534|535|536|537|538|539|540|541|542|543|544|(7:545|546|547|548|549|550|(6:552|553|554|555|(1:557)(1:661)|(4:559|560|561|562)(1:570))(1:662))|571|572|573|574|575|576|577|578|579|580|581|582|583|584|585|586|587|588|589|590|591|592|593|594|(1:596)|597|598|599|(1:601)(1:605)|(1:603)|604)(63:156|157|158|(1:160)(1:529)|(1:162)(1:528)|(1:164)(1:527)|165|166|167|168|169|170|171|172|173|(3:(1:175)(1:497)|176|(2:495|496)(8:178|179|180|181|182|(1:184)(1:487)|185|(4:187|188|189|190)(0)))|227|228|229|230|231|232|233|234|235|236|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|(1:271)(1:425)|272|(5:274|275|276|277|278)|314)|(1:316)(1:424)|317|(12:319|320|321|322|323|324|325|326|327|328|329|(5:331|332|333|334|335))(9:402|403|404|405|406|407|408|409|410)|(17:337|338|(1:340)(1:377)|341|342|343|344|345|346|347|348|349|350|351|352|353|354)(6:382|383|(1:385)(1:389)|386|387|388)))(2:101|102)|103)|993)|1030|30|(0)|(0)(0)|52|(0)|69|70|71|72|73|74|75|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|95|(4:97|99|(0)(0)|103)|994|995)|1035|(0)(0)|25|(0)|1030|30|(0)|(0)(0)|52|(0)|69|70|71|72|73|74|75|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|95|(0)|994|995)|16|(0)|1035|(0)(0)|25|(0)|1030|30|(0)|(0)(0)|52|(0)|69|70|71|72|73|74|75|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|95|(0)|994|995)|1047|1048|1049|(0)|16|(0)|1035|(0)(0)|25|(0)|1030|30|(0)|(0)(0)|52|(0)|69|70|71|72|73|74|75|76|(0)(0)|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|95|(0)|994|995) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x043f, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r14, r7[17], r7[60])).getMethod($$c((short) 185, r7[40], r7[62]), null).invoke(r15, null)).booleanValue() != false) goto L167;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1000:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:1001:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:1010:0x01c7 A[Catch: Exception -> 0x18f2, TRY_LEAVE, TryCatch #5 {Exception -> 0x18f2, blocks: (B:3:0x0014, B:36:0x0175, B:43:0x01bb, B:45:0x01c1, B:47:0x01c2, B:57:0x0236, B:64:0x0286, B:66:0x028c, B:67:0x028d, B:73:0x02d1, B:76:0x0360, B:79:0x0393, B:85:0x03a9, B:88:0x03b2, B:91:0x03bb, B:94:0x03c7, B:99:0x03e0, B:291:0x1829, B:297:0x1835, B:103:0x18b6, B:300:0x1842, B:308:0x188e, B:310:0x1894, B:311:0x1895, B:293:0x182f, B:1006:0x18d5, B:1008:0x18dc, B:1009:0x18dd, B:1010:0x01c7, B:1018:0x18df, B:1020:0x18e6, B:1021:0x18e7, B:1024:0x18e9, B:1026:0x18f0, B:1027:0x18f1, B:1054:0x0032, B:60:0x024d, B:303:0x1858, B:304:0x188b, B:39:0x0196, B:71:0x029e, B:1015:0x020a, B:1013:0x01d5), top: B:2:0x0014, inners: #42, #46, #61, #78, #82, #89 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x1896  */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:1036:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1829 A[Catch: Exception -> 0x18f2, TRY_ENTER, TryCatch #5 {Exception -> 0x18f2, blocks: (B:3:0x0014, B:36:0x0175, B:43:0x01bb, B:45:0x01c1, B:47:0x01c2, B:57:0x0236, B:64:0x0286, B:66:0x028c, B:67:0x028d, B:73:0x02d1, B:76:0x0360, B:79:0x0393, B:85:0x03a9, B:88:0x03b2, B:91:0x03bb, B:94:0x03c7, B:99:0x03e0, B:291:0x1829, B:297:0x1835, B:103:0x18b6, B:300:0x1842, B:308:0x188e, B:310:0x1894, B:311:0x1895, B:293:0x182f, B:1006:0x18d5, B:1008:0x18dc, B:1009:0x18dd, B:1010:0x01c7, B:1018:0x18df, B:1020:0x18e6, B:1021:0x18e7, B:1024:0x18e9, B:1026:0x18f0, B:1027:0x18f1, B:1054:0x0032, B:60:0x024d, B:303:0x1858, B:304:0x188b, B:39:0x0196, B:71:0x029e, B:1015:0x020a, B:1013:0x01d5), top: B:2:0x0014, inners: #42, #46, #61, #78, #82, #89 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1835 A[Catch: Exception -> 0x18f2, TryCatch #5 {Exception -> 0x18f2, blocks: (B:3:0x0014, B:36:0x0175, B:43:0x01bb, B:45:0x01c1, B:47:0x01c2, B:57:0x0236, B:64:0x0286, B:66:0x028c, B:67:0x028d, B:73:0x02d1, B:76:0x0360, B:79:0x0393, B:85:0x03a9, B:88:0x03b2, B:91:0x03bb, B:94:0x03c7, B:99:0x03e0, B:291:0x1829, B:297:0x1835, B:103:0x18b6, B:300:0x1842, B:308:0x188e, B:310:0x1894, B:311:0x1895, B:293:0x182f, B:1006:0x18d5, B:1008:0x18dc, B:1009:0x18dd, B:1010:0x01c7, B:1018:0x18df, B:1020:0x18e6, B:1021:0x18e7, B:1024:0x18e9, B:1026:0x18f0, B:1027:0x18f1, B:1054:0x0032, B:60:0x024d, B:303:0x1858, B:304:0x188b, B:39:0x0196, B:71:0x029e, B:1015:0x020a, B:1013:0x01d5), top: B:2:0x0014, inners: #42, #46, #61, #78, #82, #89 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1842 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x1832 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:978:0x0453 A[Catch: all -> 0x04d0, TryCatch #76 {all -> 0x04d0, blocks: (B:957:0x0459, B:966:0x04c8, B:968:0x04ce, B:969:0x04cf, B:976:0x044d, B:978:0x0453, B:979:0x0454, B:960:0x049a, B:961:0x04c5), top: B:956:0x0459, inners: #74 }] */
    /* JADX WARN: Removed duplicated region for block: B:979:0x0454 A[Catch: all -> 0x04d0, TryCatch #76 {all -> 0x04d0, blocks: (B:957:0x0459, B:966:0x04c8, B:968:0x04ce, B:969:0x04cf, B:976:0x044d, B:978:0x0453, B:979:0x0454, B:960:0x049a, B:961:0x04c5), top: B:956:0x0459, inners: #74 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:997:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:998:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:999:0x03b1  */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v132 */
    /* JADX WARN: Type inference failed for: r12v133 */
    /* JADX WARN: Type inference failed for: r12v134 */
    /* JADX WARN: Type inference failed for: r12v136 */
    /* JADX WARN: Type inference failed for: r12v137 */
    /* JADX WARN: Type inference failed for: r12v139 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v140 */
    /* JADX WARN: Type inference failed for: r12v141 */
    /* JADX WARN: Type inference failed for: r12v142 */
    /* JADX WARN: Type inference failed for: r12v143 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v38, types: [byte] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r12v95 */
    /* JADX WARN: Type inference failed for: r12v96 */
    /* JADX WARN: Type inference failed for: r12v97, types: [short] */
    /* JADX WARN: Type inference failed for: r12v99, types: [short] */
    /* JADX WARN: Type inference failed for: r3v152, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v186, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        /*
            Method dump skipped, instructions count: 6394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1214a.<clinit>():void");
    }

    private C1214a() {
    }

    public static int AFInAppEventType(Object obj) {
        int i10 = onValidateInApp;
        int i11 = (i10 ^ 35) + ((i10 & 35) << 1);
        getSdkVersion = i11 % 128;
        int i12 = i11 % 2;
        Object obj2 = onDeepLinking;
        int i13 = i10 + 21;
        getSdkVersion = i13 % 128;
        int i14 = i13 % 2;
        try {
            byte[] bArr = AppsFlyerLib;
            int intValue = ((Integer) Class.forName($$c((short) 938, bArr[40], bArr[450]), true, (ClassLoader) onAttributionFailure).getMethod($$c((short) 400, bArr[15], bArr[92]), Object.class).invoke(obj2, obj)).intValue();
            int i15 = onValidateInApp;
            int i16 = (i15 & 87) + (i15 | 87);
            getSdkVersion = i16 % 128;
            if ((i16 % 2 == 0 ? (char) 6 : 'E') != 6) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFKeystoreWrapper(int i10) {
        int i11 = onValidateInApp + 7;
        int i12 = i11 % 128;
        getSdkVersion = i12;
        int i13 = i11 % 2;
        Object obj = onDeepLinking;
        int i14 = (i12 + 48) - 1;
        int i15 = i14 % 128;
        onValidateInApp = i15;
        int i16 = i14 % 2;
        int i17 = (i15 ^ 109) + ((i15 & 109) << 1);
        getSdkVersion = i17 % 128;
        int i18 = i17 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            byte[] bArr = AppsFlyerLib;
            return ((Integer) Class.forName($$c((short) 938, bArr[40], bArr[450]), true, (ClassLoader) onAttributionFailure).getMethod($$c((short) 400, bArr[15], bArr[92]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AFKeystoreWrapper(int i10, int i11, char c10) {
        int i12 = getSdkVersion;
        int i13 = (i12 ^ 99) + ((i12 & 99) << 1);
        int i14 = i13 % 128;
        onValidateInApp = i14;
        int i15 = i13 % 2;
        Object obj = onDeepLinking;
        int i16 = i14 + 33;
        int i17 = i16 % 128;
        getSdkVersion = i17;
        int i18 = i16 % 2;
        int i19 = (i17 + 50) - 1;
        onValidateInApp = i19 % 128;
        int i20 = i19 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(c10)};
            byte[] bArr = AppsFlyerLib;
            Class<?> cls = Class.forName($$c((short) 938, bArr[40], bArr[450]), true, (ClassLoader) onAttributionFailure);
            String $$c = $$c((short) 214, bArr[15], bArr[66]);
            Class<?> cls2 = Integer.TYPE;
            return cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i10 = (onValidateInApp + 2) - 1;
        getSdkVersion = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = new byte[986];
        System.arraycopy("]ó\u008et\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>ÉA\u0000\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056¿üEÞÞ\u0003\fþò\u0000\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000óô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ÊA\u0000\u0002ñ.Ýý\u0007ò/Û÷û\nÿí)é\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ý\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000bú\u000b\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018ø\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ/Í\u0004\u000fó\u0004\rõ\u0019ß\u0005ý\u0011ú\u0002!Û÷\r\u0002ï\u0005ýùÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Í5\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßí\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ôó\nò\u0003\u0006\u00056¿üEé×ø\r÷\u0003\u0001\u0001\b÷ú\u0015õ÷\u0010òô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î=®\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûú\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Î4\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001ó\nò\u0003\u0006\u00056º\u000fí\u0004FÚïí\u0004\u001fá\u000býù\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô%ë\u0005ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, 986);
        AppsFlyerLib = bArr;
        AppsFlyerInAppPurchaseValidatorListener = 3;
        int i12 = onValidateInApp + 91;
        getSdkVersion = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }
}
