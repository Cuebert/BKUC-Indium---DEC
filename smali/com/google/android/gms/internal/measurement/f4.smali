.class public final Lcom/google/android/gms/internal/measurement/f4;
.super Lcom/google/android/gms/internal/measurement/p8;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/p8<",
        "Lcom/google/android/gms/internal/measurement/f4;",
        "Lcom/google/android/gms/internal/measurement/e4;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/v9;"
    }
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/f4;


# instance fields
.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/f4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/f4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/f4;->zza:Lcom/google/android/gms/internal/measurement/f4;

    const-class v1, Lcom/google/android/gms/internal/measurement/f4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/p8;->o(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/p8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f4;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static w()Lcom/google/android/gms/internal/measurement/e4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/f4;->zza:Lcom/google/android/gms/internal/measurement/f4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/p8;->p()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e4;

    return-object v0
.end method

.method static synthetic x()Lcom/google/android/gms/internal/measurement/f4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/f4;->zza:Lcom/google/android/gms/internal/measurement/f4;

    return-object v0
.end method

.method static synthetic y(Lcom/google/android/gms/internal/measurement/f4;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/f4;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/f4;->zze:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f4;->zzf:Ljava/lang/String;

    return-void
.end method

.method static synthetic z(Lcom/google/android/gms/internal/measurement/f4;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/f4;->zze:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/f4;->zze:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/f4;->zzg:J

    return-void
.end method


# virtual methods
.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    .line 1
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/f4;->zza:Lcom/google/android/gms/internal/measurement/f4;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/e4;

    .line 2
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/e4;-><init>(Lcom/google/android/gms/internal/measurement/u3;)V

    return-object p1

    .line 3
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/f4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/f4;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zze"

    aput-object v1, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v0

    .line 4
    sget-object p2, Lcom/google/android/gms/internal/measurement/f4;->zza:Lcom/google/android/gms/internal/measurement/f4;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/p8;->n(Lcom/google/android/gms/internal/measurement/u9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 5
    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
