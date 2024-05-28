.class public final Lw3/ja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/oa;


# instance fields
.field final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw3/oa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw3/ia;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    .line 1
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw3/ja;->a:Ljava/util/List;

    .line 2
    invoke-virtual {p2}, Lw3/ia;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lw3/xa;

    .line 3
    invoke-direct {v1, p1, p2}, Lw3/xa;-><init>(Landroid/content/Context;Lw3/ia;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lw3/sa;)V
    .locals 2

    iget-object v0, p0, Lw3/ja;->a:Ljava/util/List;

    .line 1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/oa;

    .line 2
    invoke-interface {v1, p1}, Lw3/oa;->a(Lw3/sa;)V

    goto :goto_0

    :cond_0
    return-void
.end method
