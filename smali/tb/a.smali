.class public final Ltb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltb/a$g;,
        Ltb/a$d;,
        Ltb/a$e;,
        Ltb/a$b;,
        Ltb/a$c;,
        Ltb/a$f;
    }
.end annotation


# instance fields
.field private final a:Lob/d0;

.field private final b:Lrb/e;

.field private final c:Lac/e;

.field private final d:Lac/d;

.field private e:I

.field private f:J

.field private g:Lob/y;


# direct methods
.method public constructor <init>(Lob/d0;Lrb/e;Lac/e;Lac/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ltb/a;->e:I

    const-wide/32 v0, 0x40000

    .line 3
    iput-wide v0, p0, Ltb/a;->f:J

    .line 4
    iput-object p1, p0, Ltb/a;->a:Lob/d0;

    .line 5
    iput-object p2, p0, Ltb/a;->b:Lrb/e;

    .line 6
    iput-object p3, p0, Ltb/a;->c:Lac/e;

    .line 7
    iput-object p4, p0, Ltb/a;->d:Lac/d;

    return-void
.end method

.method static synthetic i(Ltb/a;)Lob/d0;
    .locals 0

    iget-object p0, p0, Ltb/a;->a:Lob/d0;

    return-object p0
.end method

.method static synthetic j(Ltb/a;)Lac/d;
    .locals 0

    iget-object p0, p0, Ltb/a;->d:Lac/d;

    return-object p0
.end method

.method static synthetic k(Ltb/a;Lac/i;)V
    .locals 0

    invoke-direct {p0, p1}, Ltb/a;->s(Lac/i;)V

    return-void
.end method

.method static synthetic l(Ltb/a;)I
    .locals 0

    iget p0, p0, Ltb/a;->e:I

    return p0
.end method

.method static synthetic m(Ltb/a;I)I
    .locals 0

    iput p1, p0, Ltb/a;->e:I

    return p1
.end method

.method static synthetic n(Ltb/a;)Lac/e;
    .locals 0

    iget-object p0, p0, Ltb/a;->c:Lac/e;

    return-object p0
.end method

.method static synthetic o(Ltb/a;)Lrb/e;
    .locals 0

    iget-object p0, p0, Ltb/a;->b:Lrb/e;

    return-object p0
.end method

.method static synthetic p(Ltb/a;)Lob/y;
    .locals 0

    iget-object p0, p0, Ltb/a;->g:Lob/y;

    return-object p0
.end method

.method static synthetic q(Ltb/a;Lob/y;)Lob/y;
    .locals 0

    iput-object p1, p0, Ltb/a;->g:Lob/y;

    return-object p1
.end method

.method static synthetic r(Ltb/a;)Lob/y;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ltb/a;->z()Lob/y;

    move-result-object p0

    return-object p0
.end method

.method private s(Lac/i;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lac/i;->i()Lac/u;

    move-result-object v0

    .line 2
    sget-object v1, Lac/u;->d:Lac/u;

    invoke-virtual {p1, v1}, Lac/i;->j(Lac/u;)Lac/i;

    .line 3
    invoke-virtual {v0}, Lac/u;->a()Lac/u;

    .line 4
    invoke-virtual {v0}, Lac/u;->b()Lac/u;

    return-void
.end method

.method private t()Lac/s;
    .locals 3

    .line 1
    iget v0, p0, Ltb/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ltb/a;->e:I

    .line 3
    new-instance v0, Ltb/a$c;

    invoke-direct {v0, p0}, Ltb/a$c;-><init>(Ltb/a;)V

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ltb/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private u(Lob/z;)Lac/t;
    .locals 2

    .line 1
    iget v0, p0, Ltb/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Ltb/a;->e:I

    .line 3
    new-instance v0, Ltb/a$d;

    invoke-direct {v0, p0, p1}, Ltb/a$d;-><init>(Ltb/a;Lob/z;)V

    return-object v0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ltb/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private v(J)Lac/t;
    .locals 2

    .line 1
    iget v0, p0, Ltb/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Ltb/a;->e:I

    .line 3
    new-instance v0, Ltb/a$e;

    invoke-direct {v0, p0, p1, p2}, Ltb/a$e;-><init>(Ltb/a;J)V

    return-object v0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ltb/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private w()Lac/s;
    .locals 3

    .line 1
    iget v0, p0, Ltb/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ltb/a;->e:I

    .line 3
    new-instance v0, Ltb/a$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ltb/a$f;-><init>(Ltb/a;Ltb/a$a;)V

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ltb/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private x()Lac/t;
    .locals 3

    .line 1
    iget v0, p0, Ltb/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Ltb/a;->e:I

    .line 3
    iget-object v0, p0, Ltb/a;->b:Lrb/e;

    invoke-virtual {v0}, Lrb/e;->q()V

    .line 4
    new-instance v0, Ltb/a$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ltb/a$g;-><init>(Ltb/a;Ltb/a$a;)V

    return-object v0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ltb/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private y()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ltb/a;->c:Lac/e;

    iget-wide v1, p0, Ltb/a;->f:J

    invoke-interface {v0, v1, v2}, Lac/e;->U(J)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-wide v1, p0, Ltb/a;->f:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ltb/a;->f:J

    return-object v0
.end method

.method private z()Lob/y;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lob/y$a;

    invoke-direct {v0}, Lob/y$a;-><init>()V

    .line 2
    :goto_0
    invoke-direct {p0}, Ltb/a;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    sget-object v2, Lpb/a;->a:Lpb/a;

    invoke-virtual {v2, v0, v1}, Lpb/a;->a(Lob/y$a;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lob/y$a;->e()Lob/y;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A(Lob/i0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lsb/e;->b(Lob/i0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0, v0, v1}, Ltb/a;->v(J)Lac/t;

    move-result-object p1

    const v0, 0x7fffffff

    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1}, Lpb/e;->F(Lac/t;ILjava/util/concurrent/TimeUnit;)Z

    .line 4
    invoke-interface {p1}, Lac/t;->close()V

    return-void
.end method

.method public B(Lob/y;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Ltb/a;->e:I

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Ltb/a;->d:Lac/d;

    invoke-interface {v0, p2}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    const/4 p2, 0x0

    .line 3
    invoke-virtual {p1}, Lob/y;->h()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_0

    .line 4
    iget-object v2, p0, Ltb/a;->d:Lac/d;

    invoke-virtual {p1, p2}, Lob/y;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v2

    const-string v3, ": "

    .line 5
    invoke-interface {v2, v3}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v2

    .line 6
    invoke-virtual {p1, p2}, Lob/y;->i(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v2

    .line 7
    invoke-interface {v2, v0}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Ltb/a;->d:Lac/d;

    invoke-interface {p1, v0}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    const/4 p1, 0x1

    .line 9
    iput p1, p0, Ltb/a;->e:I

    return-void

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ltb/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Lrb/e;
    .locals 1

    iget-object v0, p0, Ltb/a;->b:Lrb/e;

    return-object v0
.end method

.method public b(Lob/g0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ltb/a;->b:Lrb/e;

    .line 2
    invoke-virtual {v0}, Lrb/e;->r()Lob/k0;

    move-result-object v0

    invoke-virtual {v0}, Lob/k0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    .line 3
    invoke-static {p1, v0}, Lsb/i;->a(Lob/g0;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lob/g0;->e()Lob/y;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Ltb/a;->B(Lob/y;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Ltb/a;->d:Lac/d;

    invoke-interface {v0}, Lac/d;->flush()V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Ltb/a;->b:Lrb/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lrb/e;->d()V

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

    iget-object v0, p0, Ltb/a;->d:Lac/d;

    invoke-interface {v0}, Lac/d;->flush()V

    return-void
.end method

.method public e(Lob/i0;)J
    .locals 2

    .line 1
    invoke-static {p1}, Lsb/e;->c(Lob/i0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const-string v0, "Transfer-Encoding"

    .line 2
    invoke-virtual {p1, v0}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    return-wide v0

    .line 3
    :cond_1
    invoke-static {p1}, Lsb/e;->b(Lob/i0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public f(Lob/g0;J)Lac/s;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v0

    invoke-virtual {v0}, Lob/h0;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const-string v0, "Transfer-Encoding"

    .line 3
    invoke-virtual {p1, v0}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 4
    invoke-direct {p0}, Ltb/a;->t()Lac/s;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    .line 5
    invoke-direct {p0}, Ltb/a;->w()Lac/s;

    move-result-object p1

    return-object p1

    .line 6
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lob/i0;)Lac/t;
    .locals 4

    .line 1
    invoke-static {p1}, Lsb/e;->c(Lob/i0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    .line 2
    invoke-direct {p0, v0, v1}, Ltb/a;->v(J)Lac/t;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "Transfer-Encoding"

    .line 3
    invoke-virtual {p1, v0}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lob/i0;->k0()Lob/g0;

    move-result-object p1

    invoke-virtual {p1}, Lob/g0;->j()Lob/z;

    move-result-object p1

    invoke-direct {p0, p1}, Ltb/a;->u(Lob/z;)Lac/t;

    move-result-object p1

    return-object p1

    .line 5
    :cond_1
    invoke-static {p1}, Lsb/e;->b(Lob/i0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    .line 6
    invoke-direct {p0, v0, v1}, Ltb/a;->v(J)Lac/t;

    move-result-object p1

    return-object p1

    .line 7
    :cond_2
    invoke-direct {p0}, Ltb/a;->x()Lac/t;

    move-result-object p1

    return-object p1
.end method

.method public h(Z)Lob/i0$a;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Ltb/a;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ltb/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    :goto_0
    :try_start_0
    invoke-direct {p0}, Ltb/a;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lsb/k;->a(Ljava/lang/String;)Lsb/k;

    move-result-object v0

    .line 4
    new-instance v2, Lob/i0$a;

    invoke-direct {v2}, Lob/i0$a;-><init>()V

    iget-object v3, v0, Lsb/k;->a:Lob/e0;

    .line 5
    invoke-virtual {v2, v3}, Lob/i0$a;->o(Lob/e0;)Lob/i0$a;

    move-result-object v2

    iget v3, v0, Lsb/k;->b:I

    .line 6
    invoke-virtual {v2, v3}, Lob/i0$a;->g(I)Lob/i0$a;

    move-result-object v2

    iget-object v3, v0, Lsb/k;->c:Ljava/lang/String;

    .line 7
    invoke-virtual {v2, v3}, Lob/i0$a;->l(Ljava/lang/String;)Lob/i0$a;

    move-result-object v2

    .line 8
    invoke-direct {p0}, Ltb/a;->z()Lob/y;

    move-result-object v3

    invoke-virtual {v2, v3}, Lob/i0$a;->j(Lob/y;)Lob/i0$a;

    move-result-object v2

    const/16 v3, 0x64

    if-eqz p1, :cond_2

    .line 9
    iget p1, v0, Lsb/k;->b:I

    if-ne p1, v3, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 10
    :cond_2
    iget p1, v0, Lsb/k;->b:I

    if-ne p1, v3, :cond_3

    .line 11
    iput v1, p0, Ltb/a;->e:I

    return-object v2

    :cond_3
    const/4 p1, 0x4

    .line 12
    iput p1, p0, Ltb/a;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    .line 13
    iget-object v0, p0, Ltb/a;->b:Lrb/e;

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {v0}, Lrb/e;->r()Lob/k0;

    move-result-object v0

    invoke-virtual {v0}, Lob/k0;->a()Lob/a;

    move-result-object v0

    invoke-virtual {v0}, Lob/a;->l()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->B()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const-string v0, "unknown"

    .line 15
    :goto_1
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unexpected end of stream on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
