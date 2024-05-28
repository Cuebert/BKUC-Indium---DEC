.class final Lr2/c;
.super Lx2/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx2/a$a<",
        "Lq3/i;",
        "Lx2/a$d$c;",
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
.method public final bridge synthetic b(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Ljava/lang/Object;Ly2/d;Ly2/j;)Lx2/a$f;
    .locals 6

    .line 1
    check-cast p4, Lx2/a$d$c;

    .line 2
    new-instance p4, Lq3/i;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lq3/i;-><init>(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Ly2/d;Ly2/j;)V

    return-object p4
.end method
