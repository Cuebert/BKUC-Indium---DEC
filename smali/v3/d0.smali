.class final Lv3/d0;
.super Lg6/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg6/e<",
        "Lv3/r;",
        "Lv3/w;",
        ">;"
    }
.end annotation


# direct methods
.method synthetic constructor <init>(Lv3/c0;)V
    .locals 0

    invoke-direct {p0}, Lg6/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lv3/r;

    new-instance v0, Lv3/w;

    .line 2
    invoke-static {}, Lg6/i;->c()Lg6/i;

    move-result-object v1

    new-instance v2, Lv3/s;

    .line 3
    invoke-static {}, Lg6/i;->c()Lg6/i;

    move-result-object v3

    invoke-virtual {v3}, Lg6/i;->b()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Lv3/s;-><init>(Landroid/content/Context;Lv3/r;)V

    .line 4
    invoke-virtual {p1}, Lv3/r;->b()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {v1}, Lg6/i;->b()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lg6/n;

    .line 6
    invoke-virtual {v1, v4}, Lg6/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/n;

    .line 7
    invoke-direct {v0, v3, v1, v2, p1}, Lv3/w;-><init>(Landroid/content/Context;Lg6/n;Lv3/v;Ljava/lang/String;)V

    return-object v0
.end method
