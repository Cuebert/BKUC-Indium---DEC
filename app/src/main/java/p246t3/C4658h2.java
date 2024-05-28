package p246t3;

/* renamed from: t3.h2 */
/* loaded from: classes.dex */
final class C4658h2 {
    /* renamed from: a */
    public static String m18768a(AbstractC4626a2 abstractC4626a2) {
        StringBuilder sb2 = new StringBuilder(abstractC4626a2.mo18731i());
        for (int i10 = 0; i10 < abstractC4626a2.mo18731i(); i10++) {
            byte mo18729c = abstractC4626a2.mo18729c(i10);
            if (mo18729c == 34) {
                sb2.append("\\\"");
            } else if (mo18729c == 39) {
                sb2.append("\\'");
            } else if (mo18729c != 92) {
                switch (mo18729c) {
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
                        if (mo18729c >= 32 && mo18729c <= 126) {
                            sb2.append((char) mo18729c);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((mo18729c >>> 6) & 3) + 48));
                            sb2.append((char) (((mo18729c >>> 3) & 7) + 48));
                            sb2.append((char) ((mo18729c & 7) + 48));
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
