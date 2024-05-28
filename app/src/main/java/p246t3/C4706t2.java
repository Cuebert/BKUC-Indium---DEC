package p246t3;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* renamed from: t3.t2 */
/* loaded from: classes.dex */
public final class C4706t2 {
    /* renamed from: a */
    public static final AbstractC4702s2 m18826a(InputStream inputStream, C4714v2 c4714v2) throws C4678m2 {
        try {
            return m18827b(inputStream, c4714v2);
        } finally {
            try {
                c4714v2.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    private static final AbstractC4702s2 m18827b(InputStream inputStream, C4714v2 c4714v2) throws C4678m2 {
        try {
            C4710u2 m18847i = c4714v2.m18847i();
            if (m18847i != null) {
                try {
                    byte m18834a = m18847i.m18834a();
                    byte m18835b = m18847i.m18835b();
                    int i10 = 0;
                    if (m18835b == Byte.MIN_VALUE) {
                        long m18844b = c4714v2.m18844b();
                        if (m18844b <= 1000) {
                            m18828c(m18834a, m18844b, inputStream, c4714v2);
                            AbstractC4702s2[] abstractC4702s2Arr = new AbstractC4702s2[(int) m18844b];
                            while (i10 < m18844b) {
                                abstractC4702s2Arr[i10] = m18827b(inputStream, c4714v2);
                                i10++;
                            }
                            return new C4666j2(AbstractC4624a0.m18717q(abstractC4702s2Arr));
                        }
                        throw new C4678m2("Parser being asked to read a large CBOR array");
                    }
                    if (m18835b != -96) {
                        if (m18835b == -64) {
                            throw new C4678m2("Tags are currently unsupported");
                        }
                        if (m18835b == -32) {
                            return new C4670k2(c4714v2.m18849z());
                        }
                        if (m18835b == 0 || m18835b == 32) {
                            long m18845c = c4714v2.m18845c();
                            m18828c(m18834a, m18845c > 0 ? m18845c : ~m18845c, inputStream, c4714v2);
                            return new C4682n2(m18845c);
                        }
                        if (m18835b == 64) {
                            byte[] m18843O = c4714v2.m18843O();
                            int length = m18843O.length;
                            m18828c(m18834a, length, inputStream, c4714v2);
                            return new C4674l2(AbstractC4626a2.m18728s(m18843O, 0, length));
                        }
                        if (m18835b == 96) {
                            String m18848l = c4714v2.m18848l();
                            m18828c(m18834a, m18848l.length(), inputStream, c4714v2);
                            return new C4694q2(m18848l);
                        }
                        throw new C4678m2("Unidentifiable major type: " + m18847i.m18836c());
                    }
                    long m18846e = c4714v2.m18846e();
                    if (m18846e <= 1000) {
                        m18828c(m18834a, m18846e, inputStream, c4714v2);
                        int i11 = (int) m18846e;
                        C4686o2[] c4686o2Arr = new C4686o2[i11];
                        AbstractC4702s2 abstractC4702s2 = null;
                        int i12 = 0;
                        while (i12 < m18846e) {
                            AbstractC4702s2 m18827b = m18827b(inputStream, c4714v2);
                            if (abstractC4702s2 != null && m18827b.compareTo(abstractC4702s2) <= 0) {
                                throw new C4662i2(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", abstractC4702s2.toString(), m18827b.toString()));
                            }
                            c4686o2Arr[i12] = new C4686o2(m18827b, m18827b(inputStream, c4714v2));
                            i12++;
                            abstractC4702s2 = m18827b;
                        }
                        TreeMap treeMap = new TreeMap();
                        while (i10 < i11) {
                            C4686o2 c4686o2 = c4686o2Arr[i10];
                            if (!treeMap.containsKey(c4686o2.m18797a())) {
                                treeMap.put(c4686o2.m18797a(), c4686o2.m18798b());
                                i10++;
                            } else {
                                throw new C4662i2("Attempted to add duplicate key to canonical CBOR Map.");
                            }
                        }
                        return new C4690p2(C4660i0.m18770e(treeMap));
                    }
                    throw new C4678m2("Parser being asked to read a large CBOR map");
                } catch (IOException | RuntimeException e10) {
                    throw new C4678m2("Error in decoding CborValue from bytes", e10);
                }
            }
            throw new C4678m2("Parser being asked to parse an empty input stream");
        } catch (IOException e11) {
            throw new C4678m2("Error in decoding CborValue from bytes", e11);
        }
    }

    /* renamed from: c */
    private static final void m18828c(byte b10, long j10, InputStream inputStream, C4714v2 c4714v2) throws IOException {
        switch (b10) {
            case 24:
                if (j10 >= 24) {
                    return;
                }
                throw new C4662i2("Integer value " + j10 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j10 >= 256) {
                    return;
                }
                throw new C4662i2("Integer value " + j10 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j10 >= 65536) {
                    return;
                }
                throw new C4662i2("Integer value " + j10 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j10 >= 4294967296L) {
                    return;
                }
                throw new C4662i2("Integer value " + j10 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
