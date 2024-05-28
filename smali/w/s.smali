.class public final synthetic Lw/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw/t;Lw/d2;)Lw/d2;
    .locals 1

    sget-object v0, Lw/t;->d:Lw/o0$a;

    invoke-interface {p0, v0, p1}, Lw/a2;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/d2;

    return-object p0
.end method

.method public static b(Lw/t;)I
    .locals 2

    sget-object v0, Lw/t;->c:Lw/o0$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lw/a2;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static c(Lw/t;)Lw/p2;
    .locals 2

    sget-object v0, Lw/t;->a:Lw/o0$a;

    sget-object v1, Lw/p2;->a:Lw/p2;

    invoke-interface {p0, v0, v1}, Lw/a2;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/p2;

    return-object p0
.end method

.method public static d(Lw/t;)Ljava/lang/Boolean;
    .locals 2

    sget-object v0, Lw/t;->e:Lw/o0$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0, v1}, Lw/a2;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method
