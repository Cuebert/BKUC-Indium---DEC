.class public final Lcom/google/android/gms/internal/measurement/u2;
.super Lcom/google/android/gms/internal/measurement/m8;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/m8<",
        "Lcom/google/android/gms/internal/measurement/v2;",
        "Lcom/google/android/gms/internal/measurement/u2;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/v9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/v2;->z()Lcom/google/android/gms/internal/measurement/v2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/t2;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/v2;->z()Lcom/google/android/gms/internal/measurement/v2;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method


# virtual methods
.method public final A(I)Lcom/google/android/gms/internal/measurement/x2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/v2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/v2;->A(I)Lcom/google/android/gms/internal/measurement/x2;

    move-result-object p1

    return-object p1
.end method

.method public final B(I)Lcom/google/android/gms/internal/measurement/g3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/v2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/v2;->B(I)Lcom/google/android/gms/internal/measurement/g3;

    move-result-object p1

    return-object p1
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/v2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/v2;->x()I

    move-result v0

    return v0
.end method

.method public final w()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m8;->o:Lcom/google/android/gms/internal/measurement/p8;

    check-cast v0, Lcom/google/android/gms/internal/measurement/v2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/v2;->y()I

    move-result v0

    return v0
.end method

.method public final x(ILcom/google/android/gms/internal/measurement/w2;)Lcom/google/android/gms/internal/measurement/u2;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/v2;

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/x2;

    .line 4
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/v2;->F(Lcom/google/android/gms/internal/measurement/v2;ILcom/google/android/gms/internal/measurement/x2;)V

    return-object p0
.end method

.method public final y(ILcom/google/android/gms/internal/measurement/f3;)Lcom/google/android/gms/internal/measurement/u2;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/v2;

    .line 3
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/g3;

    .line 4
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/v2;->E(Lcom/google/android/gms/internal/measurement/v2;ILcom/google/android/gms/internal/measurement/g3;)V

    return-object p0
.end method
