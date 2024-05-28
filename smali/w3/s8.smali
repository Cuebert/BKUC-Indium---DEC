.class public final Lw3/s8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/w7;

.field private final b:Lw3/ca;

.field private final c:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/p8;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Lw3/q8;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lw3/s7;


# direct methods
.method synthetic constructor <init>(Lw3/r8;Lw3/o8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/r8;->d(Lw3/r8;)Lw3/w7;

    move-result-object p2

    iput-object p2, p0, Lw3/s8;->a:Lw3/w7;

    invoke-static {p1}, Lw3/r8;->k(Lw3/r8;)Lw3/ca;

    move-result-object p2

    iput-object p2, p0, Lw3/s8;->b:Lw3/ca;

    invoke-static {p1}, Lw3/r8;->a(Lw3/r8;)Lw3/c1;

    move-result-object p2

    iput-object p2, p0, Lw3/s8;->c:Lw3/c1;

    invoke-static {p1}, Lw3/r8;->b(Lw3/r8;)Lw3/c1;

    move-result-object p2

    iput-object p2, p0, Lw3/s8;->d:Lw3/c1;

    invoke-static {p1}, Lw3/r8;->c(Lw3/r8;)Lw3/s7;

    move-result-object p1

    iput-object p1, p0, Lw3/s8;->e:Lw3/s7;

    return-void
.end method


# virtual methods
.method public final a()Lw3/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/c1<",
            "Lw3/p8;",
            ">;"
        }
    .end annotation

    .annotation build Lw3/b2;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lw3/s8;->c:Lw3/c1;

    return-object v0
.end method

.method public final b()Lw3/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/c1<",
            "Lw3/q8;",
            ">;"
        }
    .end annotation

    .annotation build Lw3/b2;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Lw3/s8;->d:Lw3/c1;

    return-object v0
.end method

.method public final c()Lw3/s7;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lw3/s8;->e:Lw3/s7;

    return-object v0
.end method

.method public final d()Lw3/w7;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/s8;->a:Lw3/w7;

    return-object v0
.end method

.method public final e()Lw3/ca;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lw3/s8;->b:Lw3/ca;

    return-object v0
.end method
