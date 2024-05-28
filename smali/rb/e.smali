.class public final Lrb/e;
.super Lub/f$j;
.source "SourceFile"

# interfaces
.implements Lob/l;


# instance fields
.field public final b:Lrb/g;

.field private final c:Lob/k0;

.field private d:Ljava/net/Socket;

.field private e:Ljava/net/Socket;

.field private f:Lob/x;

.field private g:Lob/e0;

.field private h:Lub/f;

.field private i:Lac/e;

.field private j:Lac/d;

.field k:Z

.field l:I

.field m:I

.field private n:I

.field private o:I

.field final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Lrb/k;",
            ">;>;"
        }
    .end annotation
.end field

.field q:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lrb/g;Lob/k0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lub/f$j;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lrb/e;->o:I

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrb/e;->p:Ljava/util/List;

    const-wide v0, 0x7fffffffffffffffL

    .line 4
    iput-wide v0, p0, Lrb/e;->q:J

    .line 5
    iput-object p1, p0, Lrb/e;->b:Lrb/g;

    .line 6
    iput-object p2, p0, Lrb/e;->c:Lob/k0;

    return-void
.end method

.method private f(IILob/g;Lob/v;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lob/a;->j()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    .line 6
    :goto_1
    iput-object v1, p0, Lrb/e;->d:Ljava/net/Socket;

    .line 7
    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {p4, p3, v1, v0}, Lob/v;->g(Lob/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 8
    iget-object p3, p0, Lrb/e;->d:Ljava/net/Socket;

    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 9
    :try_start_0
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object p2

    iget-object p3, p0, Lrb/e;->d:Ljava/net/Socket;

    iget-object p4, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {p4}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p2, p3, p4, p1}, Lwb/f;->h(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 10
    :try_start_1
    iget-object p1, p0, Lrb/e;->d:Ljava/net/Socket;

    invoke-static {p1}, Lac/l;->m(Ljava/net/Socket;)Lac/t;

    move-result-object p1

    invoke-static {p1}, Lac/l;->d(Lac/t;)Lac/e;

    move-result-object p1

    iput-object p1, p0, Lrb/e;->i:Lac/e;

    .line 11
    iget-object p1, p0, Lrb/e;->d:Ljava/net/Socket;

    invoke-static {p1}, Lac/l;->i(Ljava/net/Socket;)Lac/s;

    move-result-object p1

    invoke-static {p1}, Lac/l;->c(Lac/s;)Lac/d;

    move-result-object p1

    iput-object p1, p0, Lrb/e;->j:Lac/d;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    .line 13
    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 14
    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed to connect to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {p4}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p2, p1}, Ljava/net/ConnectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 16
    throw p2
.end method

.method private g(Lrb/b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->a()Lob/a;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lob/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    :try_start_0
    iget-object v3, p0, Lrb/e;->d:Ljava/net/Socket;

    .line 4
    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v4

    invoke-virtual {v4}, Lob/z;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v5

    invoke-virtual {v5}, Lob/z;->y()I

    move-result v5

    const/4 v6, 0x1

    .line 5
    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    invoke-virtual {p1, v1}, Lrb/b;->a(Ljavax/net/ssl/SSLSocket;)Lob/n;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lob/n;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 8
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v3

    .line 9
    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v4

    invoke-virtual {v4}, Lob/z;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lob/a;->f()Ljava/util/List;

    move-result-object v5

    .line 10
    invoke-virtual {v3, v1, v4, v5}, Lwb/f;->g(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 11
    :cond_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 12
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    .line 13
    invoke-static {v3}, Lob/x;->b(Ljavax/net/ssl/SSLSession;)Lob/x;

    move-result-object v4

    .line 14
    invoke-virtual {v0}, Lob/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v6

    invoke-virtual {v6}, Lob/z;->m()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 15
    invoke-virtual {v4}, Lob/x;->f()Ljava/util/List;

    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v3, "Hostname "

    if-nez v2, :cond_1

    const/4 v2, 0x0

    .line 17
    :try_start_2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 18
    new-instance v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n    certificate: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-static {p1}, Lob/i;->c(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    DN: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    subjectAltNames: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    invoke-static {p1}, Lyb/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 23
    :cond_1
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :cond_2
    invoke-virtual {v0}, Lob/a;->a()Lob/i;

    move-result-object v3

    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->m()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-virtual {v4}, Lob/x;->f()Ljava/util/List;

    move-result-object v5

    .line 27
    invoke-virtual {v3, v0, v5}, Lob/i;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 28
    invoke-virtual {p1}, Lob/n;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 29
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lwb/f;->o(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    .line 30
    :cond_3
    iput-object v1, p0, Lrb/e;->e:Ljava/net/Socket;

    .line 31
    invoke-static {v1}, Lac/l;->m(Ljava/net/Socket;)Lac/t;

    move-result-object p1

    invoke-static {p1}, Lac/l;->d(Lac/t;)Lac/e;

    move-result-object p1

    iput-object p1, p0, Lrb/e;->i:Lac/e;

    .line 32
    iget-object p1, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-static {p1}, Lac/l;->i(Ljava/net/Socket;)Lac/s;

    move-result-object p1

    invoke-static {p1}, Lac/l;->c(Lac/s;)Lac/d;

    move-result-object p1

    iput-object p1, p0, Lrb/e;->j:Lac/d;

    .line 33
    iput-object v4, p0, Lrb/e;->f:Lob/x;

    if-eqz v2, :cond_4

    .line 34
    invoke-static {v2}, Lob/e0;->b(Ljava/lang/String;)Lob/e0;

    move-result-object p1

    goto :goto_0

    .line 35
    :cond_4
    sget-object p1, Lob/e0;->p:Lob/e0;

    :goto_0
    iput-object p1, p0, Lrb/e;->g:Lob/e0;
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lwb/f;->a(Ljavax/net/ssl/SSLSocket;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v2, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 37
    :goto_1
    :try_start_3
    invoke-static {p1}, Lpb/e;->A(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 38
    :cond_5
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    if-eqz v2, :cond_6

    .line 39
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lwb/f;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 40
    :cond_6
    invoke-static {v2}, Lpb/e;->h(Ljava/net/Socket;)V

    throw p1
.end method

.method private h(IIILob/g;Lob/v;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lrb/e;->j()Lob/g0;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lob/g0;->j()Lob/z;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x15

    if-ge v2, v3, :cond_1

    .line 3
    invoke-direct {p0, p1, p2, p4, p5}, Lrb/e;->f(IILob/g;Lob/v;)V

    .line 4
    invoke-direct {p0, p2, p3, v0, v1}, Lrb/e;->i(IILob/g0;Lob/z;)Lob/g0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v3, p0, Lrb/e;->d:Ljava/net/Socket;

    invoke-static {v3}, Lpb/e;->h(Ljava/net/Socket;)V

    const/4 v3, 0x0

    .line 6
    iput-object v3, p0, Lrb/e;->d:Ljava/net/Socket;

    .line 7
    iput-object v3, p0, Lrb/e;->j:Lac/d;

    .line 8
    iput-object v3, p0, Lrb/e;->i:Lac/e;

    .line 9
    iget-object v4, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v4}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v5}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, Lob/v;->e(Lob/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lob/e0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private i(IILob/g0;Lob/z;)Lob/g0;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, Lpb/e;->s(Lob/z;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 2
    :goto_0
    new-instance v0, Ltb/a;

    iget-object v1, p0, Lrb/e;->i:Lac/e;

    iget-object v2, p0, Lrb/e;->j:Lac/d;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Ltb/a;-><init>(Lob/d0;Lrb/e;Lac/e;Lac/d;)V

    .line 3
    iget-object v1, p0, Lrb/e;->i:Lac/e;

    invoke-interface {v1}, Lac/t;->f()Lac/u;

    move-result-object v1

    int-to-long v4, p1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v4, v5, v2}, Lac/u;->g(JLjava/util/concurrent/TimeUnit;)Lac/u;

    .line 4
    iget-object v1, p0, Lrb/e;->j:Lac/d;

    invoke-interface {v1}, Lac/s;->f()Lac/u;

    move-result-object v1

    int-to-long v4, p2

    invoke-virtual {v1, v4, v5, v2}, Lac/u;->g(JLjava/util/concurrent/TimeUnit;)Lac/u;

    .line 5
    invoke-virtual {p3}, Lob/g0;->e()Lob/y;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Ltb/a;->B(Lob/y;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Ltb/a;->c()V

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Ltb/a;->h(Z)Lob/i0$a;

    move-result-object v1

    .line 8
    invoke-virtual {v1, p3}, Lob/i0$a;->q(Lob/g0;)Lob/i0$a;

    move-result-object p3

    .line 9
    invoke-virtual {p3}, Lob/i0$a;->c()Lob/i0;

    move-result-object p3

    .line 10
    invoke-virtual {v0, p3}, Ltb/a;->A(Lob/i0;)V

    .line 11
    invoke-virtual {p3}, Lob/i0;->e()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_3

    const/16 v1, 0x197

    if-ne v0, v1, :cond_2

    .line 12
    iget-object v0, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->a()Lob/a;

    move-result-object v0

    invoke-virtual {v0}, Lob/a;->h()Lob/d;

    move-result-object v0

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    invoke-interface {v0, v1, p3}, Lob/d;->a(Lob/k0;Lob/i0;)Lob/g0;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Connection"

    .line 13
    invoke-virtual {p3, v1}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "close"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    return-object v0

    :cond_0
    move-object p3, v0

    goto :goto_0

    .line 14
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unexpected response code for CONNECT: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {p3}, Lob/i0;->e()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_3
    iget-object p1, p0, Lrb/e;->i:Lac/e;

    invoke-interface {p1}, Lac/e;->d()Lac/c;

    move-result-object p1

    invoke-virtual {p1}, Lac/c;->F()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lrb/e;->j:Lac/d;

    invoke-interface {p1}, Lac/d;->a()Lac/c;

    move-result-object p1

    invoke-virtual {p1}, Lac/c;->F()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v3

    .line 18
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private j()Lob/g0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lob/g0$a;

    invoke-direct {v0}, Lob/g0$a;-><init>()V

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    .line 2
    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v1}, Lob/a;->l()Lob/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lob/g0$a;->i(Lob/z;)Lob/g0$a;

    move-result-object v0

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v1, v2}, Lob/g0$a;->d(Ljava/lang/String;Lob/h0;)Lob/g0$a;

    move-result-object v0

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    .line 4
    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v1}, Lob/a;->l()Lob/z;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lpb/e;->s(Lob/z;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    .line 5
    invoke-virtual {v0, v1, v2}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    move-result-object v0

    .line 6
    invoke-static {}, Lpb/f;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "User-Agent"

    invoke-virtual {v0, v2, v1}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lob/g0$a;->a()Lob/g0;

    move-result-object v0

    .line 8
    new-instance v1, Lob/i0$a;

    invoke-direct {v1}, Lob/i0$a;-><init>()V

    .line 9
    invoke-virtual {v1, v0}, Lob/i0$a;->q(Lob/g0;)Lob/i0$a;

    move-result-object v1

    sget-object v2, Lob/e0;->p:Lob/e0;

    .line 10
    invoke-virtual {v1, v2}, Lob/i0$a;->o(Lob/e0;)Lob/i0$a;

    move-result-object v1

    const/16 v2, 0x197

    .line 11
    invoke-virtual {v1, v2}, Lob/i0$a;->g(I)Lob/i0$a;

    move-result-object v1

    const-string v2, "Preemptive Authenticate"

    .line 12
    invoke-virtual {v1, v2}, Lob/i0$a;->l(Ljava/lang/String;)Lob/i0$a;

    move-result-object v1

    sget-object v2, Lpb/e;->d:Lob/j0;

    .line 13
    invoke-virtual {v1, v2}, Lob/i0$a;->b(Lob/j0;)Lob/i0$a;

    move-result-object v1

    const-wide/16 v2, -0x1

    .line 14
    invoke-virtual {v1, v2, v3}, Lob/i0$a;->r(J)Lob/i0$a;

    move-result-object v1

    .line 15
    invoke-virtual {v1, v2, v3}, Lob/i0$a;->p(J)Lob/i0$a;

    move-result-object v1

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    .line 16
    invoke-virtual {v1, v2, v3}, Lob/i0$a;->i(Ljava/lang/String;Ljava/lang/String;)Lob/i0$a;

    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lob/i0$a;->c()Lob/i0;

    move-result-object v1

    .line 18
    iget-object v2, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v2}, Lob/k0;->a()Lob/a;

    move-result-object v2

    invoke-virtual {v2}, Lob/a;->h()Lob/d;

    move-result-object v2

    iget-object v3, p0, Lrb/e;->c:Lob/k0;

    .line 19
    invoke-interface {v2, v3, v1}, Lob/d;->a(Lob/k0;Lob/i0;)Lob/g0;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method private k(Lrb/b;ILob/g;Lob/v;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->a()Lob/a;

    move-result-object v0

    invoke-virtual {v0}, Lob/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    iget-object p1, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {p1}, Lob/k0;->a()Lob/a;

    move-result-object p1

    invoke-virtual {p1}, Lob/a;->f()Ljava/util/List;

    move-result-object p1

    sget-object p3, Lob/e0;->s:Lob/e0;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lrb/e;->d:Ljava/net/Socket;

    iput-object p1, p0, Lrb/e;->e:Ljava/net/Socket;

    .line 4
    iput-object p3, p0, Lrb/e;->g:Lob/e0;

    .line 5
    invoke-direct {p0, p2}, Lrb/e;->u(I)V

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lrb/e;->d:Ljava/net/Socket;

    iput-object p1, p0, Lrb/e;->e:Ljava/net/Socket;

    .line 7
    sget-object p1, Lob/e0;->p:Lob/e0;

    iput-object p1, p0, Lrb/e;->g:Lob/e0;

    return-void

    .line 8
    :cond_1
    invoke-virtual {p4, p3}, Lob/v;->y(Lob/g;)V

    .line 9
    invoke-direct {p0, p1}, Lrb/e;->g(Lrb/b;)V

    .line 10
    iget-object p1, p0, Lrb/e;->f:Lob/x;

    invoke-virtual {p4, p3, p1}, Lob/v;->x(Lob/g;Lob/x;)V

    .line 11
    iget-object p1, p0, Lrb/e;->g:Lob/e0;

    sget-object p3, Lob/e0;->r:Lob/e0;

    if-ne p1, p3, :cond_2

    .line 12
    invoke-direct {p0, p2}, Lrb/e;->u(I)V

    :cond_2
    return-void
.end method

.method private s(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lob/k0;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lob/k0;

    .line 3
    invoke-virtual {v3}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v4

    sget-object v5, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Lrb/e;->c:Lob/k0;

    .line 4
    invoke-virtual {v4}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v4

    sget-object v5, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Lrb/e;->c:Lob/k0;

    .line 5
    invoke-virtual {v4}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    invoke-virtual {v3}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private u(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lrb/e;->e:Ljava/net/Socket;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 2
    new-instance v0, Lub/f$h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lub/f$h;-><init>(Z)V

    iget-object v1, p0, Lrb/e;->e:Ljava/net/Socket;

    iget-object v2, p0, Lrb/e;->c:Lob/k0;

    .line 3
    invoke-virtual {v2}, Lob/k0;->a()Lob/a;

    move-result-object v2

    invoke-virtual {v2}, Lob/a;->l()Lob/z;

    move-result-object v2

    invoke-virtual {v2}, Lob/z;->m()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lrb/e;->i:Lac/e;

    iget-object v4, p0, Lrb/e;->j:Lac/d;

    invoke-virtual {v0, v1, v2, v3, v4}, Lub/f$h;->d(Ljava/net/Socket;Ljava/lang/String;Lac/e;Lac/d;)Lub/f$h;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p0}, Lub/f$h;->b(Lub/f$j;)Lub/f$h;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lub/f$h;->c(I)Lub/f$h;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lub/f$h;->a()Lub/f;

    move-result-object p1

    iput-object p1, p0, Lrb/e;->h:Lub/f;

    .line 7
    invoke-virtual {p1}, Lub/f;->x0()V

    return-void
.end method


# virtual methods
.method public a()Lob/e0;
    .locals 1

    iget-object v0, p0, Lrb/e;->g:Lob/e0;

    return-object v0
.end method

.method public b(Lub/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lrb/e;->b:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lub/f;->l0()I

    move-result p1

    iput p1, p0, Lrb/e;->o:I

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Lub/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lub/b;->s:Lub/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lub/i;->d(Lub/b;Ljava/io/IOException;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lrb/e;->d:Ljava/net/Socket;

    invoke-static {v0}, Lpb/e;->h(Ljava/net/Socket;)V

    return-void
.end method

.method public e(IIIIZLob/g;Lob/v;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 1
    iget-object v0, v7, Lrb/e;->g:Lob/e0;

    if-nez v0, :cond_b

    .line 2
    iget-object v0, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->a()Lob/a;

    move-result-object v0

    invoke-virtual {v0}, Lob/a;->b()Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v10, Lrb/b;

    invoke-direct {v10, v0}, Lrb/b;-><init>(Ljava/util/List;)V

    .line 4
    iget-object v1, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v1}, Lob/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_2

    .line 5
    sget-object v1, Lob/n;->j:Lob/n;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->a()Lob/a;

    move-result-object v0

    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->m()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lwb/f;->r(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Lrb/i;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lrb/i;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 9
    :cond_1
    new-instance v0, Lrb/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lrb/i;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 10
    :cond_2
    iget-object v0, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->a()Lob/a;

    move-result-object v0

    invoke-virtual {v0}, Lob/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lob/e0;->s:Lob/e0;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :goto_0
    const/4 v11, 0x0

    move-object v12, v11

    .line 11
    :goto_1
    :try_start_0
    iget-object v0, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    .line 12
    invoke-direct/range {v1 .. v6}, Lrb/e;->h(IIILob/g;Lob/v;)V

    .line 13
    iget-object v0, v7, Lrb/e;->d:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v13, p1

    move/from16 v14, p2

    goto :goto_2

    :cond_4
    move/from16 v13, p1

    move/from16 v14, p2

    .line 14
    :try_start_1
    invoke-direct {v7, v13, v14, v8, v9}, Lrb/e;->f(IILob/g;Lob/v;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    move/from16 v15, p4

    .line 15
    :try_start_2
    invoke-direct {v7, v10, v15, v8, v9}, Lrb/e;->k(Lrb/b;ILob/g;Lob/v;)V

    .line 16
    iget-object v0, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, Lrb/e;->g:Lob/e0;

    invoke-virtual {v9, v8, v0, v1, v2}, Lob/v;->e(Lob/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lob/e0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 17
    :goto_3
    iget-object v0, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v0}, Lob/k0;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v7, Lrb/e;->d:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    .line 18
    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Too many tunnel connections attempted: 21"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 19
    new-instance v1, Lrb/i;

    invoke-direct {v1, v0}, Lrb/i;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 20
    :cond_6
    :goto_4
    iget-object v0, v7, Lrb/e;->h:Lub/f;

    if-eqz v0, :cond_7

    .line 21
    iget-object v1, v7, Lrb/e;->b:Lrb/g;

    monitor-enter v1

    .line 22
    :try_start_3
    iget-object v0, v7, Lrb/e;->h:Lub/f;

    invoke-virtual {v0}, Lub/f;->l0()I

    move-result v0

    iput v0, v7, Lrb/e;->o:I

    .line 23
    monitor-exit v1

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_7
    :goto_5
    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    move/from16 v13, p1

    move/from16 v14, p2

    :goto_6
    move/from16 v15, p4

    .line 24
    :goto_7
    iget-object v1, v7, Lrb/e;->e:Ljava/net/Socket;

    invoke-static {v1}, Lpb/e;->h(Ljava/net/Socket;)V

    .line 25
    iget-object v1, v7, Lrb/e;->d:Ljava/net/Socket;

    invoke-static {v1}, Lpb/e;->h(Ljava/net/Socket;)V

    .line 26
    iput-object v11, v7, Lrb/e;->e:Ljava/net/Socket;

    .line 27
    iput-object v11, v7, Lrb/e;->d:Ljava/net/Socket;

    .line 28
    iput-object v11, v7, Lrb/e;->i:Lac/e;

    .line 29
    iput-object v11, v7, Lrb/e;->j:Lac/d;

    .line 30
    iput-object v11, v7, Lrb/e;->f:Lob/x;

    .line 31
    iput-object v11, v7, Lrb/e;->g:Lob/e0;

    .line 32
    iput-object v11, v7, Lrb/e;->h:Lub/f;

    .line 33
    iget-object v1, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lob/v;->f(Lob/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lob/e0;Ljava/io/IOException;)V

    if-nez v12, :cond_8

    .line 34
    new-instance v12, Lrb/i;

    invoke-direct {v12, v0}, Lrb/i;-><init>(Ljava/io/IOException;)V

    goto :goto_8

    .line 35
    :cond_8
    invoke-virtual {v12, v0}, Lrb/i;->a(Ljava/io/IOException;)V

    :goto_8
    if-eqz p5, :cond_9

    .line 36
    invoke-virtual {v10, v0}, Lrb/b;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto/16 :goto_1

    .line 37
    :cond_9
    throw v12

    .line 38
    :cond_a
    new-instance v0, Lrb/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lrb/i;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 39
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()Lob/x;
    .locals 1

    iget-object v0, p0, Lrb/e;->f:Lob/x;

    return-object v0
.end method

.method m(Lob/a;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/a;",
            "Ljava/util/List<",
            "Lob/k0;",
            ">;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lrb/e;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lrb/e;->o:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_7

    iget-boolean v0, p0, Lrb/e;->k:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lpb/a;->a:Lpb/a;

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lpb/a;->e(Lob/a;Lob/a;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    .line 3
    :cond_1
    invoke-virtual {p1}, Lob/a;->l()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lrb/e;->r()Lob/k0;

    move-result-object v1

    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v1}, Lob/a;->l()Lob/z;

    move-result-object v1

    invoke-virtual {v1}, Lob/z;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    .line 4
    :cond_2
    iget-object v0, p0, Lrb/e;->h:Lub/f;

    if-nez v0, :cond_3

    return v2

    :cond_3
    if-eqz p2, :cond_7

    .line 5
    invoke-direct {p0, p2}, Lrb/e;->s(Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    .line 6
    :cond_4
    invoke-virtual {p1}, Lob/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Lyb/d;->a:Lyb/d;

    if-eq p2, v0, :cond_5

    return v2

    .line 7
    :cond_5
    invoke-virtual {p1}, Lob/a;->l()Lob/z;

    move-result-object p2

    invoke-virtual {p0, p2}, Lrb/e;->v(Lob/z;)Z

    move-result p2

    if-nez p2, :cond_6

    return v2

    .line 8
    :cond_6
    :try_start_0
    invoke-virtual {p1}, Lob/a;->a()Lob/i;

    move-result-object p2

    invoke-virtual {p1}, Lob/a;->l()Lob/z;

    move-result-object p1

    invoke-virtual {p1}, Lob/z;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lrb/e;->l()Lob/x;

    move-result-object v0

    invoke-virtual {v0}, Lob/x;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lob/i;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_7
    :goto_0
    return v2
.end method

.method public n(Z)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lrb/e;->h:Lub/f;

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lub/f;->k0(J)Z

    move-result p1

    return p1

    :cond_1
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 4
    :try_start_0
    iget-object p1, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :try_start_1
    iget-object v2, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-virtual {v2, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 6
    iget-object v2, p0, Lrb/e;->i:Lac/e;

    invoke-interface {v2}, Lac/e;->F()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    .line 7
    :try_start_2
    iget-object v2, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v1

    :cond_2
    iget-object v2, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v2
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return v1

    :catch_1
    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lrb/e;->h:Lub/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method p(Lob/d0;Lob/a0$a;)Lsb/c;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lrb/e;->h:Lub/f;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lub/g;

    iget-object v1, p0, Lrb/e;->h:Lub/f;

    invoke-direct {v0, p1, p0, p2, v1}, Lub/g;-><init>(Lob/d0;Lrb/e;Lob/a0$a;Lub/f;)V

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lrb/e;->e:Ljava/net/Socket;

    invoke-interface {p2}, Lob/a0$a;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 4
    iget-object v0, p0, Lrb/e;->i:Lac/e;

    invoke-interface {v0}, Lac/t;->f()Lac/u;

    move-result-object v0

    invoke-interface {p2}, Lob/a0$a;->d()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lac/u;->g(JLjava/util/concurrent/TimeUnit;)Lac/u;

    .line 5
    iget-object v0, p0, Lrb/e;->j:Lac/d;

    invoke-interface {v0}, Lac/s;->f()Lac/u;

    move-result-object v0

    invoke-interface {p2}, Lob/a0$a;->f()I

    move-result p2

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2, v3}, Lac/u;->g(JLjava/util/concurrent/TimeUnit;)Lac/u;

    .line 6
    new-instance p2, Ltb/a;

    iget-object v0, p0, Lrb/e;->i:Lac/e;

    iget-object v1, p0, Lrb/e;->j:Lac/d;

    invoke-direct {p2, p1, p0, v0, v1}, Ltb/a;-><init>(Lob/d0;Lrb/e;Lac/e;Lac/d;)V

    return-object p2
.end method

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lrb/e;->b:Lrb/g;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lrb/e;->k:Z

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public r()Lob/k0;
    .locals 1

    iget-object v0, p0, Lrb/e;->c:Lob/k0;

    return-object v0
.end method

.method public t()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lrb/e;->e:Ljava/net/Socket;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    .line 2
    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v1}, Lob/a;->l()Lob/z;

    move-result-object v1

    invoke-virtual {v1}, Lob/z;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v1}, Lob/a;->l()Lob/z;

    move-result-object v1

    invoke-virtual {v1}, Lob/z;->y()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    .line 3
    invoke-virtual {v1}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    .line 4
    invoke-virtual {v1}, Lob/k0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    iget-object v1, p0, Lrb/e;->f:Lob/x;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lob/x;->a()Lob/k;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrb/e;->g:Lob/e0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(Lob/z;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lob/z;->y()I

    move-result v0

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v1}, Lob/a;->l()Lob/z;

    move-result-object v1

    invoke-virtual {v1}, Lob/z;->y()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 2
    :cond_0
    invoke-virtual {p1}, Lob/z;->m()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1}, Lob/k0;->a()Lob/a;

    move-result-object v1

    invoke-virtual {v1}, Lob/a;->l()Lob/z;

    move-result-object v1

    invoke-virtual {v1}, Lob/z;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 3
    iget-object v0, p0, Lrb/e;->f:Lob/x;

    if-eqz v0, :cond_1

    sget-object v0, Lyb/d;->a:Lyb/d;

    .line 4
    invoke-virtual {p1}, Lob/z;->m()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lrb/e;->f:Lob/x;

    invoke-virtual {v3}, Lob/x;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/X509Certificate;

    .line 5
    invoke-virtual {v0, p1, v3}, Lyb/d;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2

    :cond_2
    return v1
.end method

.method w(Ljava/io/IOException;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lrb/e;->b:Lrb/g;

    monitor-enter v0

    .line 2
    :try_start_0
    instance-of v1, p1, Lub/n;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 3
    check-cast p1, Lub/n;

    iget-object p1, p1, Lub/n;->n:Lub/b;

    .line 4
    sget-object v1, Lub/b;->s:Lub/b;

    if-ne p1, v1, :cond_0

    .line 5
    iget p1, p0, Lrb/e;->n:I

    add-int/2addr p1, v2

    iput p1, p0, Lrb/e;->n:I

    if-le p1, v2, :cond_4

    .line 6
    iput-boolean v2, p0, Lrb/e;->k:Z

    .line 7
    iget p1, p0, Lrb/e;->l:I

    add-int/2addr p1, v2

    iput p1, p0, Lrb/e;->l:I

    goto :goto_0

    .line 8
    :cond_0
    sget-object v1, Lub/b;->t:Lub/b;

    if-eq p1, v1, :cond_4

    .line 9
    iput-boolean v2, p0, Lrb/e;->k:Z

    .line 10
    iget p1, p0, Lrb/e;->l:I

    add-int/2addr p1, v2

    iput p1, p0, Lrb/e;->l:I

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0}, Lrb/e;->o()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Lub/a;

    if-eqz v1, :cond_4

    .line 12
    :cond_2
    iput-boolean v2, p0, Lrb/e;->k:Z

    .line 13
    iget v1, p0, Lrb/e;->m:I

    if-nez v1, :cond_4

    if-eqz p1, :cond_3

    .line 14
    iget-object v1, p0, Lrb/e;->b:Lrb/g;

    iget-object v3, p0, Lrb/e;->c:Lob/k0;

    invoke-virtual {v1, v3, p1}, Lrb/g;->c(Lob/k0;Ljava/io/IOException;)V

    .line 15
    :cond_3
    iget p1, p0, Lrb/e;->l:I

    add-int/2addr p1, v2

    iput p1, p0, Lrb/e;->l:I

    .line 16
    :cond_4
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
