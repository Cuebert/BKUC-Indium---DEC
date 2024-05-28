.class public final Ly3/t4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Long;

.field private final b:Ly3/s4;

.field private final c:Ly3/m4;

.field private final d:Ljava/lang/Integer;

.field private final e:Ljava/lang/Integer;

.field private final f:Ljava/lang/Integer;

.field private final g:Ljava/lang/Integer;


# direct methods
.method synthetic constructor <init>(Ly3/r4;Ly3/q4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ly3/r4;->o(Ly3/r4;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Ly3/t4;->a:Ljava/lang/Long;

    invoke-static {p1}, Ly3/r4;->i(Ly3/r4;)Ly3/s4;

    move-result-object p2

    iput-object p2, p0, Ly3/t4;->b:Ly3/s4;

    invoke-static {p1}, Ly3/r4;->a(Ly3/r4;)Ly3/m4;

    move-result-object p2

    iput-object p2, p0, Ly3/t4;->c:Ly3/m4;

    invoke-static {p1}, Ly3/r4;->k(Ly3/r4;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Ly3/t4;->d:Ljava/lang/Integer;

    invoke-static {p1}, Ly3/r4;->l(Ly3/r4;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Ly3/t4;->e:Ljava/lang/Integer;

    invoke-static {p1}, Ly3/r4;->m(Ly3/r4;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Ly3/t4;->f:Ljava/lang/Integer;

    invoke-static {p1}, Ly3/r4;->n(Ly3/r4;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ly3/t4;->g:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()Ly3/m4;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Ly3/t4;->c:Ly3/m4;

    return-object v0
.end method

.method public final b()Ly3/s4;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Ly3/t4;->b:Ly3/s4;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Ly3/t4;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x6
    .end annotation

    iget-object v0, p0, Ly3/t4;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Ly3/t4;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x7
    .end annotation

    iget-object v0, p0, Ly3/t4;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public final g()Ljava/lang/Long;
    .locals 1
    .annotation build Ly3/i8;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Ly3/t4;->a:Ljava/lang/Long;

    return-object v0
.end method
