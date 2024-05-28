.class public final Lw3/r2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/q2;

.field private final b:Ljava/lang/Integer;

.field private final c:Lw3/m7;


# direct methods
.method synthetic constructor <init>(Lw3/o2;Lw3/n2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/o2;->d(Lw3/o2;)Lw3/q2;

    move-result-object p2

    iput-object p2, p0, Lw3/r2;->a:Lw3/q2;

    invoke-static {p1}, Lw3/o2;->g(Lw3/o2;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lw3/r2;->b:Ljava/lang/Integer;

    invoke-static {p1}, Lw3/o2;->f(Lw3/o2;)Lw3/m7;

    move-result-object p1

    iput-object p1, p0, Lw3/r2;->c:Lw3/m7;

    return-void
.end method


# virtual methods
.method public final a()Lw3/q2;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/r2;->a:Lw3/q2;

    return-object v0
.end method

.method public final b()Lw3/m7;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lw3/r2;->c:Lw3/m7;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lw3/r2;->b:Ljava/lang/Integer;

    return-object v0
.end method
