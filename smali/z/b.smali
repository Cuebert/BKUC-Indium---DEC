.class public final Lz/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/i1;


# instance fields
.field private final a:Lw/q;


# direct methods
.method public constructor <init>(Lw/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz/b;->a:Lw/q;

    return-void
.end method


# virtual methods
.method public a()Lw/j2;
    .locals 1

    iget-object v0, p0, Lz/b;->a:Lw/q;

    invoke-interface {v0}, Lw/q;->a()Lw/j2;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroidx/camera/core/impl/utils/g$b;)V
    .locals 1

    iget-object v0, p0, Lz/b;->a:Lw/q;

    invoke-interface {v0, p1}, Lw/q;->b(Landroidx/camera/core/impl/utils/g$b;)V

    return-void
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lz/b;->a:Lw/q;

    invoke-interface {v0}, Lw/q;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Landroid/graphics/Matrix;
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    return-object v0
.end method

.method public f()Lw/q;
    .locals 1

    iget-object v0, p0, Lz/b;->a:Lw/q;

    return-object v0
.end method
