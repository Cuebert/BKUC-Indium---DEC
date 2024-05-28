.class public final Lcom/google/android/gms/internal/measurement/cc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/t6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/t6<",
        "Lcom/google/android/gms/internal/measurement/dc;",
        ">;"
    }
.end annotation


# static fields
.field private static final o:Lcom/google/android/gms/internal/measurement/cc;


# instance fields
.field private final n:Lcom/google/android/gms/internal/measurement/t6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/t6<",
            "Lcom/google/android/gms/internal/measurement/dc;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/cc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/cc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/cc;->o:Lcom/google/android/gms/internal/measurement/cc;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/ec;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/ec;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/x6;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/t6;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/x6;->a(Lcom/google/android/gms/internal/measurement/t6;)Lcom/google/android/gms/internal/measurement/t6;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/cc;->n:Lcom/google/android/gms/internal/measurement/t6;

    return-void
.end method

.method public static a()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/cc;->o:Lcom/google/android/gms/internal/measurement/cc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cc;->b()Lcom/google/android/gms/internal/measurement/dc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/dc;->zza()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/measurement/dc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cc;->n:Lcom/google/android/gms/internal/measurement/t6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/t6;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/dc;

    return-object v0
.end method

.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cc;->b()Lcom/google/android/gms/internal/measurement/dc;

    move-result-object v0

    return-object v0
.end method
