.class public final Lv3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/v;


# instance fields
.field final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv3/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lv3/r;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    .line 1
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv3/s;->a:Ljava/util/List;

    .line 2
    invoke-virtual {p2}, Lv3/r;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lv3/b0;

    .line 3
    invoke-direct {v1, p1, p2}, Lv3/b0;-><init>(Landroid/content/Context;Lv3/r;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
