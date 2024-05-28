.class public Lz2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lz2/n;
    .locals 1

    sget-object v0, Lz2/o;->o:Lz2/o;

    invoke-static {p0, v0}, Lz2/m;->b(Landroid/content/Context;Lz2/o;)Lz2/n;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lz2/o;)Lz2/n;
    .locals 1

    new-instance v0, Lb3/d;

    invoke-direct {v0, p0, p1}, Lb3/d;-><init>(Landroid/content/Context;Lz2/o;)V

    return-object v0
.end method
