.class public Lr9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:Ljava/lang/String;

.field protected c:Lob/d0;

.field protected d:Lgc/c$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lr9/k;->b:Ljava/lang/String;

    if-eqz p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lr9/k;->c()Ljava/lang/String;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lr9/k;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lr9/k;->b:Ljava/lang/String;

    iget-object v1, p0, Lr9/k;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lr9/k;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr9/k;->b(Ljava/lang/String;)Lgc/u;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Lgc/u;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 4
    iget-object v0, p0, Lr9/k;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lr9/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lr9/k;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lr9/k;->b(Ljava/lang/String;)Lgc/u;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lgc/u;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected b(Ljava/lang/String;)Lgc/u;
    .locals 1

    .line 1
    new-instance v0, Lgc/u$b;

    invoke-direct {v0}, Lgc/u$b;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lgc/u$b;->c(Ljava/lang/String;)Lgc/u$b;

    .line 3
    iget-object p1, p0, Lr9/k;->c:Lob/d0;

    invoke-virtual {v0, p1}, Lgc/u$b;->g(Lob/d0;)Lgc/u$b;

    .line 4
    iget-object p1, p0, Lr9/k;->d:Lgc/c$a;

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lgc/u$b;->a(Lgc/c$a;)Lgc/u$b;

    .line 6
    :cond_0
    invoke-static {}, Lhc/a;->f()Lhc/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgc/u$b;->b(Lgc/f$a;)Lgc/u$b;

    .line 7
    invoke-virtual {v0}, Lgc/u$b;->e()Lgc/u;

    move-result-object p1

    return-object p1
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "roblox.com"

    return-object v0
.end method

.method protected d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Lgc/c$a;)Lr9/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/c$a;",
            ")",
            "Lr9/k<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Lr9/k;->d:Lgc/c$a;

    return-object p0
.end method

.method public f(Lob/d0;)Lr9/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/d0;",
            ")",
            "Lr9/k<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Lr9/k;->c:Lob/d0;

    return-object p0
.end method
