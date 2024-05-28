.class final Lac/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/d;


# instance fields
.field public final n:Lac/c;

.field public final o:Lac/s;

.field p:Z


# direct methods
.method constructor <init>(Lac/s;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lac/c;

    invoke-direct {v0}, Lac/c;-><init>()V

    iput-object v0, p0, Lac/n;->n:Lac/c;

    const-string v0, "sink == null"

    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    iput-object p1, p0, Lac/n;->o:Lac/s;

    return-void
.end method


# virtual methods
.method public C(Lac/c;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1, p2, p3}, Lac/c;->C(Lac/c;J)V

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public E(Lac/f;)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1}, Lac/c;->C0(Lac/f;)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public G(I)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1}, Lac/c;->G0(I)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public M([B)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1}, Lac/c;->D0([B)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public R()Lac/d;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0}, Lac/c;->j0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 3
    iget-object v2, p0, Lac/n;->o:Lac/s;

    iget-object v3, p0, Lac/n;->n:Lac/c;

    invoke-interface {v2, v3, v0, v1}, Lac/s;->C(Lac/c;J)V

    :cond_0
    return-object p0

    .line 4
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()Lac/c;
    .locals 1

    iget-object v0, p0, Lac/n;->n:Lac/c;

    return-object v0
.end method

.method public b0(Ljava/lang/String;)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1}, Lac/c;->M0(Ljava/lang/String;)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c0(J)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1, p2}, Lac/c;->H0(J)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lac/n;->n:Lac/c;

    iget-wide v2, v1, Lac/c;->o:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    .line 3
    iget-object v4, p0, Lac/n;->o:Lac/s;

    invoke-interface {v4, v1, v2, v3}, Lac/s;->C(Lac/c;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Lac/n;->o:Lac/s;

    invoke-interface {v1}, Lac/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lac/n;->p:Z

    if-eqz v0, :cond_3

    .line 6
    invoke-static {v0}, Lac/v;->e(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public f()Lac/u;
    .locals 1

    iget-object v0, p0, Lac/n;->o:Lac/s;

    invoke-interface {v0}, Lac/s;->f()Lac/u;

    move-result-object v0

    return-object v0
.end method

.method public flush()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    iget-wide v1, v0, Lac/c;->o:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 3
    iget-object v3, p0, Lac/n;->o:Lac/s;

    invoke-interface {v3, v0, v1, v2}, Lac/s;->C(Lac/c;J)V

    .line 4
    :cond_0
    iget-object v0, p0, Lac/n;->o:Lac/s;

    invoke-interface {v0}, Lac/s;->flush()V

    return-void

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h([BII)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1, p2, p3}, Lac/c;->E0([BII)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lac/n;->p:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public n(J)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1, p2}, Lac/c;->I0(J)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(I)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1}, Lac/c;->K0(I)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lac/n;->o:Lac/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1}, Lac/c;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    return p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x(I)Lac/d;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lac/n;->p:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lac/n;->n:Lac/c;

    invoke-virtual {v0, p1}, Lac/c;->J0(I)Lac/c;

    .line 3
    invoke-virtual {p0}, Lac/n;->R()Lac/d;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
