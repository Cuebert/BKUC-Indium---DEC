.class public final Lcom/google/android/gms/internal/play_billing/d4;
.super Lcom/google/android/gms/internal/play_billing/d1;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/h2;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/d4;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:I

.field private zzh:Lcom/google/android/gms/internal/play_billing/l4;

.field private zzi:Lcom/google/android/gms/internal/play_billing/s4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/d4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/d4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/d4;->zzb:Lcom/google/android/gms/internal/play_billing/d4;

    const-class v1, Lcom/google/android/gms/internal/play_billing/d4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/d1;->p(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/d1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/d1;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/d4;->zze:I

    return-void
.end method

.method static synthetic A(Lcom/google/android/gms/internal/play_billing/d4;Lcom/google/android/gms/internal/play_billing/l4;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/d4;->zzh:Lcom/google/android/gms/internal/play_billing/l4;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/d4;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d4;->zzd:I

    return-void
.end method

.method static synthetic B(Lcom/google/android/gms/internal/play_billing/d4;Lcom/google/android/gms/internal/play_billing/w4;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/d4;->zzf:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d4;->zze:I

    return-void
.end method

.method static synthetic w(Lcom/google/android/gms/internal/play_billing/d4;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d4;->zzg:I

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/d4;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d4;->zzd:I

    return-void
.end method

.method public static x()Lcom/google/android/gms/internal/play_billing/c4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/d4;->zzb:Lcom/google/android/gms/internal/play_billing/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/d1;->h()Lcom/google/android/gms/internal/play_billing/z0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/c4;

    return-object v0
.end method

.method static synthetic y()Lcom/google/android/gms/internal/play_billing/d4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/d4;->zzb:Lcom/google/android/gms/internal/play_billing/d4;

    return-object v0
.end method

.method public static z([BLcom/google/android/gms/internal/play_billing/p0;)Lcom/google/android/gms/internal/play_billing/d4;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/play_billing/j1;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/play_billing/d4;->zzb:Lcom/google/android/gms/internal/play_billing/d4;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/d1;->k(Lcom/google/android/gms/internal/play_billing/d1;[BLcom/google/android/gms/internal/play_billing/p0;)Lcom/google/android/gms/internal/play_billing/d1;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/d4;

    return-object p0
.end method


# virtual methods
.method protected final t(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    .line 1
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/play_billing/d4;->zzb:Lcom/google/android/gms/internal/play_billing/d4;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/c4;

    .line 2
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/play_billing/c4;-><init>(Lcom/google/android/gms/internal/play_billing/b4;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/d4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/d4;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzf"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzd"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    .line 3
    sget-object p2, Lcom/google/android/gms/internal/play_billing/e4;->a:Lcom/google/android/gms/internal/play_billing/f1;

    aput-object p2, p1, v0

    const-string p2, "zzh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, Lcom/google/android/gms/internal/play_billing/w4;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/play_billing/d4;->zzb:Lcom/google/android/gms/internal/play_billing/d4;

    const-string p3, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004<\u0000"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/d1;->m(Lcom/google/android/gms/internal/play_billing/g2;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4
    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
