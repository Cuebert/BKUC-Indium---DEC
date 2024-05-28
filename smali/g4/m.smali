.class public Lg4/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lg4/n0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    iput-object v0, p0, Lg4/m;->a:Lg4/n0;

    return-void
.end method

.method public constructor <init>(Lg4/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg4/n0;

    invoke-direct {v0}, Lg4/n0;-><init>()V

    iput-object v0, p0, Lg4/m;->a:Lg4/n0;

    new-instance v0, Lg4/k0;

    invoke-direct {v0, p0}, Lg4/k0;-><init>(Lg4/m;)V

    invoke-virtual {p1, v0}, Lg4/a;->b(Lg4/i;)Lg4/a;

    return-void
.end method

.method static bridge synthetic f(Lg4/m;)Lg4/n0;
    .locals 0

    iget-object p0, p0, Lg4/m;->a:Lg4/n0;

    return-object p0
.end method


# virtual methods
.method public a()Lg4/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg4/l<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lg4/m;->a:Lg4/n0;

    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lg4/m;->a:Lg4/n0;

    invoke-virtual {v0, p1}, Lg4/n0;->r(Ljava/lang/Exception;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lg4/m;->a:Lg4/n0;

    invoke-virtual {v0, p1}, Lg4/n0;->s(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lg4/m;->a:Lg4/n0;

    invoke-virtual {v0, p1}, Lg4/n0;->u(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lg4/m;->a:Lg4/n0;

    invoke-virtual {v0, p1}, Lg4/n0;->v(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
