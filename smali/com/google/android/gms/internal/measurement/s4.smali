.class public final Lcom/google/android/gms/internal/measurement/s4;
.super Lcom/google/android/gms/internal/measurement/m8;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/m8<",
        "Lcom/google/android/gms/internal/measurement/t4;",
        "Lcom/google/android/gms/internal/measurement/s4;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/v9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/t4;->C()Lcom/google/android/gms/internal/measurement/t4;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/u3;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/t4;->C()Lcom/google/android/gms/internal/measurement/t4;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method


# virtual methods
.method public final A()Lcom/google/android/gms/internal/measurement/s4;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/m8;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/t4;->M(Lcom/google/android/gms/internal/measurement/t4;)V

    return-object p0
.end method

.method public final B()Lcom/google/android/gms/internal/measurement/s4;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/m8;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/t4;->K(Lcom/google/android/gms/internal/measurement/t4;)V

    return-object p0
.end method

.method public final C(I)Lcom/google/android/gms/internal/measurement/s4;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/m8;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/t4;->P(Lcom/google/android/gms/internal/measurement/t4;I)V

    return-object p0
.end method

.method public final D(I)Lcom/google/android/gms/internal/measurement/s4;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/m8;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/t4;->S(Lcom/google/android/gms/internal/measurement/t4;I)V

    return-object p0
.end method

.method public final v(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/s4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/measurement/b4;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/s4;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/m8;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/t4;->N(Lcom/google/android/gms/internal/measurement/t4;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final w(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/s4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/s4;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/m8;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/t4;->L(Lcom/google/android/gms/internal/measurement/t4;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final x(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/s4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/measurement/v4;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/s4;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/m8;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/t4;->R(Lcom/google/android/gms/internal/measurement/t4;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final y(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/s4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/s4;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/m8;->r()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/m8;->p:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/t4;->J(Lcom/google/android/gms/internal/measurement/t4;Ljava/lang/Iterable;)V

    return-object p0
.end method
