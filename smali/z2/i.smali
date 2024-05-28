.class public Lz2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/i$a;
    }
.end annotation


# static fields
.field private static final a:Lz2/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz2/z;

    invoke-direct {v0}, Lz2/z;-><init>()V

    sput-object v0, Lz2/i;->a:Lz2/d0;

    return-void
.end method

.method public static a(Lx2/h;Lx2/l;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lx2/m;",
            "T:",
            "Lx2/l<",
            "TR;>;>(",
            "Lx2/h<",
            "TR;>;TT;)",
            "Lg4/l<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lz2/b0;

    invoke-direct {v0, p1}, Lz2/b0;-><init>(Lx2/l;)V

    invoke-static {p0, v0}, Lz2/i;->b(Lx2/h;Lz2/i$a;)Lg4/l;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lx2/h;Lz2/i$a;)Lg4/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lx2/m;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lx2/h<",
            "TR;>;",
            "Lz2/i$a<",
            "TR;TT;>;)",
            "Lg4/l<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lz2/i;->a:Lz2/d0;

    new-instance v1, Lg4/m;

    invoke-direct {v1}, Lg4/m;-><init>()V

    new-instance v2, Lz2/a0;

    invoke-direct {v2, p0, v1, p1, v0}, Lz2/a0;-><init>(Lx2/h;Lg4/m;Lz2/i$a;Lz2/d0;)V

    .line 2
    invoke-virtual {p0, v2}, Lx2/h;->b(Lx2/h$a;)V

    .line 3
    invoke-virtual {v1}, Lg4/m;->a()Lg4/l;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lx2/h;)Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lx2/m;",
            ">(",
            "Lx2/h<",
            "TR;>;)",
            "Lg4/l<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz2/c0;

    invoke-direct {v0}, Lz2/c0;-><init>()V

    invoke-static {p0, v0}, Lz2/i;->b(Lx2/h;Lz2/i$a;)Lg4/l;

    move-result-object p0

    return-object p0
.end method
