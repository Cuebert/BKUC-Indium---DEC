.class public final Lrb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/c$b;,
        Lrb/c$a;
    }
.end annotation


# instance fields
.field final a:Lrb/k;

.field final b:Lob/g;

.field final c:Lob/v;

.field final d:Lrb/d;

.field final e:Lsb/c;

.field private f:Z


# direct methods
.method public constructor <init>(Lrb/k;Lob/g;Lob/v;Lrb/d;Lsb/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrb/c;->a:Lrb/k;

    .line 3
    iput-object p2, p0, Lrb/c;->b:Lob/g;

    .line 4
    iput-object p3, p0, Lrb/c;->c:Lob/v;

    .line 5
    iput-object p4, p0, Lrb/c;->d:Lrb/d;

    .line 6
    iput-object p5, p0, Lrb/c;->e:Lsb/c;

    return-void
.end method


# virtual methods
.method a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    if-eqz p5, :cond_0

    .line 1
    invoke-virtual {p0, p5}, Lrb/c;->o(Ljava/io/IOException;)V

    :cond_0
    if-eqz p4, :cond_2

    if-eqz p5, :cond_1

    .line 2
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1, p5}, Lob/v;->p(Lob/g;Ljava/io/IOException;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1, p1, p2}, Lob/v;->n(Lob/g;J)V

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    if-eqz p5, :cond_3

    .line 4
    iget-object p1, p0, Lrb/c;->c:Lob/v;

    iget-object p2, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {p1, p2, p5}, Lob/v;->u(Lob/g;Ljava/io/IOException;)V

    goto :goto_1

    .line 5
    :cond_3
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1, p1, p2}, Lob/v;->s(Lob/g;J)V

    .line 6
    :cond_4
    :goto_1
    iget-object p1, p0, Lrb/c;->a:Lrb/k;

    invoke-virtual {p1, p0, p4, p3, p5}, Lrb/k;->g(Lrb/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0}, Lsb/c;->cancel()V

    return-void
.end method

.method public c()Lrb/e;
    .locals 1

    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0}, Lsb/c;->a()Lrb/e;

    move-result-object v0

    return-object v0
.end method

.method public d(Lob/g0;Z)Lac/s;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iput-boolean p2, p0, Lrb/c;->f:Z

    .line 2
    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object p2

    invoke-virtual {p2}, Lob/h0;->a()J

    move-result-wide v0

    .line 3
    iget-object p2, p0, Lrb/c;->c:Lob/v;

    iget-object v2, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {p2, v2}, Lob/v;->o(Lob/g;)V

    .line 4
    iget-object p2, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {p2, p1, v0, v1}, Lsb/c;->f(Lob/g0;J)Lac/s;

    move-result-object p1

    .line 5
    new-instance p2, Lrb/c$a;

    invoke-direct {p2, p0, p1, v0, v1}, Lrb/c$a;-><init>(Lrb/c;Lac/s;J)V

    return-object p2
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0}, Lsb/c;->cancel()V

    .line 2
    iget-object v0, p0, Lrb/c;->a:Lrb/k;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v1, v2}, Lrb/k;->g(Lrb/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public f()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0}, Lsb/c;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, p0, Lrb/c;->c:Lob/v;

    iget-object v2, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v1, v2, v0}, Lob/v;->p(Lob/g;Ljava/io/IOException;)V

    .line 3
    invoke-virtual {p0, v0}, Lrb/c;->o(Ljava/io/IOException;)V

    .line 4
    throw v0
.end method

.method public g()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0}, Lsb/c;->d()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    iget-object v1, p0, Lrb/c;->c:Lob/v;

    iget-object v2, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v1, v2, v0}, Lob/v;->p(Lob/g;Ljava/io/IOException;)V

    .line 3
    invoke-virtual {p0, v0}, Lrb/c;->o(Ljava/io/IOException;)V

    .line 4
    throw v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lrb/c;->f:Z

    return v0
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0}, Lsb/c;->a()Lrb/e;

    move-result-object v0

    invoke-virtual {v0}, Lrb/e;->q()V

    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lrb/c;->a:Lrb/k;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v1, v2, v3}, Lrb/k;->g(Lrb/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public k(Lob/i0;)Lob/j0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1}, Lob/v;->t(Lob/g;)V

    const-string v0, "Content-Type"

    .line 2
    invoke-virtual {p1, v0}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v1, p1}, Lsb/c;->e(Lob/i0;)J

    move-result-wide v1

    .line 4
    iget-object v3, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v3, p1}, Lsb/c;->g(Lob/i0;)Lac/t;

    move-result-object p1

    .line 5
    new-instance v3, Lrb/c$b;

    invoke-direct {v3, p0, p1, v1, v2}, Lrb/c$b;-><init>(Lrb/c;Lac/t;J)V

    .line 6
    new-instance p1, Lsb/h;

    invoke-static {v3}, Lac/l;->d(Lac/t;)Lac/e;

    move-result-object v3

    invoke-direct {p1, v0, v1, v2, v3}, Lsb/h;-><init>(Ljava/lang/String;JLac/e;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 7
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1, p1}, Lob/v;->u(Lob/g;Ljava/io/IOException;)V

    .line 8
    invoke-virtual {p0, p1}, Lrb/c;->o(Ljava/io/IOException;)V

    .line 9
    throw p1
.end method

.method public l(Z)Lob/i0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0, p1}, Lsb/c;->h(Z)Lob/i0$a;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    sget-object v0, Lpb/a;->a:Lpb/a;

    invoke-virtual {v0, p1, p0}, Lpb/a;->g(Lob/i0$a;Lrb/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    .line 3
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1, p1}, Lob/v;->u(Lob/g;Ljava/io/IOException;)V

    .line 4
    invoke-virtual {p0, p1}, Lrb/c;->o(Ljava/io/IOException;)V

    .line 5
    throw p1
.end method

.method public m(Lob/i0;)V
    .locals 2

    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1, p1}, Lob/v;->v(Lob/g;Lob/i0;)V

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1}, Lob/v;->w(Lob/g;)V

    return-void
.end method

.method o(Ljava/io/IOException;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lrb/c;->d:Lrb/d;

    invoke-virtual {v0}, Lrb/d;->h()V

    .line 2
    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0}, Lsb/c;->a()Lrb/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrb/e;->w(Ljava/io/IOException;)V

    return-void
.end method

.method public p(Lob/g0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1}, Lob/v;->r(Lob/g;)V

    .line 2
    iget-object v0, p0, Lrb/c;->e:Lsb/c;

    invoke-interface {v0, p1}, Lsb/c;->b(Lob/g0;)V

    .line 3
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1, p1}, Lob/v;->q(Lob/g;Lob/g0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 4
    iget-object v0, p0, Lrb/c;->c:Lob/v;

    iget-object v1, p0, Lrb/c;->b:Lob/g;

    invoke-virtual {v0, v1, p1}, Lob/v;->p(Lob/g;Ljava/io/IOException;)V

    .line 5
    invoke-virtual {p0, p1}, Lrb/c;->o(Ljava/io/IOException;)V

    .line 6
    throw p1
.end method
