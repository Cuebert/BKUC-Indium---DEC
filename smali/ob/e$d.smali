.class final Lob/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lob/y;

.field private final c:Ljava/lang/String;

.field private final d:Lob/e0;

.field private final e:I

.field private final f:Ljava/lang/String;

.field private final g:Lob/y;

.field private final h:Lob/x;

.field private final i:J

.field private final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v1

    invoke-virtual {v1}, Lwb/f;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-Sent-Millis"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lob/e$d;->k:Ljava/lang/String;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lwb/f;->l()Lwb/f;

    move-result-object v1

    invoke-virtual {v1}, Lwb/f;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-Received-Millis"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lob/e$d;->l:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lac/t;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    invoke-static {p1}, Lac/l;->d(Lac/t;)Lac/e;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Lac/e;->B()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lob/e$d;->a:Ljava/lang/String;

    .line 4
    invoke-interface {v0}, Lac/e;->B()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lob/e$d;->c:Ljava/lang/String;

    .line 5
    new-instance v1, Lob/y$a;

    invoke-direct {v1}, Lob/y$a;-><init>()V

    .line 6
    invoke-static {v0}, Lob/e;->l(Lac/e;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 7
    invoke-interface {v0}, Lac/e;->B()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lob/y$a;->c(Ljava/lang/String;)Lob/y$a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Lob/y$a;->e()Lob/y;

    move-result-object v1

    iput-object v1, p0, Lob/e$d;->b:Lob/y;

    .line 9
    invoke-interface {v0}, Lac/e;->B()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lsb/k;->a(Ljava/lang/String;)Lsb/k;

    move-result-object v1

    .line 10
    iget-object v2, v1, Lsb/k;->a:Lob/e0;

    iput-object v2, p0, Lob/e$d;->d:Lob/e0;

    .line 11
    iget v2, v1, Lsb/k;->b:I

    iput v2, p0, Lob/e$d;->e:I

    .line 12
    iget-object v1, v1, Lsb/k;->c:Ljava/lang/String;

    iput-object v1, p0, Lob/e$d;->f:Ljava/lang/String;

    .line 13
    new-instance v1, Lob/y$a;

    invoke-direct {v1}, Lob/y$a;-><init>()V

    .line 14
    invoke-static {v0}, Lob/e;->l(Lac/e;)I

    move-result v2

    :goto_1
    if-ge v3, v2, :cond_1

    .line 15
    invoke-interface {v0}, Lac/e;->B()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lob/y$a;->c(Ljava/lang/String;)Lob/y$a;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 16
    :cond_1
    sget-object v2, Lob/e$d;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lob/y$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 17
    sget-object v4, Lob/e$d;->l:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lob/y$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 18
    invoke-virtual {v1, v2}, Lob/y$a;->g(Ljava/lang/String;)Lob/y$a;

    .line 19
    invoke-virtual {v1, v4}, Lob/y$a;->g(Ljava/lang/String;)Lob/y$a;

    const-wide/16 v6, 0x0

    if-eqz v3, :cond_2

    .line 20
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    goto :goto_2

    :cond_2
    move-wide v2, v6

    .line 21
    :goto_2
    iput-wide v2, p0, Lob/e$d;->i:J

    if-eqz v5, :cond_3

    .line 22
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 23
    :cond_3
    iput-wide v6, p0, Lob/e$d;->j:J

    .line 24
    invoke-virtual {v1}, Lob/y$a;->e()Lob/y;

    move-result-object v1

    iput-object v1, p0, Lob/e$d;->g:Lob/y;

    .line 25
    invoke-direct {p0}, Lob/e$d;->a()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 26
    invoke-interface {v0}, Lac/e;->B()Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_5

    .line 28
    invoke-interface {v0}, Lac/e;->B()Ljava/lang/String;

    move-result-object v1

    .line 29
    invoke-static {v1}, Lob/k;->b(Ljava/lang/String;)Lob/k;

    move-result-object v1

    .line 30
    invoke-direct {p0, v0}, Lob/e$d;->c(Lac/e;)Ljava/util/List;

    move-result-object v2

    .line 31
    invoke-direct {p0, v0}, Lob/e$d;->c(Lac/e;)Ljava/util/List;

    move-result-object v3

    .line 32
    invoke-interface {v0}, Lac/e;->F()Z

    move-result v4

    if-nez v4, :cond_4

    .line 33
    invoke-interface {v0}, Lac/e;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lob/l0;->b(Ljava/lang/String;)Lob/l0;

    move-result-object v0

    goto :goto_3

    .line 34
    :cond_4
    sget-object v0, Lob/l0;->s:Lob/l0;

    .line 35
    :goto_3
    invoke-static {v0, v1, v2, v3}, Lob/x;->c(Lob/l0;Lob/k;Ljava/util/List;Ljava/util/List;)Lob/x;

    move-result-object v0

    iput-object v0, p0, Lob/e$d;->h:Lob/x;

    goto :goto_4

    .line 36
    :cond_5
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lob/e$d;->h:Lob/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    :goto_4
    invoke-interface {p1}, Lac/t;->close()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Lac/t;->close()V

    throw v0
.end method

.method constructor <init>(Lob/i0;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Lob/i0;->k0()Lob/g0;

    move-result-object v0

    invoke-virtual {v0}, Lob/g0;->j()Lob/z;

    move-result-object v0

    invoke-virtual {v0}, Lob/z;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lob/e$d;->a:Ljava/lang/String;

    .line 41
    invoke-static {p1}, Lsb/e;->n(Lob/i0;)Lob/y;

    move-result-object v0

    iput-object v0, p0, Lob/e$d;->b:Lob/y;

    .line 42
    invoke-virtual {p1}, Lob/i0;->k0()Lob/g0;

    move-result-object v0

    invoke-virtual {v0}, Lob/g0;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lob/e$d;->c:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Lob/i0;->e0()Lob/e0;

    move-result-object v0

    iput-object v0, p0, Lob/e$d;->d:Lob/e0;

    .line 44
    invoke-virtual {p1}, Lob/i0;->e()I

    move-result v0

    iput v0, p0, Lob/e$d;->e:I

    .line 45
    invoke-virtual {p1}, Lob/i0;->T()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lob/e$d;->f:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Lob/i0;->O()Lob/y;

    move-result-object v0

    iput-object v0, p0, Lob/e$d;->g:Lob/y;

    .line 47
    invoke-virtual {p1}, Lob/i0;->i()Lob/x;

    move-result-object v0

    iput-object v0, p0, Lob/e$d;->h:Lob/x;

    .line 48
    invoke-virtual {p1}, Lob/i0;->l0()J

    move-result-wide v0

    iput-wide v0, p0, Lob/e$d;->i:J

    .line 49
    invoke-virtual {p1}, Lob/i0;->j0()J

    move-result-wide v0

    iput-wide v0, p0, Lob/e$d;->j:J

    return-void
.end method

.method private a()Z
    .locals 2

    iget-object v0, p0, Lob/e$d;->a:Ljava/lang/String;

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c(Lac/e;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lac/e;",
            ")",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lob/e;->l(Lac/e;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    :try_start_0
    const-string v1, "X.509"

    .line 3
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v1

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 5
    invoke-interface {p1}, Lac/e;->B()Ljava/lang/String;

    move-result-object v4

    .line 6
    new-instance v5, Lac/c;

    invoke-direct {v5}, Lac/c;-><init>()V

    .line 7
    invoke-static {v4}, Lac/f;->e(Ljava/lang/String;)Lac/f;

    move-result-object v4

    invoke-virtual {v5, v4}, Lac/c;->C0(Lac/f;)Lac/c;

    .line 8
    invoke-virtual {v5}, Lac/c;->i0()Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2

    :catch_0
    move-exception p1

    .line 9
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private e(Lac/d;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lac/d;",
            "Ljava/util/List<",
            "Ljava/security/cert/Certificate;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lac/d;->c0(J)Lac/d;

    move-result-object v0

    const/16 v1, 0xa

    .line 2
    invoke-interface {v0, v1}, Lac/d;->G(I)Lac/d;

    const/4 v0, 0x0

    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_0

    .line 4
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/Certificate;

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v3

    .line 5
    invoke-static {v3}, Lac/f;->m([B)Lac/f;

    move-result-object v3

    invoke-virtual {v3}, Lac/f;->b()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-interface {p1, v3}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v3

    .line 7
    invoke-interface {v3, v1}, Lac/d;->G(I)Lac/d;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 8
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/security/cert/CertificateEncodingException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public b(Lob/g0;Lob/i0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lob/e$d;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lob/g0;->j()Lob/z;

    move-result-object v1

    invoke-virtual {v1}, Lob/z;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lob/e$d;->c:Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Lob/g0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lob/e$d;->b:Lob/y;

    .line 3
    invoke-static {p2, v0, p1}, Lsb/e;->o(Lob/i0;Lob/y;Lob/g0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Lqb/d$e;)Lob/i0;
    .locals 5

    .line 1
    iget-object v0, p0, Lob/e$d;->g:Lob/y;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Lob/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lob/e$d;->g:Lob/y;

    const-string v2, "Content-Length"

    invoke-virtual {v1, v2}, Lob/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    new-instance v2, Lob/g0$a;

    invoke-direct {v2}, Lob/g0$a;-><init>()V

    iget-object v3, p0, Lob/e$d;->a:Ljava/lang/String;

    .line 4
    invoke-virtual {v2, v3}, Lob/g0$a;->h(Ljava/lang/String;)Lob/g0$a;

    move-result-object v2

    iget-object v3, p0, Lob/e$d;->c:Ljava/lang/String;

    const/4 v4, 0x0

    .line 5
    invoke-virtual {v2, v3, v4}, Lob/g0$a;->d(Ljava/lang/String;Lob/h0;)Lob/g0$a;

    move-result-object v2

    iget-object v3, p0, Lob/e$d;->b:Lob/y;

    .line 6
    invoke-virtual {v2, v3}, Lob/g0$a;->c(Lob/y;)Lob/g0$a;

    move-result-object v2

    .line 7
    invoke-virtual {v2}, Lob/g0$a;->a()Lob/g0;

    move-result-object v2

    .line 8
    new-instance v3, Lob/i0$a;

    invoke-direct {v3}, Lob/i0$a;-><init>()V

    .line 9
    invoke-virtual {v3, v2}, Lob/i0$a;->q(Lob/g0;)Lob/i0$a;

    move-result-object v2

    iget-object v3, p0, Lob/e$d;->d:Lob/e0;

    .line 10
    invoke-virtual {v2, v3}, Lob/i0$a;->o(Lob/e0;)Lob/i0$a;

    move-result-object v2

    iget v3, p0, Lob/e$d;->e:I

    .line 11
    invoke-virtual {v2, v3}, Lob/i0$a;->g(I)Lob/i0$a;

    move-result-object v2

    iget-object v3, p0, Lob/e$d;->f:Ljava/lang/String;

    .line 12
    invoke-virtual {v2, v3}, Lob/i0$a;->l(Ljava/lang/String;)Lob/i0$a;

    move-result-object v2

    iget-object v3, p0, Lob/e$d;->g:Lob/y;

    .line 13
    invoke-virtual {v2, v3}, Lob/i0$a;->j(Lob/y;)Lob/i0$a;

    move-result-object v2

    new-instance v3, Lob/e$c;

    invoke-direct {v3, p1, v0, v1}, Lob/e$c;-><init>(Lqb/d$e;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {v2, v3}, Lob/i0$a;->b(Lob/j0;)Lob/i0$a;

    move-result-object p1

    iget-object v0, p0, Lob/e$d;->h:Lob/x;

    .line 15
    invoke-virtual {p1, v0}, Lob/i0$a;->h(Lob/x;)Lob/i0$a;

    move-result-object p1

    iget-wide v0, p0, Lob/e$d;->i:J

    .line 16
    invoke-virtual {p1, v0, v1}, Lob/i0$a;->r(J)Lob/i0$a;

    move-result-object p1

    iget-wide v0, p0, Lob/e$d;->j:J

    .line 17
    invoke-virtual {p1, v0, v1}, Lob/i0$a;->p(J)Lob/i0$a;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lob/i0$a;->c()Lob/i0;

    move-result-object p1

    return-object p1
.end method

.method public f(Lqb/d$c;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Lqb/d$c;->d(I)Lac/s;

    move-result-object p1

    invoke-static {p1}, Lac/l;->c(Lac/s;)Lac/d;

    move-result-object p1

    .line 2
    iget-object v1, p0, Lob/e$d;->a:Ljava/lang/String;

    invoke-interface {p1, v1}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v1

    const/16 v2, 0xa

    .line 3
    invoke-interface {v1, v2}, Lac/d;->G(I)Lac/d;

    .line 4
    iget-object v1, p0, Lob/e$d;->c:Ljava/lang/String;

    invoke-interface {p1, v1}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v1

    .line 5
    invoke-interface {v1, v2}, Lac/d;->G(I)Lac/d;

    .line 6
    iget-object v1, p0, Lob/e$d;->b:Lob/y;

    invoke-virtual {v1}, Lob/y;->h()I

    move-result v1

    int-to-long v3, v1

    invoke-interface {p1, v3, v4}, Lac/d;->c0(J)Lac/d;

    move-result-object v1

    .line 7
    invoke-interface {v1, v2}, Lac/d;->G(I)Lac/d;

    .line 8
    iget-object v1, p0, Lob/e$d;->b:Lob/y;

    invoke-virtual {v1}, Lob/y;->h()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    const-string v4, ": "

    if-ge v3, v1, :cond_0

    .line 9
    iget-object v5, p0, Lob/e$d;->b:Lob/y;

    invoke-virtual {v5, v3}, Lob/y;->e(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v5

    .line 10
    invoke-interface {v5, v4}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v4

    iget-object v5, p0, Lob/e$d;->b:Lob/y;

    .line 11
    invoke-virtual {v5, v3}, Lob/y;->i(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v4

    .line 12
    invoke-interface {v4, v2}, Lac/d;->G(I)Lac/d;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lsb/k;

    iget-object v3, p0, Lob/e$d;->d:Lob/e0;

    iget v5, p0, Lob/e$d;->e:I

    iget-object v6, p0, Lob/e$d;->f:Ljava/lang/String;

    invoke-direct {v1, v3, v5, v6}, Lsb/k;-><init>(Lob/e0;ILjava/lang/String;)V

    invoke-virtual {v1}, Lsb/k;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v1

    .line 14
    invoke-interface {v1, v2}, Lac/d;->G(I)Lac/d;

    .line 15
    iget-object v1, p0, Lob/e$d;->g:Lob/y;

    invoke-virtual {v1}, Lob/y;->h()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    int-to-long v5, v1

    invoke-interface {p1, v5, v6}, Lac/d;->c0(J)Lac/d;

    move-result-object v1

    .line 16
    invoke-interface {v1, v2}, Lac/d;->G(I)Lac/d;

    .line 17
    iget-object v1, p0, Lob/e$d;->g:Lob/y;

    invoke-virtual {v1}, Lob/y;->h()I

    move-result v1

    :goto_1
    if-ge v0, v1, :cond_1

    .line 18
    iget-object v3, p0, Lob/e$d;->g:Lob/y;

    invoke-virtual {v3, v0}, Lob/y;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v3

    .line 19
    invoke-interface {v3, v4}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v3

    iget-object v5, p0, Lob/e$d;->g:Lob/y;

    .line 20
    invoke-virtual {v5, v0}, Lob/y;->i(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v3

    .line 21
    invoke-interface {v3, v2}, Lac/d;->G(I)Lac/d;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 22
    :cond_1
    sget-object v0, Lob/e$d;->k:Ljava/lang/String;

    invoke-interface {p1, v0}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v0

    .line 23
    invoke-interface {v0, v4}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v0

    iget-wide v5, p0, Lob/e$d;->i:J

    .line 24
    invoke-interface {v0, v5, v6}, Lac/d;->c0(J)Lac/d;

    move-result-object v0

    .line 25
    invoke-interface {v0, v2}, Lac/d;->G(I)Lac/d;

    .line 26
    sget-object v0, Lob/e$d;->l:Ljava/lang/String;

    invoke-interface {p1, v0}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v0

    .line 27
    invoke-interface {v0, v4}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v0

    iget-wide v3, p0, Lob/e$d;->j:J

    .line 28
    invoke-interface {v0, v3, v4}, Lac/d;->c0(J)Lac/d;

    move-result-object v0

    .line 29
    invoke-interface {v0, v2}, Lac/d;->G(I)Lac/d;

    .line 30
    invoke-direct {p0}, Lob/e$d;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31
    invoke-interface {p1, v2}, Lac/d;->G(I)Lac/d;

    .line 32
    iget-object v0, p0, Lob/e$d;->h:Lob/x;

    invoke-virtual {v0}, Lob/x;->a()Lob/k;

    move-result-object v0

    invoke-virtual {v0}, Lob/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v0

    .line 33
    invoke-interface {v0, v2}, Lac/d;->G(I)Lac/d;

    .line 34
    iget-object v0, p0, Lob/e$d;->h:Lob/x;

    invoke-virtual {v0}, Lob/x;->f()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lob/e$d;->e(Lac/d;Ljava/util/List;)V

    .line 35
    iget-object v0, p0, Lob/e$d;->h:Lob/x;

    invoke-virtual {v0}, Lob/x;->d()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lob/e$d;->e(Lac/d;Ljava/util/List;)V

    .line 36
    iget-object v0, p0, Lob/e$d;->h:Lob/x;

    invoke-virtual {v0}, Lob/x;->g()Lob/l0;

    move-result-object v0

    invoke-virtual {v0}, Lob/l0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    move-result-object v0

    invoke-interface {v0, v2}, Lac/d;->G(I)Lac/d;

    .line 37
    :cond_2
    invoke-interface {p1}, Lac/s;->close()V

    return-void
.end method
