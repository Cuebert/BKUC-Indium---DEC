.class public final Lob/d0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field A:I

.field B:I

.field a:Lob/q;

.field b:Ljava/net/Proxy;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/e0;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/n;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/a0;",
            ">;"
        }
    .end annotation
.end field

.field final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lob/a0;",
            ">;"
        }
    .end annotation
.end field

.field g:Lob/v$b;

.field h:Ljava/net/ProxySelector;

.field i:Lob/p;

.field j:Lob/e;

.field k:Lqb/f;

.field l:Ljavax/net/SocketFactory;

.field m:Ljavax/net/ssl/SSLSocketFactory;

.field n:Lyb/c;

.field o:Ljavax/net/ssl/HostnameVerifier;

.field p:Lob/i;

.field q:Lob/d;

.field r:Lob/d;

.field s:Lob/m;

.field t:Lob/t;

.field u:Z

.field v:Z

.field w:Z

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lob/d0$b;->e:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lob/d0$b;->f:Ljava/util/List;

    .line 4
    new-instance v0, Lob/q;

    invoke-direct {v0}, Lob/q;-><init>()V

    iput-object v0, p0, Lob/d0$b;->a:Lob/q;

    .line 5
    sget-object v0, Lob/d0;->P:Ljava/util/List;

    iput-object v0, p0, Lob/d0$b;->c:Ljava/util/List;

    .line 6
    sget-object v0, Lob/d0;->Q:Ljava/util/List;

    iput-object v0, p0, Lob/d0$b;->d:Ljava/util/List;

    .line 7
    sget-object v0, Lob/v;->a:Lob/v;

    invoke-static {v0}, Lob/v;->l(Lob/v;)Lob/v$b;

    move-result-object v0

    iput-object v0, p0, Lob/d0$b;->g:Lob/v$b;

    .line 8
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Lob/d0$b;->h:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Lxb/a;

    invoke-direct {v0}, Lxb/a;-><init>()V

    iput-object v0, p0, Lob/d0$b;->h:Ljava/net/ProxySelector;

    .line 10
    :cond_0
    sget-object v0, Lob/p;->a:Lob/p;

    iput-object v0, p0, Lob/d0$b;->i:Lob/p;

    .line 11
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lob/d0$b;->l:Ljavax/net/SocketFactory;

    .line 12
    sget-object v0, Lyb/d;->a:Lyb/d;

    iput-object v0, p0, Lob/d0$b;->o:Ljavax/net/ssl/HostnameVerifier;

    .line 13
    sget-object v0, Lob/i;->c:Lob/i;

    iput-object v0, p0, Lob/d0$b;->p:Lob/i;

    .line 14
    sget-object v0, Lob/d;->a:Lob/d;

    iput-object v0, p0, Lob/d0$b;->q:Lob/d;

    .line 15
    iput-object v0, p0, Lob/d0$b;->r:Lob/d;

    .line 16
    new-instance v0, Lob/m;

    invoke-direct {v0}, Lob/m;-><init>()V

    iput-object v0, p0, Lob/d0$b;->s:Lob/m;

    .line 17
    sget-object v0, Lob/t;->a:Lob/t;

    iput-object v0, p0, Lob/d0$b;->t:Lob/t;

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lob/d0$b;->u:Z

    .line 19
    iput-boolean v0, p0, Lob/d0$b;->v:Z

    .line 20
    iput-boolean v0, p0, Lob/d0$b;->w:Z

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lob/d0$b;->x:I

    const/16 v1, 0x2710

    .line 22
    iput v1, p0, Lob/d0$b;->y:I

    .line 23
    iput v1, p0, Lob/d0$b;->z:I

    .line 24
    iput v1, p0, Lob/d0$b;->A:I

    .line 25
    iput v0, p0, Lob/d0$b;->B:I

    return-void
.end method

.method constructor <init>(Lob/d0;)V
    .locals 3

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lob/d0$b;->e:Ljava/util/List;

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lob/d0$b;->f:Ljava/util/List;

    .line 29
    iget-object v2, p1, Lob/d0;->n:Lob/q;

    iput-object v2, p0, Lob/d0$b;->a:Lob/q;

    .line 30
    iget-object v2, p1, Lob/d0;->o:Ljava/net/Proxy;

    iput-object v2, p0, Lob/d0$b;->b:Ljava/net/Proxy;

    .line 31
    iget-object v2, p1, Lob/d0;->p:Ljava/util/List;

    iput-object v2, p0, Lob/d0$b;->c:Ljava/util/List;

    .line 32
    iget-object v2, p1, Lob/d0;->q:Ljava/util/List;

    iput-object v2, p0, Lob/d0$b;->d:Ljava/util/List;

    .line 33
    iget-object v2, p1, Lob/d0;->r:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 34
    iget-object v0, p1, Lob/d0;->s:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35
    iget-object v0, p1, Lob/d0;->t:Lob/v$b;

    iput-object v0, p0, Lob/d0$b;->g:Lob/v$b;

    .line 36
    iget-object v0, p1, Lob/d0;->u:Ljava/net/ProxySelector;

    iput-object v0, p0, Lob/d0$b;->h:Ljava/net/ProxySelector;

    .line 37
    iget-object v0, p1, Lob/d0;->v:Lob/p;

    iput-object v0, p0, Lob/d0$b;->i:Lob/p;

    .line 38
    iget-object v0, p1, Lob/d0;->x:Lqb/f;

    iput-object v0, p0, Lob/d0$b;->k:Lqb/f;

    .line 39
    iget-object v0, p1, Lob/d0;->w:Lob/e;

    iput-object v0, p0, Lob/d0$b;->j:Lob/e;

    .line 40
    iget-object v0, p1, Lob/d0;->y:Ljavax/net/SocketFactory;

    iput-object v0, p0, Lob/d0$b;->l:Ljavax/net/SocketFactory;

    .line 41
    iget-object v0, p1, Lob/d0;->z:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Lob/d0$b;->m:Ljavax/net/ssl/SSLSocketFactory;

    .line 42
    iget-object v0, p1, Lob/d0;->A:Lyb/c;

    iput-object v0, p0, Lob/d0$b;->n:Lyb/c;

    .line 43
    iget-object v0, p1, Lob/d0;->B:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Lob/d0$b;->o:Ljavax/net/ssl/HostnameVerifier;

    .line 44
    iget-object v0, p1, Lob/d0;->C:Lob/i;

    iput-object v0, p0, Lob/d0$b;->p:Lob/i;

    .line 45
    iget-object v0, p1, Lob/d0;->D:Lob/d;

    iput-object v0, p0, Lob/d0$b;->q:Lob/d;

    .line 46
    iget-object v0, p1, Lob/d0;->E:Lob/d;

    iput-object v0, p0, Lob/d0$b;->r:Lob/d;

    .line 47
    iget-object v0, p1, Lob/d0;->F:Lob/m;

    iput-object v0, p0, Lob/d0$b;->s:Lob/m;

    .line 48
    iget-object v0, p1, Lob/d0;->G:Lob/t;

    iput-object v0, p0, Lob/d0$b;->t:Lob/t;

    .line 49
    iget-boolean v0, p1, Lob/d0;->H:Z

    iput-boolean v0, p0, Lob/d0$b;->u:Z

    .line 50
    iget-boolean v0, p1, Lob/d0;->I:Z

    iput-boolean v0, p0, Lob/d0$b;->v:Z

    .line 51
    iget-boolean v0, p1, Lob/d0;->J:Z

    iput-boolean v0, p0, Lob/d0$b;->w:Z

    .line 52
    iget v0, p1, Lob/d0;->K:I

    iput v0, p0, Lob/d0$b;->x:I

    .line 53
    iget v0, p1, Lob/d0;->L:I

    iput v0, p0, Lob/d0$b;->y:I

    .line 54
    iget v0, p1, Lob/d0;->M:I

    iput v0, p0, Lob/d0$b;->z:I

    .line 55
    iget v0, p1, Lob/d0;->N:I

    iput v0, p0, Lob/d0$b;->A:I

    .line 56
    iget p1, p1, Lob/d0;->O:I

    iput p1, p0, Lob/d0$b;->B:I

    return-void
.end method


# virtual methods
.method public a(Lob/a0;)Lob/d0$b;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lob/d0$b;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "interceptor == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lob/a0;)Lob/d0$b;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lob/d0$b;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "interceptor == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Lob/d0;
    .locals 1

    new-instance v0, Lob/d0;

    invoke-direct {v0, p0}, Lob/d0;-><init>(Lob/d0$b;)V

    return-object v0
.end method

.method public d(Lob/e;)Lob/d0$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lob/d0$b;->j:Lob/e;

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lob/d0$b;->k:Lqb/f;

    return-object p0
.end method

.method public e(JLjava/util/concurrent/TimeUnit;)Lob/d0$b;
    .locals 1

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lpb/e;->e(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lob/d0$b;->y:I

    return-object p0
.end method

.method public f(Lob/p;)Lob/d0$b;
    .locals 1

    const-string v0, "cookieJar == null"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lob/d0$b;->i:Lob/p;

    return-object p0
.end method

.method public g(Lob/v;)Lob/d0$b;
    .locals 1

    const-string v0, "eventListener == null"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    invoke-static {p1}, Lob/v;->l(Lob/v;)Lob/v$b;

    move-result-object p1

    iput-object p1, p0, Lob/d0$b;->g:Lob/v$b;

    return-object p0
.end method

.method public h(Z)Lob/d0$b;
    .locals 0

    iput-boolean p1, p0, Lob/d0$b;->v:Z

    return-object p0
.end method

.method public i(JLjava/util/concurrent/TimeUnit;)Lob/d0$b;
    .locals 1

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lpb/e;->e(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lob/d0$b;->z:I

    return-object p0
.end method
