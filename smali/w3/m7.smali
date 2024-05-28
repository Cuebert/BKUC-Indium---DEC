.class public final Lw3/m7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Long;

.field private final b:Ljava/lang/Long;

.field private final c:Ljava/lang/Long;

.field private final d:Ljava/lang/Long;

.field private final e:Ljava/lang/Long;

.field private final f:Ljava/lang/Long;


# direct methods
.method synthetic constructor <init>(Lw3/l7;Lw3/k7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/l7;->h(Lw3/l7;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lw3/m7;->a:Ljava/lang/Long;

    invoke-static {p1}, Lw3/l7;->i(Lw3/l7;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lw3/m7;->b:Ljava/lang/Long;

    invoke-static {p1}, Lw3/l7;->j(Lw3/l7;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lw3/m7;->c:Ljava/lang/Long;

    invoke-static {p1}, Lw3/l7;->k(Lw3/l7;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lw3/m7;->d:Ljava/lang/Long;

    invoke-static {p1}, Lw3/l7;->l(Lw3/l7;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lw3/m7;->e:Ljava/lang/Long;

    invoke-static {p1}, Lw3/l7;->m(Lw3/l7;)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lw3/m7;->f:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lw3/m7;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()Ljava/lang/Long;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Lw3/m7;->d:Ljava/lang/Long;

    return-object v0
.end method

.method public final c()Ljava/lang/Long;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/m7;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lw3/m7;->e:Ljava/lang/Long;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lw3/m7;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public final f()Ljava/lang/Long;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x6
    .end annotation

    iget-object v0, p0, Lw3/m7;->f:Ljava/lang/Long;

    return-object v0
.end method
