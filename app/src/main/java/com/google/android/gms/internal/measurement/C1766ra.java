package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ra */
/* loaded from: classes.dex */
final class C1766ra {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m8767a(AbstractC1731p7 abstractC1731p7) {
        StringBuilder sb2 = new StringBuilder(abstractC1731p7.mo8352i());
        for (int i10 = 0; i10 < abstractC1731p7.mo8352i(); i10++) {
            byte mo8350c = abstractC1731p7.mo8350c(i10);
            if (mo8350c == 34) {
                sb2.append("\\\"");
            } else if (mo8350c == 39) {
                sb2.append("\\'");
            } else if (mo8350c != 92) {
                switch (mo8350c) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (mo8350c >= 32 && mo8350c <= 126) {
                            sb2.append((char) mo8350c);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((mo8350c >>> 6) & 3) + 48));
                            sb2.append((char) (((mo8350c >>> 3) & 7) + 48));
                            sb2.append((char) ((mo8350c & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
