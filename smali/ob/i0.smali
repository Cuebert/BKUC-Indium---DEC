.class public final Lob/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lob/i0$a;
    }
.end annotation


# instance fields
.field private volatile A:Lob/f;

.field final n:Lob/g0;

.field final o:Lob/e0;

.field final p:I

.field final q:Ljava/lang/String;

.field final r:Lob/x;

.field final s:Lob/y;

.field final t:Lob/j0;

.field final u:Lob/i0;

.field final v:Lob/i0;

.field final w:Lob/i0;

.field final x:J

.field final y:J

.field final z:Lrb/c;


# direct methods
.method constructor <init>(Lob/i0$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lob/i0$a;->a:Lob/g0;

    iput-object v0, p0, Lob/i0;->n:Lob/g0;

    .line 3
    iget-object v0, p1, Lob/i0$a;->b:Lob/e0;

    iput-object v0, p0, Lob/i0;->o:Lob/e0;

    .line 4
    iget v0, p1, Lob/i0$a;->c:I

    iput v0, p0, Lob/i0;->p:I

    .line 5
    iget-object v0, p1, Lob/i0$a;->d:Ljava/lang/String;

    iput-object v0, p0, Lob/i0;->q:Ljava/lang/String;

    .line 6
    iget-object v0, p1, Lob/i0$a;->e:Lob/x;

    iput-object v0, p0, Lob/i0;->r:Lob/x;

    .line 7
    iget-object v0, p1, Lob/i0$a;->f:Lob/y$a;

    invoke-virtual {v0}, Lob/y$a;->e()Lob/y;

    move-result-object v0

    iput-object v0, p0, Lob/i0;->s:Lob/y;

    .line 8
    iget-object v0, p1, Lob/i0$a;->g:Lob/j0;

    iput-object v0, p0, Lob/i0;->t:Lob/j0;

    .line 9
    iget-object v0, p1, Lob/i0$a;->h:Lob/i0;

    iput-object v0, p0, Lob/i0;->u:Lob/i0;

    .line 10
    iget-object v0, p1, Lob/i0$a;->i:Lob/i0;

    iput-object v0, p0, Lob/i0;->v:Lob/i0;

    .line 11
    iget-object v0, p1, Lob/i0$a;->j:Lob/i0;

    iput-object v0, p0, Lob/i0;->w:Lob/i0;

    .line 12
    iget-wide v0, p1, Lob/i0$a;->k:J

    iput-wide v0, p0, Lob/i0;->x:J

    .line 13
    iget-wide v0, p1, Lob/i0$a;->l:J

    iput-wide v0, p0, Lob/i0;->y:J

    .line 14
    iget-object p1, p1, Lob/i0$a;->m:Lrb/c;

    iput-object p1, p0, Lob/i0;->z:Lrb/c;

    return-void
.end method


# virtual methods
.method public O()Lob/y;
    .locals 1

    iget-object v0, p0, Lob/i0;->s:Lob/y;

    return-object v0
.end method

.method public Q()Z
    .locals 2

    iget v0, p0, Lob/i0;->p:I

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public T()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lob/i0;->q:Ljava/lang/String;

    return-object v0
.end method

.method public W()Lob/i0;
    .locals 1

    iget-object v0, p0, Lob/i0;->u:Lob/i0;

    return-object v0
.end method

.method public X()Lob/i0$a;
    .locals 1

    new-instance v0, Lob/i0$a;

    invoke-direct {v0, p0}, Lob/i0$a;-><init>(Lob/i0;)V

    return-object v0
.end method

.method public Y()Lob/i0;
    .locals 1

    iget-object v0, p0, Lob/i0;->w:Lob/i0;

    return-object v0
.end method

.method public b()Lob/j0;
    .locals 1

    iget-object v0, p0, Lob/i0;->t:Lob/j0;

    return-object v0
.end method

.method public c()Lob/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lob/i0;->A:Lob/f;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lob/i0;->s:Lob/y;

    invoke-static {v0}, Lob/f;->k(Lob/y;)Lob/f;

    move-result-object v0

    iput-object v0, p0, Lob/i0;->A:Lob/f;

    :goto_0
    return-object v0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lob/i0;->t:Lob/j0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lob/j0;->close()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lob/i0;->p:I

    return v0
.end method

.method public e0()Lob/e0;
    .locals 1

    iget-object v0, p0, Lob/i0;->o:Lob/e0;

    return-object v0
.end method

.method public i()Lob/x;
    .locals 1

    iget-object v0, p0, Lob/i0;->r:Lob/x;

    return-object v0
.end method

.method public j0()J
    .locals 2

    iget-wide v0, p0, Lob/i0;->y:J

    return-wide v0
.end method

.method public k0()Lob/g0;
    .locals 1

    iget-object v0, p0, Lob/i0;->n:Lob/g0;

    return-object v0
.end method

.method public l(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lob/i0;->z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l0()J
    .locals 2

    iget-wide v0, p0, Lob/i0;->x:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/i0;->o:Lob/e0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lob/i0;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/i0;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/i0;->n:Lob/g0;

    .line 2
    invoke-virtual {v1}, Lob/g0;->j()Lob/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lob/i0;->s:Lob/y;

    invoke-virtual {v0, p1}, Lob/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object p2, p1

    :cond_0
    return-object p2
.end method
