package p268v0;

import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p243t0.AbstractC4596e;
import p243t0.C4595d;
import p256u0.AbstractC4786e;
import p256u0.C4778a;
import p256u0.C4779a0;
import p256u0.C4780b;
import p256u0.C4781b0;
import p256u0.C4782c;
import p256u0.C4783c0;
import p256u0.C4784d;
import p256u0.C4785d0;
import p256u0.C4787f;
import p256u0.C4788g;
import p256u0.C4789h;
import p256u0.C4790i;
import p256u0.C4791j;
import p256u0.C4792k;
import p256u0.C4793l;
import p256u0.C4794m;
import p256u0.C4795n;
import p256u0.C4796o;
import p256u0.C4797p;
import p256u0.C4798q;
import p256u0.C4799r;
import p256u0.C4800s;
import p256u0.C4801t;
import p256u0.C4802u;
import p256u0.C4803v;
import p256u0.C4804w;
import p256u0.C4805x;
import p256u0.C4806y;
import p256u0.C4807z;
import p268v0.C4935c;
import p280w0.C5099a;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public final class C4933a extends C4934b {

    /* renamed from: s */
    public static final a f18981s = new a(null);

    /* renamed from: r */
    private final AbstractC4786e f18982r;

    /* renamed from: v0.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final AbstractC4596e m19355a(String type, String str) {
            Object m19359b;
            C3844i.m16253f(type, "type");
            try {
                C4935c.a aVar = C4935c.f18985a;
                C4933a c4933a = new C4933a(new C4781b0(), null, 2, null);
                if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    m19359b = aVar.m19359b(new C4778a(), str, c4933a);
                } else {
                    if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                        m19359b = aVar.m19359b(new C4780b(), str, c4933a);
                    } else {
                        if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                            m19359b = aVar.m19359b(new C4782c(), str, c4933a);
                        } else {
                            if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                                m19359b = aVar.m19359b(new C4784d(), str, c4933a);
                            } else {
                                if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                                    m19359b = aVar.m19359b(new C4787f(), str, c4933a);
                                } else {
                                    if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                                        m19359b = aVar.m19359b(new C4788g(), str, c4933a);
                                    } else {
                                        if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                                            m19359b = aVar.m19359b(new C4789h(), str, c4933a);
                                        } else {
                                            if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                                                m19359b = aVar.m19359b(new C4790i(), str, c4933a);
                                            } else {
                                                if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                                                    m19359b = aVar.m19359b(new C4791j(), str, c4933a);
                                                } else {
                                                    if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                                                        m19359b = aVar.m19359b(new C4792k(), str, c4933a);
                                                    } else {
                                                        if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                                                            m19359b = aVar.m19359b(new C4793l(), str, c4933a);
                                                        } else {
                                                            if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                                                                m19359b = aVar.m19359b(new C4794m(), str, c4933a);
                                                            } else {
                                                                if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                                                                    m19359b = aVar.m19359b(new C4795n(), str, c4933a);
                                                                } else {
                                                                    if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                                                                        m19359b = aVar.m19359b(new C4796o(), str, c4933a);
                                                                    } else {
                                                                        if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                                                                            m19359b = aVar.m19359b(new C4797p(), str, c4933a);
                                                                        } else {
                                                                            if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                                                                                m19359b = aVar.m19359b(new C4798q(), str, c4933a);
                                                                            } else {
                                                                                if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                                                                                    m19359b = aVar.m19359b(new C4799r(), str, c4933a);
                                                                                } else {
                                                                                    if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                                                                                        m19359b = aVar.m19359b(new C4800s(), str, c4933a);
                                                                                    } else {
                                                                                        if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                                                                                            m19359b = aVar.m19359b(new C4801t(), str, c4933a);
                                                                                        } else {
                                                                                            if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                                                                                                m19359b = aVar.m19359b(new C4802u(), str, c4933a);
                                                                                            } else {
                                                                                                if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                                                                                                    m19359b = aVar.m19359b(new C4803v(), str, c4933a);
                                                                                                } else {
                                                                                                    if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                                                                                                        m19359b = aVar.m19359b(new C4804w(), str, c4933a);
                                                                                                    } else {
                                                                                                        if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                                                                                                            m19359b = aVar.m19359b(new C4805x(), str, c4933a);
                                                                                                        } else {
                                                                                                            if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                                                                                                                m19359b = aVar.m19359b(new C4806y(), str, c4933a);
                                                                                                            } else {
                                                                                                                if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                                                                                                                    m19359b = aVar.m19359b(new C4807z(), str, c4933a);
                                                                                                                } else {
                                                                                                                    if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                                                                                                                        m19359b = aVar.m19359b(new C4779a0(), str, c4933a);
                                                                                                                    } else {
                                                                                                                        if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                                                                                                                            m19359b = aVar.m19359b(new C4781b0(), str, c4933a);
                                                                                                                        } else {
                                                                                                                            if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                                                                                                                                m19359b = aVar.m19359b(new C4783c0(), str, c4933a);
                                                                                                                            } else {
                                                                                                                                if (C3844i.m16248a(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                                                                                                                                    m19359b = aVar.m19359b(new C4785d0(), str, c4933a);
                                                                                                                                } else {
                                                                                                                                    throw new C5099a();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return (AbstractC4596e) m19359b;
            } catch (C5099a unused) {
                return new C4595d(type, str);
            }
        }
    }

    public /* synthetic */ C4933a(AbstractC4786e abstractC4786e, CharSequence charSequence, int i10, C3840e c3840e) {
        this(abstractC4786e, (i10 & 2) != 0 ? null : charSequence);
    }

    /* renamed from: b */
    public final AbstractC4786e m19354b() {
        return this.f18982r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4933a(AbstractC4786e domError, CharSequence charSequence) {
        super("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + domError.m18966a(), charSequence);
        C3844i.m16253f(domError, "domError");
        this.f18982r = domError;
    }
}
