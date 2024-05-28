.class public Li6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj6/i;


# direct methods
.method public constructor <init>(Lj6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj6/i;

    iput-object p1, p0, Li6/a;->a:Lj6/i;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    iget-object v0, p0, Li6/a;->a:Lj6/i;

    invoke-interface {v0}, Lj6/i;->zza()I

    move-result v0

    const/4 v1, -0x1

    const/16 v2, 0x1000

    if-gt v0, v2, :cond_0

    if-nez v0, :cond_1

    return v1

    :cond_0
    const/4 v0, -0x1

    :cond_1
    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNullable;
    .end annotation

    iget-object v0, p0, Li6/a;->a:Lj6/i;

    invoke-interface {v0}, Lj6/i;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Li6/a;->a:Lj6/i;

    invoke-interface {v0}, Lj6/i;->zzb()I

    move-result v0

    return v0
.end method
