.class public Lob/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Lob/g0;

.field b:Lob/e0;

.field c:I

.field d:Ljava/lang/String;

.field e:Lob/x;

.field f:Lob/y$a;

.field g:Lob/j0;

.field h:Lob/i0;

.field i:Lob/i0;

.field j:Lob/i0;

.field k:J

.field l:J

.field m:Lrb/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lob/i0$a;->c:I

    .line 3
    new-instance v0, Lob/y$a;

    invoke-direct {v0}, Lob/y$a;-><init>()V

    iput-object v0, p0, Lob/i0$a;->f:Lob/y$a;

    return-void
.end method

.method constructor <init>(Lob/i0;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lob/i0$a;->c:I

    .line 6
    iget-object v0, p1, Lob/i0;->n:Lob/g0;

    iput-object v0, p0, Lob/i0$a;->a:Lob/g0;

    .line 7
    iget-object v0, p1, Lob/i0;->o:Lob/e0;

    iput-object v0, p0, Lob/i0$a;->b:Lob/e0;

    .line 8
    iget v0, p1, Lob/i0;->p:I

    iput v0, p0, Lob/i0$a;->c:I

    .line 9
    iget-object v0, p1, Lob/i0;->q:Ljava/lang/String;

    iput-object v0, p0, Lob/i0$a;->d:Ljava/lang/String;

    .line 10
    iget-object v0, p1, Lob/i0;->r:Lob/x;

    iput-object v0, p0, Lob/i0$a;->e:Lob/x;

    .line 11
    iget-object v0, p1, Lob/i0;->s:Lob/y;

    invoke-virtual {v0}, Lob/y;->f()Lob/y$a;

    move-result-object v0

    iput-object v0, p0, Lob/i0$a;->f:Lob/y$a;

    .line 12
    iget-object v0, p1, Lob/i0;->t:Lob/j0;

    iput-object v0, p0, Lob/i0$a;->g:Lob/j0;

    .line 13
    iget-object v0, p1, Lob/i0;->u:Lob/i0;

    iput-object v0, p0, Lob/i0$a;->h:Lob/i0;

    .line 14
    iget-object v0, p1, Lob/i0;->v:Lob/i0;

    iput-object v0, p0, Lob/i0$a;->i:Lob/i0;

    .line 15
    iget-object v0, p1, Lob/i0;->w:Lob/i0;

    iput-object v0, p0, Lob/i0$a;->j:Lob/i0;

    .line 16
    iget-wide v0, p1, Lob/i0;->x:J

    iput-wide v0, p0, Lob/i0$a;->k:J

    .line 17
    iget-wide v0, p1, Lob/i0;->y:J

    iput-wide v0, p0, Lob/i0$a;->l:J

    .line 18
    iget-object p1, p1, Lob/i0;->z:Lrb/c;

    iput-object p1, p0, Lob/i0$a;->m:Lrb/c;

    return-void
.end method

.method private e(Lob/i0;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lob/i0;->t:Lob/j0;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private f(Ljava/lang/String;Lob/i0;)V
    .locals 1

    .line 1
    iget-object v0, p2, Lob/i0;->t:Lob/j0;

    if-nez v0, :cond_3

    .line 2
    iget-object v0, p2, Lob/i0;->u:Lob/i0;

    if-nez v0, :cond_2

    .line 3
    iget-object v0, p2, Lob/i0;->v:Lob/i0;

    if-nez v0, :cond_1

    .line 4
    iget-object p2, p2, Lob/i0;->w:Lob/i0;

    if-nez p2, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".priorResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 6
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cacheResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 7
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".networkResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 8
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".body != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lob/i0$a;
    .locals 1

    iget-object v0, p0, Lob/i0$a;->f:Lob/y$a;

    invoke-virtual {v0, p1, p2}, Lob/y$a;->a(Ljava/lang/String;Ljava/lang/String;)Lob/y$a;

    return-object p0
.end method

.method public b(Lob/j0;)Lob/i0$a;
    .locals 0

    iput-object p1, p0, Lob/i0$a;->g:Lob/j0;

    return-object p0
.end method

.method public c()Lob/i0;
    .locals 3

    .line 1
    iget-object v0, p0, Lob/i0$a;->a:Lob/g0;

    if-eqz v0, :cond_3

    .line 2
    iget-object v0, p0, Lob/i0$a;->b:Lob/e0;

    if-eqz v0, :cond_2

    .line 3
    iget v0, p0, Lob/i0$a;->c:I

    if-ltz v0, :cond_1

    .line 4
    iget-object v0, p0, Lob/i0$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 5
    new-instance v0, Lob/i0;

    invoke-direct {v0, p0}, Lob/i0;-><init>(Lob/i0$a;)V

    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lob/i0$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lob/i0;)Lob/i0$a;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "cacheResponse"

    .line 1
    invoke-direct {p0, v0, p1}, Lob/i0$a;->f(Ljava/lang/String;Lob/i0;)V

    .line 2
    :cond_0
    iput-object p1, p0, Lob/i0$a;->i:Lob/i0;

    return-object p0
.end method

.method public g(I)Lob/i0$a;
    .locals 0

    iput p1, p0, Lob/i0$a;->c:I

    return-object p0
.end method

.method public h(Lob/x;)Lob/i0$a;
    .locals 0

    iput-object p1, p0, Lob/i0$a;->e:Lob/x;

    return-object p0
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Lob/i0$a;
    .locals 1

    iget-object v0, p0, Lob/i0$a;->f:Lob/y$a;

    invoke-virtual {v0, p1, p2}, Lob/y$a;->h(Ljava/lang/String;Ljava/lang/String;)Lob/y$a;

    return-object p0
.end method

.method public j(Lob/y;)Lob/i0$a;
    .locals 0

    invoke-virtual {p1}, Lob/y;->f()Lob/y$a;

    move-result-object p1

    iput-object p1, p0, Lob/i0$a;->f:Lob/y$a;

    return-object p0
.end method

.method k(Lrb/c;)V
    .locals 0

    iput-object p1, p0, Lob/i0$a;->m:Lrb/c;

    return-void
.end method

.method public l(Ljava/lang/String;)Lob/i0$a;
    .locals 0

    iput-object p1, p0, Lob/i0$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public m(Lob/i0;)Lob/i0$a;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "networkResponse"

    .line 1
    invoke-direct {p0, v0, p1}, Lob/i0$a;->f(Ljava/lang/String;Lob/i0;)V

    .line 2
    :cond_0
    iput-object p1, p0, Lob/i0$a;->h:Lob/i0;

    return-object p0
.end method

.method public n(Lob/i0;)Lob/i0$a;
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0, p1}, Lob/i0$a;->e(Lob/i0;)V

    .line 2
    :cond_0
    iput-object p1, p0, Lob/i0$a;->j:Lob/i0;

    return-object p0
.end method

.method public o(Lob/e0;)Lob/i0$a;
    .locals 0

    iput-object p1, p0, Lob/i0$a;->b:Lob/e0;

    return-object p0
.end method

.method public p(J)Lob/i0$a;
    .locals 0

    iput-wide p1, p0, Lob/i0$a;->l:J

    return-object p0
.end method

.method public q(Lob/g0;)Lob/i0$a;
    .locals 0

    iput-object p1, p0, Lob/i0$a;->a:Lob/g0;

    return-object p0
.end method

.method public r(J)Lob/i0$a;
    .locals 0

    iput-wide p1, p0, Lob/i0$a;->k:J

    return-object p0
.end method
