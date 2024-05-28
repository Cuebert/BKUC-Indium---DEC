.class public Lf9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf9/a$a;
    }
.end annotation


# static fields
.field private static a:Lf9/a$a;


# direct methods
.method public static a()I
    .locals 1

    sget-object v0, Lf9/a;->a:Lf9/a$a;

    invoke-interface {v0}, Lf9/a$a;->e()I

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lf9/a;->a:Lf9/a$a;

    invoke-interface {v0}, Lf9/a$a;->b()Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lf9/a;->a:Lf9/a$a;

    invoke-interface {v0}, Lf9/a$a;->d()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lf9/a;->a:Lf9/a$a;

    invoke-interface {v0}, Lf9/a$a;->c()Z

    move-result v0

    return v0
.end method

.method public static e()Z
    .locals 1

    sget-object v0, Lf9/a;->a:Lf9/a$a;

    invoke-interface {v0}, Lf9/a$a;->a()Z

    move-result v0

    return v0
.end method

.method public static f(Lf9/a$a;)V
    .locals 0

    sput-object p0, Lf9/a;->a:Lf9/a$a;

    return-void
.end method
