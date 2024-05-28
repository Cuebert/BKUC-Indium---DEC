.class public Lob/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lob/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lob/d0$b;
    }
.end annotation


# static fields
.field static final P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/e0;",
            ">;"
        }
    .end annotation
.end field

.field static final Q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/n;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final A:Lyb/c;

.field final B:Ljavax/net/ssl/HostnameVerifier;

.field final C:Lob/i;

.field final D:Lob/d;

.field final E:Lob/d;

.field final F:Lob/m;

.field final G:Lob/t;

.field final H:Z

.field final I:Z

.field final J:Z

.field final K:I

.field final L:I

.field final M:I

.field final N:I

.field final O:I

.field final n:Lob/q;

.field final o:Ljava/net/Proxy;

.field final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/e0;",
            ">;"
        }
    .end annotation
.end field

.field final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/n;",
            ">;"
        }
    .end annotation
.end field

.field final r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/a0;",
            ">;"
        }
    .end annotation
.end field

.field final s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/a0;",
            ">;"
        }
    .end annotation
.end field

.field final t:Lob/v$b;

.field final u:Ljava/net/ProxySelector;

.field final v:Lob/p;

.field final w:Lob/e;

.field final x:Lqb/f;

.field final y:Ljavax/net/SocketFactory;

.field final z:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Lob/e0;

    .line 1
    sget-object v2, Lob/e0;->r:Lob/e0;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lob/e0;->p:Lob/e0;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lpb/e;->u([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lob/d0;->P:Ljava/util/List;

    new-array v0, v0, [Lob/n;

    .line 2
    sget-object v1, Lob/n;->h:Lob/n;

    aput-object v1, v0, v3

    sget-object v1, Lob/n;->j:Lob/n;

    aput-object v1, v0, v4

    invoke-static {v0}, Lpb/e;->u([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lob/d0;->Q:Ljava/util/List;

    .line 3
    new-instance v0, Lob/d0$a;

    invoke-direct {v0}, Lob/d0$a;-><init>()V

    sput-object v0, Lpb/a;->a:Lpb/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lob/d0$b;

    invoke-direct {v0}, Lob/d0$b;-><init>()V

    invoke-direct {p0, v0}, Lob/d0;-><init>(Lob/d0$b;)V

    return-void
.end method

.method constructor <init>(Lob/d0$b;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Lob/d0$b;->a:Lob/q;

    iput-object v0, p0, Lob/d0;->n:Lob/q;

    .line 4
    iget-object v0, p1, Lob/d0$b;->b:Ljava/net/Proxy;

    iput-object v0, p0, Lob/d0;->o:Ljava/net/Proxy;

    .line 5
    iget-object v0, p1, Lob/d0$b;->c:Ljava/util/List;

    iput-object v0, p0, Lob/d0;->p:Ljava/util/List;

    .line 6
    iget-object v0, p1, Lob/d0$b;->d:Ljava/util/List;

    iput-object v0, p0, Lob/d0;->q:Ljava/util/List;

    .line 7
    iget-object v1, p1, Lob/d0$b;->e:Ljava/util/List;

    invoke-static {v1}, Lpb/e;->t(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lob/d0;->r:Ljava/util/List;

    .line 8
    iget-object v1, p1, Lob/d0$b;->f:Ljava/util/List;

    invoke-static {v1}, Lpb/e;->t(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lob/d0;->s:Ljava/util/List;

    .line 9
    iget-object v1, p1, Lob/d0$b;->g:Lob/v$b;

    iput-object v1, p0, Lob/d0;->t:Lob/v$b;

    .line 10
    iget-object v1, p1, Lob/d0$b;->h:Ljava/net/ProxySelector;

    iput-object v1, p0, Lob/d0;->u:Ljava/net/ProxySelector;

    .line 11
    iget-object v1, p1, Lob/d0$b;->i:Lob/p;

    iput-object v1, p0, Lob/d0;->v:Lob/p;

    .line 12
    iget-object v1, p1, Lob/d0$b;->j:Lob/e;

    iput-object v1, p0, Lob/d0;->w:Lob/e;

    .line 13
    iget-object v1, p1, Lob/d0$b;->k:Lqb/f;

    iput-object v1, p0, Lob/d0;->x:Lqb/f;

    .line 14
    iget-object v1, p1, Lob/d0$b;->l:Ljavax/net/SocketFactory;

    iput-object v1, p0, Lob/d0;->y:Ljavax/net/SocketFactory;

    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lob/n;

    if-nez v2, :cond_1

    .line 16
    invoke-virtual {v3}, Lob/n;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    .line 17
    :cond_2
    iget-object v0, p1, Lob/d0$b;->m:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_4

    if-nez v2, :cond_3

    goto :goto_1

    .line 18
    :cond_3
    invoke-static {}, Lpb/e;->D()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    .line 19
    invoke-static {v0}, Lob/d0;->x(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, p0, Lob/d0;->z:Ljavax/net/ssl/SSLSocketFactory;

    .line 20
    invoke-static {v0}, Lyb/c;->b(Ljavax/net/ssl/X509TrustManager;)Lyb/c;

    move-result-object v0

    iput-object v0, p0, Lob/d0;->A:Lyb/c;

    goto :goto_2

    .line 21
    :cond_4
    :goto_1
    iput-object v0, p0, Lob/d0;->z:Ljavax/net/ssl/SSLSocketFactory;

    .line 22
    iget-object v0, p1, Lob/d0$b;->n:Lyb/c;

    iput-object v0, p0, Lob/d0;->A:Lyb/c;

    .line 23
    :goto_2
    iget-object v0, p0, Lob/d0;->z:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_5

    .line 24
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v0

    iget-object v1, p0, Lob/d0;->z:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, v1}, Lwb/f;->f(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 25
    :cond_5
    iget-object v0, p1, Lob/d0$b;->o:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Lob/d0;->B:Ljavax/net/ssl/HostnameVerifier;

    .line 26
    iget-object v0, p1, Lob/d0$b;->p:Lob/i;

    iget-object v1, p0, Lob/d0;->A:Lyb/c;

    invoke-virtual {v0, v1}, Lob/i;->f(Lyb/c;)Lob/i;

    move-result-object v0

    iput-object v0, p0, Lob/d0;->C:Lob/i;

    .line 27
    iget-object v0, p1, Lob/d0$b;->q:Lob/d;

    iput-object v0, p0, Lob/d0;->D:Lob/d;

    .line 28
    iget-object v0, p1, Lob/d0$b;->r:Lob/d;

    iput-object v0, p0, Lob/d0;->E:Lob/d;

    .line 29
    iget-object v0, p1, Lob/d0$b;->s:Lob/m;

    iput-object v0, p0, Lob/d0;->F:Lob/m;

    .line 30
    iget-object v0, p1, Lob/d0$b;->t:Lob/t;

    iput-object v0, p0, Lob/d0;->G:Lob/t;

    .line 31
    iget-boolean v0, p1, Lob/d0$b;->u:Z

    iput-boolean v0, p0, Lob/d0;->H:Z

    .line 32
    iget-boolean v0, p1, Lob/d0$b;->v:Z

    iput-boolean v0, p0, Lob/d0;->I:Z

    .line 33
    iget-boolean v0, p1, Lob/d0$b;->w:Z

    iput-boolean v0, p0, Lob/d0;->J:Z

    .line 34
    iget v0, p1, Lob/d0$b;->x:I

    iput v0, p0, Lob/d0;->K:I

    .line 35
    iget v0, p1, Lob/d0$b;->y:I

    iput v0, p0, Lob/d0;->L:I

    .line 36
    iget v0, p1, Lob/d0$b;->z:I

    iput v0, p0, Lob/d0;->M:I

    .line 37
    iget v0, p1, Lob/d0$b;->A:I

    iput v0, p0, Lob/d0;->N:I

    .line 38
    iget p1, p1, Lob/d0$b;->B:I

    iput p1, p0, Lob/d0;->O:I

    .line 39
    iget-object p1, p0, Lob/d0;->r:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 40
    iget-object p1, p0, Lob/d0;->s:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    .line 41
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null network interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/d0;->s:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 42
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/d0;->r:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static x(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v0

    invoke-virtual {v0}, Lwb/f;->n()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    .line 2
    invoke-virtual {v0, p0, v1, p0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 4
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "No System TLS"

    invoke-direct {v0, v1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lob/e0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lob/d0;->p:Ljava/util/List;

    return-object v0
.end method

.method public B()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lob/d0;->o:Ljava/net/Proxy;

    return-object v0
.end method

.method public C()Lob/d;
    .locals 1

    iget-object v0, p0, Lob/d0;->D:Lob/d;

    return-object v0
.end method

.method public D()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Lob/d0;->u:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public E()I
    .locals 1

    iget v0, p0, Lob/d0;->M:I

    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Lob/d0;->J:Z

    return v0
.end method

.method public G()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Lob/d0;->y:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public H()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lob/d0;->z:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public I()I
    .locals 1

    iget v0, p0, Lob/d0;->N:I

    return v0
.end method

.method public a(Lob/g0;)Lob/g;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lob/f0;->g(Lob/d0;Lob/g0;Z)Lob/f0;

    move-result-object p1

    return-object p1
.end method

.method public d()Lob/d;
    .locals 1

    iget-object v0, p0, Lob/d0;->E:Lob/d;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lob/d0;->K:I

    return v0
.end method

.method public g()Lob/i;
    .locals 1

    iget-object v0, p0, Lob/d0;->C:Lob/i;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lob/d0;->L:I

    return v0
.end method

.method public j()Lob/m;
    .locals 1

    iget-object v0, p0, Lob/d0;->F:Lob/m;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lob/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lob/d0;->q:Ljava/util/List;

    return-object v0
.end method

.method public m()Lob/p;
    .locals 1

    iget-object v0, p0, Lob/d0;->v:Lob/p;

    return-object v0
.end method

.method public n()Lob/q;
    .locals 1

    iget-object v0, p0, Lob/d0;->n:Lob/q;

    return-object v0
.end method

.method public o()Lob/t;
    .locals 1

    iget-object v0, p0, Lob/d0;->G:Lob/t;

    return-object v0
.end method

.method public p()Lob/v$b;
    .locals 1

    iget-object v0, p0, Lob/d0;->t:Lob/v$b;

    return-object v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lob/d0;->I:Z

    return v0
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lob/d0;->H:Z

    return v0
.end method

.method public s()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lob/d0;->B:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public t()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lob/a0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lob/d0;->r:Ljava/util/List;

    return-object v0
.end method

.method u()Lqb/f;
    .locals 1

    iget-object v0, p0, Lob/d0;->w:Lob/e;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lob/e;->n:Lqb/f;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lob/d0;->x:Lqb/f;

    :goto_0
    return-object v0
.end method

.method public v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lob/a0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lob/d0;->s:Ljava/util/List;

    return-object v0
.end method

.method public w()Lob/d0$b;
    .locals 1

    new-instance v0, Lob/d0$b;

    invoke-direct {v0, p0}, Lob/d0$b;-><init>(Lob/d0;)V

    return-object v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Lob/d0;->O:I

    return v0
.end method
