.class public Lz2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/o$a;
    }
.end annotation


# static fields
.field public static final o:Lz2/o;


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lz2/o;->a()Lz2/o$a;

    move-result-object v0

    invoke-virtual {v0}, Lz2/o$a;->a()Lz2/o;

    move-result-object v0

    sput-object v0, Lz2/o;->o:Lz2/o;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lz2/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/o;->n:Ljava/lang/String;

    return-void
.end method

.method public static a()Lz2/o$a;
    .locals 2

    new-instance v0, Lz2/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz2/o$a;-><init>(Lz2/q;)V

    return-object v0
.end method


# virtual methods
.method public final b()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lz2/o;->n:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "api"

    .line 2
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Lz2/o;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    check-cast p1, Lz2/o;

    iget-object v0, p0, Lz2/o;->n:Ljava/lang/String;

    .line 3
    iget-object p1, p1, Lz2/o;->n:Ljava/lang/String;

    invoke-static {v0, p1}, Lz2/h;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lz2/o;->n:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lz2/h;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
