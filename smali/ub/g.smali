.class public final Lub/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/c;


# static fields
.field private static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lob/a0$a;

.field private final b:Lrb/e;

.field private final c:Lub/f;

.field private volatile d:Lub/i;

.field private final e:Lob/e0;

.field private volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    .line 1
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lpb/e;->u([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lub/g;->g:Ljava/util/List;

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    .line 2
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lpb/e;->u([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lub/g;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lob/d0;Lrb/e;Lob/a0$a;Lub/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lub/g;->b:Lrb/e;

    .line 3
    iput-object p3, p0, Lub/g;->a:Lob/a0$a;

    .line 4
    iput-object p4, p0, Lub/g;->c:Lub/f;

    .line 5
    invoke-virtual {p1}, Lob/d0;->A()Ljava/util/List;

    move-result-object p1

    sget-object p2, Lob/e0;->s:Lob/e0;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object p2, Lob/e0;->r:Lob/e0;

    :goto_0
    iput-object p2, p0, Lub/g;->e:Lob/e0;

    return-void
.end method

.method public static i(Lob/g0;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/g0;",
            ")",
            "Ljava/util/List<",
            "Lub/c;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lob/g0;->e()Lob/y;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lob/y;->h()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    new-instance v2, Lub/c;

    sget-object v3, Lub/c;->f:Lac/f;

    invoke-virtual {p0}, Lob/g0;->g()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lub/c;-><init>(Lac/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v2, Lub/c;

    sget-object v3, Lub/c;->g:Lac/f;

    invoke-virtual {p0}, Lob/g0;->j()Lob/z;

    move-result-object v4

    invoke-static {v4}, Lsb/i;->c(Lob/z;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lub/c;-><init>(Lac/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "Host"

    .line 5
    invoke-virtual {p0, v2}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 6
    new-instance v3, Lub/c;

    sget-object v4, Lub/c;->i:Lac/f;

    invoke-direct {v3, v4, v2}, Lub/c;-><init>(Lac/f;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    :cond_0
    new-instance v2, Lub/c;

    sget-object v3, Lub/c;->h:Lac/f;

    invoke-virtual {p0}, Lob/g0;->j()Lob/z;

    move-result-object p0

    invoke-virtual {p0}, Lob/z;->D()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Lub/c;-><init>(Lac/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    .line 8
    invoke-virtual {v0}, Lob/y;->h()I

    move-result v2

    :goto_0
    if-ge p0, v2, :cond_3

    .line 9
    invoke-virtual {v0, p0}, Lob/y;->e(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 10
    sget-object v4, Lub/g;->g:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "te"

    .line 11
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, p0}, Lob/y;->i(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "trailers"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 12
    :cond_1
    new-instance v4, Lub/c;

    invoke-virtual {v0, p0}, Lob/y;->i(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lub/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static j(Lob/y;Lob/e0;)Lob/i0$a;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lob/y$a;

    invoke-direct {v0}, Lob/y$a;-><init>()V

    .line 2
    invoke-virtual {p0}, Lob/y;->h()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 3
    invoke-virtual {p0, v3}, Lob/y;->e(I)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {p0, v3}, Lob/y;->i(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ":status"

    .line 5
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HTTP/1.1 "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsb/k;->a(Ljava/lang/String;)Lsb/k;

    move-result-object v2

    goto :goto_1

    .line 7
    :cond_0
    sget-object v6, Lub/g;->h:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 8
    sget-object v6, Lpb/a;->a:Lpb/a;

    invoke-virtual {v6, v0, v4, v5}, Lpb/a;->b(Lob/y$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    .line 9
    new-instance p0, Lob/i0$a;

    invoke-direct {p0}, Lob/i0$a;-><init>()V

    .line 10
    invoke-virtual {p0, p1}, Lob/i0$a;->o(Lob/e0;)Lob/i0$a;

    move-result-object p0

    iget p1, v2, Lsb/k;->b:I

    .line 11
    invoke-virtual {p0, p1}, Lob/i0$a;->g(I)Lob/i0$a;

    move-result-object p0

    iget-object p1, v2, Lsb/k;->c:Ljava/lang/String;

    .line 12
    invoke-virtual {p0, p1}, Lob/i0$a;->l(Ljava/lang/String;)Lob/i0$a;

    move-result-object p0

    .line 13
    invoke-virtual {v0}, Lob/y$a;->e()Lob/y;

    move-result-object p1

    invoke-virtual {p0, p1}, Lob/i0$a;->j(Lob/y;)Lob/i0$a;

    move-result-object p0

    return-object p0

    .line 14
    :cond_3
    new-instance p0, Ljava/net/ProtocolException;

    const-string p1, "Expected \':status\' header not present"

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lrb/e;
    .locals 1

    iget-object v0, p0, Lub/g;->b:Lrb/e;

    return-object v0
.end method

.method public b(Lob/g0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lub/g;->d:Lub/i;

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-static {p1}, Lub/g;->i(Lob/g0;)Ljava/util/List;

    move-result-object p1

    .line 4
    iget-object v1, p0, Lub/g;->c:Lub/f;

    invoke-virtual {v1, p1, v0}, Lub/f;->n0(Ljava/util/List;Z)Lub/i;

    move-result-object p1

    iput-object p1, p0, Lub/g;->d:Lub/i;

    .line 5
    iget-boolean p1, p0, Lub/g;->f:Z

    if-nez p1, :cond_2

    .line 6
    iget-object p1, p0, Lub/g;->d:Lub/i;

    invoke-virtual {p1}, Lub/i;->l()Lac/u;

    move-result-object p1

    iget-object v0, p0, Lub/g;->a:Lob/a0$a;

    invoke-interface {v0}, Lob/a0$a;->d()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lac/u;->g(JLjava/util/concurrent/TimeUnit;)Lac/u;

    .line 7
    iget-object p1, p0, Lub/g;->d:Lub/i;

    invoke-virtual {p1}, Lub/i;->r()Lac/u;

    move-result-object p1

    iget-object v0, p0, Lub/g;->a:Lob/a0$a;

    invoke-interface {v0}, Lob/a0$a;->f()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, Lac/u;->g(JLjava/util/concurrent/TimeUnit;)Lac/u;

    return-void

    .line 8
    :cond_2
    iget-object p1, p0, Lub/g;->d:Lub/i;

    sget-object v0, Lub/b;->t:Lub/b;

    invoke-virtual {p1, v0}, Lub/i;->f(Lub/b;)V

    .line 9
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lub/g;->d:Lub/i;

    invoke-virtual {v0}, Lub/i;->h()Lac/s;

    move-result-object v0

    invoke-interface {v0}, Lac/s;->close()V

    return-void
.end method

.method public cancel()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lub/g;->f:Z

    .line 2
    iget-object v0, p0, Lub/g;->d:Lub/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lub/g;->d:Lub/i;

    sget-object v1, Lub/b;->t:Lub/b;

    invoke-virtual {v0, v1}, Lub/i;->f(Lub/b;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lub/g;->c:Lub/f;

    invoke-virtual {v0}, Lub/f;->flush()V

    return-void
.end method

.method public e(Lob/i0;)J
    .locals 2

    invoke-static {p1}, Lsb/e;->b(Lob/i0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public f(Lob/g0;J)Lac/s;
    .locals 0

    iget-object p1, p0, Lub/g;->d:Lub/i;

    invoke-virtual {p1}, Lub/i;->h()Lac/s;

    move-result-object p1

    return-object p1
.end method

.method public g(Lob/i0;)Lac/t;
    .locals 0

    iget-object p1, p0, Lub/g;->d:Lub/i;

    invoke-virtual {p1}, Lub/i;->i()Lac/t;

    move-result-object p1

    return-object p1
.end method

.method public h(Z)Lob/i0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lub/g;->d:Lub/i;

    invoke-virtual {v0}, Lub/i;->p()Lob/y;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lub/g;->e:Lob/e0;

    invoke-static {v0, v1}, Lub/g;->j(Lob/y;Lob/e0;)Lob/i0$a;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 3
    sget-object p1, Lpb/a;->a:Lpb/a;

    invoke-virtual {p1, v0}, Lpb/a;->d(Lob/i0$a;)I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    return-object v0
.end method
