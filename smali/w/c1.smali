.class public final synthetic Lw/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw/d1;)I
    .locals 1

    sget-object v0, Lw/d1;->f:Lw/o0$a;

    invoke-interface {p0, v0}, Lw/a2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method
