.class public Lu/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lt/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-class v0, Lt/p;

    invoke-static {v0}, Lt/l;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v0

    check-cast v0, Lt/p;

    iput-object v0, p0, Lu/e;->a:Lt/p;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lw/g2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lu/e;->a:Lt/p;

    if-nez v0, :cond_0

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {v0, p1, p2}, Lt/p;->c(Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
