.class public final Lcom/google/android/gms/internal/measurement/y3;
.super Lcom/google/android/gms/internal/measurement/m8;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/m8<",
        "Lcom/google/android/gms/internal/measurement/z3;",
        "Lcom/google/android/gms/internal/measurement/y3;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/v9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/z3;->y()Lcom/google/android/gms/internal/measurement/z3;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/u3;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/z3;->y()Lcom/google/android/gms/internal/measurement/z3;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method


# virtual methods
.method public final v(I)Lcom/google/android/gms/internal/measurement/y3;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/z3;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/z3;->B(Lcom/google/android/gms/internal/measurement/z3;I)V

    return-object p0
.end method

.method public final w(Lcom/google/android/gms/internal/measurement/s4;)Lcom/google/android/gms/internal/measurement/y3;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/z3;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/t4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/z3;->C(Lcom/google/android/gms/internal/measurement/z3;Lcom/google/android/gms/internal/measurement/t4;)V

    return-object p0
.end method

.method public final x(Z)Lcom/google/android/gms/internal/measurement/y3;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/z3;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/z3;->E(Lcom/google/android/gms/internal/measurement/z3;Z)V

    return-object p0
.end method

.method public final y(Lcom/google/android/gms/internal/measurement/t4;)Lcom/google/android/gms/internal/measurement/y3;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/z3;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/z3;->D(Lcom/google/android/gms/internal/measurement/z3;Lcom/google/android/gms/internal/measurement/t4;)V

    return-object p0
.end method
