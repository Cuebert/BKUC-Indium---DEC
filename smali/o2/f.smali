.class final Lo2/f;
.super Lx2/a$a;
.source "SourceFile"


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

    check-cast v4, Lo2/c;

    .line 2
    new-instance p4, Lo3/b;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lo3/b;-><init>(Landroid/content/Context;Landroid/os/Looper;Lz2/b;Lo2/c;Ly2/d;Ly2/j;)V

    return-object p4
.end method
