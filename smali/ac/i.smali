.class public Lac/i;
.super Lac/u;
.source "SourceFile"


# instance fields
.field private e:Lac/u;


# direct methods
.method public constructor <init>(Lac/u;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lac/u;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lac/i;->e:Lac/u;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lac/u;
    .locals 1

    iget-object v0, p0, Lac/i;->e:Lac/u;

    invoke-virtual {v0}, Lac/u;->a()Lac/u;

    move-result-object v0

    return-object v0
.end method

.method public b()Lac/u;
    .locals 1

    iget-object v0, p0, Lac/i;->e:Lac/u;

    invoke-virtual {v0}, Lac/u;->b()Lac/u;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lac/i;->e:Lac/u;

    invoke-virtual {v0}, Lac/u;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Lac/u;
    .locals 1

    iget-object v0, p0, Lac/i;->e:Lac/u;

    invoke-virtual {v0, p1, p2}, Lac/u;->d(J)Lac/u;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lac/i;->e:Lac/u;

    invoke-virtual {v0}, Lac/u;->e()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lac/i;->e:Lac/u;

    invoke-virtual {v0}, Lac/u;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Lac/u;
    .locals 1

    iget-object v0, p0, Lac/i;->e:Lac/u;

    invoke-virtual {v0, p1, p2, p3}, Lac/u;->g(JLjava/util/concurrent/TimeUnit;)Lac/u;

    move-result-object p1

    return-object p1
.end method

.method public final i()Lac/u;
    .locals 1

    iget-object v0, p0, Lac/i;->e:Lac/u;

    return-object v0
.end method

.method public final j(Lac/u;)Lac/i;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lac/i;->e:Lac/u;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
