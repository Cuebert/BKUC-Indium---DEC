.class public final Lq2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;)Lq2/a;
    .locals 2

    .line 1
    new-instance v0, Lp3/o;

    .line 2
    invoke-static {p0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    new-instance v1, Lq2/e;

    invoke-direct {v1}, Lq2/e;-><init>()V

    invoke-direct {v0, p0, v1}, Lp3/o;-><init>(Landroid/app/Activity;Lq2/e;)V

    return-object v0
.end method

.method public static b(Landroid/app/Activity;)Lq2/c;
    .locals 2

    .line 1
    new-instance v0, Lp3/z;

    .line 2
    invoke-static {p0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    new-instance v1, Lq2/h;

    invoke-direct {v1}, Lq2/h;-><init>()V

    invoke-direct {v0, p0, v1}, Lp3/z;-><init>(Landroid/app/Activity;Lq2/h;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lq2/c;
    .locals 2

    .line 1
    new-instance v0, Lp3/z;

    .line 2
    invoke-static {p0}, Lz2/j;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    new-instance v1, Lq2/h;

    invoke-direct {v1}, Lq2/h;-><init>()V

    invoke-direct {v0, p0, v1}, Lp3/z;-><init>(Landroid/content/Context;Lq2/h;)V

    return-object v0
.end method
