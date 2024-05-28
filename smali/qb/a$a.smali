.class Lqb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lac/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqb/a;->b(Lqb/b;Lob/i0;)Lob/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field n:Z

.field final synthetic o:Lac/e;

.field final synthetic p:Lqb/b;

.field final synthetic q:Lac/d;

.field final synthetic r:Lqb/a;


# direct methods
.method constructor <init>(Lqb/a;Lac/e;Lqb/b;Lac/d;)V
    .locals 0

    iput-object p1, p0, Lqb/a$a;->r:Lqb/a;

    iput-object p2, p0, Lqb/a$a;->o:Lac/e;

    iput-object p3, p0, Lqb/a$a;->p:Lqb/b;

    iput-object p4, p0, Lqb/a$a;->q:Lac/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public V(Lac/c;J)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget-object v1, p0, Lqb/a$a;->o:Lac/e;

    invoke-interface {v1, p1, p2, p3}, Lac/t;->V(Lac/c;J)J

    move-result-wide p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-nez v3, :cond_1

    .line 2
    iget-boolean p1, p0, Lqb/a$a;->n:Z

    if-nez p1, :cond_0

    .line 3
    iput-boolean v0, p0, Lqb/a$a;->n:Z

    .line 4
    iget-object p1, p0, Lqb/a$a;->q:Lac/d;

    invoke-interface {p1}, Lac/s;->close()V

    :cond_0
    return-wide v1

    .line 5
    :cond_1
    iget-object v0, p0, Lqb/a$a;->q:Lac/d;

    invoke-interface {v0}, Lac/d;->a()Lac/c;

    move-result-object v3

    invoke-virtual {p1}, Lac/c;->y0()J

    move-result-wide v0

    sub-long v4, v0, p2

    move-object v2, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, Lac/c;->k0(Lac/c;JJ)Lac/c;

    .line 6
    iget-object p1, p0, Lqb/a$a;->q:Lac/d;

    invoke-interface {p1}, Lac/d;->R()Lac/d;

    return-wide p2

    :catch_0
    move-exception p1

    .line 7
    iget-boolean p2, p0, Lqb/a$a;->n:Z

    if-nez p2, :cond_2

    .line 8
    iput-boolean v0, p0, Lqb/a$a;->n:Z

    .line 9
    iget-object p2, p0, Lqb/a$a;->p:Lqb/b;

    invoke-interface {p2}, Lqb/b;->b()V

    .line 10
    :cond_2
    throw p1
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lqb/a$a;->n:Z

    if-nez v0, :cond_0

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    invoke-static {p0, v0, v1}, Lpb/e;->p(Lac/t;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lqb/a$a;->n:Z

    .line 4
    iget-object v0, p0, Lqb/a$a;->p:Lqb/b;

    invoke-interface {v0}, Lqb/b;->b()V

    .line 5
    :cond_0
    iget-object v0, p0, Lqb/a$a;->o:Lac/e;

    invoke-interface {v0}, Lac/t;->close()V

    return-void
.end method

.method public f()Lac/u;
    .locals 1

    iget-object v0, p0, Lqb/a$a;->o:Lac/e;

    invoke-interface {v0}, Lac/t;->f()Lac/u;

    move-result-object v0

    return-object v0
.end method
