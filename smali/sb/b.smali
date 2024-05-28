.class public final Lsb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/a0;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lsb/b;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lob/a0$a;)Lob/i0;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lsb/g;

    .line 2
    invoke-virtual {p1}, Lsb/g;->g()Lrb/c;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lsb/g;->e()Lob/g0;

    move-result-object p1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 5
    invoke-virtual {v0, p1}, Lrb/c;->p(Lob/g0;)V

    .line 6
    invoke-virtual {p1}, Lob/g0;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lsb/f;->b(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v3

    if-eqz v3, :cond_3

    const-string v3, "Expect"

    .line 7
    invoke-virtual {p1, v3}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "100-continue"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x1

    if-eqz v3, :cond_0

    .line 8
    invoke-virtual {v0}, Lrb/c;->g()V

    .line 9
    invoke-virtual {v0}, Lrb/c;->n()V

    .line 10
    invoke-virtual {v0, v6}, Lrb/c;->l(Z)Lob/i0$a;

    move-result-object v5

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v5, :cond_2

    .line 11
    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v7

    invoke-virtual {v7}, Lob/h0;->g()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 12
    invoke-virtual {v0}, Lrb/c;->g()V

    .line 13
    invoke-virtual {v0, p1, v6}, Lrb/c;->d(Lob/g0;Z)Lac/s;

    move-result-object v6

    .line 14
    invoke-static {v6}, Lac/l;->c(Lac/s;)Lac/d;

    move-result-object v6

    .line 15
    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v7

    invoke-virtual {v7, v6}, Lob/h0;->i(Lac/d;)V

    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {v0, p1, v4}, Lrb/c;->d(Lob/g0;Z)Lac/s;

    move-result-object v6

    .line 17
    invoke-static {v6}, Lac/l;->c(Lac/s;)Lac/d;

    move-result-object v6

    .line 18
    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v7

    invoke-virtual {v7, v6}, Lob/h0;->i(Lac/d;)V

    .line 19
    invoke-interface {v6}, Lac/s;->close()V

    goto :goto_1

    .line 20
    :cond_2
    invoke-virtual {v0}, Lrb/c;->j()V

    .line 21
    invoke-virtual {v0}, Lrb/c;->c()Lrb/e;

    move-result-object v6

    invoke-virtual {v6}, Lrb/e;->o()Z

    move-result v6

    if-nez v6, :cond_4

    .line 22
    invoke-virtual {v0}, Lrb/c;->i()V

    goto :goto_1

    .line 23
    :cond_3
    invoke-virtual {v0}, Lrb/c;->j()V

    const/4 v3, 0x0

    .line 24
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {p1}, Lob/g0;->a()Lob/h0;

    move-result-object v6

    invoke-virtual {v6}, Lob/h0;->g()Z

    move-result v6

    if-nez v6, :cond_6

    .line 25
    :cond_5
    invoke-virtual {v0}, Lrb/c;->f()V

    :cond_6
    if-nez v3, :cond_7

    .line 26
    invoke-virtual {v0}, Lrb/c;->n()V

    :cond_7
    if-nez v5, :cond_8

    .line 27
    invoke-virtual {v0, v4}, Lrb/c;->l(Z)Lob/i0$a;

    move-result-object v5

    .line 28
    :cond_8
    invoke-virtual {v5, p1}, Lob/i0$a;->q(Lob/g0;)Lob/i0$a;

    move-result-object v3

    .line 29
    invoke-virtual {v0}, Lrb/c;->c()Lrb/e;

    move-result-object v5

    invoke-virtual {v5}, Lrb/e;->l()Lob/x;

    move-result-object v5

    invoke-virtual {v3, v5}, Lob/i0$a;->h(Lob/x;)Lob/i0$a;

    move-result-object v3

    .line 30
    invoke-virtual {v3, v1, v2}, Lob/i0$a;->r(J)Lob/i0$a;

    move-result-object v3

    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lob/i0$a;->p(J)Lob/i0$a;

    move-result-object v3

    .line 32
    invoke-virtual {v3}, Lob/i0$a;->c()Lob/i0;

    move-result-object v3

    .line 33
    invoke-virtual {v3}, Lob/i0;->e()I

    move-result v5

    const/16 v6, 0x64

    if-ne v5, v6, :cond_9

    .line 34
    invoke-virtual {v0, v4}, Lrb/c;->l(Z)Lob/i0$a;

    move-result-object v3

    .line 35
    invoke-virtual {v3, p1}, Lob/i0$a;->q(Lob/g0;)Lob/i0$a;

    move-result-object p1

    .line 36
    invoke-virtual {v0}, Lrb/c;->c()Lrb/e;

    move-result-object v3

    invoke-virtual {v3}, Lrb/e;->l()Lob/x;

    move-result-object v3

    invoke-virtual {p1, v3}, Lob/i0$a;->h(Lob/x;)Lob/i0$a;

    move-result-object p1

    .line 37
    invoke-virtual {p1, v1, v2}, Lob/i0$a;->r(J)Lob/i0$a;

    move-result-object p1

    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lob/i0$a;->p(J)Lob/i0$a;

    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lob/i0$a;->c()Lob/i0;

    move-result-object v3

    .line 40
    invoke-virtual {v3}, Lob/i0;->e()I

    move-result v5

    .line 41
    :cond_9
    invoke-virtual {v0, v3}, Lrb/c;->m(Lob/i0;)V

    .line 42
    iget-boolean p1, p0, Lsb/b;->a:Z

    if-eqz p1, :cond_a

    const/16 p1, 0x65

    if-ne v5, p1, :cond_a

    .line 43
    invoke-virtual {v3}, Lob/i0;->X()Lob/i0$a;

    move-result-object p1

    sget-object v1, Lpb/e;->d:Lob/j0;

    .line 44
    invoke-virtual {p1, v1}, Lob/i0$a;->b(Lob/j0;)Lob/i0$a;

    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lob/i0$a;->c()Lob/i0;

    move-result-object p1

    goto :goto_2

    .line 46
    :cond_a
    invoke-virtual {v3}, Lob/i0;->X()Lob/i0$a;

    move-result-object p1

    .line 47
    invoke-virtual {v0, v3}, Lrb/c;->k(Lob/i0;)Lob/j0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lob/i0$a;->b(Lob/j0;)Lob/i0$a;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lob/i0$a;->c()Lob/i0;

    move-result-object p1

    .line 49
    :goto_2
    invoke-virtual {p1}, Lob/i0;->k0()Lob/g0;

    move-result-object v1

    const-string v2, "Connection"

    invoke-virtual {v1, v2}, Lob/g0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "close"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 50
    invoke-virtual {p1, v2}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 51
    :cond_b
    invoke-virtual {v0}, Lrb/c;->i()V

    :cond_c
    const/16 v0, 0xcc

    if-eq v5, v0, :cond_d

    const/16 v0, 0xcd

    if-ne v5, v0, :cond_e

    .line 52
    :cond_d
    invoke-virtual {p1}, Lob/i0;->b()Lob/j0;

    move-result-object v0

    invoke-virtual {v0}, Lob/j0;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_f

    :cond_e
    return-object p1

    .line 53
    :cond_f
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {p1}, Lob/i0;->b()Lob/j0;

    move-result-object p1

    invoke-virtual {p1}, Lob/j0;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
