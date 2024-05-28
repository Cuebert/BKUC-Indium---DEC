.class public final Lcom/google/android/gms/internal/measurement/t4;
.super Lcom/google/android/gms/internal/measurement/p8;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/p8<",
        "Lcom/google/android/gms/internal/measurement/t4;",
        "Lcom/google/android/gms/internal/measurement/s4;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/v9;"
    }
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/t4;


# instance fields
.field private zze:Lcom/google/android/gms/internal/measurement/v8;

.field private zzf:Lcom/google/android/gms/internal/measurement/v8;

.field private zzg:Lcom/google/android/gms/internal/measurement/w8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/w8<",
            "Lcom/google/android/gms/internal/measurement/b4;",
            ">;"
        }
    .end annotation
.end field

.field private zzh:Lcom/google/android/gms/internal/measurement/w8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/w8<",
            "Lcom/google/android/gms/internal/measurement/v4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/t4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/t4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/t4;->zza:Lcom/google/android/gms/internal/measurement/t4;

    const-class v1, Lcom/google/android/gms/internal/measurement/t4;

    .line 2
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/p8;->o(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/p8;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/p8;-><init>()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/p8;->t()Lcom/google/android/gms/internal/measurement/v8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zze:Lcom/google/android/gms/internal/measurement/v8;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/p8;->t()Lcom/google/android/gms/internal/measurement/v8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzf:Lcom/google/android/gms/internal/measurement/v8;

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/p8;->k()Lcom/google/android/gms/internal/measurement/w8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzg:Lcom/google/android/gms/internal/measurement/w8;

    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/p8;->k()Lcom/google/android/gms/internal/measurement/w8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzh:Lcom/google/android/gms/internal/measurement/w8;

    return-void
.end method

.method public static B()Lcom/google/android/gms/internal/measurement/s4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/t4;->zza:Lcom/google/android/gms/internal/measurement/t4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/p8;->p()Lcom/google/android/gms/internal/measurement/m8;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s4;

    return-object v0
.end method

.method static synthetic C()Lcom/google/android/gms/internal/measurement/t4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/t4;->zza:Lcom/google/android/gms/internal/measurement/t4;

    return-object v0
.end method

.method public static D()Lcom/google/android/gms/internal/measurement/t4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/t4;->zza:Lcom/google/android/gms/internal/measurement/t4;

    return-object v0
.end method

.method static synthetic J(Lcom/google/android/gms/internal/measurement/t4;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zze:Lcom/google/android/gms/internal/measurement/v8;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/w8;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/p8;->u(Lcom/google/android/gms/internal/measurement/v8;)Lcom/google/android/gms/internal/measurement/v8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zze:Lcom/google/android/gms/internal/measurement/v8;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/t4;->zze:Lcom/google/android/gms/internal/measurement/v8;

    .line 3
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/z6;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/internal/measurement/t4;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/p8;->t()Lcom/google/android/gms/internal/measurement/v8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zze:Lcom/google/android/gms/internal/measurement/v8;

    return-void
.end method

.method static synthetic L(Lcom/google/android/gms/internal/measurement/t4;Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzf:Lcom/google/android/gms/internal/measurement/v8;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/w8;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/p8;->u(Lcom/google/android/gms/internal/measurement/v8;)Lcom/google/android/gms/internal/measurement/v8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzf:Lcom/google/android/gms/internal/measurement/v8;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzf:Lcom/google/android/gms/internal/measurement/v8;

    .line 3
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/z6;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic M(Lcom/google/android/gms/internal/measurement/t4;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/p8;->t()Lcom/google/android/gms/internal/measurement/v8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzf:Lcom/google/android/gms/internal/measurement/v8;

    return-void
.end method

.method static synthetic N(Lcom/google/android/gms/internal/measurement/t4;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/t4;->U()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzg:Lcom/google/android/gms/internal/measurement/w8;

    .line 2
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/z6;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic P(Lcom/google/android/gms/internal/measurement/t4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/t4;->U()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzg:Lcom/google/android/gms/internal/measurement/w8;

    .line 2
    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method static synthetic R(Lcom/google/android/gms/internal/measurement/t4;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/t4;->V()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzh:Lcom/google/android/gms/internal/measurement/w8;

    .line 2
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/z6;->c(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method static synthetic S(Lcom/google/android/gms/internal/measurement/t4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/t4;->V()V

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzh:Lcom/google/android/gms/internal/measurement/w8;

    .line 2
    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method private final U()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzg:Lcom/google/android/gms/internal/measurement/w8;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/w8;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/p8;->l(Lcom/google/android/gms/internal/measurement/w8;)Lcom/google/android/gms/internal/measurement/w8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzg:Lcom/google/android/gms/internal/measurement/w8;

    :cond_0
    return-void
.end method

.method private final V()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzh:Lcom/google/android/gms/internal/measurement/w8;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/w8;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/p8;->l(Lcom/google/android/gms/internal/measurement/w8;)Lcom/google/android/gms/internal/measurement/w8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzh:Lcom/google/android/gms/internal/measurement/w8;

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(I)Lcom/google/android/gms/internal/measurement/b4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzg:Lcom/google/android/gms/internal/measurement/w8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/b4;

    return-object p1
.end method

.method public final E(I)Lcom/google/android/gms/internal/measurement/v4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzh:Lcom/google/android/gms/internal/measurement/w8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/v4;

    return-object p1
.end method

.method public final F()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/b4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzg:Lcom/google/android/gms/internal/measurement/w8;

    return-object v0
.end method

.method public final G()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzf:Lcom/google/android/gms/internal/measurement/v8;

    return-object v0
.end method

.method public final H()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/v4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzh:Lcom/google/android/gms/internal/measurement/w8;

    return-object v0
.end method

.method public final I()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zze:Lcom/google/android/gms/internal/measurement/v8;

    return-object v0
.end method

.method protected final v(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lcom/google/android/gms/internal/measurement/t4;->zza:Lcom/google/android/gms/internal/measurement/t4;

    return-object p1

    .line 2
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/s4;

    .line 3
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/s4;-><init>(Lcom/google/android/gms/internal/measurement/u3;)V

    return-object p1

    .line 4
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/t4;

    .line 5
    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/t4;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v2

    .line 6
    const-class p2, Lcom/google/android/gms/internal/measurement/b4;

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-class p2, Lcom/google/android/gms/internal/measurement/v4;

    aput-object p2, p1, p3

    sget-object p2, Lcom/google/android/gms/internal/measurement/t4;->zza:Lcom/google/android/gms/internal/measurement/t4;

    const-string p3, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/p8;->n(Lcom/google/android/gms/internal/measurement/u9;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 7
    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final w()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzg:Lcom/google/android/gms/internal/measurement/w8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final x()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzf:Lcom/google/android/gms/internal/measurement/v8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final y()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zzh:Lcom/google/android/gms/internal/measurement/w8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4;->zze:Lcom/google/android/gms/internal/measurement/v8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
