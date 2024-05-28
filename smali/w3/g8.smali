.class public final Lw3/g8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/x9;

.field private final b:Lw3/d8;

.field private final c:Ljava/lang/Boolean;

.field private final d:Lw3/s8;

.field private final e:Lw3/v8;

.field private final f:Lw3/r2;


# direct methods
.method synthetic constructor <init>(Lw3/f8;Lw3/e8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/f8;->l(Lw3/f8;)Lw3/x9;

    move-result-object p2

    iput-object p2, p0, Lw3/g8;->a:Lw3/x9;

    invoke-static {p1}, Lw3/f8;->b(Lw3/f8;)Lw3/d8;

    move-result-object p2

    iput-object p2, p0, Lw3/g8;->b:Lw3/d8;

    invoke-static {p1}, Lw3/f8;->m(Lw3/f8;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lw3/g8;->c:Ljava/lang/Boolean;

    invoke-static {p1}, Lw3/f8;->j(Lw3/f8;)Lw3/s8;

    move-result-object p2

    iput-object p2, p0, Lw3/g8;->d:Lw3/s8;

    invoke-static {p1}, Lw3/f8;->k(Lw3/f8;)Lw3/v8;

    move-result-object p2

    iput-object p2, p0, Lw3/g8;->e:Lw3/v8;

    invoke-static {p1}, Lw3/f8;->a(Lw3/f8;)Lw3/r2;

    move-result-object p1

    iput-object p1, p0, Lw3/g8;->f:Lw3/r2;

    return-void
.end method


# virtual methods
.method public final a()Lw3/r2;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x21
    .end annotation

    iget-object v0, p0, Lw3/g8;->f:Lw3/r2;

    return-object v0
.end method

.method public final b()Lw3/d8;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lw3/g8;->b:Lw3/d8;

    return-object v0
.end method

.method public final c()Lw3/s8;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x7
    .end annotation

    iget-object v0, p0, Lw3/g8;->d:Lw3/s8;

    return-object v0
.end method

.method public final d()Lw3/v8;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x3a
    .end annotation

    iget-object v0, p0, Lw3/g8;->e:Lw3/v8;

    return-object v0
.end method

.method public final e()Lw3/x9;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/g8;->a:Lw3/x9;

    return-object v0
.end method

.method public final f()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x25
    .end annotation

    iget-object v0, p0, Lw3/g8;->c:Ljava/lang/Boolean;

    return-object v0
.end method
