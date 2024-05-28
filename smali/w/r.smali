.class public final Lw/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/camera/core/i1;)Lw/q;
    .locals 1

    .line 1
    instance-of v0, p0, Lz/b;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Lz/b;

    invoke-virtual {p0}, Lz/b;->f()Lw/q;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
