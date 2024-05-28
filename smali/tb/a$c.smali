.class final Ltb/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final n:Lac/i;

.field private o:Z

.field final synthetic p:Ltb/a;


# direct methods
.method constructor <init>(Ltb/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ltb/a$c;->p:Ltb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lac/i;

    invoke-static {p1}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object p1

    invoke-interface {p1}, Lac/s;->f()Lac/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lac/i;-><init>(Lac/u;)V

    iput-object v0, p0, Ltb/a$c;->n:Lac/i;

    return-void
.end method


# virtual methods
.method public C(Lac/c;J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Ltb/a$c;->o:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Ltb/a$c;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lac/d;->n(J)Lac/d;

    .line 3
    iget-object v0, p0, Ltb/a$c;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    .line 4
    iget-object v0, p0, Ltb/a$c;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lac/s;->C(Lac/c;J)V

    .line 5
    iget-object p1, p0, Ltb/a$c;->p:Ltb/a;

    invoke-static {p1}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object p1

    invoke-interface {p1, v1}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    return-void

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Ltb/a$c;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    :try_start_1
    iput-boolean v0, p0, Ltb/a$c;->o:Z

    .line 3
    iget-object v0, p0, Ltb/a$c;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object v0

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lac/d;->b0(Ljava/lang/String;)Lac/d;

    .line 4
    iget-object v0, p0, Ltb/a$c;->p:Ltb/a;

    iget-object v1, p0, Ltb/a$c;->n:Lac/i;

    invoke-static {v0, v1}, Ltb/a;->k(Ltb/a;Lac/i;)V

    .line 5
    iget-object v0, p0, Ltb/a$c;->p:Ltb/a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ltb/a;->m(Ltb/a;I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public f()Lac/u;
    .locals 1

    iget-object v0, p0, Ltb/a$c;->n:Lac/i;

    return-object v0
.end method

.method public declared-synchronized flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Ltb/a$c;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 2
    :cond_0
    :try_start_1
    iget-object v0, p0, Ltb/a$c;->p:Ltb/a;

    invoke-static {v0}, Ltb/a;->j(Ltb/a;)Lac/d;

    move-result-object v0

    invoke-interface {v0}, Lac/d;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
