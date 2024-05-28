.class final Lcom/google/android/gms/measurement/internal/d4;
.super Lh0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh0/e<",
        "Ljava/lang/String;",
        "Lcom/google/android/gms/internal/measurement/c1;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic i:Lcom/google/android/gms/measurement/internal/g4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/g4;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/d4;->i:Lcom/google/android/gms/measurement/internal/g4;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lh0/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    invoke-static {p1}, Lz2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d4;->i:Lcom/google/android/gms/measurement/internal/g4;

    .line 3
    invoke-static {v0, p1}, Lcom/google/android/gms/measurement/internal/g4;->n(Lcom/google/android/gms/measurement/internal/g4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c1;

    move-result-object p1

    return-object p1
.end method
