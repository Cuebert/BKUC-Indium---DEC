.class public final Lcom/google/android/gms/internal/measurement/o4;
.super Lcom/google/android/gms/internal/measurement/m8;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/m8<",
        "Lcom/google/android/gms/internal/measurement/r4;",
        "Lcom/google/android/gms/internal/measurement/o4;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/v9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/r4;->x()Lcom/google/android/gms/internal/measurement/r4;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/u3;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/r4;->x()Lcom/google/android/gms/internal/measurement/r4;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/m8;-><init>(Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method


# virtual methods
.method public final v(Lcom/google/android/gms/internal/measurement/e4;)Lcom/google/android/gms/internal/measurement/o4;
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
    check-cast v0, Lcom/google/android/gms/internal/measurement/r4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/m8;->p()Lcom/google/android/gms/internal/measurement/p8;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/f4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/r4;->y(Lcom/google/android/gms/internal/measurement/r4;Lcom/google/android/gms/internal/measurement/f4;)V

    return-object p0
.end method
