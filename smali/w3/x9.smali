.class public final Lw3/x9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/Boolean;

.field private final h:Ljava/lang/Boolean;

.field private final i:Ljava/lang/Boolean;

.field private final j:Ljava/lang/Integer;


# direct methods
.method synthetic constructor <init>(Lw3/w9;Lw3/v9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw3/w9;->q(Lw3/w9;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->a:Ljava/lang/String;

    invoke-static {p1}, Lw3/w9;->r(Lw3/w9;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->b:Ljava/lang/String;

    invoke-static {p1}, Lw3/w9;->s(Lw3/w9;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->c:Ljava/lang/String;

    invoke-static {p1}, Lw3/w9;->t(Lw3/w9;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->d:Ljava/lang/String;

    invoke-static {p1}, Lw3/w9;->a(Lw3/w9;)Lw3/c1;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->e:Lw3/c1;

    invoke-static {p1}, Lw3/w9;->u(Lw3/w9;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->f:Ljava/lang/String;

    invoke-static {p1}, Lw3/w9;->o(Lw3/w9;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->g:Ljava/lang/Boolean;

    invoke-static {p1}, Lw3/w9;->m(Lw3/w9;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->h:Ljava/lang/Boolean;

    invoke-static {p1}, Lw3/w9;->n(Lw3/w9;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lw3/x9;->i:Ljava/lang/Boolean;

    invoke-static {p1}, Lw3/w9;->p(Lw3/w9;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lw3/x9;->j:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()Lw3/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw3/c1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lw3/b2;
        zza = 0x8
    .end annotation

    iget-object v0, p0, Lw3/x9;->e:Lw3/c1;

    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0xa
    .end annotation

    iget-object v0, p0, Lw3/x9;->g:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0xc
    .end annotation

    iget-object v0, p0, Lw3/x9;->i:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0xb
    .end annotation

    iget-object v0, p0, Lw3/x9;->h:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0xd
    .end annotation

    iget-object v0, p0, Lw3/x9;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lw3/x9;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lw3/x9;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x9
    .end annotation

    iget-object v0, p0, Lw3/x9;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Lw3/x9;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1
    .annotation build Lw3/b2;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lw3/x9;->d:Ljava/lang/String;

    return-object v0
.end method
