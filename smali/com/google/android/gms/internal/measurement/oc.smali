.class public final Lcom/google/android/gms/internal/measurement/oc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/t6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/t6<",
        "Lcom/google/android/gms/internal/measurement/pc;",
        ">;"
    }
.end annotation


# static fields
.field private static final o:Lcom/google/android/gms/internal/measurement/oc;


# instance fields
.field private final n:Lcom/google/android/gms/internal/measurement/t6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/t6<",
            "Lcom/google/android/gms/internal/measurement/pc;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/oc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/oc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/oc;->o:Lcom/google/android/gms/internal/measurement/oc;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/qc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/qc;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/x6;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/t6;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/x6;->a(Lcom/google/android/gms/internal/measurement/t6;)Lcom/google/android/gms/internal/measurement/t6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/oc;->n:Lcom/google/android/gms/internal/measurement/t6;

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/oc;->o:Lcom/google/android/gms/internal/measurement/oc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/oc;->a()Lcom/google/android/gms/internal/measurement/pc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/pc;->zza()Z

    const/4 v0, 0x1

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/oc;->o:Lcom/google/android/gms/internal/measurement/oc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/oc;->a()Lcom/google/android/gms/internal/measurement/pc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/pc;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/measurement/pc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/oc;->n:Lcom/google/android/gms/internal/measurement/t6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/t6;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/pc;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/oc;->a()Lcom/google/android/gms/internal/measurement/pc;

    move-result-object v0

    return-object v0
.end method
