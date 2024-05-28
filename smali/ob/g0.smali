.class public final Lob/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lob/g0$a;
    }
.end annotation


# instance fields
.field final a:Lob/z;

.field final b:Ljava/lang/String;

.field final c:Lob/y;

.field final d:Lob/h0;

.field final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private volatile f:Lob/f;


# direct methods
.method constructor <init>(Lob/g0$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lob/g0$a;->a:Lob/z;

    iput-object v0, p0, Lob/g0;->a:Lob/z;

    .line 3
    iget-object v0, p1, Lob/g0$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lob/g0;->b:Ljava/lang/String;

    .line 4
    iget-object v0, p1, Lob/g0$a;->c:Lob/y$a;

    invoke-virtual {v0}, Lob/y$a;->e()Lob/y;

    move-result-object v0

    iput-object v0, p0, Lob/g0;->c:Lob/y;

    .line 5
    iget-object v0, p1, Lob/g0$a;->d:Lob/h0;

    iput-object v0, p0, Lob/g0;->d:Lob/h0;

    .line 6
    iget-object p1, p1, Lob/g0$a;->e:Ljava/util/Map;

    invoke-static {p1}, Lpb/e;->v(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lob/g0;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Lob/h0;
    .locals 1

    iget-object v0, p0, Lob/g0;->d:Lob/h0;

    return-object v0
.end method

.method public b()Lob/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lob/g0;->f:Lob/f;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lob/g0;->c:Lob/y;

    invoke-static {v0}, Lob/f;->k(Lob/y;)Lob/f;

    move-result-object v0

    iput-object v0, p0, Lob/g0;->f:Lob/f;

    :goto_0
    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lob/g0;->c:Lob/y;

    invoke-virtual {v0, p1}, Lob/y;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lob/g0;->c:Lob/y;

    invoke-virtual {v0, p1}, Lob/y;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public e()Lob/y;
    .locals 1

    iget-object v0, p0, Lob/g0;->c:Lob/y;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lob/g0;->a:Lob/z;

    invoke-virtual {v0}, Lob/z;->n()Z

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lob/g0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lob/g0$a;
    .locals 1

    new-instance v0, Lob/g0$a;

    invoke-direct {v0, p0}, Lob/g0$a;-><init>(Lob/g0;)V

    return-object v0
.end method

.method public i(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "+TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lob/g0;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j()Lob/z;
    .locals 1

    iget-object v0, p0, Lob/g0;->a:Lob/z;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/g0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/g0;->a:Lob/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/g0;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
