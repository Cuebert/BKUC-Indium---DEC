.class public final Lw3/w7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Long;

.field private final b:Lw3/c8;

.field private final c:Ljava/lang/Boolean;

.field private final d:Ljava/lang/Boolean;

.field private final e:Ljava/lang/Boolean;


# direct methods
.method synthetic constructor <init>(Lw3/v7;Lw3/u7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/v7;->k(Lw3/v7;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lw3/w7;->a:Ljava/lang/Long;

    invoke-static {p1}, Lw3/v7;->g(Lw3/v7;)Lw3/c8;

    move-result-object p2

    iput-object p2, p0, Lw3/w7;->b:Lw3/c8;

    invoke-static {p1}, Lw3/v7;->h(Lw3/v7;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lw3/w7;->c:Ljava/lang/Boolean;

    invoke-static {p1}, Lw3/v7;->i(Lw3/v7;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lw3/w7;->d:Ljava/lang/Boolean;

    invoke-static {p1}, Lw3/v7;->j(Lw3/v7;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lw3/w7;->e:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()Lw3/c8;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lw3/w7;->b:Lw3/c8;

    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Lw3/w7;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lw3/w7;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lw3/w7;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/w7;->a:Ljava/lang/Long;

    return-object v0
.end method
