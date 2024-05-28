.class public Lu/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lt/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-class v0, Lt/o;

    invoke-static {v0}, Lt/l;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v0

    check-cast v0, Lt/o;

    invoke-direct {p0, v0}, Lu/n;-><init>(Lt/o;)V

    return-void
.end method

.method constructor <init>(Lt/o;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lu/n;->a:Lt/o;

    return-void
.end method


# virtual methods
.method public a(Lw/h2$b;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/h2$b;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lu/n;->a:Lt/o;

    if-nez v0, :cond_0

    return-object p2

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Lt/o;->a(Lw/h2$b;)Landroid/util/Size;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p2

    .line 3
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    .line 6
    invoke-virtual {v1, p1}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method
