.class final Lb3/c;
.super Lx2/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/a$a<",
        "Lb3/e;",
        "Lz2/o;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx2/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Ljava/lang/Object;Ly2/d;Ly2/j;)Lx2/a$f;
    .locals 7

    .line 1
    move-object v4, p4

    check-cast v4, Lz2/o;

    .line 2
    new-instance p4, Lb3/e;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lb3/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Lz2/o;Ly2/d;Ly2/j;)V

    return-object p4
.end method
