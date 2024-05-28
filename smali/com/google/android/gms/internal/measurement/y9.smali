.class final Lcom/google/android/gms/internal/measurement/y9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/fa;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/fa<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/u9;

.field private final b:Lcom/google/android/gms/internal/measurement/ua;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/ua<",
            "**>;"
        }
    .end annotation
.end field

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/measurement/d8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/d8<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/ua;Lcom/google/android/gms/internal/measurement/d8;Lcom/google/android/gms/internal/measurement/u9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/ua<",
            "**>;",
            "Lcom/google/android/gms/internal/measurement/d8<",
            "*>;",
            "Lcom/google/android/gms/internal/measurement/u9;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/y9;->b:Lcom/google/android/gms/internal/measurement/ua;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/d8;->c(Lcom/google/android/gms/internal/measurement/u9;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/y9;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/y9;->a:Lcom/google/android/gms/internal/measurement/u9;

    return-void
.end method

.method static j(Lcom/google/android/gms/internal/measurement/ua;Lcom/google/android/gms/internal/measurement/d8;Lcom/google/android/gms/internal/measurement/u9;)Lcom/google/android/gms/internal/measurement/y9;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/measurement/ua<",
            "**>;",
            "Lcom/google/android/gms/internal/measurement/d8<",
            "*>;",
            "Lcom/google/android/gms/internal/measurement/u9;",
            ")",
            "Lcom/google/android/gms/internal/measurement/y9<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/y9;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/y9;-><init>(Lcom/google/android/gms/internal/measurement/ua;Lcom/google/android/gms/internal/measurement/d8;Lcom/google/android/gms/internal/measurement/u9;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->b:Lcom/google/android/gms/internal/measurement/ua;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/ua;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d8;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->a:Lcom/google/android/gms/internal/measurement/u9;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/u9;->j()Lcom/google/android/gms/internal/measurement/t9;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/t9;->T()Lcom/google/android/gms/internal/measurement/u9;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->b:Lcom/google/android/gms/internal/measurement/ua;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/ua;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/ua;->b(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/y9;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/h8;

    const/4 p1, 0x0

    throw p1
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->b:Lcom/google/android/gms/internal/measurement/ua;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/ha;->f(Lcom/google/android/gms/internal/measurement/ua;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/y9;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    .line 2
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/ha;->e(Lcom/google/android/gms/internal/measurement/d8;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->b:Lcom/google/android/gms/internal/measurement/ua;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/ua;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/y9;->c:Z

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/h8;

    const/4 p1, 0x0

    .line 3
    throw p1
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/h8;

    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public final g(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/c7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BII",
            "Lcom/google/android/gms/internal/measurement/c7;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/measurement/p8;

    iget-object p3, p2, Lcom/google/android/gms/internal/measurement/p8;->zzc:Lcom/google/android/gms/internal/measurement/va;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/va;->c()Lcom/google/android/gms/internal/measurement/va;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/va;->e()Lcom/google/android/gms/internal/measurement/va;

    move-result-object p3

    .line 3
    iput-object p3, p2, Lcom/google/android/gms/internal/measurement/p8;->zzc:Lcom/google/android/gms/internal/measurement/va;

    .line 4
    :goto_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/n8;

    const/4 p1, 0x0

    .line 5
    throw p1
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->b:Lcom/google/android/gms/internal/measurement/ua;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/ua;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/y9;->b:Lcom/google/android/gms/internal/measurement/ua;

    .line 2
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/measurement/ua;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/y9;->c:Z

    if-nez v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    .line 4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/h8;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    .line 5
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/d8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/h8;

    const/4 p1, 0x0

    .line 6
    throw p1
.end method

.method public final i(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/y7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/measurement/y7;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/y9;->d:Lcom/google/android/gms/internal/measurement/d8;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/d8;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/h8;

    const/4 p1, 0x0

    .line 2
    throw p1
.end method
