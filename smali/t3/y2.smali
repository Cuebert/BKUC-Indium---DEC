.class public final Lt3/y2;
.super Lx2/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx2/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Ljava/lang/Object;Lx2/f$a;Lx2/f$b;)Lx2/a$f;
    .locals 6

    .line 1
    check-cast p4, Lx2/a$d$c;

    .line 2
    new-instance p4, Lt3/z2;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lt3/z2;-><init>(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Lx2/f$a;Lx2/f$b;)V

    return-object p4
.end method
