.class public final Lcom/google/android/gms/internal/measurement/c4;
.super Lcom/google/android/gms/internal/measurement/m8;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/m8<",
        "Lcom/google/android/gms/internal/measurement/d4;",
        "Lcom/google/android/gms/internal/measurement/c4;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/v9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d4;->B()Lcom/google/android/gms/internal/measurement/d4;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/u3;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d4;->B()Lcom/google/android/gms/internal/measurement/d4;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/internal/measurement/g4;)Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/h4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/d4;->G(Lcom/google/android/gms/internal/measurement/d4;Lcom/google/android/gms/internal/measurement/h4;)V

    return-object p0
.end method

.method public final B(Lcom/google/android/gms/internal/measurement/h4;)Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/d4;->G(Lcom/google/android/gms/internal/measurement/d4;Lcom/google/android/gms/internal/measurement/h4;)V

    return-object p0
.end method

.method public final C()Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/d4;->I(Lcom/google/android/gms/internal/measurement/d4;)V

    return-object p0
.end method

.method public final D(I)Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/d4;->J(Lcom/google/android/gms/internal/measurement/d4;I)V

    return-object p0
.end method

.method public final E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/d4;->K(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/String;)V

    return-object p0
.end method

.method public final F(ILcom/google/android/gms/internal/measurement/g4;)Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/h4;

    .line 4
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/d4;->F(Lcom/google/android/gms/internal/measurement/d4;ILcom/google/android/gms/internal/measurement/h4;)V

    return-object p0
.end method

.method public final G(ILcom/google/android/gms/internal/measurement/h4;)Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/d4;->F(Lcom/google/android/gms/internal/measurement/d4;ILcom/google/android/gms/internal/measurement/h4;)V

    return-object p0
.end method

.method public final H(J)Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/d4;->M(Lcom/google/android/gms/internal/measurement/d4;J)V

    return-object p0
.end method

.method public final I(J)Lcom/google/android/gms/internal/measurement/c4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/d4;->L(Lcom/google/android/gms/internal/measurement/d4;J)V

    return-object p0
.end method

.method public final J(I)Lcom/google/android/gms/internal/measurement/h4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d4;->C(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object p1

    return-object p1
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final L()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/h4;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->E()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final M()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->R()Z

    move-result v0

    return v0
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->x()I

    move-result v0

    return v0
.end method

.method public final w()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->y()J

    move-result-wide v0

    return-wide v0
.end method

.method public final x()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->z()J

    move-result-wide v0

    return-wide v0
.end method

.method public final y(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/c4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/measurement/h4;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/c4;"
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/d4;->H(Lcom/google/android/gms/internal/measurement/d4;Ljava/lang/Iterable;)V

    return-object p0
.end method
