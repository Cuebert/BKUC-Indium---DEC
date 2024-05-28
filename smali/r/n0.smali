.class public final synthetic Lr/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/os/Handler;)Lr/m0$b;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 2
    new-instance p1, Lr/p0;

    invoke-direct {p1, p0}, Lr/p0;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 3
    invoke-static {p0}, Lr/o0;->g(Landroid/content/Context;)Lr/o0;

    move-result-object p0

    return-object p0

    .line 4
    :cond_1
    invoke-static {p0, p1}, Lr/q0;->f(Landroid/content/Context;Landroid/os/Handler;)Lr/q0;

    move-result-object p0

    return-object p0
.end method
