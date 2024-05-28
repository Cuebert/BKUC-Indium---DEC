.class public Ld8/e;
.super Ld8/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ld8/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 0

    new-instance p1, Lc8/a;

    invoke-direct {p1}, Lc8/a;-><init>()V

    return-object p1
.end method

.method public c(Ld8/f$a;)Lu6/a;
    .locals 1

    .line 1
    sget-object v0, Ld8/f$a;->n:Ld8/f$a;

    if-ne p1, v0, :cond_0

    .line 2
    sget-object p1, Lu6/a;->p:Lu6/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
