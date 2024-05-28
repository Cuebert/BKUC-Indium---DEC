package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.g3 */
/* loaded from: classes.dex */
final class C1945g3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m9352a(AbstractC1914c0 abstractC1914c0) {
        StringBuilder sb2 = new StringBuilder(abstractC1914c0.mo9271i());
        for (int i10 = 0; i10 < abstractC1914c0.mo9271i(); i10++) {
            byte mo9269c = abstractC1914c0.mo9269c(i10);
            if (mo9269c == 34) {
                sb2.append("\\\"");
            } else if (mo9269c == 39) {
                sb2.append("\\'");
            } else if (mo9269c != 92) {
                switch (mo9269c) {
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
                        if (mo9269c >= 32 && mo9269c <= 126) {
                            sb2.append((char) mo9269c);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((mo9269c >>> 6) & 3) + 48));
                            sb2.append((char) (((mo9269c >>> 3) & 7) + 48));
                            sb2.append((char) ((mo9269c & 7) + 48));
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
